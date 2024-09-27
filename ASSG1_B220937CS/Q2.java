import java.util.*;

class Q2{

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        for(int i = 0;i<n;i++){
            int k ;
            k = sc.nextInt();
            a.add(k);
        }

        int target ;
        target = sc.nextInt();
        int l = 0;
        int h = n-1;
        while(l<=h){
            int m = (l+h)/2;
            if(a.get(m)==target){
                System.out.println(m);
                break;
            }
            else if(a.get(m)<target) l = m + 1;
            else h = m - 1 ;
        }

    }

}