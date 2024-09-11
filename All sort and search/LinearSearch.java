//The answer is based on 0 index

public class LinearSearch{
    public static void main(String[] args){
        
        int [] array = {1 , 7 , 3 , 2 , 4 , 9 , 6 , 5 , 8 , 10};
        int key = 9;

        int result = linearSearch(array, key);

        if(result != -1){
            System.out.println("The element is found at index = "+result);
        }

        else{
            System.out.println("The element is not found in the array");
        }

    }  
       
    public static int linearSearch(int [] array , int key){

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == key){
                return i;
            }
        }

        return -1;

    }

}