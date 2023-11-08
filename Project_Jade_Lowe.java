/*
Jade Lowe (#4261402)
CSC251-N852
Project Demo
*/

import java.io.*;    // import io wildcard for multiple classes to be imported
import java.util.Scanner;  // import scanner class
import java.util.ArrayList;   // import array list class


public class Project_Jade_Lowe {
   public static void main(String[] args) throws IOException { // Acknowledge the exception
      
      File file = new File("PolicyInformation.txt");
      
      Scanner inputFile = new Scanner(file);
      
      // Check if a file exists
      if (!file.exists()) {
         System.out.println("Unable to locate file.");
         System.exit(0);      // Exit the program if file does not exist
      }
      
      //variables for reading data
      int readPolicyNum;
      String readProviderName;
      String readFirstName;
      String readLastName;
      int readAge;
      String readSmokingStatus;
      double readHeight;
      double readWeight;
      int totalSmoker = 0;
      int totalNonsmoker = 0;
      double BMI;
   
      ArrayList<Policy> accountList = new ArrayList<Policy>();    // Create a new ArrayList

   
      // While loop to process file until I hit end
      while(inputFile.hasNext()) {

         // read the data
         readPolicyNum = inputFile.nextInt();
         inputFile.nextLine(); // Clear the newline
         readProviderName = inputFile.nextLine();
         readFirstName = inputFile.nextLine();
         readLastName = inputFile.nextLine();
         readAge = inputFile.nextInt();
         readSmokingStatus = inputFile.next();
         inputFile.nextLine(); // Clear the newline
         readHeight = inputFile.nextDouble();
         readWeight = inputFile.nextDouble();
         
         if (inputFile.hasNext())
            inputFile.nextLine(); // Clear the newline
         if (inputFile.hasNext())
            inputFile.nextLine(); // Skip the blank line in file

         // Create a Policy Account object.
         Policy account = new Policy (readPolicyNum, readProviderName, readFirstName, readLastName, 
                           readAge, readSmokingStatus, readHeight, readWeight);
         
         BMI = account.calculateBMI(readWeight, readHeight);   // Call method to calculate BMI
         
         account.calculatePrice(readAge, readSmokingStatus, BMI);    // Call method to calculate price
   
         account.displayPolicy();   // Call method to display policy info
         
         accountList.add(account);  // Add object to ArrayList
         
         // if/else statement to tally smoking/nonsmoking policies
         if (readSmokingStatus.equalsIgnoreCase("smoker")) 
            totalSmoker++;
         else
            totalNonsmoker++;
      
         } // End while loop
      
         System.out.println("\n\nThe number of policies with a smoker is: " + totalSmoker);
         System.out.println("The number of policies with a non-smoker is: " + totalNonsmoker);
      
      inputFile.close();   // Close the file
   
   } // End main
} // End class
