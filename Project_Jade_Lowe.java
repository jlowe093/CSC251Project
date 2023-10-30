/*
Jade Lowe (#4261402)
CSC251-N852
Project Demo
*/

import java.util.Scanner;  // Needed for the Scanner class

public class Project_Jade_Lowe {

   public static void main(String[] args) {
      
      int inputPolicyNum;
      String inputProviderName;
      String inputFirstName;
      String inputLastName;
      int inputAge;
      String inputSmokingStatus;
      double inputHeight;
      double inputWeight;
      double BMI;
      
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      inputPolicyNum = keyboard.nextInt();
      
      System.out.print("Please enter the Provider Name: ");
      inputProviderName = keyboard.nextLine();
      inputProviderName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      inputFirstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      inputLastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      inputAge = keyboard.nextInt();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      inputSmokingStatus = keyboard.nextLine();
      inputSmokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      inputHeight = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      inputWeight = keyboard.nextDouble();
      
      
      // Create a BankAccount object.
      Policy account = new Policy (inputPolicyNum, inputProviderName, inputFirstName, inputLastName, 
                     inputAge, inputSmokingStatus, inputHeight, inputWeight);
      
      BMI = account.calculateBMI(inputWeight, inputHeight);
      
      account.calculatePrice(inputAge, inputSmokingStatus, BMI);

      account.displayPolicy ();
   
   } // End main

} // End class
