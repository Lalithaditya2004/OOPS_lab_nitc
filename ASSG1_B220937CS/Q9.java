import java.util.*;

class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int freq[] = new int[26];
        for(int i= 0;i<s.length();i++){
            freq[s.charAt(i)-'a'] += 1;
        }
        for(int i = 0;i<26;i++){
            System.out.println((char)('a'+i) + " " + freq[i]);
        }

    }


}