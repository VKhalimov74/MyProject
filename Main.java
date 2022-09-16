import java.util.Scanner;

import static java.util.Scanner.*;

public class Main {

    public static void
    main(String[] args) {

        String[] String = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", "x", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int[] variable = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] Rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String arg1;
        String arg2;
        arg1 = "";
        arg2 = "";
        int POSznak1 = 0;
        int POSznak2 = 0;
        int POSznak3 = 0;
        int POSznak4 = 0;
        int Ravno = 0;
        int endSTOKA = 0;
        int mestoRazdela = 0;
        int cicleCount = 0;
        int a1 = 0;
        int a2 = 0;
        int indeX1 = 0;
        int indeX2 = 0;
        double REZALT = 0.0;
        String vyrajenie = "";
        boolean systemaCH = true;
        int indexrim = 0;

        System.out.println("КАЛЬКУЛЯТОР ЧЕТЫРЕХ АРИФМЕТИЧЕСКИХ ОПЕРАЦИЙ ДЛЯ ЧИСЕЛ 1-10");
        System.out.println("введите выражение, используя арабские или римские цифры (оба числа должны быть выражены в одной системе):");
        Scanner scanner = new Scanner(System.in);
        vyrajenie = scanner.nextLine();
        System.out.println("вы ввели:" + vyrajenie);
        POSznak1 = vyrajenie.indexOf("+") + 1;
        POSznak2 = vyrajenie.indexOf("*") + 1;
        POSznak3 = vyrajenie.indexOf("-") + 1;
        POSznak4 = vyrajenie.indexOf("/") + 1;
        Ravno = vyrajenie.indexOf("=") + 1;
        endSTOKA = vyrajenie.length();
        mestoRazdela = POSznak1 + POSznak2 + POSznak3 + POSznak4;
        if (mestoRazdela > 1) {
            String operazija = vyrajenie.substring(mestoRazdela - 1, mestoRazdela);
            arg1 = vyrajenie.substring(0, mestoRazdela - 1);
            if (Ravno == 0) {
                arg2 = vyrajenie.substring(mestoRazdela, endSTOKA);
            } else if (Ravno > 0) {
                arg2 = vyrajenie.substring(mestoRazdela, Ravno - 1);
            }
            System.out.println("первый аргумент :" + arg1);
            System.out.println("второй аргумент :" + arg2);
            System.out.println("вы хотите провести операцию :" + operazija);

            for (cicleCount = 0; cicleCount < 30; cicleCount++) {

                if (arg1.equals(String[cicleCount])) {
                    a1 = variable[cicleCount];
                    indeX1 = cicleCount;
                }
                if (arg2.equals(String[cicleCount])) {
                    a2 = variable[cicleCount];
                    indeX2 = cicleCount;
                }
            }
            System.out.println("РАВНО:");
            if (operazija.equals("+")) {
                REZALT = a1 + a2;
            }
            if (operazija.equals("*")) {
                REZALT = a1 * a2;
            }
            if (operazija.equals("-")) {
                REZALT = a1 - a2;
            }
            if (operazija.equals("/")) {
                REZALT = (double) a1 / a2;
            }
            if (a1 == 0)
            {
                System.out.println("неверно введен первый аргумент (вводите числа от 1 до 10)");
                System.exit (1);
            }
            if (a2 == 0) {
                System.out.println("неверно введен второй аргумент (вводите числа от 1 до 10) или деление на 0");
                System.exit (1);
            }
            if (indeX1 < 11 & indeX2 > 11 |indeX1 > 11 & indeX2 < 11 )
            {
                System.out.println("введены аргументы из разных систем счисления");
                System.exit (1);
            }
            if (indeX1 < 11 & indeX2 < 11 & a2 + a2 > 0) {

                System.out.println((int)REZALT);
            }
            if (indeX1 > 11 & indeX2 > 11 & a2 + a2 > 0&REZALT>0)
            {
                indexrim = (int)REZALT;
                System.out.println(Rim[indexrim-1]);
            }

        }


        else
        {
            System.out.println("некорректный знак операции");
        }
    }
}