import java.util.*;

class Q3{
    
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        HashMap<String,String> map = new HashMap<>();
        String arr[] = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.next();
            String name = sc.nextLine();
            map.put(arr[i],name);
        }
        Arrays.sort(arr);
        for(int i = 0;i<n;i++){
            System.out.println(arr[i] + " " + map.get(arr[i]));
        }

    }

}