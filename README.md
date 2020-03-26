# TesteEst-gioDataCapture
Teste de Programação Orientada a Objetos e Web Scraper

# POO:

- Baixe e abra a pasta POOLett/src/fazendinha, lá está os arquivos com toda a implementação de POO.

- Os arquivos VacaApp.java, MorcegoApp.java são executáveis pela máquina java e testam os comportamentos pedidos para os mamíferos.

- Os arquivos GalinhaApp.java, PatoApp.java são executáveis pela máquina java e testam os comportamentos pedidos para as aves.

- Cada arquivo executável já apresenta uma interface para o teste das ações de cada animal pelo console. 

---------------------------------------------------------------------------------------------------------------------------
### Abstração:

- Numa fazenda existem dois tipos de animais: aves e mamíferos. As aves saõ: galinhas ou patos. Os mamíferos são: vacas ou morcegos.

- Cada animal tem seu som e suas ações possíveis, por exemplo a galinha cacareja e também bota ovo, mas não voa.

---------------------------------------------------------------------------------------------------------------------------
### Encapsulamento:

- Todo atributo dos animais devem ser obtidos através dos métodos.

- Todos os atributos são privados.

- Atributos staticos são usados para servir para toda a classe, por exemplo para contar o número de vezes que a classe galinha botou ovos.

---------------------------------------------------------------------------------------------------------------------------
### Herança:

- O super pai de todos as classes é a classe Animal, todos as outras são herdeira diretas ou indiretas.

- A classe Ave e Mamífero são as herdeiras mais próximas de Animal.

- Os herdeiros de Ave são: Galinha e Pato.

- Os herdeiros de mamífero são: Vaca e Morcego.

---------------------------------------------------------------------------------------------------------------------------
### Polimorfismo:

- As galinhas e os patos têm coisas em comum que somente as aves fazem.

- O método botarOvo(), só se encontra para as aves.

- Galinhas e patos podem também botar ovos por serem aves, e têm também, cada um, seus próprios métodos botarOvos().

- As vacas e morcegos têm coisas em comum que somente os mamífero fazem.

- O método amamentar(), só se encontra para os mamíferos.

- Vacas e morcegos podem tamém amamentar por serem mamíferos, e têm também, cada um, seus próprios métodos botarOvos().

# WEB SCRAPER:

- Baixe e abra a pasta WebScraperLett/src/scraper e abra o arquivo scraperingMagazine.java

- Existe apenas um arquivo e é nele que fazemos nossos testes.

- Foi usado o site da Magazine Luiza para executar o scraping.

- URL utilizada: https://www.magazineluiza.com.br/whey-protein-900g-fitfast-nutrition/p/eadf5b09c5/sa/sawp/

- Criando o documento pelo URL do site e a biblioteca jsoup extraimos as informações:

        Document doc = Jsoup.connect("https://www.magazineluiza.com.br/whey-protein-900g-fitfast-   nutrition/p/eadf5b09c5/sa/sawp/").get();

- Informações retiradas: links na página e seu texto associado e imagens.

- Bibliotecas:   

                org.jsoup.Jsoup
                org.jsoup.nodes.Document
                org.jsoup.nodes.Element
                org.jsoup.select.Elements
                
## CSS SELECTOR a[href]:

- Usamos o seletor a[] para fazermos a busca (select("a[href]"))

- Foi criada uma função:
 
      public static void linksCSSselector(Elements links){
        
        System.out.println("\nOBTENDO TODOS OS LINKS DO WEBSITE ATRAVÉS DO 'a[href]");
        for(Element link: links){
            System.out.println("Link:"+link.attr("href"));
            System.out.println("Texto: "+link.text()+"\n");
         }   
         
      }

- Tem como parâmetro um vetor de Elements links e imprime no console os "href" e o seu texto.

## GET BY TAG:

- Fazendo doc.getElementsByTag("img") obtemos um vetor com todas as imagens do site.

- Foi criada a função:

      public static void getByTagImag(Elements img){
        
        System.out.println("\nOBTENDO AS IMAGENS DO SITE:");
        
        for(Element src: img){
            System.out.println("src: "+src.attr("abs:src"));
        }
        
      }
- Tem como parâmetro o vetor de Elements img e imprime no console todos os endereços das imagens.

  


