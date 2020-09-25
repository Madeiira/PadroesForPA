# Padrão SingletonMethod

## Descrição:
### O padrão Template Method usa uma classe base abstrata, que encapsula o template do algoritmo em um método, para que a classe concreta possa herdar/extends desta classe e executar certas etapas do algoritmo.

## Motivação:
### Foi a existência de uma paixão minha, que é treinar na academia, tenho 5 anos de treino, com esse tempo acabei estudando e conhecedo bastante sobre esta area.

## Aplicação:
### Ajudar sobre a existencia de dois de muitos métodos de treinos/dietas de um praticante de musculação.


## Estrutura:
![structure](https://i.stack.imgur.com/KtHqz.jpg)


## Pasta com o codigo:
[CODEPASTE](/trabalhoSingletonMethod/src/main)

### Classe abstrata base:Treinos.java.
Classe java abstrata, com o objetivo de preparar metodos bases e encapsulalos.

### Classes que extendem/extends a classe abstrata: treinoBulking.java e treinoCutting.java.
Classes aonde se encontram duas funções espelhos, sendo elas com o seu modificador de acesso sendo Protected, ou seja podendo sobrescrever assim quando necessario na classe concreta.

### Classe concreta: main.java.
Sendo ela a classe concreta, tendo nela as instancias das classes usadas como implemento da classe base.
Também possuindo a execução das rotinas necessárias para o objetivo do projeto.
