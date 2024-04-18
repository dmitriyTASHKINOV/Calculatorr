import java.util.Scanner;

public class Calcylator {
    public static void main(String[] args) throws Exception {
        Convert convert = new Convert();
        Scanner scanner = new Scanner(System.in);
      String[] sing = new String[]{"+","-","*","/"};
      String[] split = new String[]{"\\+","-","\\*","/"};
        System.out.println("Введите число");
        String exp = scanner.nextLine();
        int singsave = -1;
            for (int i = 0; i < sing.length; i++) {
                if (exp.contains(sing[i])) {
                   singsave = i;
                }
            }
            if(singsave==-1){
                throw new Exception("Некорректное выражение");
            }
            String[] number = exp.split(split[singsave]);
            if (convert.Roman(number[0])==convert.Roman(number[1])){
             int a,b;
             boolean isRoman=convert.Roman(number[0]);
             if(isRoman){
                 a = convert.romanToInt(number[0]);
                 b= convert.romanToInt(number[1]);
             }else {
                 a=Integer.valueOf(number[0]);
                 b=Integer.valueOf(number[1]);
             } int rezylt=0;
             switch (sing[singsave]){
                 case "+":
              rezylt = a+b;
              break;
                 case "-":
               rezylt = a-b;
               break;
                 case "*":
                     rezylt = a*b;
                     break;
                 case "/":
                     rezylt = a/b;
                     break;
             }
                if (isRoman) {
                    System.out.println(convert.intToRoman(rezylt));
                }else {
                    System.out.println(rezylt);
                }
            }else {
                throw new Exception("Некорректное выражение");
            }
    }

    }







