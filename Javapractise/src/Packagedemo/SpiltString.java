package Packagedemo;

import java.util.HashSet;

public class SpiltString {
    public static void split ( String a)
    {
        StringBuilder number = new StringBuilder();
        StringBuilder letter = new StringBuilder();

        for ( char c : a.toCharArray())
        {
            if(Character.isDigit(c)){
                number.append(c);
            } else if (Character.isLetter(c)) {
                letter.append(c);

            }
        }
System.out.println(number);
        System.out.println(letter);
    }
    public static String duplicate (String a)

    {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb =new StringBuilder();
        for ( char c : a.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
               System.out.println(sb);
            }//System.out.println(sb);
      }
            return sb.toString();
    }
    public static void main(String[] args) {
        String input ="35635wdfwfw3435";
        String dinput="java selenium";
        String output =duplicate(dinput);
        System.out.println(output);

split(input);
    }
}
