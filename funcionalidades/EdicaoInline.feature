#encoding: iso-8859-1

Feature: Edi��o Inline
	Eu quero realizar a edi��o inline do site do Elias Nogueira


Scenario: Realizando a altera��o do nome
Given Acessar a p�gina de edi��o inline do site do Elias Nogueira
	And Alterar o nome "Carol Cruz"
When Completar a a��o atrav�s do Salvar nome
Then Verificar que a troca do nome foi feita com sucesso
	

Scenario: Realizando a altera��o do email
Given Acessar a p�gina de edi��o inline do site do Elias Nogueira
	And Alterar o email "lolicruz@gmail.com"
When Completar a a��o atrav�s do Salvar email
Then Verificar que a troca do email foi feita com sucesso



Scenario: Realizando a altera��o do telefone
Given Acessar a p�gina de edi��o inline do site do Elias Nogueira
	And Alterar o telefone "21 21222121"
When Completar a a��o atrav�s do Salvar telefone
Then Verificar que a troca do telefone foi feita com sucesso