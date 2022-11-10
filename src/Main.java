import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner scan=new Scanner(System.in);
        System.out.print("Basamakları toplanacak sayıyı giriniz: ");
        sayi=scan.nextInt();

        int tempSayi=sayi;
        int temp=0;
        int result=0;
        while (tempSayi !=0 ){
            temp=tempSayi % 10;
            result+=temp;
            tempSayi/=10;
        }
        System.out.println(result);

    }
}