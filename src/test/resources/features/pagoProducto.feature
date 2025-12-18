@PagoProducto


Feature: Pagar Productos

  Scenario Outline: Pago de productos registrados en la seccion carro de compras
    Given El usuario hace click en el boton 'Checkout'
    And El visualiza el formulario 'Your Information'
    When El digita los datos '<First Name>' , '<Last Name>' , '<Zip/Postal Code>'
    Then El visualiza el 'Overview' de la compra
    And El hace click en el boton 'Finish'
    Then El visualiza el texto 'Thank you for your order
    Examples:
    |First Name||Last Name||Zip/Postal Code|
    |Paul||Benavides||593|
