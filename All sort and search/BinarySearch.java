//The answer is based on 0 index

public class BinarySearch {
    public static void main(String[] args){
        int [] array = {1 , 3 , 5 , 7 , 9 , 11 , 13 , 15 , 17 ,19};
        int key = 15;

        int low = 0;
        int high = array.length - 1;
        int flag = 0;

        while(low <= high){
            int mid = (low + high)/2;

            if(array[mid] == key){
                flag = 1;
                System.out.println("The element is found at the index = "+mid);
                return;
            }

            else if(key > array[mid]){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }

        if(flag == 1){
            System.out.println("The element is in an array");
        }

        else{
            System.out.println("The element is not in an array");
        }
    }
}
