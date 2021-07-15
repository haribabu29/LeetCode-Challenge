public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {29, 10, 14, 37, 13};
        SelectionSort ss = new SelectionSort();
        int[] sorted = ss.selectionSortAlgo(a);
        for(int i = 0 ; i < sorted.length; i ++ ){
            System.out.println(sorted[i]);
        }
    }

    public int[] selectionSortAlgo(int[] aValue){
        for(int i = 0 ; i < aValue.length - 1 ; i++){
            for(int j = i + 1 ; j < aValue.length ; j++ ){
                if(aValue[i] > aValue[j]){
                    int temp = aValue[j];
                    aValue[j] = aValue[i];
                    aValue[i] = temp;
                }
            }
        }
        return aValue;
    }
}