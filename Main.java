import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please input your number: ");
    String num = keyboard.nextLine();

    for(int i = num.length(); i < 0; i--){
      convert(num);
      System.out.println(i);
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
        System.out.println(names[hundreds] + " hundred and " + teens[ones]);
      }
      if(tens > 0 && ones == 0){
        System.out.println(names[hundreds] + " hundred and " + xties[tens]);
      }
      if(tens == 0 && ones > 0){
        System.out.println(names[hundreds] + " hundred and " + names[ones]);
      }
      if(tens == 0 && ones == 0){
        System.out.println(names[hundreds] + " hundred");
      }
      if(tens > 1 && ones > 0){
        System.out.println(names[hundreds] + " hundred and " + xties[tens] + "-" + names[ones]);
      }
    } 

    //for 2 digit numbers
    if(hundreds == 0 && tens > 0){
      if(tens == 1 && ones > 0){
        System.out.println(teens[ones]);
      }
      if(tens > 0 && ones == 0){
        System.out.println(xties[tens]);
      }
      if(tens > 1 && ones > 0){
        System.out.println(xties[tens] + "-" + names[ones]);
      }
    } 

    //for 1 digit numbers
    if(hundreds == 0 && tens == 0){
      System.out.println(names[ones]);
    }
  }
  
}