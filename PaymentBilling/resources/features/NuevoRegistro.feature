Feature: Nuevo Registro
Se comprueba que la interfaz de registro se cargue correctamente
  
Scenario: nuevo registro 
Given el usuario esta conectado
Given se carga la pagina principal de la aplicacion
     
When se carga la opcion nuevo registro
     
Then se muestra la interfaz nuevo registro