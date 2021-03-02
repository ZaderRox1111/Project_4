package p4_package;

public class QuadCalc_Class_3 {

   //The overall goal of this program is to determine the roots of a quadratic-
   //whether it is complex, one root, or two, and display it in a table
   
   //First we will need to initialize variables and classes
   //Then we will create the title, followed by inputing three coefficients
   //Then we will do all the calculations required by finding the discriminant
   //using the discrimant we will determine how many roots it has, or complexity
   //We will then create a table adjusted for the root types and display it
   //End the program
   
   //Initialize constants
   //constants for creating the table
   
   //number constants for table width/title and such   
   
   //precision difference for testing equality
   
   //create conIO class instance
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub

      //Initialize all the variables we will need
       //complexFlag, singleFlag, ceof_A/B/C, discriminant, denominator,
       //rootOne/Two
      
      //Display title: Quadratic Root Finding Program
       //Method: printString, printEndline, printChars, printEndlines
      
      //get coefficient a,b,c as input from the user as a double
       //Method: promptForDouble, printEndlines
      
      //In calculations REMEMBER to use precision offset when applicable!
      //Calculate the denominator
      //Calculate the discriminant: b^2 - 4ac
      //Determine the sign of the discriminant
      //If the determine is negative, set the complexFlag
         //No additional calculations needed after complexFlag is set
      //Otherwise
      //If the discriminant is equal to zero, set the single flag
         //Complete the calculations for the single root
         //find -b divided by the denominator to find the single root
      //Otherwise there are two roots
         //Complete the calculations for two roots
         //Find square root of discriminant
         //find -b +/- square root of discriminant divided by denominator to find both roots
      
      //Display the first part of the table
       //Method: printChars, printString, printEndline
      //Check for complexFlag
         //If set, display a row saying the roots are complex
      //Otherwise check for singleFlag
         //If set, display a row containing the single root
      //Otherwise display two rows with both roots
       //Method: printChars, printString, printEndline, printDouble
      
      //End Program
       //Method: printString, printEndlines

      
   }

}
