package hackathon.Java;

//package hackathon.java;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 

    ArrayList arrayListOne;
    arrayListOne = new ArrayList();
    ArrayList<String> letterArray = new ArrayList<String>();

    while(true) {
      System.out.println("Type a string:");
      letterArray.add(input.nextLine());
      System.out.println("Number of string in array: " + letterArray.size());
      // Display eveything in the list
      displayList(letterArray);
    }
  }


  public static void displayList(ArrayList letterArray) {
    for(int i = 0; i < letterArray.size(); i++) 
      System.out.println(letterArray.get(i));
  }
}
