/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texttyper;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author Edgar Onukwugha
 */
public class TextReader {
    
    private String path;
    
    public TextReader(String filePath){
        path = filePath;
    }
    
    // opens text file
    public String[] OpenFile() throws IOException{
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        
        int numberOfLines = ReadLines();
        String[] textData = new String[numberOfLines];
        
        for (int i = 0; i < numberOfLines;i++){
            textData[i] = textReader.readLine();
        }
        
        textReader.close();
        return textData;
    }
    
    //reads out aomunt of lines in text file 
    int ReadLines() throws IOException{
        FileReader fileToRead = new FileReader(path);
        int numberOfLines;
        
        try (BufferedReader bf = new BufferedReader(fileToRead)) {
            String currentLine;
            numberOfLines = 0;
            
            while ((currentLine = bf.readLine()) != null){
                numberOfLines++;
            }
        }
        return numberOfLines;
    }
    
    /* quick way to convert String array into a single String
    */
    public String SetTextString(String[] stringArray){
        
        String resultFile = "";

        for (String stringArray1 : stringArray) {
            resultFile += stringArray1;
        }
        
        return resultFile;
    }
}
