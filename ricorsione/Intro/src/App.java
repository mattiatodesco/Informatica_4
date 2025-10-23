import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inserisci numero");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibonacci(n));

        in.close();
        }

    public static int fatt(int n){
        //condizione di uscita
        if (n == 1)
            //caso banale: fattoriale (1) = 1
            return 1;
            //chiamata ricorsiva
        return fatt(n-1) * n;
    }

    public static int fibonacci (int n){
        if (n == 0 || n == 1)
            return 1;
        return fibonacci (n-1) + fibonacci (n-2);
    }

    public static int diagonali (int lati){
        if (lati == 3)
            return 0;
        return diagonali(lati - 1) + lati -2;
    }
}
