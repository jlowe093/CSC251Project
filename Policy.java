
public class Policy{
   
   public static int totalPolicy;
   private int policyNum;
   private PolicyHolder accountHolder;
   
   public Policy(int setPolicyNum, PolicyHolder holder) {
      policyNum = setPolicyNum;
      
      accountHolder = new PolicyHolder(holder);
      
      totalPolicy++;   
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
   
   public void setPolicyHolder(PolicyHolder holder)
   {
      accountHolder = new PolicyHolder(holder);
   }
   
   // Data display method 
   public String toString()
   {
      String str = ("\nPolicy Number: " + policyNum + 
                           accountHolder.toString());
      
      return str;
   } // End display method


} // End class