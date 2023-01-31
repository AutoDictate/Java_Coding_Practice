package methodsPractice;
class BinarySearch{  
 public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   System.out.println(mid);
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;
        System.out.println("first"+first);
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
      System.out.println("after"+mid);
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[]){  
        int arr[] = {10,20,32,43,30,40,50};  
        int key = 50;  
        int last=arr.length-1;
        System.out.println(last);
        binarySearch(arr,0,last,key);     
 }  
}  