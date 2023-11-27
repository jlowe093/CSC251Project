
public class Policy{
   
   private static int totalPolicy;
   private int policyNum;
   
   // mutator (setter) method
   // @param setPolicyNumber to set the policy number
   public void setPolicyNum(int setPolicyNumber) {
      policyNum = setPolicyNumber;
      
      totalPolicy++;
   }
   
   // accessor (getter) method
   // @return policyNum to return the policy number
   public int getPolicyNum() {
      return policyNum;
   }
   
   // Data display method 
   public String toString()
   {
      return String.format("\nPolicy Number: " + policyNum + 
                           accountHolder.toString());
   } // End display method


} // End class