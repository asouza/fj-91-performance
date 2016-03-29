##Importando para o eclipse
	<ul>
	 <li>Faça o clone do projeto no seu workspace => git clone https://github.com/asouza/fj-91-performance.git</li> 
	 <li>Importe o projeto como **Maven Project**</li>
	 <li>Aqui vai demorar um pouco, já que ele vai baixar as dependências do projeto</li>
	 <li>
	 	Enquanto ele está baixando, já importe os dados do banco de dados para seu mysql
	 	<ul>
	 		* Entre no mysql => ```mysql -u root```
	 		* destrua o banco => ```drop database testehibernate;```
	 		* crie o banco de novo => ```create database testehibernate```
	 		* saia do console do mysql
	 		* agora importe o banco => ```mysql -u root testehibernate < dump.sql```
	 	</ul>
	 </li>
	</ul>


