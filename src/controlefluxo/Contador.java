package controlefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parametro1, parametro2;

        System.out.print("Dígite o primeiro parâmetro: ");
        parametro1 = sc.nextInt();
        System.out.print("Dígite o segundo parâmetro: ");
        parametro2 = sc.nextInt();
        try {
            contar(parametro1, parametro2);
        }
        catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int x, int y) throws ParametrosInvalidosException {
        if (x > y) {
            throw new ParametrosInvalidosException();
        }
        int contagem = y - x;
        for (int i=0; i<contagem; i++) {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }


}
