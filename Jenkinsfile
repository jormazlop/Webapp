pipeline {
  agent any
  stages {
    stage('SonarQube analysis') {
      steps {
        withSonarQubeEnv('SonarServer') {
          bat '/Jorge/Apuntes/TFG/2018/sonar-runner-dist-2.4/sonar-runner-2.4/bin/sonar-runner '+'-Dsonar.projectKey=WebApp '+'-Dsonar.projectName=WebApp '+'-Dsonar.projectVersion=1.0 '+'-Dsonar.login=admin '+'-Dsonar.password=admin '+'-Dsonar.exclusions=vendor/** '+'-Dsonar.exclusions=storage/** '+'-Dsonar.exclusions=resources/** '+'-Dsonar.sources=. '+'-Dsonar.sourceEncoding=UTF-8 '+'-Dsonar.java.binaries=/Jorge/Apuntes/TFG/2018/sonarqube-7.6/sonarqube-7.6/extensions/plugins '
        }

      }
    }
    stage('Sonar Quality Gate') {
      steps {
        timeout(time: 2, unit: 'MINUTES') {
          waitForQualityGate true
          echo 'Analisis Correcto'
        }

      }
    }
    stage('Build') {
      steps {
        build 'WebApp'
      }
    }
    stage('JMeter') {
      steps {
        bat 'cd  C:/Jorge/Apuntes/TFG/2018/apache-jmeter-5.0/apache-jmeter-5.0/Resultados'
        bat 'rd HtmlReport /S /Q'
        bat 'cd C:/Jorge/Apuntes/TFG/2018/apache-jmeter-5.0/apache-jmeter-5.0'
        bat 'del Resultados /S /Q'
        bat 'C:/Jorge/Apuntes/TFG/2018/apache-jmeter-5.0/apache-jmeter-5.0/bin/jmeter -n -t C:/Jorge/Apuntes/TFG/2018/apache-jmeter-5.0/apache-jmeter-5.0/Scripts/Prueba1.jmx -l C:/Jorge/Apuntes/TFG/2018/apache-jmeter-5.0/apache-jmeter-5.0/Resultados/Prueba1.csv -e -o C:/Jorge/Apuntes/TFG/2018/apache-jmeter-5.0/apache-jmeter-5.0/Resultados/HtmlReport'
      }
    }
  }
}
