import java.util.*;

class Q5{
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int n = s.length();
        StringBuilder news  = new StringBuilder(s);
        for(int i = 0;i<s.length()/2;i++){
            char temp = s.charAt(i);
            news.setCharAt(n-i-1, temp);
            news.setCharAt(i, s.charAt(n-i-1));
        }
        System.out.println(news);
    }



}