/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcamentotraducao;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 *
 * @author alex
 */
public class OrcamentoTraducao {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File file = new File("demo.docx");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            
            if(file.canRead()) System.out.println("Leitura OK\n");

            XWPFDocument document = new XWPFDocument(fis);

            List<XWPFParagraph> paragraphs = document.getParagraphs();
            String allText = "";
            int lines = 0;

            for (XWPFParagraph para : paragraphs) {
                allText += para.getText() + " ";
                lines++;
            }
            fis.close();
            
            String allTextExploded[] = allText.split(" ");
            int words = allTextExploded.length + 1;
            int characters = allText.length();
            
            float priceByWord = 0.03f;
            
            System.out.println("Há " + words + " palavras\n");
            System.out.println("Há " + characters + " caracteres\n");
            System.out.println("Há " + lines + " linhas\n");
            System.out.println("O orçamento estimado é de R$" + words * priceByWord + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
