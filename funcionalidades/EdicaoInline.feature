#encoding: iso-8859-1

Feature: Edição Inline
	Eu quero realizar a edição inline do site do Elias Nogueira


Scenario: Realizando a alteração do nome
Given Acessar a página de edição inline do site do Elias Nogueira
	And Alterar o nome "Carol Cruz"
When Completar a ação através do Salvar nome
Then Verificar que a troca do nome foi feita com sucesso
	

Scenario: Realizando a alteração do email
Given Acessar a página de edição inline do site do Elias Nogueira
	And Alterar o email "lolicruz@gmail.com"
When Completar a ação através do Salvar email
Then Verificar que a troca do email foi feita com sucesso



Scenario: Realizando a alteração do telefone
Given Acessar a página de edição inline do site do Elias Nogueira
	And Alterar o telefone "21 21222121"
When Completar a ação através do Salvar telefone
Then Verificar que a troca do telefone foi feita com sucesso