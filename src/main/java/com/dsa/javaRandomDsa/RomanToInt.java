import java.util.Scanner;

public  class RomanToInt{
    public static int getCurrentValue(char a ) {
        return switch (a) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default  -> 0;
        };
    }
 public static int getValue (String roman){
     int total =0;
  for(int i =0 ; i< roman.length()-1; i++){
   int   currentValue = getCurrentValue(roman.charAt(i));
   int nextValue= getCurrentValue(roman.charAt(i+1));

   if (currentValue < nextValue) {
       total -= currentValue;
   } else {
       total += currentValue;
   }
  }
total += getCurrentValue(roman.charAt(roman.length() - 1));

  return total;

 }
    public static void  main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String roman = sc.nextLine(); 
 int getValue = getValue(roman.toUpperCase());
 System.out.println(getValue);
  
}
  
    }
