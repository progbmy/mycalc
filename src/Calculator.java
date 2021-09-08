import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        startCalc();

        while (true) {

            System.out.println("Введите данные для расчета: ");
            String line = scanner.nextLine();

            if (line.equals("exit")) {
                exitCalc();
                break;
            }

            try {
                String[] symbols = line.split(" ");
                if (symbols.length != 3) throw new Exception("Попробуйте еще раз");

                Number firstNumber = ServiceNumber.parseAndValidate(symbols[0]);
                Number secondNumber = ServiceNumber.parseAndValidate(symbols[2], firstNumber.getType());
                String result = ActionService.calculate(firstNumber, secondNumber, symbols[1]);
                System.out.println("Результат: \n" + result);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                exitCalc();
                break;
            }
        }

        scanner.close();
    }

    private static void startCalc() {
        System.out.println("Калькулятор работает только с арабскими и римскими цифрами от 1 до 10");
        System.out.println("Работают следующие операции: Сложение(+), Вычитание(-), Умножение(*), Деление(/)");
        System.out.println("Введите 'exit' если хотите выйти");
    }

    private static void exitCalc() {

        System.out.println("До свидания!");

    }
}

