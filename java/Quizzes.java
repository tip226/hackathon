package hackathon.java;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Quizzes {
    public static void main (String[]args){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int ranEvent[] = new int [20];
        char answer;
        int prompt; 
        int count = 0;
        int day = 1;
        boolean play = false;
        
    do{ 
        System.out.println("Question of today: " + " (day " + day +")");
        prompt =  r.nextInt(21);

        switch(prompt){
            case 1: 
            System.out.println("Which of these is used to categorise hurricanes by their wind speeds? \nA. Richter scale\nB. Saffir Simpson scale\nC. Fujita scale");
            answer = s.nextLine().charAt(0);
                if(answer == 'B'){
                    System.out.println("You got it correct! Congratulations \nThe Saffir Simpson wind scale, formerly the Saffir Simpson hurricane scale, classifies hurricanes into 5 categories.");
                    count++;
                } else {
                    System.out.println("You got it wrong. The answer is: The Saffir Simpson wind scale, formerly the Saffir-Simpson hurricane scale, classifies hurricanes into 5 categories.");
                }
            break;
            case 2: System.out.println("2. Who started the trend of naming hurricanes?\nA. Clement Wragge\nB. William Shakespeare\nC. Theodore Roosevelt");
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nClement L. Wragge, a European meteorologist started the trend of naming hurricanes.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: Clement L. Wragge, a European meteorologist started the trend of naming hurricanes. ");
            }
            break;
            case 3: System.out.println(". The Sepik river is located in which country?\nA. Papua New Guinea\nB. Indonesia\nC. New Zealand"); 
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nThe Sepik river is located in Papua New Guinea, and is prone to regular flooding.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: The Sepik river is located in Papua New Guinea, and is prone to regular flooding. ");
            }
            break;
            case 4:System.out.println(". What type of natural disaster wiped out entire villages in Iran in 1972?\nA. Blizzard\nB. Earthquake\nC. Wildfire");
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nYes, it snowed in the Middle East. And yes, it wiped out entire villages.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: Yes, it snowed in the Middle East. And yes, it wiped out entire villages.");
            } 
            break;
            case 5: System.out.println(". In 1976, a 7.8 magnitude earthquake struck, killing over 240,000 people. Which country housed this earthquake?\nA. China\nB. Turkey\nC. Kazakhstan");
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nA 7.8 magnitude earthquake struck China, and completely destroyed the city of Tangshan.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: A 7.8 magnitude earthquake struck China, and completely destroyed the city of Tangshan.");
            }
            break;
            case 6: System.out.println("In what country did the highest-magnitude earthquake occur?\nA. Chile\nB. China\nC. Cambodia");answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nThe highest-magnitude earthquake occurred to date was a 9.5-magnitude earthquake on the 22nd of May, 1960 in southern Chile.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: The highest-magnitude earthquake occurred to date was a 9.5-magnitude earthquake on the 22nd of May, 1960 in southern Chile. ");
            }
            break;
            case 7:System.out.println("One of the worst typhoons occurred in September, 1959, and occurred in which country?\nA. China\nB. Japan\nC. Australia");answer = s.nextLine().charAt(0);
            if(answer == 'B'){
                System.out.println("You got it correct! Congratulations \nAround 5,000 died during a typhoon in Japan.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: Around 5,000 died during a typhoon in Japan.");
            }
            break;
            case 8:System.out.println("What type of natural disaster nearly destroyed the Valley of Geysers?\nA. Mudflow\nB. Earthquake\nC. Hurricane");
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nYes, you heard it correctly. One of Russia’s Natural Wonders was almost completely destroyed by a mudflow.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: One of Russia’s Natural Wonders was almost completely destroyed by a mudflow.");
            }break;
            case 9:System.out.println("What caused the crash of Pan American Airlines aircraft in the 8th of December, 1963?\nA. Lightning\nB. Hurricane\nC. Tornado");
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nLightning struck the Pan American airplane, igniting its fuel reserves and blowing up the plane.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: Lightning struck the Pan American airplane, igniting its fuel reserves and blowing up the plane. ");
            }break;
            case 10: System.out.println("All of the following are true about disasters except…\nA. A disaster may be domestic or international\nB. A disaster may be caused by nature or have human origins\nC. A disaster always receives widespread media coverage");
            answer = s.nextLine().charAt(0);
            if(answer == 'C'){
                System.out.println("You got it correct! Congratulations \nIt is not true that a natural disaster always receives widespread media coverage. It may not get any media coverage at all.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: It is not true that a natural disaster always receives widespread media coverage. It may not get any media coverage at all. ");
            }break;
            case 11:System.out.println("What type of natural disaster lay waste to a city on Christmas day in 1974?\nA. Earthquake\nB. Tropical Cyclone\nC. Volcanic Eruption"); 
            answer = s.nextLine().charAt(0);
            if(answer == 'B'){
                System.out.println("You got it correct! Congratulations \nCyclone Tracy almost destroyed the city of Darwin, Australia, on Christmas day.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: Cyclone Tracy almost destroyed the city of Darwin, Australia, on Christmas day. ");
            }
            break;
            case 12:System.out.println("Where do droughts occur?\nA. In any climate\nB. In cold climates\nC. In dry, arid climates");
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nDroughts can occur in any climate on Earth.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: Droughts can occur in any climate on Earth. ");
            }
            break;
            case 13:System.out.println("Which natural disaster can produce the fastest winds on Earth?\nA. Cyclone\nB. Hurricane\nC. Tornado");
            answer = s.nextLine().charAt(0);
            if(answer == 'C'){
                System.out.println("You got it correct! Congratulations \nTornadoes are smaller than hurricanes, but they do produce faster winds.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: Tornadoes are smaller than hurricanes, but they do produce faster winds.");
            }
            break;
            case 14: System.out.println(" When and where did the Hatepe eruption occur?\nA. 180 CE / New Zealand\nB. 1925 CE / Indonesia\nC. 32 BCE / Caribbean Islands");
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nThe Hatepe eruption of the Taupo Volcano occurred in 180 CE in New Zealand.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: The Hatepe eruption of the Taupo Volcano occurred in 180 CE in New Zealand. ");
            }
            break;
            case 15:System.out.println("What are the odds of being struck by lightning in one year?\nA. 1 in 700,000\nB. 1 in 7,000,000\nC. 1 in 70,000");
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nThe odds of being struck in any one year is 1 in 700,000.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: The odds of being struck in any one year is 1 in 700,000.");
            }
            break;
            case 16:System.out.println("What are the odds of being struck by lightning in a lifetime?\nA. 1 in 3,000\nB. 1 in 30,000\nC. 1 in 300");
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nThe odds of being struck in any one year is 1 in 3,000.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: The odds of being struck in any one year is 1 in 3,000. ");
            }
            break;
            case 17:System.out.println("How often does a lightning strike occur worldwide?\nA. 2 to 3 times every second\nB. 50 to 100 times every second\nC. Once every hour");
            answer = s.nextLine().charAt(0);
            if(answer == 'B'){
                System.out.println("You got it correct! Congratulations \nSurprisingly, lightning strikes occur 50 to 100 times a second!");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: Surprisingly, lightning strikes occur 50 to 100 times a second!");
            }
            break;
            case 18:System.out.println("Natural disasters frequently result in all of the following except…\nA. Damage to the ecological environment\nB. Displacement of populations\nC. Sustained public attention");
            answer = s.nextLine().charAt(0);
            if(answer == 'C'){
                System.out.println("You got it correct! Congratulations \nAs previously stated, natural disasters don’t necessarily attract media coverage.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: As previously stated, natural disasters don’t necessarily attract media coverage. ");
            }
            break;
            case 19:System.out.println("Where did a major earthquake occur in the early 1900s?\nA. San Francisco, California\nB. Riga, Latvia\nC. Athens, Greece");
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nThe 1906 San Francisco earthquake is considered one of the deadliest in the history of California.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: The 1906 San Francisco earthquake is considered one of the deadliest in the history of California.");
            }
            break;
            case 20:System.out.println("One of the deadliest diseases in history killed at least 50 million people in the 20th century is known as…\nA. The Spanish flu\nB. Polio\nC. Smallpox");
            answer = s.nextLine().charAt(0);
            if(answer == 'A'){
                System.out.println("You got it correct! Congratulations \nThe Spanish flu killed at least 50 million people and affect more than 10 times that amount.");
                count++;
            } else {
                System.out.println("You got it wrong. The answer is: The Spanish flu killed at least 50 million people and affect more than 10 times that amount.");
            }
            break;
        }
        System.out.println("Your current point is: " + count);
        
        System.out.println("Next day ? \tY \tN" );
        char choice = s.nextLine().charAt(0);
        if (choice == 'Y'){
            day++;
            play = true;
        } else {
            play = false;
            break;
        }
        
    } while(play);

    

    }
}
