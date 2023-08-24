Feature: Realizar compras de articulos
  Como un nuevo cliente
  Quiero ingresar a la pagina saucelab
  Para realizar la compra de productos


  @ejemplo
  Scenario Outline: Agregar articulo al carrito de compras
    Given que un nuevo cliente accede hasta la web de compras
    When el ingresa su <user> y <password>
    And el da click en Login
    And el agrega la cantidad <cantidad> de productos al carrito
    And el ve los productos listados en el carro de compras
    And el da click en Checkout
    And el completa el formulario con los datos <nombre>, <apellido> y <postal>
    And el da click en Continue
    And el da click en Finish
    Then el visualiza el mensaje de confirmacion <mensaje>
    Examples:
      | user          | password     | cantidad | nombre  | apellido | postal   | mensaje                  |
      | standard_user | secret_sauce | 2        | Kat     | Sanchez  | 11111    | Thank you for your order |