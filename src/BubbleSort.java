public class BubbleSort {

    public static void bsort(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++){
            for(int j = 0; j < mas.length - i - 1; j++)
                if (mas[j] > mas[j + 1]) {
                    int x = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j+1] = x;

                }
        } 
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 9, 3};
        bsort(arr);

        for (int x : arr) {
            System.out.print(x + " ");

        }
    }
}