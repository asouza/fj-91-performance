#Importando para o eclipse
	
	 1.Faça o clone do projeto no seu workspace => git clone https://github.com/asouza/fj-91-performance.git
	 2.Importe o projeto como **Maven Project**
	 3.Aqui vai demorar um pouco, já que ele vai baixar as dependências do projeto
	 
	 4.Enquanto ele está baixando, já importe os dados do banco de dados para seu mysql
	  	1.Entre no mysql => ```mysql -u root``` 
	 	2.destrua o banco => ```drop database testehibernate;```
	 	3.crie o banco de novo => ```create database testehibernate;```
	 	4.saia do console do mysql
	 	5.agora importe o banco => ```mysql -u root testehibernate < dump.sql```


