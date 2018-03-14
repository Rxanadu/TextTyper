/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texttyper;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Edgar Onukwugha
 * 
 * Types out a set of text one letter at a time after a set delay 
 * (in milliseconds)
 * 
 * A simple class made in order to get reacquainted with NetBeans after so long
 */
class TextTyper {

        
    public static void main(String[] args) throws IOException {
        TextTyper textTyper = new TextTyper();
        
        String filePath = 
                "E:/Programming Projects/NetBeans/TextTyper/src/testtext.txt";
        try{
            TextReader file = new TextReader(filePath);
            String[] aryLines = file.OpenFile();
            
            String result = file.SetTextString(aryLines);
            textTyper.TypeText(result, 500);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    // types a set test text one letter at a time after a given delay 
    public void TypeText(int delayInMilliseconds){
        String text = "hello world";
        int i;
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(delayInMilliseconds);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
    
    // types out the entered text one letter at a time after a given delay
    public void TypeText(String typedText, int delayInMilliseconds){

        for(int i = 0; i < typedText.length(); i++){
            System.out.printf("%c", typedText.charAt(i));
            try{
                Thread.sleep(delayInMilliseconds);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }

}
