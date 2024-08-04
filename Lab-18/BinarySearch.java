public class BinarySearch {
    public static void main(String[] args) {
        int key = 10;
        int [] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 , 20 ,
                    21 , 22 , 23 , 24 , 25};
        
        int low = 0;
        int high = arr.length - 1;
        int flag = 0;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == key){
                flag = 1;
                System.out.println("Element is found is at = "+mid);
                return;
            }

            else if(key > arr[mid]){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        if(flag == 1){
            System.out.println("Element is in an array");
        }
        else{
            System.out.println("Element is not in an array");
        }
    }
}
