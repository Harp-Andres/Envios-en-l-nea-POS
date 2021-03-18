
#Author: Andres_Rodriguez_P.
#Keywords Summary : Admisiones_Envios_en_Linea


Feature: Login Feature
Verificar escenarios de prueba.


  Scenario: Ingreso a Pos WPF admision de envios en linea y generar admision
    Given Ingrear a la aplicacion Pos WPF
    And Ingresar al modulo de Envios En Linea WPF
    When al Ingresar al  modulo de Envios En Linea WPF Buscar Usuario
    And Validar Envios en linea del usuario
    And Seleccionar envio En linea
     And Admitir Envio en Linea en Ruta Feliz
    Then Generar admision y afectacion a caja
    And Ultimo Escenario de validacion OK

 