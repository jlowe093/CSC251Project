
public class Policy{
   
   private int policyNum;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
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
   }
   
   // with arg constructor
   public Policy (int policyNum, String providerName, String firstName, String lastName, 
                     int age,String smokingStatus, double height,double weight) {
   
   }
   
   // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
   
   // mutator (setter) method
   public void setPolicyNum() {
   
   }
   
   // accessor (getter) method
   public int getPolicyNum() {
   
   }
   
   


} // End class