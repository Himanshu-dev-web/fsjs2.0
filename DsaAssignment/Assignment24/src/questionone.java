import java.util.HashMap;

public class questionone {

    private static final HashMap<Character, Integer> ROMAN_NUMERALS = new HashMap<>();

    static {
        ROMAN_NUMERALS.put('I', 1);
        ROMAN_NUMERALS.put('V', 5);
        ROMAN_NUMERALS.put('X', 10);
        ROMAN_NUMERALS.put('L', 50);
        ROMAN_NUMERALS.put('C', 100);
        ROMAN_NUMERALS.put('D', 500);
        ROMAN_NUMERALS.put('M', 1000);
    }

    public static int romanToInteger(String romanNumeral) {
        int value = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            int currentValue = ROMAN_NUMERALS.get(romanNumeral.charAt(i));
            if (i + 1 < romanNumeral.length() && ROMAN_NUMERALS.get(romanNumeral.charAt(i + 1)) > currentValue) {
                value -= currentValue;
            } else {
                value += currentValue;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("LVIII")); // 58
    }
}