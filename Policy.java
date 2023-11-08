
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
   
   // no-arg constructor to set the default 
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
   
   /* with arg constructor to create an object
      @param inputpolicyNum to set the policy number
      @param inputproviderName to set the provider name
      @param inputfirstName to set the first name
      @param inputlastName to set the last name
      @param inputage to set the age
      @param inputsmokingStatus to set the smoking status
      @param inputheight
      @param inputweight
   */
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
   // @param setPolicyNumber to set the policy number
   public void setPolicyNum(int setPolicyNumber) {
      policyNum = setPolicyNumber;
   }
   
   // accessor (getter) method
   // @return policyNum to return the policy number
   public int getPolicyNum() {
      return policyNum;
   }
   
   // mutator (setter) method
   // @param setProvider to set the provider name
   public void setProviderName(String setProvider) {
       providerName = setProvider;
   }
   
   // accessor (getter) method
   // @return providerName to return the provider name
   public String getProviderName() {
      return providerName;
   }
   
   // mutator (setter) method
   // @param setFirst to set the first name
   public void setFirstName(String setFirst) {
      firstName = setFirst;
   }
   
   // accessor (getter) method
   // @return firstName to return the first name
   public String getFirstName() {
      return firstName;
   }
   
   // mutator (setter) method
   // @param setLast to set the last name
   public void setLastName(String setLast) {
      lastName = setLast;
   }
   
   // accessor (getter) method
   // @return lastName to return the last name
   public String getLastName() {
      return lastName;
   }
   
   // mutator (setter) method
   // @param setAge1 to set the age
   public void setAge(int setAge1) {
      age = setAge1;
   }
   
   // accessor (getter) method
   // @return age to return the age
   public int getAge() {
      return age;
   }
   
   // mutator (setter) method
   // @param setSmoking to set the smoking status
   public void setSmokingStatus(String setSmoking) {
      smokingStatus = setSmoking;
   }
   
   // accessor (getter) method
   // @return smokingStatus to return the smoking status
   public String getSmokingStatus() {
      return smokingStatus;
   }
   
   // mutator (setter) method
   // @param setHeight1 to set the height
   public void setHeight(double setHeight1) {
      height = setHeight1;
   }
   
   // accessor (getter) method
   // @return height to return the height
   public double getHeight() {
      return height;
   }
   
   // mutator (setter) method
   // @param setWeight1 to set the weight
   public void setWeight(double setWeight1) {
      weight = setWeight1;
   }
   
   // accessor (getter) method
   // @return weight to return the weight
   public double getWeight() {
      return weight;
   }

   // BMI calculator method
   // @param weight to calculate BMI
   // @param height to calculate BMI
   // @return bmi to return the BMI
   public double calculateBMI(double weight, double height) {
      bmi = ((weight *703)/(height*height));
      return bmi;
   } // End BMI method
   
   // Policy price calculator method
   // @param age to determine age fee
   // @param smokingStatus to determine smoking fee
   // @param BMI to determine BMI fee
   // @return price to return the policy price
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
   } // End price method 
   
   // Data display method 
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
   } // End display method


} // End class