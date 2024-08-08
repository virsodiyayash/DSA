public class MergeSort{
    public static void main(String[] args){
        int [] arr = {1 , 5 , 3 , 7 , 4 , 2 , 9 , 8 , 6};
        int low = 0;
        int high = arr.length - 1;

        Sort srt = new Sort();
        srt.merSort(arr, low, high);

        System.out.println("Prining array after sorting = ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

class Sort{
    public void merSort(int [] arr , int low , int high){

        if(low < high){
        int mid = (low + high) / 2;

        merSort(arr , low , mid);
        merSort(arr , mid + 1 , high);
        sortElements(arr, low, mid, high);
        }
    }

    public void sortElements(int [] arr , int low , int mid , int high){
        int [] temp = new int [arr.length];

        int i = low;
        int j = mid + 1;
        int k = low;

        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }

            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

            while(i <= mid){
                temp[k] = arr[i];
                i++;
                k++;
            }

            while(j <= high){
                temp[k] = arr[j];
                j++;
                k++;
            }

            for(int t = low ; t <= high ; t++){
                arr[t] = temp[t];
            }
        
    }
}