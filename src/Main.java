import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("      Задача 1");
        int perOdin = 2147483647; // perOdin это Переменная Один и т.д
        byte perDva = 127;
        short perTri = 32767;
        long perChet = 9223372036854775807l;
        float perPyt = 28.6666666666666666f;
        double perShest = 368.7777777777775;
        System.out.println("Значение переменной : perOdin с типом init равно :" + perOdin);
        System.out.println("Значение переменной : perDva с типом byte равно :" + perDva);
        System.out.println("Значение переменной : perTri с типом shot равно :" + perTri);
        System.out.println("Значение переменной : perChet с типом long равно :" + perChet);
        System.out.println("Значение переменной : perPyt с типом float равно :" + perPyt);
        System.out.println("Значение переменной : perShest с типом double равно :" + perShest);
        System.out.println("      Задча 2");
        System.out.println("не было просьбы выводить на консоль");
        float a = 27.12f;
        long b = 987678965549l;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int g = 27897;
        byte h = 67;
        System.out.println("      Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short itogoListov = 480;
        byte itogoUchenikov = (byte) (class1 + class2 + class3);
        short listovOdnomy = (short) (itogoListov / itogoUchenikov);
        System.out.println("На каждого ученика рассчитано : " + listovOdnomy + " листов бумаги");
        System.out.println("      Задача 4");
        byte bottlesPerTwoMinutes = 16; //  производительность за 2 минуты
        short bottlesPerTwentyMinutes = (short) (bottlesPerTwoMinutes * 10);
        System.out.println("За 20 минут машина произвела: " + bottlesPerTwentyMinutes + " штук бутылок");
        int bottlesPerDay = bottlesPerTwentyMinutes * 3 * 24;
        int bottlesPer3Day = bottlesPerDay * 3;
        System.out.println("За сутки машина произвела: " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела: " + bottlesPer3Day + " штук бутылок");
        long bottlesPerMonth = bottlesPerDay * 30L;
        System.out.println("За месяц машина произвела: " + bottlesPerMonth + " штук бутылок");
        System.out.println("      Задача 5");
        int allBanokKraski = 120;
        int allKolClass = allBanokKraski / 6;
        int belBanokKraski = allKolClass * 2;
        int korBanokKraski = allKolClass * 4;
        System.out.println("В школе,, где " + allKolClass + " классов, нужно " + belBanokKraski +
                " банок белой краски и " + korBanokKraski + " банок коричневой краски");
        System.out.println("      Задача 6");
        int bananofGramm = 5 * 80;
        int molokaGramm = 200 / 100 * 105;
        int morogenovaGramm = 2 * 100;
        int yaicaGramm = 4 * 70;
        int summaVsehIngridientovGgamm = bananofGramm + molokaGramm + morogenovaGramm + yaicaGramm;
        float summaVsehIngridientovKg = summaVsehIngridientovGgamm / 1000F;
        System.out.println("вес в граммах : " + summaVsehIngridientovGgamm + " грамм");
        System.out.println("вес в килограммах : " + summaVsehIngridientovKg + " килограмм");
        System.out.println("      Задача7");
        short poteryaVesaGr1 = 250;
        short poteryaVesaGr2 = 500;
        int skolkoDneyTeryatPri1 = 7 * 1000 / poteryaVesaGr1;
        int skolkoDneyTeryatPri2 = 7 * 1000 / poteryaVesaGr2;
        int skolkoDneyTeryatVsrednem = (7 * 1000) / ((poteryaVesaGr2 + poteryaVesaGr1) / 2);
        System.out.println(" если терять по " + poteryaVesaGr1 + " грамм , то :" + skolkoDneyTeryatPri1 + " дней");
        System.out.println(" если терять по " + poteryaVesaGr2 + " грамм , то :" + skolkoDneyTeryatPri2 + " дней");
        System.out.println(" в среднем может потребоваться :" + skolkoDneyTeryatVsrednem + " дней");
        System.out.println("      Задча 8");
        int zpMash = 67760;
        int zpDen = 83690;
        int zpKr = 76230;
        int newZpMash = (int) (zpMash * 1.1);
        int newZpDen = (int) (zpDen * 1.1);
        int newZpKr = (int) (zpKr * 1.1);
        int raznMash = newZpMash - zpMash;
        int raznDen = newZpDen - zpDen;
        int raznKr = newZpKr - zpKr;
        System.out.println("Маша теперь получает " + newZpMash + " рублей, разница составляет " + raznMash + " руб.");
        System.out.println("Денис теперь получает " + newZpDen + " рублей, разница составляет " + raznDen + " руб.");
        System.out.println("Кристина теперь получает " + newZpKr + " рублей, разница составляет " + raznKr + " руб.");
    }
}