package exception;
public class Exceptions {   
        public static void main(String args[]) 
        {
            int i, sum;
            try 
            {
                sum = 10;
                for (i = -1; i < 3 ;++i) 
                {
                    System.out.print(i);
                    sum = (sum / i);
                
                }
            }
            catch(ArithmeticException e) 
            {     	
                System.out.print("15");
            }
        }
    }
