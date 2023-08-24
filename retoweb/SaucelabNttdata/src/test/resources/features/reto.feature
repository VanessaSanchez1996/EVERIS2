Feature: Realizar compras de articulos
  Como un nuevo cliente
  Quiero ingresar a la pagina Your Store
  Para realizar la compra de productos

  #Agregar dos productos al carrito
  # Visualizar el carrito
  # Completar el “Checkout” como invitado: “Guest Checkout”
  # Finalizar la compra hasta la confirmación: “Your order has been placed!”

  @ejemplo
  Scenario Outline: Agregar articulo al carrito de compras
    Given que un nuevo cliente accede hasta la web de compras
    And el agrega la cantidad <cantidad> de productos al carrito
    And el ve los productos listados en el carro de compras
    And se haga clic en el botón continue
    And el selecciona la opcion <opcionCheckout> Guest Checkout
    And se haga clic en el botón continue
    And llena el formulario con <FirtName>
    And coloca su <LastName>
    And coloca su <email>
    And coloca su <Telephone>
    And coloca su <Address1>
    And coloca su <city>
    And coloca su <PostCode>
    And coloca su <Country>
    And coloca su <Region>
    And se haga clic en el botón continue
    And se haga clic en el botón continue
    And se agrega un <comentario>
    And se haga clic en el botón continue
    And se seleccina la opcion transferencia <opcionPago>
    And se escribe el mensaje de confirmación <mensaje>
    And se selecciona el boton de terminos y condiciones
    And se haga click en el boton confirm Orden
    And se finaliza la compra.

    Then el visualiza el mensaje de confirmacion <mensaje>
    Examples:
      |cantidad| opcionCheckout | FirtName| LastName| email               | Telephone |Address1  |city|PostCode|Country |Region |comentario|opcionPago   |mensaje                    |
      | 2      | Guest Checkout | Jose    | Rojas   | jos.rojas@email.com | 987654123 |av: Lima12|Lima| 1111   | Peru   | Lima  |  Pago    |bank transfer|Your order has been placed!|
