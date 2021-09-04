import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для расчета");
        String data = scanner.nextLine();
        //int intData = Integer.parseInt(data);
        char[] strMyArray = data.toCharArray();

        int oneperem = Integer.parseInt(String.valueOf(strMyArray[0]));
        char twoperem = strMyArray[1];
//        int twoperem = Integer.parseInt(String.valueOf(strMyArray[1]));
        int threeper = Integer.parseInt(String.valueOf(strMyArray[strMyArray.length -1]));


        System.out.println(oneperem);
        System.out.println(twoperem);
        System.out.println(threeper);



//        for (int i =0; i < strMyArray.length; i++){
//
//            System.out.print(strMyArray[i]);
//        }

//        System.out.println("Вот такие данные ввели " + data);
        // Будем использовать массив
        scanner.close();
    }
}
