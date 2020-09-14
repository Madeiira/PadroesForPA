Composite é um padrão de design de software usado para representar objetos compostos de objetos semelhantes. Este grupo de objetos assume que pertence à mesma hierarquia de classes. Esse padrão geralmente é usado para representar listas repetidas ou recursivas de elementos.

Interface basica no arvores.java

Classes leafs  folhaComercial.java e folhaMarketPlace.java
Ambas as classes implementam o  método printArvore() do componente de interface, onde imprimem os nomes das classes para cada um deles.
Além disso, como são classes folha, não contêm outros objetos do arvores.

Elemento Composto folhapai.java
Esta é uma classe composta, pois contém uma coleção de componentes do arvores , bem como métodos para adicionar e remover elementos da lista.
O método composto printArvore () é implementado iterando sobre a lista de elementos folha e invocando o método apropriado para cada um.

Classe para testar o retorno.
Testando com o método de composição printArvore () . Como esperamos, a saída contém os nomes das classes de cada componente folha, dito anteriormente
