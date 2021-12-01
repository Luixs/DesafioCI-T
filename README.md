<div id="top"></div>

[![Contributors][contributors-shield]][contributors-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">
  <!--
  <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>
  -->
  <h1 align="center">Desafio CI&T</h1>

  <p align="center">
    Feito por Luis Guilherme Soares Starlino, UNABH CRISTIANO MACHADO
    <br />
    <a href="https://github.com/othneildrew/Best-README-Template"><strong> Ver Desafio Completo »</strong></a>
    <br />
    <br />
    <a href="parteUm">Primeira Parte</a>
    ·
    <a href="parteDois">Segunda Parte</a>
    ·
    <a href="https://github.com/othneildrew/Best-README-Template/issues">Terceira parte</a>
  </p>
</div>



<details>
  <summary>Sumário</summary>
  <ol>
    <li>
      <a href="#desafio">Sobre o Desafio</a>
      <ul>
        <li><a href="#ferramentas">ferramentas</a></li>
      </ul>
    </li>
    <li><a href="#parteUm">Primeira Etapa</a></li>
    <li><a href="#parteDois">Segunda Etapa</a></li>
    <li><a href="#parteTres">Terceira Etapa</a></li>
  </ol>
</details>


<!-- Sobre o Projeto  -->
<div id="desafio"></div>

## Sobre o Desafio

Esse desafio foi proposto pela CI&T na Unidade Curricular Gestão e Qualidade De software ministrada dentro da facudade UNABH - CRISTIANO MACHADO.

Composição do Desafio:
* Parte 1 - Automação baseada na Linguagem Gherkin Escrita pela prórpia empresa.
* Parte 2 - Realizar a criação da Feature usando o Gherkin e realizando a automação com o cenário informado.
* Parte 3 - Criar um cenário e fazer toda a sua construção, desde o Gherkin até a automação do teste esperando o resultado correto.

O projeto foi divido e colocado em três pastas diferentes para ajudar na compreensão e desenvolvimento de todo o Desafio, cada pasta representa uma Parte do Desafio.

<p align="right">(<a href="#top">Voltar para o topo</a>)</p>


<div id="ferramentas"></div>

## Ferramentas Utilizadas

Essa sessão lista os frameworks/libs e IDE's utilizadas ness desafio

* [Eclipse 4.21.0](https://google.com/)
* [JUnit 4.13.2](https://google.com/)
* [Selenium 4.0.0](https://google.com/)
* [Chrome WebDrive](https://google.com/)
* [Visual Studio](https://google.com/) (Apenas para criação das features)

<p align="right">(<a href="#top">Voltar para o topo</a>)</p>


<div id="parteUm"></div>

## Parte 1
Nessa primeira etapa realizei a criação de uma classe para instanciar dentro da área de testes, essa classe foi criada dentro do package "faseUm".
Dentro dessa classe que recebe o _driver_ como parâmentro eu peguei todos os elementos e verifiquei se o possivel cenário retornaria True dentro das condições propostas.

_Veja toda classe da primeira etapa e sua lógica abrindo a classe [Primeira Etapa](https://github.com/Luixs/DesafioCI-T/blob/main/CucumberEstrutura/src/main/java/faseUm/PrimeiraEtapa.java)_

<p align="right">(<a href="#top">Voltar para o topo</a>)</p>


<div id="parteDois"></div>

## Parte 2
Nessa segunda etapa recebemos apenas uma informação para o novo cenário e tivemos que realizar a criação tanto do cenário em Gherkin quando da classe responsável pelo teste. A classe foi criada dentro do package "faseDois", demonimada de "Segunda Etapa".

Segue abaixo o modelo Gherkin criado, documentando também dentro do projeto, clicando aqui você consegue visualizar dentros dos arquivos.

* Gherkin
  ```sh
  Funcionalidade:Realizar busca em 'Categoria' e verificar se a paginação esta correta
    Cenário: Paginação correta buscando por 'Science: Computers'
          Dado que navego para a página de busca do banco de questões dentro do site 'https://opentdb.com/'
          E digito 'Science: Computers' no campo de busca
          E troco o 'Question' por 'Category' no select ao lado do campo de busca
          Quando clico no botão de buscar
          Então visualizo a listagem de respostas totalizando 25 itens ao todo
  ```
  _Visualizar toda etapa acima dentro do arquivo .[Feature](https://github.com/Luixs/DesafioCI-T/blob/main/CucumberEstrutura/Features/buscarCategoria(SegundaEtapa).feature)_
  
  Além da escrita em Gherkin, toda a classe do objeto está disponível no diretório clicando [aqui](https://github.com/Luixs/DesafioCI-T/blob/main/CucumberEstrutura/src/main/java/faseDois/SegundaEtapa.java)

<p align="right">(<a href="#top">Voltar para o topo</a>)</p>

<div id="parteTres"></div>

## Parte 3
Nessa terceira e última etapa, ficamos livre para criar e realizar um teste começando do zero, desde a disponibilização das informações, criação na linguagem Gherkin e todo desenvolvimento da classe em Java e seu teste.
O teste no qual desenvolvi tem como base uma usa usuária, a Karen, que criou uma pergunta e queriamos verificar se a mesma foi criada corretamente e estava atrelada ao perfil da Karen. Ao buscar pela perguta e clicar no Perfil do criado podemos verificar que de fato está atrelado corretamente e que essa função não possui erros aparentes.

Segue abaixo o modelo Gherkin criado, documentando também dentro do projeto, clicando aqui você consegue visualizar dentros dos arquivos.

* Gherkin
  ```sh
  Funcionalidade: Verificar se a pergunta criada esta atrelada à usuária  no sistema
    Cenário: Pergunta encontrada e atrelada ao Perfil Correto
        Dado que a usuaria 'Karen' criou a pergunta 'What does the computer software acronym JVM stand for?'
        E eu navegue para a página de busca do banco de questões dentro do site 'https://opentdb.com/'
        Quando eu digitar 'What does the computer software acronym JVM stand for?' na busca
        E clicar no botão de busca
        E aparecer apenas uma questão
        Então ao clicar no perfil listado no campo 'Created By' irei ser redirecionado para o perfil do criador
        E visualizarei o perfil da "Karen"
  ```
  _Visualizar toda etapa acima dentro do arquivo .[Feature](https://github.com/Luixs/DesafioCI-T/blob/main/CucumberEstrutura/Features/verificandoQuestaoCriada(TerceitaEtapa).feature)_
  
Além da escrita em Gherkin, toda a classe do objeto está disponível no diretório clicando [aqui](https://github.com/Luixs/DesafioCI-T/blob/main/CucumberEstrutura/src/main/java/faseTres/TerceitaEtapa.java)
<p align="right">(<a href="#top">Voltar para o topo</a>)</p>

[contributors-url]:https://github.com/Luixs/DesafioCI-T/graphs/contributors
[linkedin-url]: https://www.linkedin.com/in/luis-starlino/
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge

