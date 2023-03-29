Desenvolvido por Israel Goularte;

Dados utilizado de modo ficticio qualquer semelhança com a realidade e pura coincidencia.

---

Sumario:

    Problemas resolvidos por essa aplicação
    Instrução de uso
    Em relação aos diretorios
    Definição do Padrão de Projeto Abstract Factory

---

Problemas resolvidos por essa aplicação:

    Implemente o padrão Abstract Factory em uma aplicação de Combo, em que há fábricas diferentes
    para carros de marcas diferentes. Cada Carro possui um Motor e Acessórios. Demonstre o 
    funcionamento do padrão na sua função main, fabricando pelo menos 3 tipos diferentes de Carro. 

---

Instrução de uso:

    Executar: Main.java

    Dentro da main e possivel:
        criar novos veiculos atraves da opção concessionaria,
        Listar os veiculos cadastrados,
        Acessar um veiculo individualmente:
            ligar,
            desligar,
            andar   (esse metodo e acionado uma threads ando o veiculo segue em movimento),
            parar   (ao parar o veiculo sera intorrimpida a thread de movimento, e atualizado a 
                    quantidade de KM  do veiculo);

---

Em relação aos diretorios:

    /fabricas:
        Aqui temos a Interface Veiculos com os metodos para se criar uma fabrica.
        E as clasees que implementam essa Interface tornando-se em fabricas dos respectivos Carros
            CorsaBasico,
            CorsaCompleto,
            GolCompleto,
            GolBasico;
    /locomocao:
        Aqui temos a classe Locomocao que extende Thread para que o veiculo possa estar em movimento
        e ainda possamos controla-lo.
    /objetos
        Aqui temos as Interface para que seja implementado:
            Carro,
            Moto,
            TipoVeiculo;
        
        /objetos/carros:
            Classes que implementa a interface Carro
                GM,
                Volkswagen;
        /objetos/motor:
            Classes que implementa a interface Motor
                V8,
                VHC;
        /objetos/tipoDeVeiculo:
            Interface Acessorio para que seja implementado um acessorio individual.
            Classes que implementa a interface TipoDeVeiculo:
                Basico,
                Completo;
            /objetos/tipoDeVeiculo/acessorio:
                        Classes que implementa a interface Acessorio
                            ArCondicionado,
                            DirecaoHidraulica;

---

Definição do Padrão de Projeto Abstract Factory:

    É um padrão criacional que fornece uma interface para criar famílias de objetos 
    relacionados ou dependentes sem especificar suas classes concretas. O objetivo do
    padrão é encapsular a criação de objetos em uma classe de fábrica (Factory), que é
    responsável por criar as instâncias de objetos concretos.

    Permite que o código cliente seja desacoplado das classes concretas dos objetos que 
    ele cria, permitindo que diferentes fábricas produzam diferentes tipos de objetos sem 
    alterar o código cliente. Ele também pode ser usado para criar hierarquias de objetos 
    relacionados, que podem ser compostos por outras fábricas de objetos.

    O padrão é composto por um conjunto de interfaces e classes abstratas que definem a 
    estrutura da fábrica e suas famílias de objetos. Cada família de objetos é definida 
    por uma interface ou classe abstrata, que é implementada por várias classes concretas 
    que fornecem a implementação real dos objetos. A fábrica abstrata fornece métodos para 
    criar objetos de cada família, que são implementados por fábricas concretas.

    O Abstract Factory é útil quando se precisa criar uma família de objetos relacionados, 
    mas não se sabe antecipadamente qual é a classe concreta de cada objeto. Ele é comumente 
    usado em aplicativos de software que precisam ser flexíveis, escaláveis e extensíveis, 
    como em jogos, sistemas de gerenciamento de documentos, sistemas de gerenciamento de 
    banco de dados, entre outros.

