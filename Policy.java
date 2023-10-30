
public class Policy{
   
   private int policyNum;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   private double bmi;
   private double price;
   
   // no-arg constructor
   public Policy() {
      policyNum = 0000;
      providerName = " ";
      firstName = " ";
      lastName = " ";
      age = 0;
      smokingStatus = " ";
      height = 0.00;
      weight = 0.00;
      bmi = 0.00;
      price = 0.00;
   }
   
   // with arg constructor
   public Policy (int inputpolicyNum, String inputproviderName, String inputfirstName, String inputlastName, 
                     int inputage,String inputsmokingStatus, double inputheight,double inputweight) {
      policyNum = inputpolicyNum;
      providerName = inputproviderName;
      firstName = inputfirstName;
      lastName = inputlastName;
      age = inputage;
      smokingStatus = inputsmokingStatus;
      height = inputheight;
      weight = inputweight;
   
   }
   
   
   
   // mutator (setter) method
   public void setPolicyNum(int setPolicyNumber) {
      policyNum = setPolicyNumber;
   }
   
   // accessor (getter) method
   public int getPolicyNum() {
      return policyNum;
   }
   
   // mutator (setter) method
   public void setProviderName(String setProvider) {
       providerName = setProvider;
   }
   
   // accessor (getter) method
   public String getProviderName() {
      return providerName;
   }
   
   // mutator (setter) method
   public void setFirstName(String setFirst) {
      firstName = setFirst;
   }
   
   // accessor (getter) method
   public String getFirstName() {
      return firstName;
   }
   
   // mutator (setter) method
   public void setLastName(String setLast) {
      lastName = setLast;
   }
   
   // accessor (getter) method
   public String getLastName() {
      return lastName;
   }
   
   // mutator (setter) method
   public void setAge(int setAge1) {
      age = setAge1;
   }
   
   // accessor (getter) method
   public int getAge() {
      return age;
   }
   
   // mutator (setter) method
   public void setSmokingStatus(String setSmoking) {
      smokingStatus = setSmoking;
   }
   
   // accessor (getter) method
   public String getSmokingStatus() {
      return smokingStatus;
   }
   
   // mutator (setter) method
   public void setHeight(double setHeight1) {
      height = setHeight1;
   }
   
   // accessor (getter) method
   public double getHeight() {
      return height;
   }
   
   // mutator (setter) method
   public void setWeight(double setWeight1) {
      weight = setWeight1;
   }
   
   // accessor (getter) method
   public double getWeight() {
      return weight;
   }

   // BMI calculator method
   public double calculateBMI(double weight, double height) {
      bmi = ((weight *703)/(height*height));
      return bmi;
   }
   
   // Policy price calculator method
   public double calculatePrice(int age, String smokingStatus, double BMI) {
      double ageFee;
      double smokeFee;
      double bmiFee;
      
      if (age > 50) {
         ageFee = 75.00;
      }
      else {
         ageFee = 0.00;
      }
      
      if (smokingStatus.equalsIgnoreCase("smoker")) {
         smokeFee = 100.00;
      }
      else {
         smokeFee = 0.00;
      }
      
      if (BMI > 35) {
         bmiFee = (BMI - 35) * 20;
      }
      else {
         bmiFee = 0.00;
      }
      
      price = (600 + ageFee + smokeFee + bmiFee);
      return price;
   }
   
   public void displayPolicy () {
      
      System.out.println("\n\nPolicy Number: " + policyNum);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status: " + smokingStatus);
      System.out.print("Policyholder's Height: ");
      System.out.printf("%,.1f",height);      // Format the output
      System.out.print(" inches");
      System.out.print("\nPolicyholder's Weight: ");
      System.out.printf("%,.1f",weight);      // Format the output
      System.out.print(" pounds");
      System.out.print("\nPolicyholder's BMI: ");
      System.out.printf("%,.2f",bmi);      // Format the output
      System.out.print("\nPolicy Price: $");
      System.out.printf("%,.2f",price);      // Format the output
   }


} // End class