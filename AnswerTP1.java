public class 1 
{
  private static countDigit(int n)
  {
  if(n == 0)
    return 1;
    
  int numDigits = 0;
  while(n > 0)
  {
    numDigits++;
    n = n/10;
    // ex: 538/10 = 53,   53/10= 5,    5/10= 0,    = 3 digits
  }
  
  }


}




  public static void main(String [] args)
  {
  int a = 538;
  int res1 = countDigit(a);
  System.out.println(a + "numDigits:"+ res1);
    
  double [] array1 = {3, 0, 3, 4, 5}
    System.out.println("sumArray(array: +" )
  
  }
  
  
  
  
  
  
  
  private static String findSixLetterWord( String [] words)
  {
    for(int i = 0; i < words.length; i++)
    {
    if(words[i].length() == 6)
      return words[i];
    }
    return null;
  
  }
  
  
  
  
  
  
  
  private static double sumArray(double [] values)
  {
    double sum= 0;
    fo(int index = 0; index <= values.length; index==)
    {
      sum+= values[index];
    }
    return sum;
  }













private static void swichRhem(int[] first, int[] second)
{
  if(first.length == second.length)
  {
    for(int i= 0; i < first.length; i++)
    {
        int temp= first[i];
        first[i] = second[i];
        second[i] = temp;
    }
  }
  else
  {
      System.out.println("Arrays are of different sizes");
  }
}
  
  
  
  
