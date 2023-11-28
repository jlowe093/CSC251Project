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

         PolicyHolder currentAccountHolder = new PolicyHolder(readProviderName, readFirstName, readLastName, 
                                       readAge, readSmokingStatus, readHeight, readWeight);

         currentAccountHolder.calculateBMI();   // Call method to calculate BMI
         
         currentAccountHolder.calculatePrice();    // Call method to calculate price
   
          // Create a Policy Account object.
         Policy account = new Policy (readPolicyNum,currentAccountHolder);
         
         accountList.add(account);  // Add object to ArrayList
         
         
         
         // if/else statement to tally smoking/nonsmoking policies
         if (readSmokingStatus.equalsIgnoreCase("smoker")) 
            totalSmoker++;
         else
            totalNonsmoker++;
      
         } // End while loop
         
         for(int i=0; i < accountList.size(); i++){
            System.out.println(accountList.get(i));//notice how the toString() method does not need to be explicitly called when printing out information of our Course class
            System.out.println();//print a blank line between Courses for easier readability
         }
         
         System.out.println("\nThere were " + Policy.totalPolicy + " Policy objects created.");
         
         // Print the smoker/nonsmoker totals
         System.out.println("\nThe number of policies with a smoker is: " + totalSmoker);
         System.out.println("The number of policies with a non-smoker is: " + totalNonsmoker);
      
      inputFile.close();   // Close the file
   
   } // End main
} // End class
