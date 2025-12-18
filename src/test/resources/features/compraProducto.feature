@CompraProducto

Feature: Comprar Productos

  Scenario: Compra de Productos seleccionados
    Given El usuario ha seleccionado dos productos para comprar
    When El hace click en el icono 'Carro de Compras'
    Then Se visualiza los productos seleccionados para comprar
    And El hace click en el boton 'Checkout'