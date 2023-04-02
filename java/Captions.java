package hackathon.java;
// import java.io.*;
// import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Captions {
    public static void main (String[]args){
        int input;
        Scanner s = new Scanner(System.in);
        ArrayList<String> captionsList = new ArrayList<String>();
        while (true){
                System.out.println("Add a comment:");
                captionsList.add(s.nextLine());
                System.out.println("Number of captions: " + captionsList.size());
                displayList(captionsList);
                System.out.println("Add more ? 1/Yes 2/No");
                    input = s.nextInt();
                        if(input == 1){
                            s.nextLine();
                        }else{
                            s.nextLine();
                            saveCaptions(captionsList,"caption.txt");
                            break;
                        }
            }
            
        }
        
    public static void displayList(ArrayList captionsList) {
        for(int i = 0; i < captionsList.size(); i++) 
            System.out.println(captionsList.get(i));

    }
    public static void saveCaptions (ArrayList<String> list, String filename){
        File file = new File (filename);
        try{
            PrintWriter writeFile = new PrintWriter (file);
             for (int i = 0; i< list.size(); i++){
  
                writeFile.println(list.get(i));
            
            }

            writeFile.close(); //close file
        }
        catch (FileNotFoundException e){
            System.out.println("Cannot write to " + filename);

        }

    }
}