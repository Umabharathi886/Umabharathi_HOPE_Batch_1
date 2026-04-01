
import java.util.*;
public class FindLeaders{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        int max = arr[n-1];
        for(int i= n-1;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
         System.out.println(list);
    }
}