import java.util.Scanner;
import java.io.File; //needed for both reader and writer
import java.io.FileNotFoundException; // needed to read and write a file
import java.io.PrintWriter; // needed to write file
import java.security.Policy;
public class Test {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        // corresponds to the app login page
        System.out.println("Sign up or Login?");
        String choice = scan.nextLine();
        Account[] accts = new Account[50]; //for a demo's sake it's going to b an array of maximum 50
        String filename = "userInfo";
        int arrayNum = readAccount(accts, filename);
        String name = "";
        String email = "";
        String pw = "";
        int points = 0;
        boolean loop = true;
        boolean loop1 = true;
        do{
            switch(choice.charAt(0)){
                case 'S': // if the user is signing up
                    System.out.println("Name (First and Last): ");
                    name = scan.nextLine();
                    System.out.println("Email: "); 
                    email = scan.nextLine();
                    boolean cont = checkEmail(accts, email, arrayNum);//check is not alreaady taken
                    if(cont){
                        System.out.println("Password: ");
                        pw = scan.nextLine();
                        System.out.println("Confirm Password: ");
                        String pw1 = scan.nextLine();
                        //String junk = scan.nextLine(); // clear scanner

                        if(pw.equals(pw1)){
                            Login login = new Login(email, name, pw); // their new account
                            Account account = new Account(email, name, pw, 0);
                            addAccount(accts, account, arrayNum);
                            arrayNum++;
                            //System.out.println(login);
                            System.out.println("Welcome to Flicko " + name);
                            loop1 = false;
                        }
                        else{
                            System.out.println("Password does not match, account not created");
                        }
                        saveAccount(accts, filename, arrayNum);
                    }
                    else{
                        System.out.println("User name is already taken");
                    }

                    break;
                case 'L': // if the user is logining
                    System.out.println("Email: "); //check is not alreaady taken
                    email = scan.nextLine();
                    System.out.println("Password: ");
                    pw = scan.nextLine();
                    Account exists = findAccount(accts, email, arrayNum, pw);
                    if(exists != null){
                        System.out.println(exists);
                        loop1 = false;
                    }
                    else{
                        System.out.println("Account not found: either email or password is incorrect");
                    }
                    break;
                default:
                    System.out.println("Not an option on the app's screen");
                    break;
                }
            }while(loop1);

            do{
                System.out.println("\nHome screen options: ");
                System.out.println("a: Profile");
                System.out.println("b: Sign out of app (and save)");

                choice = scan.next();
                switch(choice.charAt(0)){
                    case 'a':
                        Account profile = findAccount(accts, email, arrayNum, pw);
                        System.out.println("How many more points did you win from the Quizzes? ");
                        points = scan.nextInt();
                        updateProfile(accts, profile, points, arrayNum);
                        System.out.println(profile);
                        break;

                    case 'b':
                        System.out.println("You have exited Flicko");
                        loop = false;
                        break;

                    default:
                        System.out.println("Not an option");
                        break;
                        
                }
            }while(loop);

    }

    public static void saveAccount(Account[] acc, String filename, int arrayNum){
        File file = new File(filename);
        //System.out.println(arrayNum);
            try{
                PrintWriter writeFile = new PrintWriter(file);
                for(int i = 0; i < arrayNum; i++){ //rows

                    // System.out.println(acc[i].getName());
                    // System.out.println(acc[i].getEmail());
                    // System.out.println(acc[i].getPassword());
                    writeFile.println(acc[i].getName() + " " + acc[i].getEmail() + " " + acc[i].getPassword() + " " + acc[i].getPoints());
                }
                writeFile.close(); //must close file
            }
            catch (FileNotFoundException e){
                System.out.println("Cannot write to " + filename);
            }
    }

    public static int readAccount(Account[] acc, String filename){
        File file = new File(filename);
        int count = 0;
        try{
            Scanner readFile = new Scanner(file);
            while(readFile.hasNext()){
                String name = readFile.next() + " " + readFile.next();
                String email = readFile.next();
                String pw = readFile.next();
                int pts = readFile.nextInt();

                acc[count] = new Account(email, name, pw, pts);
                count++;
            }
            readFile.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return count;
    }
    public static boolean checkEmail(Account[] acnt, String email, int arrayNum){
        if(acnt[0] == null){
            return true;
        }
        else{
            for(int i = 0; i < arrayNum; i ++){
            if(email.equals(acnt[i].getEmail())){
                return false;
                }
            }
        }
        return true;
    }

    public static Account findAccount(Account[] acnt, String email, int arrayNum, String pw){
        for(int i = 0; i < arrayNum; i++){
            if(email.equals(acnt[i].getEmail()) && pw.equals(acnt[i].getPassword())){
                return acnt[i];
            }
        }
        return null;
    }

    public static void addAccount(Account[] acnt, Account account, int arrayNum){
        for(int i = 0; i < arrayNum + 1; i++){
            if(acnt[i] == null){
                acnt[i] = account;
            }
        }
    }

    public static void printAccounts(Account[] acnt, int arrayNum){
        for(int i = 0; i < arrayNum; i++){
            System.out.println(acnt[i]);
        }
    }

    public static void updateProfile(Account[] acnt, Account account, int points, int arrayNum){
        for(int i = 0; i < arrayNum; i++){
            if(acnt[i].getEmail().equals(account.getEmail()))
                account.setPoints(account.getPoints() + points);
        }
        saveAccount(acnt, "userInfo", arrayNum);
    }
}
