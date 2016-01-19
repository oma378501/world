/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package world;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author debian
 */
public class World {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "src/source/file.csv";
        String output = "src/source/output.csv";
        File file_input = new File(input);
        File file_output = new File(output);
        int i = 1;
        try{
            Scanner scanner = new Scanner(file_input);
            PrintWriter printer = new PrintWriter(file_output);
            while(scanner.hasNextLine()){
                
                String data = scanner.nextLine();
                String new_data = data.substring(1,data.length());
                printer.write("(");   
                printer.write(String.valueOf(i));
                printer.write(",");
                printer.write(new_data);
                printer.write("\n");
                                i++;

            }
            scanner.close();
            printer.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
    
}
