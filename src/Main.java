import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для расчета");
        String data = scanner.nextLine();

        System.out.println("Вот такие данные ввели " + data);
    }
}
