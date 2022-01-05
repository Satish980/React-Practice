import java.util.Scanner;
class NumberToString{
    public static String getWords(String s) {
        String word = "";
        for(int i=0;i<s.length();i++)
        {
            switch(s.charAt(i)){
                case '1': word+="ONE ";break;
                case '2': word+="TWO ";break;
                case '3': word+="THREE ";break;
                case '4': word+="FOUR ";break;
                case '5': word+="FIVE ";break;
                case '6': word+="SIX ";break;
                case '7': word+="SEVEN ";break;
                case '8': word+="EIGHT ";break;
                case '9': word+="NINE ";break;
            }
        }
        return word;    
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(getWords(s));
    }
}