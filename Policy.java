
public class Policy{
   
   private int policyNum;
   
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
   
   // Data display method 
   public void displayPolicy () {
      
      System.out.println("\n\nPolicy Number: " + policyNum);
   } // End display method


} // End class