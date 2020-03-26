/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscraperlett;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author gabri
 */
public class WebScraperLett {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException{
        // TODO code application logic here
        Document doc = Jsoup.connect("https://www.magazineluiza.com.br/whey-protein-900g-fitfast-nutrition/p/eadf5b09c5/sa/sawp/").get();
        String title = doc.title();
        System.out.println("Título do site: '"+title+"'");
        
        //CSS SELECTOR A[HREF]
        Elements links = doc.select("a[href]");
        linksCSSselector(links);  
        
        //USING DOM TO GET IMAGES
        Elements imagem =  doc.getElementsByTag("img");
        getByTagImag(imagem);
        
     
    }
    
    public static void linksCSSselector(Elements links){
        
        System.out.println("\nOBTENDO TODOS OS LINKS DO WEBSITE ATRAVÉS DO 'a[href]");
        for(Element link: links){
            System.out.println("Link:"+link.attr("href"));
            System.out.println("Texto: "+link.text()+"\n");
            
        }   
    }
    
    public static void getByTagImag(Elements img){
        
        System.out.println("\nOBTENDO AS IMAGENS DO SITE:");
        
        for(Element src: img){
            System.out.println("src: "+src.attr("abs:src"));
        }
    }
    
    
}
