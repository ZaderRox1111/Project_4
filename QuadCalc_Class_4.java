package p4_package;

public class QuadCalc_Class_4 {

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
   public static final char DASH = '-';
   public static final char DOUBLE_DASH = '=';
   public static final char PIPE = '|';
   public static final char CROSS = '+';

   public static final String PIPE_SPACE = "| ";
   public static final String SPACE_PIPE = " |";
   public static final String SPACE_PIPE_SPACE = " | ";
   public static final String SPACE_CROSS_SPACE = " + ";
   
   //number constants for table width/title and such   
   public static final int PRECISION = 2;
   public static final int TITLE_WIDTH = 30;
   public static final int TABLE_WIDTH = 44;
   public static final int NAME_BLOCK_WIDTH = 29;
   public static final int VALUE_BLOCK_WIDTH = 12;

   public static final int TWO_ENDLINES = 2;
   public static final int TWO_SPACES = 2;
   public static final int TWO_PIPES = 2;
   
   //precision difference for testing equality
   public static final double PRECISION_OFFSET = 0.000001;
   
   //create conIO class instance
   private static Console_IO_Class conIO = new Console_IO_Class();

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      //Initialize all the variables we will need
       //complexFlag, singleFlag, ceof_A/B/C, discriminant, denominator,
       //rootOne/Two
      boolean complexFlag = false, singleFlag = false;
      double coef_A, coef_B, coef_C, discrim, sqrt_discrim, denom;
      double rootOne = 0, rootTwo = 0;
      
      //Display title: Quadratic Root Finding Program
       //Method: printString, printEndline, printChars, printEndlines
      conIO.printString("Quadratic Root Finding Program");
      conIO.printEndline();
      conIO.printChars(TITLE_WIDTH, DOUBLE_DASH);
      conIO.printEndlines(TWO_ENDLINES);
      
      //get coefficient a,b,c as input from the user as a double
       //Method: promptForDouble, printEndlines
      coef_A = conIO.promptForDouble("Enter Coefficient A: ");
      coef_B = conIO.promptForDouble("Enter Coefficient B: ");
      coef_C = conIO.promptForDouble("Enter Coefficient C: ");
      
      conIO.printEndline();
      
      //In calculations REMEMBER to use precision offset when applicable!
      //Calculate the denominator
      denom = 2 * coef_A;
      
      //Calculate the discriminant: b^2 - 4ac
      discrim = Math.pow(coef_B, 2) - (4 * coef_A * coef_C);
      
      //Determine the sign of the discriminant      
      //If the discriminant is negative, set the complexFlag
         //No additional calculations needed after complexFlag is set
      //I am only adding the offset here, because if it was barely below zero (technically zero) the offset would see that it isn't negative
      if (discrim + PRECISION_OFFSET < 0)
      {
         complexFlag = true;
      }
      
      //Otherwise
      //If the discriminant is equal to zero, set the single flag
         //Complete the calculations for the single root
         //find -b divided by the denominator to find the single root
      else if (discrim + PRECISION_OFFSET > 0 && discrim - PRECISION_OFFSET < 0)
      {
         singleFlag = true;
         rootOne = -coef_B / denom;
      }
      
      //Otherwise there are two roots
         //Complete the calculations for two roots
         //Find square root of discriminant
         //find -b +/- square root of discriminant divided by denominator to find both roots
      else
      {
         sqrt_discrim = Math.sqrt(discrim);
         rootOne = (-coef_B + sqrt_discrim) / (2 * coef_A);
         rootTwo = (-coef_B - sqrt_discrim) / (2 * coef_A);
      }
      
      //Display the first part of the table
       //Method: printChars, printString, printEndline
      conIO.printChar(PIPE);
      conIO.printChars(TABLE_WIDTH - TWO_PIPES, DOUBLE_DASH);
      conIO.printChar(PIPE);
      conIO.printEndline();
      
      conIO.printChar(PIPE);
      conIO.printString("QUADRATIC ROOT RESULTS", TABLE_WIDTH - TWO_PIPES, "CENTER");
      conIO.printChar(PIPE);
      conIO.printEndline();
      
      conIO.printChar(PIPE);
      conIO.printChars(TABLE_WIDTH - TWO_PIPES, DASH);
      conIO.printChar(PIPE);
      conIO.printEndline();
      
      conIO.printString(PIPE_SPACE);
      conIO.printString("VALUE NAME", NAME_BLOCK_WIDTH - TWO_SPACES, "CENTER");
      conIO.printString(SPACE_PIPE_SPACE);
      conIO.printString("VALUE", VALUE_BLOCK_WIDTH - TWO_SPACES, "CENTER");
      conIO.printString(SPACE_PIPE);
      conIO.printEndline();
      
      conIO.printChar(PIPE);
      conIO.printChars(NAME_BLOCK_WIDTH, DOUBLE_DASH);
      conIO.printChar(PIPE);
      conIO.printChars(VALUE_BLOCK_WIDTH, DOUBLE_DASH);
      conIO.printChar(PIPE);
      conIO.printEndline();
      
      conIO.printString(PIPE_SPACE);
      conIO.printString("Coefficient A", NAME_BLOCK_WIDTH - TWO_SPACES, "LEFT");
      conIO.printString(SPACE_CROSS_SPACE);
      conIO.printDouble(coef_A, PRECISION, VALUE_BLOCK_WIDTH - TWO_SPACES, "RIGHT");
      conIO.printString(SPACE_PIPE);
      conIO.printEndline();
      
