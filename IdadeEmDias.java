import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {

        final int diasAno = 365;
        final int diasMes = 30;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();
        
        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();
        
        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();
        
        int totalDias = (anos * diasAno) + (meses * diasMes) + dias;
        
        System.out.println("A idade em dias é: " + totalDias + " dias");
        
        scanner.close();
    }
}