# language : pt
@tag
Funcionalidade: Cadastro de cliente no site

  @tag1
   Cenário: Cadastro com sucesso
   Dado que estou no site "https://advantageonlineshopping.com/#/"
   Quando preencho o formulário do cliente com um nome válido, um e-mail válido, uma senha válida e a confirmação da senha
   E clico no botão "REGISTER"
   Então vejo uma mensagem de sucesso indicando que meu cadastro foi realizado
 