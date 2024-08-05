public class SelectionSort{
    public static void main(String[] args){
        int [] a = {1 , 5 , 3 , 6 , 4 , 9 , 2 , 8 , 0 , 7 , -5};
        int length = a.length;

        for(int i = 0 ; i < length ; i++){
            int smallest = i;

            for(int j = i + 1 ; j < length ; j++){
                if(a[smallest] > a[j]){
                    smallest = j;
                }
            }  
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
        }

        for(int i = 0 ; i < length ; i++){
            System.out.print(a[i] + " ");
        }
    }
}