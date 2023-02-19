import java.util.Scanner;

public class App {

    static boolean isAsal(int number, int i){
        if (i==1){
        return true;
        }else{
            if(number % i == 0){
                return false;
            }else{
                return isAsal(number, --i);
            }
        }
     }
public static void main (String[] args) throws Exception {
    Scanner inp = new Scanner(System.in);
    System.out.print("Sayı giriniz : ");
    int n = inp.nextInt();

    if(isAsal(n, n/2))
        System.out.println(n + " sayısı ASALDIR.");
    else 
    System.out.println(n + " sayısı ASAL DEĞİLDİR.");
}
}