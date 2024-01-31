// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person
//# Programmers: Alejandro and Wil
//        # Course: Computer Science 212
//        # Due Date: Jan 31, 2024
//        # Lab Assignment: 2
//        # Problem Statement: Get lottery tickets for someone
//        # Data In:name
//        # Data Out:10 lottery tickets and jackpot
//        # Credits:online
import java.util.Scanner;
//allows you to find random number
import java.util.concurrent.ThreadLocalRandom;
class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        //creates scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        //gets input for user name
        System.out.print("What's your name? ");
        String customerName = input.nextLine();
        //gets rid of any spaces customer added in their name
        customerName = customerName.trim();

        System.out.println("Here are the tickets: ");

        //for loop for the columns
        for(int j = 0; j < 10; j++ ) {
            //for loop finding 6 numbers for each row
            for (int i = 0; i < 6; i++) {
                //int ranNum = ran.nextInt(100);
                int ranNum = ThreadLocalRandom.current().nextInt(0,100);
                //if the random number is less than 10 add a 0 before it
                if(ranNum <10){
                    System.out.print("0"+ranNum+" ");
                }
                else{
                    System.out.print(ranNum+" ");
                }

            }
            //goes to next line for new lottery ticket
            System.out.println("");
        }
        //prints the jackot
        System.out.println("Good Luck "+customerName+"!");
        System.out.println("Estimated Jackpot: ");
        System.out.println("$"+prize);






    }
}
