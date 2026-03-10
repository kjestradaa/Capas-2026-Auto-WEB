Feature: Flujo E2E de realizar una compra en SauceDemo

  @CP2_purchase @e2e @regression
  Scenario: Verificar la compra completa de un producto exitosamente
    Given el usuario se encuentra en la pagina web de saucedemo
    When inicia session con user "standard_user" y password "secret_sauce"
    And agrega el producto "Sauce Labs Onesie" al carrito
    And al abrir el carrito verifica que está el producto "Sauce Labs Onesie"
    And al finalizar la compra con la información nombre "Karen", apellido "Estrada" y código postal "06000"
    Then verifica el mensaje de confirmación "Thank you for your order!"