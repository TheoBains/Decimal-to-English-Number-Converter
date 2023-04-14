import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please input all numbers in the range 000 - 999 and in 3-digit form eg. 005 or 043 \n\n");

    while(true){
      System.out.print("Please input your number: ");
      String num = keyboard.nextLine();
  
      convert(num);
    }
  }

  public static void convert(String num){

    String[] names = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] xties = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    
    int hundreds = (num.charAt(0)-48);
    int tens = (num.charAt(1)-48);
    int ones = (num.charAt(2)-48);
    
     //for 3 digit numbers
    if(hundreds > 0){
     if(tens == 1 && ones > 0){
        System.out.println(names[hundreds] + " hundred and " + teens[ones] + "\n\n");
      }
      if(tens > 0 && ones == 0){
        System.out.println(names[hundreds] + " hundred and " + xties[tens] + "\n\n");
      }
      if(tens == 0 && ones > 0){
        System.out.println(names[hundreds] + " hundred and " + names[ones] + "\n\n");
      }
      if(tens == 0 && ones == 0){
        System.out.println(names[hundreds] + " hundred" + "\n\n");
      }
      if(tens > 1 && ones > 0){
        System.out.println(names[hundreds] + " hundred and " + xties[tens] + "-" + names[ones] + "\n\n");
      }
    } 

    //for 2 digit numbers
    if(hundreds == 0 && tens > 0){
      if(tens == 1 && ones > 0){
        System.out.println(teens[ones] + "\n\n");
      }
      if(tens > 0 && ones == 0){
        System.out.println(xties[tens] + "\n\n");
      }
      if(tens > 1 && ones > 0){
        System.out.println(xties[tens] + "-" + names[ones] + "\n\n");
      }
    } 

    //for 1 digit numbers
    if(hundreds == 0 && tens == 0){
      System.out.println(names[ones] + "\n\n");
    }
  }
  
}
