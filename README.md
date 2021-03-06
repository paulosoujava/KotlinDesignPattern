# KotlinDesignPattern
Em Dart:
https://github.com/paulosoujava/dartPattern
Em Javascript
https://github.com/paulosoujava/pattern

Exemplos em KOTLIN


#Creational

<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/creational/images/1.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/creational/images/2.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/creational/images/3.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/creational/images/4.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/creational/images/5.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/creational/images/7.png" width="648">


#Behavioural

<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/behavioural/image/0.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/behavioural/image/1.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/behavioural/image/2.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/behavioural/image/4.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/behavioural/image/5.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/behavioural/image/6.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/behavioural/image/7.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/behavioural/image/8.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/behavioural/image/9.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/behavioural/image/10.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/behavioural/image/11.png" width="648">


#Structural

<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/structural/image/0.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/structural/image/1.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/structural/image/2.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/structural/image/3.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/structural/image/4.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/structural/image/5.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/structural/image/6.png" width="648">
<img src="https://github.com/paulosoujava/KotlinDesignPattern/blob/main/designPatternsKotlin/structural/image/7.png" width="648">

## 

Behavioral Patterns
Os padr??es de projeto comportamentais se preocupam com os algoritmos e a atribui????o de responsabilidades entre objetos. Os padr??es comportamentais n??o descrevem apenas padr??es de objetos ou classes, mas tamb??m os padr??es de comunica????o entre eles. Esses padr??es caracterizam fluxos de controle dif??ceis de seguir em tempo de execu????o. Eles afastam o foco do fluxo de controle para permitir que voc?? se concentre somente na maneira como os objetos s??o interconectados.

Padr??es e inten????es
Chain of responsibility - evita o acoplamento do remetente de uma solicita????o ao seu destinat??rio, dando a mais de um objeto a chance de tratar a solicita????o. Encadeia os objetos receptores e passa a solicita????o ao longo da cadeia at?? que um objeto a trate.

Command - encapsula uma solicita????o como um objeto, desta forma permitindo que voc?? parametrize clientes com diferentes solicita????es, enfileire ou registre (log) solicita????es e suporte opera????es que podem ser desfeitas. Interpreter - dada uma linguagem, define um representa????o para sua gram??tica juntamente com um interpretador que usa a representa????o para interpretar senten??as nesta linguagem.

Iterator - fornece uma maneira de acessar sequencialmente os elementos de um objeto agregado sem expor sua representa????o subjacente.

Mediator - define um objeto que encapsula como um conjunto de objetos interage. O mediator promove o acoplamento fraco ao evitar que os objetos se refiram explicitamente uns aos outros, permitindo que voc?? varie suas intera????es independentemente.

Memento - sem violar a encapsula????o, captura e externaliza um estado interno de um objeto, de modo que o mesmo possa posteriormente ser restaurado para este estado.

Observer - define uma depend??ncia um para muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes s??o automaticamente notificados e atualizados.

State - permite que um objeto altere seu comportamento quando seu estado interno muda. O objeto parecer?? ter mudado sua classe.

Strategy - Define uma fam??lia de algoritmos, encapsular cada um deles e faz??-los intercambi??veis. O strategy permite que o algoritmo varie independentemente dos clientes que o utilizam. Template method - define o esqueleto de um algoritmo em uma opera????o, postergando a defini????o de alguns passos para subclasses. O template method permite que as subclasses redefinam certos passos de um algoritmo sem mudar sua estrutura.

Visitor - representa uma opera????o a ser executada sobre os elementos da estrutura de um objeto. O visitor permite que voc?? defina uma nova opera????o sem mudar as classes dos elementos sobre os quais opera.

Creational
Os padr??es de projeto de cria????o s??o padr??es que abstraem o processo de instancia????o de objetos. Eles ajudam a tornar um sistema independente de como seus objetos s??o representados, criados e compostos. Geralmente, atingem este objetivo delegando tarefas para outros objetos.

Esses padr??es d??o muita flexibilidade ao sistema, porque encapsulam o conhecimento sobre quais classes concretas s??o usadas. Al??m disso, ocultam o modo como as inst??ncias s??o criadas e compostas. O foco ?? eliminar conhecimento do cliente sobre o QUE, COMO e QUANDO est?? sendo criado e QUEM faz parte do processo de cria????o.

Padr??es e inten????es
Abstract Factory - Fornecer uma interface para cria????o de fam??lias de objetos relacionados ou dependentes sem especificar suas classes concretas;

Builder - Separar a constru????o de um objeto complexo de sua representa????o, de modo que o mesmo processo de constru????o possa criar diferentes representa????es;

Factory Method - Definir uma interface para criar um objeto, mas deixar as subclasses decidirem qual classe a ser instanciada. O Factory Method permite a uma classe postergar (defer) a instancia????o ??s subclasses;

Prototype - Especificar os tipos de objetos a serem criados usando uma inst??ncia protot??pica e criar novos objetos copiando este prot??tipo;

Singleton - Garantir que uma classe tenha somente uma inst??ncia e fornecer um ponto global de acesso para ela.

Structural Patterns
Os padr??es estruturais se preocupam com a forma como os objetos s??o compostos para formar estruturas maiores.

Padr??es e inten????es
Adapter - converte a interface de uma classe em outra interface esperada pelos clientes. O Adapter permite que certas classes trabalhem em conjunto, pois de outra forma seria imposs??vel por causa de suas interfaces incompat??veis.

Bridge - separa uma abstra????o da sua implementa????o, de modo que as duas possam variar independentemente.

Composite - compor objetos em estruturas de ??rvore para representarem hierarquias partes-todo. Composite permite aos cliente tratarem de maneira uniforme objetos individuais e composi????es de objetos.

Decorator - atribui responsabilidades adicionais a um objeto dinamicamente. Os Decorators fornecem uma alternativa flex??vel ?? subclasses para extens??o da funcionalidade.

Fa??ade - fornece uma interface unifica para um conjunto de interfaces em um subsistema. O Fa??ade define uma interface de n??vel mais alto que torna o subsistema mais f??cil de usar.

Flyweight - usa compartilhamento para suportar grandes quantidades de objetos de granularidade fina, de maneira eficiente.

Proxy - fornece um objeto representante (surrogate), ou um marcador de outro objeto para controlar o acesso ao mesmo.

Fonte: https://scottt2.github.io/design-patterns-in-dart/
