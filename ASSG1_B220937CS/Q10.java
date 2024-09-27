import java.util.*;

class Q10{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        a = sc.nextLine();
        b = sc.nextLine();
        int n1 = a.length();
        a = a+b;
        b = a.substring(0,n1);
        a = a.substring(n1);

        System.out.println(a);
        System.out.println(b);
    }

}