#language: pt-br
@Search
Funcionalidade: Realizar busca em 'Categoria' e verificar se a paginação esta correta

    Cenário: Paginação correta buscando por 'Science: Computers'
        Dado que navego para a página de busca do banco de questões dentro do site 'https://opentdb.com/'
        E digito 'Science: Computers' no campo de busca
        E troco o 'Question' por 'Category' no select ao lado do campo de busca
        Quando clico no botão de buscar
        Então visualizo a listagem de respostas totalizando 25 itens ao todo






         
    

