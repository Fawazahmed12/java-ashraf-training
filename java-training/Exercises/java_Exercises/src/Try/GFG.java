package Try;

public class GFG {
    public static void main(String args[])
    {
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 5);

        for (String a : arrOfStr)
            System.out.println(a);

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.println(alphabet[0]);
    }
}
