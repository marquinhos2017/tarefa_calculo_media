import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
        float n1, n2,n3,n4;

        System.out.printf("Nota 1: ");
        n1 = ler.nextFloat(); // 3. entrada de dados (lendo um valor inteiro)

        System.out.printf("Nota 2: ");
        n2 = ler.nextFloat(); // 3. entrada de dados (lendo um valor inteiro)

        System.out.printf("Nota 3: ");
        n3 = ler.nextFloat(); // 3. entr

        System.out.printf("Nota 4: ");
        n4 =ler.nextFloat(); // 3. entr

        System.out.printf("\nResultados:\n");
        System.out.printf("%.2f\n", (n1+n2+n3+n4)/4);

    }

}