Feature: Flujo E2E de realizar una compra en SauceDemo

  @CP2_purchase @e2e @regression
  Scenario: Verificar la compra completa de un producto exitosamente
    Given el usuario se encuentra en la pagina web de saucedemo
    When inicia session con user "standard_user" y password "secret_sauce"
#    And agrega el producto "Sauce Labs Onesie" al carrito
#    And abre el carrito de compras
#    Then valida que el producto "Sauce Labs Onesie" se encuentre en el carrito
#    When completa la información del checkout con nombre "Karen", apellido "Estrada" y código postal "06000"
#    And finaliza la compra
#    Then visualiza el mensaje de confirmación "Thank you for your order!"