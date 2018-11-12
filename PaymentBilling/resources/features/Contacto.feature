Feature: Contacto
Se comprueba que la interfaz de contacto este visible para todos los usuarios
  
Scenario: contacto
Given el usuario esta conectado
Given se carga la pagina principal de la aplicacion
     
When se carga la opcion contacto
     
Then se muestra la interfaz de contacto