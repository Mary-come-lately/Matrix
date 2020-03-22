import java.util.Random;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int size = scan.nextInt();
        int[][] arr = new int[size][size];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(50);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //сумма главной диагонали
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum = " + sum);

        //нечетные под главной диагональю включително
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j <= i) {
                    if (arr[i][j] % 2 != 0) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
        }
        System.out.println();
       // сравнение произведений диагоналей
        int rezult = 1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if(i == j){
                    rezult *= arr[i][j];
                }
            }
        }
        System.out.println("Rezult = " + rezult);

        int rezult2 = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == (arr.length - 1) - i) {
                    rezult2 *= arr[i][j];
                }
            }
        }
        System.out.println("Rezult2 = " + rezult2);
        if(rezult > rezult2){
            System.out.println(rezult + " > " + rezult2);
        }
        else if(rezult2 > rezult){
            System.out.println(rezult2 + " > " + rezult);
        }
        else System.out.println(rezult + " = " + rezult2);

        //сумма четных над побочной диагональю не включительно
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if(j < (arr.length-1) -i){
                    summ += arr[i][j];
                }
            }
        }
        System.out.println("Sum = " + summ);

        //транспортировка матрицы
        int tmp;
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 0; j < i; j++) {
                tmp = arr[i][j];
                 arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
