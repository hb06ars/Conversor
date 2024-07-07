package com.sistema.conversor.modelos;
import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HtmlConverter {

    public static String execute(String conteudo){
        try {
            Document doc = Jsoup.parse(conteudo);
            return doc.outerHtml();
        } catch (Exception ex) {
            JOptionPane.showOptionDialog(null, "Ocorreu um erro: \n" + ex, "ATENÇÃO", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            return "";
        }
    }
    
}