      conIO.printChar(PIPE);
      conIO.printChars(NAME_BLOCK_WIDTH, DASH);
      conIO.printChar(PIPE);
      conIO.printChars(VALUE_BLOCK_WIDTH, DASH);
      conIO.printChar(PIPE);
      conIO.printEndline();
      
      conIO.printString(PIPE_SPACE);
      conIO.printString("Coefficient B", NAME_BLOCK_WIDTH - TWO_SPACES, "LEFT");
      conIO.printString(SPACE_CROSS_SPACE);
      conIO.printDouble(coef_B, PRECISION, VALUE_BLOCK_WIDTH - TWO_SPACES, "RIGHT");
      conIO.printString(SPACE_PIPE);
      conIO.printEndline();
      
      conIO.printChar(PIPE);
      conIO.printChars(NAME_BLOCK_WIDTH, DASH);
      conIO.printChar(PIPE);
      conIO.printChars(VALUE_BLOCK_WIDTH, DASH);
      conIO.printChar(PIPE);
      conIO.printEndline();
      
      conIO.printString(PIPE_SPACE);
      conIO.printString("Coefficient C", NAME_BLOCK_WIDTH - TWO_SPACES, "LEFT");
      conIO.printString(SPACE_CROSS_SPACE);
      conIO.printDouble(coef_C, PRECISION, VALUE_BLOCK_WIDTH - TWO_SPACES, "RIGHT");
      conIO.printString(SPACE_PIPE);
      conIO.printEndline();
      
      conIO.printChar(PIPE);
      conIO.printChars(NAME_BLOCK_WIDTH, DOUBLE_DASH);
      conIO.printChar(PIPE);
      conIO.printChars(VALUE_BLOCK_WIDTH, DOUBLE_DASH);
      conIO.printChar(PIPE);
      conIO.printEndline();
      
      //Check for complexFlag
         //If set, display a row saying the roots are complex
      if (complexFlag)
      {
         conIO.printString(PIPE_SPACE);
         conIO.printString("Roots", NAME_BLOCK_WIDTH - TWO_SPACES, "LEFT");
         conIO.printString(SPACE_CROSS_SPACE);
         conIO.printString("Complex", VALUE_BLOCK_WIDTH - TWO_SPACES, "RIGHT");
         conIO.printString(SPACE_PIPE);
         conIO.printEndline();
         
         conIO.printChar(PIPE);
         conIO.printChars(NAME_BLOCK_WIDTH, DOUBLE_DASH);
         conIO.printChar(PIPE);
         conIO.printChars(VALUE_BLOCK_WIDTH, DOUBLE_DASH);
         conIO.printChar(PIPE);
         conIO.printEndline();
      }
      
      //Otherwise check for singleFlag
         //If set, display a row containing the single root
      else if (singleFlag)
      {
         conIO.printString(PIPE_SPACE);
         conIO.printString("Single Root", NAME_BLOCK_WIDTH - TWO_SPACES, "LEFT");
         conIO.printString(SPACE_CROSS_SPACE);
         conIO.printDouble(rootOne, PRECISION, VALUE_BLOCK_WIDTH - TWO_SPACES, "RIGHT");
         conIO.printString(SPACE_PIPE);
         conIO.printEndline();
         
         conIO.printChar(PIPE);
         conIO.printChars(NAME_BLOCK_WIDTH, DOUBLE_DASH);
         conIO.printChar(PIPE);
         conIO.printChars(VALUE_BLOCK_WIDTH, DOUBLE_DASH);
         conIO.printChar(PIPE);
         conIO.printEndline();
      }
      
      //Otherwise display two rows with both roots
       //Method: printChars, printString, printEndline, printDouble
      else
      {
         conIO.printString(PIPE_SPACE);
         conIO.printString("Root One", NAME_BLOCK_WIDTH - TWO_SPACES, "LEFT");
         conIO.printString(SPACE_CROSS_SPACE);
         conIO.printDouble(rootOne, PRECISION, VALUE_BLOCK_WIDTH - TWO_SPACES, "RIGHT");
         conIO.printString(SPACE_PIPE);
         conIO.printEndline();
         
         conIO.printChar(PIPE);
         conIO.printChars(NAME_BLOCK_WIDTH, DASH);
         conIO.printChar(PIPE);
         conIO.printChars(VALUE_BLOCK_WIDTH, DASH);
         conIO.printChar(PIPE);
         conIO.printEndline();
         
         conIO.printString(PIPE_SPACE);
         conIO.printString("Root Two", NAME_BLOCK_WIDTH - TWO_SPACES, "LEFT");
         conIO.printString(SPACE_CROSS_SPACE);
         conIO.printDouble(rootTwo, PRECISION, VALUE_BLOCK_WIDTH - TWO_SPACES, "RIGHT");
         conIO.printString(SPACE_PIPE);
         conIO.printEndline();
         
         conIO.printChar(PIPE);
         conIO.printChars(NAME_BLOCK_WIDTH, DOUBLE_DASH);
         conIO.printChar(PIPE);
         conIO.printChars(VALUE_BLOCK_WIDTH, DOUBLE_DASH);
         conIO.printChar(PIPE);
         conIO.printEndline();
      }
      
      //End Program
       //Method: printString, printEndlines
      conIO.printEndline();
      conIO.printString("End Program");
   }

}