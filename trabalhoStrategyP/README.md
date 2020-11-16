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

### Interface IApurarVotos.
Interface padrão para todas as cidades, aonde é criado também as assinaturas de métodos padrões para todas as cidades

### Classe Votos.
Classe aonde é feito a aplicação dos métodos criados na interface padrão.

### Classe votosSaoPaulo .
Classe que implementa a interface padrão;



