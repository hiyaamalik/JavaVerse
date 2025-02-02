import java.util.*;

public class DefaultValues {
    public static void main(String[] args) {
        
        boolean boolVal = false;    
        byte byteVal = 0;           
        short shortVal = 0;        
        int intVal = 0;             
        long longVal = 0L;         
        float floatVal = 0.0f;     
        double doubleVal = 0.0d;   
        char charVal = '\u0000';    

        
        System.out.println("Default value of boolean: " + boolVal);
        System.out.println("Default value of byte: " + byteVal);
        System.out.println("Default value of short: " + shortVal);
        System.out.println("Default value of int: " + intVal);
        System.out.println("Default value of long: " + longVal);
        System.out.println("Default value of float: " + floatVal);
        System.out.println("Default value of double: " + doubleVal);
        System.out.println("Default value of char: '" + charVal + "'");
    }
}
