@SeleccionProducto

Feature: Seleccionar Productos

  Scenario: Seleccion de dos productos
    Given El Usuario se encuentra en el inventario de productos
    And El identifica dos productos disponibles en <lista Productos>
    When El hace click en el boton 'Add to Cart' en dos productos de <lista Productos>
    Then En el carro de compras se muestra un circulo rojo con el numero de items seleccionados
    And El boton 'Add to Cart' de los productos seleccionados cambia a 'Remove'
