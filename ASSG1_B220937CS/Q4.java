import java.util.*;

class Q4{
    
    public static void  main(String[] args){
        String s;
        Set<Character> hash = new HashSet<Character>();
        hash.add('a');
        hash.add('e');
        hash.add('i');
        hash.add('o');
        hash.add('u');
        hash.add('A');
        hash.add('E');
        hash.add('I');
        hash.add('O');
        hash.add('U');
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        for(int i = 0;i<s.length();i++){
            if(hash.contains(s.charAt(i))){
                System.out.println("Yes");
                break;
            }
            else if(i==s.length()-1){
                System.out.println("No");
                break;
            }
        }
    }


}