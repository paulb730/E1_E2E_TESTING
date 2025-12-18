@Loginexitoso(HappyPath)
Feature: Iniciar sesion

  Scenario Outline: Ingreso de sesion exitoso
    Given El Usuario A abre la tienda Sauce
    When El ingresa '<Username>' y '<Password>'
    Then El usuario logra ingresar a la aplicacion
    Examples:
    |Username||Password|
    |standard_user||secret_sauce|


