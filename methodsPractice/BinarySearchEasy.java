package methodsPractice;


import java.util.Arrays;
public class BinarySearchEasy {
	public static void main(String[] args){
	int arr[]={23,56,89,7,56,12};
	int key=89;
	int result=Arrays.binarySearch(arr,key);
	
	System.out.println("before Sorted:");
	for(int i: arr)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	Arrays.sort(arr);
	
	System.out.println("after sorted:");
	for(int j: arr)
	{
		System.out.print(j+" ");
	}
	System.out.println();
	
	if (result>0){
		System.out.println("The is found at the index: "+result);
		System.out.println("Well!! Element is found");
	}
	else{
		System.out.println("NOT found");
	}
}
}	


