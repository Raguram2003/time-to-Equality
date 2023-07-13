import java.util.Arrays;
import java.util.Scanner;

class Solution{
    public int timeToEquality(int[] array,int largest){
        int count =0;
        for (int i = 0; i < array.length-1; i++) {
            count = count+(largest - array[i]);
        }
        return count;
    }
}

public class TimeToEquality {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("Enter the Elements of the array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Solution answer = new Solution();
        Arrays.sort(array);
        int largest_element=array[size-1];
        System.out.println("required seconds is : "+answer.timeToEquality(array,largest_element));
    }
}
