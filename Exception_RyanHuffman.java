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
 ********************************************************************************************************************
 ********************************************************************************************************************/

public class Exception_RyanHuffman extends Exception {

    public Exception_RyanHuffman(){
        super();
    }

    public Exception_RyanHuffman(String str, int num, int[] intArr){
        System.out.println(str + "index: " + num + " for an array of size: " + intArr.length);
    }
}
