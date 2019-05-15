/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                        Chapter 12: Problem 2                                             *****
 *****__________________________________________________________________________________________________________*****
 *****                 2.  Write an Exception class of your own name (it should extend Exception)               *****
 *****                          with a no-arg constructor which merely calls super() and                        *****
 *****                     a 3-arg constructor which receives a String, an int and an int array.                *****
 *****                              This constructor will output the String                                     *****
 *****                                         followed by "index: "                                            *****
 *****                                      followed by the int value                                           *****
 *****                                  followed by " for an array of size: "                                   *****
 *****                            followed by the array's length (use array.length).                            *****
 *****                           Next, reimplement the final version of exercise 1 (c)                           *****
 *****                   whereby the method throws the Exception of the class you created and                   *****
 *****                               the method's body looks like this instead:                                 *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                                for(int i=0;i<20;i++)                                                     *****
 *****                                    if(i>=a.length) throw new EXCEPTION_NAME("message", i, a);            *****
 *****                                    else a[i]=i;                                                          *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                          where EXCEPTION_NAME is the name of your Exception class.                       *****
 *****                      In main, change the catch block to catch this type of Exception.                    *****
 *****                                            Run your program.                                             *****
 *****__________________________________________________________________________________________________________*****
 *****                                Question: What output did you receive?                                    *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****            Answer: You have exceeded the array length. index: 10 for an array of size: 10                *****
 *****                                        Exception_RyanHuffman                                             *****
 *****                                                                                                          *****
 *****                                 Process finished with exit code 0                                        *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

public class Chapter12_2 {

    public static void main(String[] args) {
        int[] a = new int[10];

        try{
            computeArray(a);
        }
        catch(Exception_RyanHuffman e){
            System.out.println(e);
        }
    }

    private static void computeArray(int[] intArr) throws Exception_RyanHuffman {
        for(int i = 0; i < 20; i++){
            if(i >= intArr.length) throw new Exception_RyanHuffman("You have exceeded the array length. ", i, intArr);
            else intArr[i] = i;
        }
    }
}
