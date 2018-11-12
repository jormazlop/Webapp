Feature: Modificar
Se comprueba que la interfaz de modificar este limitada a los administradores
  
Scenario: modificacion 
Given el usuario esta conectado
Given se carga la pagina principal de la aplicacion
     
When se carga la opcion modificacion
     
Then esta restringido a los administradores