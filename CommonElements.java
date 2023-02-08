public class CommonElements 
{
    public static void main(String[] args)
     {
        //array values
        int[] array1 = {1,5,6,6,9,9,9,11,11,21};
        int[] array2 = {6,6,9,11,21,21,21};
        int[] array3 = new int[array1.length + array2.length];
        int count = 0;
         //loop to find common values
         for (int i = 0; i < array1.length; i++)
          {
            for (int j = 0; j < array2.length; j++) 
            {
                if (array1[i] == array2[j]) 
                {
                    array3[count] = array1[i];
                    count++;
                }
            }
        }
        //to print out my final answer
        for (int i = 0; i < count; i++) 
        {
        //put in place so that there is no repeating numbers
        if(array3[i] == array3[i+1])
            {
            System.out.print("");
            }
          else
          {
          //answer
          System.out.print(array3[i] + " ");
          }
        }
    }
}
                  