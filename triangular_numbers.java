//Написать программу вычисления n-ого треугольного числа.


import java.util.Scanner;

public class triangular_numbers {
    
    
    static int Tn(int n) { // с помощью рекурсии
        if(n==1)return 1;
        return n + Tn(n-1);
    }
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("N: ");
        int N = iScanner.nextInt();
        if (N == 0) {
            System.out.printf("Введите число отличное от 0");
            
        }
        else{
        double res =0.5 * N*(N+1);
        int value = (int) res;
        System.out.printf("triangular_number = ");
        System.out.println(value);
        System.out.printf("Tn_rekur = ");
        System.out.println(Tn(N));

        iScanner.close();
        }
        
    }
}