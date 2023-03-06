import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Длинна вашего массива: ");
        int lengthMass = in.nextInt();
        int[] sortArr = new int[lengthMass];
        for (int i = 0; i < lengthMass; i++) {
            System.out.printf("Число номер %d: ", i);
            sortArr[i] = in.nextInt();
        }
        combSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + ", ");
    }

    }
    public static void combSort(int[] arr) {
        int n = arr.length;
        int step = n;
        double factor = 1.247;
        boolean sorted = false;

        while (!sorted) {
            step = (int) Math.floor(step / factor);
            if (step <= 1) {
                step = 1;
                sorted = true;
            }
            int i = 0;
            while (i + step < n) {
                if (arr[i] > arr[i + step]) {
                    int temp = arr[i];
                    arr[i] = arr[i + step];
                    arr[i + step] = temp;
                    sorted = false;
                }
                i++;
            }
        }
    }
}