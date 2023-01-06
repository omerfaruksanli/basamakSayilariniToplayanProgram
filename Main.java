import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        int basNumber=0 ;
        int basValue;
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print(" Sayı : ");
        number = input.nextInt();
        int tempNumber = number;
        while (tempNumber !=0){
            basValue = tempNumber %10 ;
            total +=basValue;
            tempNumber/=10;
        }
        System.out.print(" Toplam : " + total);

    }
}