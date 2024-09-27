import java.util.*;
class Q8{

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int A[][] = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                int x = sc.nextInt();
                A[i][j] = x;
            }
        }
   

        for(int i = 0;i<n;i++){
            for(int j =i +1;j<n;j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }


    }


}