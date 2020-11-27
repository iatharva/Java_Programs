import java.util.*;

class NumToText { 
   
    //For Unit place number
    static String unit[] = { " ", "One ", "Two ", "Three ", "Four ", 
                            "Five ", "Six ", "Seven ", "Eight ", 
                            "Nine ", "Ten ", "Eleven ", "Twelve ", 
                            "Thirteen ", "Fourteen ", "Fifteen ", 
                            "Sixteen ", "Seventeen ", "Eighteen ", 
                            "Nineteen " }; 
    
    //For Tens place number
    static String tens[] = { " ", "Ten ", "Twenty ", "Thirty ", "Forty ", 
                            "Fifty ", "Sixty ", "Seventy ", "Eighty ", 
                            "Ninety " }; 
  
    // n is one or two digit number 
    static String numToWords(int n, String s) 
    { 
        String str = ""; 
        // if n is more than 19, divide it 
        if (n > 19) { 
            str += tens[n / 10] + unit[n % 10]; 
        } 
        else { 
            str += unit[n]; 
        } 
  
        // if n is non-zero 
        if (n != 0) { 
            str += s; 
        } 
  
        return str; 
    } 
  
    // Function to print number in words 
    static String convertToWords(float n) 
    { 
        String s=String.valueOf(n);
        StringTokenizer t=new StringTokenizer(s,".");
       // stores the number after decimal point
        String s1=t.nextToken();
        String s2=t.nextToken();

        // stores word representation of the number
        String out = ""; 
  
        // handles digits at hundred thousands and one  
        out += numToWords((int)((n / 100000) % 100), "lakh "); 
        // handles digits at thousands and tens thousands 
        out += numToWords((int)((n / 1000) % 100), "thousand "); 
  
        // handles digit at hundreds places
        out += numToWords((int)((n / 100) % 10), "hundred "); 
  
        if (n > 100 && n % 100 > 0) { 
            out += "and "; 
        } 
  
        // handles digits at ones and tens places (if any) 
        out += numToWords((int)(n % 100), ""); 

        // handles digits after the decimal
        out +=" "+s2+"/100 ONLY";
  
        return out; 
    } 
  
    public static void main(String[] args) 
    { 
        float n = 0; 
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter a integer between 0 and 9,99,999.99 : ");
            n = sc.nextFloat();
        }
        while((n < 0 || n > 999999.99));
  
        // convert given number in words 
        System.out.printf(convertToWords(n)); 

        sc.close();
    } 
} 