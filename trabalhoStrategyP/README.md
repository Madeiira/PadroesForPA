# Padrão Strategy

## Descrição:
### O padrão Strategy define uma família de algoritmos , encapsula cada um deles , e torna-os intercambiáveis, basicamente se torna possivel utilizar mesmos métodos, mas em funções diferentes, de estrategias diferentes

## Motivação:
### Basicamente algo que estava acontecendo ao redor do Brasil.

## Aplicação:
### Relacionar candidatos ao seus votos, de diferentes cidades.


## Estrutura:
![structure](https://www.thiengo.com.br/img/post/normal/09j782i4d422a779bkf7907oi3950ab95fe613edf46f2c3cebb61d52d3.jpg)


## Pasta com o codigo:
[CODEPASTE](/trabalhoStrategyP/src/main)

### Classe Package.
Como podemos ver, ele contém uma referência para gerenciar o estado, observe  os métodos previousState (), nextState () e  printStatus () onde delegamos o trabalho ao objeto de estado. Os estados serão vinculados uns aos outros e cada estado configurará outro com base nesta referência passada para ambos os métodos.


### Classe contexto.
Nesta classe é aonde é feito a solicitação, caso ele for fazer um nextState ou um previousState, passará nesta classe.

# Utilizando um outro método pro statePattern

### Classe state.
Classe aonde criei interface de possiveis status, onde estão os contextos que serão modificados por cada state possivel neste programa.


### Classe stateCura, stateLivre e stateParalasia.
Classes que implementam a interface state, aonde é modificada o contexto e seus states.


