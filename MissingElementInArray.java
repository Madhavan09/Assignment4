package week1.day4;
public class MissingElementInArray {
    public static void main(String[] args) {
    	
	int[] array= {6,5,4,2,1};
	int n=array.length+1;
	int sum=(n*(n+1)/2);
	for(int i=0;i<array.length;i++) {
		sum=sum-array[i];
	}
	System.out.println("Missing number is"+sum);
}
}




