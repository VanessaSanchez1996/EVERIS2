Feature: PetStore
  Background: Cabecera
    #Definimos url base
    Given url 'https://petstore.swagger.io/v2'

    #Siguiendo la pagina del "https://petstore.swagger.io/v2" identificamos el request
    #analizamos el request, que parametros definir y agregar para crear un usuario
    #una vez definida y replicada en la pagina consumimos el metodo (post) con status 200.

  @test
  Scenario: Crear un usuario
    #Identificamos el path
    Given path '/user'
    And request
    """
      {
        "id": 500,
        "username": "Luis",
        "firstName": "Suarez",
        "lastName": "Rojas",
        "email": "luis.rojas@email.com",
        "password": "erme&12LINDA",
        "phone": "987654321",
        "userStatus": 101
      }
    """
    When method post
    Then status 200

    #Siguiendo la pagina del "https://petstore.swagger.io/v2" identificamos metodo a consumir
    #(GET) para la busqueda del usuario con username, referimos el username del metodo anterior para
    # realizar la consulta correspondiente y visualizar que el usuario fue agrega correctamente.

  @test
  Scenario:  Buscar el usuario creado
    Given path 'user/Luis'
    When method get
    Then status 200

  #Siguiendo la pagina del "https://petstore.swagger.io/v2" identificamos metodo a consumir
    #(PUT) status 200 la cual nos sirve para actulizar data.
    #En este caso nos pide actualizar el username y email del usuario.

  @test
  Scenario: Actualizar el nombre y el correo del usuario
    #Identificamos el path
    Given path '/user/Luis'
    And request
    """
    {
       "id": 500,
       "username": "Mario",
       "firstName": "Suarez",
       "lastName": "Rojas",
       "email": "mario.rojas@email.com",
       "password": "erme&12LINDA",
       "phone": "987654321",
       "userStatus": 201
    }
    """

    When method put
    Then status 200

    #Siguiendo la pagina del "https://petstore.swagger.io/v2" identificamos metodo a consumir
    #(GET) para la busqueda del usuario con username, referimos el username del metodo anterior para
    # realizar la consulta correspondiente y visualizar que el usuario fue actualizado correctamente.

  @test
  Scenario:  Buscar el usuario actualizado
    Given path 'user/Mario'
    When method get
    Then status 200

    #Siguiendo la pagina del "https://petstore.swagger.io/v2" identificamos metodo a consumir
    #(DELETE) para eliminar un usuario, referimos en el path el username a eliminar.
    # realizar el delete correspondiente y visualizar que la mascota fue eliminada correctamente.

  @test
  Scenario:  Eliminar usuario
    Given path 'user/Mario'
    When method delete
    Then status 200
