@Google
Feature: Probar la busqueda en google

Scenario: Buscar algo en google
    Given navego a google
    When Ingreso el criterio de busqueda
    And presiono el boton de busqueda
    Then Obtengo resultados
