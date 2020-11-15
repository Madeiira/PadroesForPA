# Padrão Strategy

## Descrição:
### Esse padrão encapsula o estado em uma classe separada e delega a tarefa ao objeto que representa o estado atual.Sabemos que o comportamento mudará com o estado interno.

## Motivação:
### Inspirado em alguns exemplos dado pelo proprio professor.

## Aplicação:
### Interação de efeitos e do sistema com um Jogador.


## Estrutura:
![structure](https://www.devmedia.com.br/imagens/articles/208953/state1.PNG)


## Pasta com o codigo:
[CODEPASTE](/trabalhoStatePattern/src/trabalhoStatePattern)

### Classe Package.
Como podemos ver, ele contém uma referência para gerenciar o estado, observe  os métodos previousState (), nextState () e  printStatus () onde delegamos o trabalho ao objeto de estado. Os estados serão vinculados uns aos outros e cada estado configurará outro com base nesta referência passada para ambos os métodos.


### Classe contexto.
Nesta classe é aonde é feito a solicitação, caso ele for fazer um nextState ou um previousState, passará nesta classe.

# Utilizando um outro método pro statePattern

### Classe state.
Classe aonde criei interface de possiveis status, onde estão os contextos que serão modificados por cada state possivel neste programa.


### Classe stateCura, stateLivre e stateParalasia.
Classes que implementam a interface state, aonde é modificada o contexto e seus states.


