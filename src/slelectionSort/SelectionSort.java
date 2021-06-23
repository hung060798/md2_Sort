package slelectionSort;

public class SelectionSort {
    static int[] list = {54,3,2,1,6,7,8,9,6};

    public static  void selectionSort(int[] list){
        for (int i =0; i<list.length-1; i++){
            int min = list[i];
            int minIndex = i;

            for (int j = i+1; j< list.length; j++){
                if (min>list[j]){
                    min = list[j];
                    minIndex = j;
                }
            }

            if (minIndex != i){
                list[minIndex] = list[i];
                list[i]=min;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i =0; i< list.length; i++){
            System.out.println(list[i]);
        }
    }
}
