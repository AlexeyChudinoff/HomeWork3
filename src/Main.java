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
        byte pr2 = 16; // pr2 - производительность за 2 минуты
        short pr20 = (short) (pr2 * 10);
        System.out.println("За 20 минут машина произвела: " + pr20 + " штук бутылок");
        int prSutki = pr20 * 3 * 24;
        int prSutki3 = prSutki * 3;
        System.out.println("За сутки машина произвела: " + prSutki + " штук бутылок");
        System.out.println("За 3 дня машина произвела: " + prSutki3 + " штук бутылок");
        long prMesyc = (long) prSutki * 30;
        System.out.println("За месяц машина произвела: " + prMesyc + " штук бутылок");
        System.out.println("      Задача 5");
        int allBanok = 120;
        int kolKlass = allBanok / 6;
        int belClass = kolKlass * 2;
        int korClass = kolKlass * 4;
        System.out.println("В школе,, где " + kolKlass + " классов, нужно " + belClass +
                " банок белой краски и " + korClass + " банок коричневой краски");
        System.out.println("      Задача 6");
        int ban = 5*80;
        int mol = 200 / 100 *105;
        int mor = 2 * 100;
        int yaic = 4*70;
        int summgr = ban + mol + mor + yaic ;
        float summkg = (float) summgr / 1000;
        System.out.println("вес в граммах : " + summgr + " грамм");
        System.out.println("вес в килограммах : " + summkg + " килограмм");
        System.out.println("      Задача7");
        short terVes1 = 250;
        short terVes2 = 500;
        int dney1 = 7*1000/terVes1;
        int dney2 = 7*1000/terVes2;
        int dneySred = 7*1000/((terVes2+terVes1)/2);
        System.out.println(" если терять по " + terVes1 + " грамм , то :" + dney1 + " дней");
        System.out.println(" если терять по " + terVes2 + " грамм , то :" + dney2 + " дней");
        System.out.println(" в среднем может потребоваться :" + dneySred + " дней");
        System.out.println("      Задча 8");

    }
}