/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcamentotraducao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.List;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import java.util.Scanner;


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
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo:");
        String filename = scan.nextLine();
        String typeFile = filename.substring(filename.length()-3, filename.length());
        if(!typeFile.matches("ocx") && !typeFile.matches("doc")){
            System.out.println("Este formato de arquivo não é suportado\n");
            System.exit(0);
        }
        try {
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            
            String allText = "";
            int lines = 0;
            
            if(typeFile.matches("ocx")){
                XWPFDocument document = new XWPFDocument(fis);

                List<XWPFParagraph> paragraphs = document.getParagraphs();
                
                for (XWPFParagraph para : paragraphs) {
                    allText += para.getText() + " ";
                    lines++;
                }
                fis.close();
            }
            else if(typeFile.matches("doc")){
                WordExtractor extractor = new WordExtractor(new HWPFDocument(fis));
                allText = extractor.getText();
            }
            
            String allTextExploded[] = allText.split(" ");
            int words = allTextExploded.length;
            int characters = allText.length();

            System.out.println("Há " + words + " palavras");
            System.out.println("Há " + characters + " caracteres");
            System.out.println("Há " + lines + " linhas");
            System.out.println("O orçamento estimado é de R$" + calculate(characters, words, lines));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static float calculate(int chars, int words, int lines){
        float cost = 0f;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("prices.conf"));
            String line[];
            line = reader.readLine().split(":");
            float ttchar = Float.valueOf(line[1]);
            line = reader.readLine().split(":");
            float ttwords = Float.valueOf(line[1]);
            line = reader.readLine().split(":");
            float ttline = Float.valueOf(line[1]);
            
            cost = (ttchar*chars + ttwords*words + ttline*lines) / 3;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return cost;
    }
    
}
