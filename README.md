O código original sem as correções foi apagado por conta de erro no push no github apagando os históricos originais, o cógio em questão disponibilizado foi desenvolvido em repositório a parte com os detalhamentos e passos a passos no que foi densenvolvido e refatorado segue o link do repositório https://github.com/Marcomira12/OrientadaObjetosAvancada.git  .

O código foi refatorado diminuindo a influência da classe App nas funções do sistema, aplicando o conceito de Single Resoinsibility subdividindo as funções e metodos do
código anterior em classes distintas e únicas com que possam ter uma função nítida e clara. Sendo assim, foram criadas subdivisões de pastas de operações que teriam contato
com o cliente ou usúario e operações internas que não poderão ter interação direta. 

O código no pacote operações foi extendido pela Classe abstrata Acao<T> com objetivo de atender o principio de Open/Closed impossibilitando alterações na abstração e 
permitindo extensão para a demais classes do tipo Acao e possuem Listas com tipos distintos e metodo ececucao() com funções diferentes entre demais classes. Foi desenvolvido
uma classe Fatory para que seja responsavel pela inicialização das classes que serão utilizadas no código, permitindo com que as classes que possuem parâmetros direfentes na 
execução do metodo possam ser padronizadas e sejam aplicadas polimorfismo sem que haja nenhuma incompatibilidade de parâmetros no método execucao().

O principio de Dependency inversion foi atendido detalhes não depender de detalhes e sim de abstrações, evitando assim que caso haja alguma mudança ou acrescimo de uma 
funcionalidade não deixaria o sistema instavel, sendo aplicado na List na classe abstrata com o tipo generico, possibilitando assim que seja possivel a implemnetação de mais
um tipo de lista no sistema sem obrigar mudar a List e nem o getList() será alterado e o metodo abstrato com a classe Fatory passada como parametro, possibilitando alteração
e inicialização no código sem alteração nenhuma parte nas demais classes.
