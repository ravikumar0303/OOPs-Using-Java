import java.util.Scanner;
import java.util.*;
public class Test2DArray {
    public static void accpetdata(int[][] arr) {
    	Scanner sc=new Scanner(System.in);
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr[i].length;j++) {
    			System.out.println("enter number");
    			arr[i][j]=sc.nextInt();
    		}
    	}
    }
    
    public static void displaydata(int[][] arr) {
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr[i].length;j++) {
    			System.out.print(arr[i][j]+"\t");
    			
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		accpetdata(arr);
		displaydata(arr);
        System.out.println(+arr[0][1]);
 System.out.println(+arr[2][1]);
	}

}
