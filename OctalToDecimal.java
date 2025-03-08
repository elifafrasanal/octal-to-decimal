import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sekizlik sayıyı girin: ");
        String octalStr = scanner.nextLine();
        
        try {
            int decimalValue = Integer.parseInt(octalStr, 8); // 8 tabanında dönüştürme
            System.out.println("Onluk karşılığı: " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz sekizlik (octal) sayı!");
        }
    }
}
