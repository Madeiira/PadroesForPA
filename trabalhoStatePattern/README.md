# Padrão State

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

### Classe googleEarthObserver.
Nesta classe  nota-se a presença da interface Subject e da sua classe concreta googleEarthObserver que define o comportamento dos objetos para se registrarem (Attach) .
 E a existncia do método update() que é chamado quando o estado do Subject é alterado.

### Classe Subject e Observer.
Classes aonde o principio do padrão observer são criados.
O subject sendo aonde será montado a possivel lista de seus dependentes chamados de “observers”, e os notifica automaticamente de eventuais mudanças de estado, geralmente, chamando um dos seus métodos.
E a classe abstrata Observer aonde será criado o que será observado e a forma de atualizar, para assim poder notificar.

