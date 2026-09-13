import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        // Iterate through the string up to the second to last character
        for (int i = 0; i < s.length() - 1; i++) {
            // Check if the current character's value is less than the next
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                result -= romanMap.get(s.charAt(i));
            } else {
                result += romanMap.get(s.charAt(i));
            }
        }
        
        // Add the value of the last character, which is always added
        result += romanMap.get(s.charAt(s.length() - 1));
        
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();
        System.out.println("III -> " + converter.romanToInt("III")); // Output: 3
        System.out.println("LVIII -> " + converter.romanToInt("LVIII")); // Output: 58
        System.out.println("MCMXCIV -> " + converter.romanToInt("MCMXCIV")); // Output: 1994
    }
}
