import java.util.*;

class Q6{

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        for(int i = 1;i<n;i++){
            int temp = b;
            b = a + b;
            a = temp;
            System.out.println(a);
        } 
    }

}