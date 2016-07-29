import java.io.*;

class Reverse
{
public static void main(String[] args) 
{
  int n = 1234;
  int r= 0;
  int temp = 0;
  while(n > 0)
     {
        temp = n%10;
        r = r * 10 + temp;
        n = n/10;
     }
    System.out.println("Reversed Number is: " + r);
 }                      
 }                        
               
               
              
                
   
