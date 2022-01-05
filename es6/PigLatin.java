import java.util.Scanner;
class PigLatin{
    public static String getPinglatin(String s) {
        String []arr = s.split(" ");
        String str = "";
        for(String k: arr)
            str += k.substring(1,k.length()) + k.charAt(0) + "a ";
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(getPinglatin(s));
    }
}


