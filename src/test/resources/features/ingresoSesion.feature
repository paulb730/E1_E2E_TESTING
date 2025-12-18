@login
Feature: Iniciar sesion

  Scenario Outline: Ingreso de sesion exitoso
    Given El Usuario A abre la tienda Sauce
    When El ingresa '<Username>' y '<Password>'
    Then El usuario logra ingresar a la direccion '<URL>'
    Examples:
    |Username||Password||URL|
    |standard_user||secret_sauce||https://www.saucedemo.com/inventory.html|


