#language: pt-br
@Verification

Funcionalidade: Verificar se a pergunta criada esta atrelada à usuária  no sistema

    Cenário: Pergunta encontrada e atrelada ao Perfil Correto
        Dado que a usuaria 'Karen' criou a pergunta 'What does the computer software acronym JVM stand for?'
        E eu navegue para a página de busca do banco de questões dentro do site 'https://opentdb.com/'
        Quando eu digitar 'What does the computer software acronym JVM stand for?' na busca
        E clicar no botão de busca
        E aparecer apenas uma questão
        Então ao clicar no perfil listado no campo 'Created By' irei ser redirecionado para o perfil do criador
        E visualizarei o perfil da "Karen"
        
