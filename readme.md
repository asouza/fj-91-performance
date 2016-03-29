##Importando para o eclipse
	<ul>
	 <li>Faça o clone do projeto no seu workspace => git clone https://github.com/asouza/fj-91-performance.git</li> 
	 <li>Importe o projeto como **Maven Project**</li>
	 <li>Aqui vai demorar um pouco, já que ele vai baixar as dependências do projeto</li>
	 <li>
	 	Enquanto ele está baixando, já importe os dados do banco de dados para seu mysql
	 	<ul>
	 		<li> Entre no mysql => ```mysql -u root``` </li>
	 		<li> destrua o banco => ```drop database testehibernate;```</li>
	 		<li> crie o banco de novo => ```create database testehibernate;```</li>
	 		<li> saia do console do mysql</li>
	 		<li>agora importe o banco => ```mysql -u root testehibernate < dump.sql```</li>
	 	</ul>
	 </li>
	</ul>


