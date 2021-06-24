package minhHoaInserionSort;

public class InserttonSortStep {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        int pos, x;
        for (int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
        for (int i =0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }



}
