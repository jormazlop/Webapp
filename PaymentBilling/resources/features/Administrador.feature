Feature: Administrador
Se comprueba que la interfaz de administrador no este visible para los usuarios normales
  
Scenario: administrador
Given el usuario esta conectado
Given se carga la pagina principal de la aplicacion
     
When se carga la opcion administrador
     
Then esta restringido a los administradores