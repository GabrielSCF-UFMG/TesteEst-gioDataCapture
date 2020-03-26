# TesteEst-gioDataCapture
Teste de Programação Orientada a Objetos e Web Scraper

-Os arquivos VacaApp.java, MorcegoApp.java são executáveis pela máquina java e testam os comportamentos pedidos para os mamíferos.

-Os arquivos GalinhaApp.java, PatoApp.java são executáveis pela máquina java e testam os comportamentos pedidos para as aves.

---------------------------------------------------------------------------------------------------------------------------
Abstração:

-Numa fazenda existem dois tipos de animais: aves e mamíferos. As aves saõ: galinhas ou patos. Os mamíferos são: vacas ou morcegos.

-Cada animal tem seu som e suas ações possíveis, por exemplo a galinha cacareja e também bota ovo, mas não voa.

---------------------------------------------------------------------------------------------------------------------------
Encapsulamento:

-Todo atributo dos animais devem ser obtidos através dos métodos.

-Todos os atributos são privados.

-Atributos staticos são usados para servir para toda a classe, por exemplo para contar o número de vezes que a classe galinha botou ovos.

---------------------------------------------------------------------------------------------------------------------------
Herança:

-O super pai de todos as classes é a classe Animal, todos as outras são herdeira diretas ou indiretas.

-A classe Ave e Mamífero são as herdeiras mais próximas de Animal.

-Os herdeiros de Ave são: Galinha e Pato.

-Os herdeiros de mamífero são: Vaca e Morcego.

---------------------------------------------------------------------------------------------------------------------------
Polimorfismo:

-As galinhas e os patos têm coisas em comum que somente as aves fazem.

-O método botarOvo(), só se encontra para as aves.

-Galinhas e patos podem também botar ovos por serem aves, e têm também, cada um, seus próprios métodos botarOvos().

-As vacas e morcegos têm coisas em comum que somente os mamífero fazem.

-O método amamentar(), só se encontra para os mamíferos.

-Vacas e morcegos podem tamém amamentar por serem mamíferos, e têm também, cada um, seus próprios métodos botarOvos().
