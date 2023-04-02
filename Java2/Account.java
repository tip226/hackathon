import java.util.Scanner;
import java.io.File; //needed for both reader and writer
import java.io.FileNotFoundException; // needed to read and write a file
public class Account extends Login{ //will include their profile, points, and their captions
    //data members
    private int points;
    //private String[] caption; //represting their photos **array?
    private String caption;

    //parameter constructor
    public Account(String email, String name, String password, int points){
        super(email, name, password);
        this.points = points; //increment by the size of caption
        //caption = readCaption(caption, "caption.txt"); //need to write the captions first
        //caption = "No captions yet";
        caption = " ";
        this.points = points;
    }

    // public String[] getCaption() {
    //     return caption;
    // }
    public String getCaption() {
        return caption;
    }
    public int getPoints() {
         return points;
    }
    // public void setCaption(String[] caption) {
    //     this.caption = caption;
    // }
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    

    // @Override
    // public String toString() {
        
    //     String out = "";
    //     for(int i = 0; i < caption.length; i ++){
    //         out += caption[i] + "/ ";
    //     }
    //     return super.toString() + String.format("%-10d", points) + out;
    // }

    @Override
    public String toString() {
        return super.toString() + String.format("%-10d\t%-50s", points, caption);
    }
    public static String[] readCaption(String[] cap, String filename){
        File file = new File(filename);
        int count = 0;
        try{
            Scanner readFile = new Scanner(file);
            while(readFile.hasNext()){
                cap[count] = readFile.nextLine();;
                count++;
            }
            readFile.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        for(int i = 0; i < cap.length; i++){
            System.out.println(cap[i]);
        }
        return cap;
    }
}
