import java.util.Scanner;

public class Calcylator {
    public static String calc(String input) throws Exception {

        String[] sing = new String[]{"+", "-", "*", "/"};
        String[] split = new String[]{"\\+", "-", "\\*", "/"};
        Convert convert = new Convert();
        int singsave = -1;
        for (int i = 0; i < sing.length; i++) {
            if (input.contains(sing[i])) {
                singsave = i;
            }
        }
        if (singsave == -1) {
            throw new Exception("Некорректное выражение");
        }
        String[] number = input.split(split[singsave]);
        if (convert.Roman(number[0]) == convert.Roman(number[1])) {
            if (number.length > 2) {
                throw new Exception("Вы ввели больше двух чисел");
            }
            int a, b;
            boolean isRoman = convert.Roman(number[0]);
            if (isRoman) {
                a = convert.romanToInt(number[0]);
                b = convert.romanToInt(number[1]);
            } else {
                a = Integer.valueOf(number[0]);
                b = Integer.valueOf(number[1]);
            }
            if (a > 10 || b > 10) {
                throw new Exception("Некорректное выражение");
            }
            int rezylt = 0;
            switch (sing[singsave]) {
                case "+":
                    rezylt = a + b;
                    break;
                case "-":
                    rezylt = a - b;
                    break;
                case "*":
                    rezylt = a * b;
                    break;
                case "/":
                    rezylt = a / b;
                    break;
            }
            if (isRoman) {
                return convert.intToRoman(rezylt);
            } else {
                return Integer.toString(rezylt);
            }
        } else {
            throw new Exception("Некорректное выражение");
        }
    }

    public static void main(String[] args) throws Exception {
        while (true){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();
        System.out.println(calc(exp));}
    }
}







