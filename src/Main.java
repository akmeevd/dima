public class Main {
    public static void main(String[] args) {

        byte a = 2;
        short b = 200;
        int c = 100000000;
        long d = 1000000000L;
        float e = 1.0f;
        double f = 1.0000000;

        float BoxerFirstWeight = 78.2f;
        float BoxerSecondWeight = 82.7f;
        float SumWeight = BoxerFirstWeight + BoxerSecondWeight;
        System.out.println("Общий вес двух бойцов " + SumWeight + " кг");
        float SubtractWeight = BoxerSecondWeight - BoxerFirstWeight;
        System.out.println("Разница в весе между двумя бойцами " + SubtractWeight + " кг");

        byte bananas = 5;
        short bananaWeight = 80;
        byte IceCream = 2;
        short IceCreamWeight = 100;
        byte eggs = 4;
        short eggWeight = 70;
        short Milk = 2;
        short MilkWeight = 105;
        int bananasWeight = bananas * bananaWeight;
        int IceCreamsWeight = IceCream * IceCreamWeight;
        int eggsWeight = eggs * eggWeight;
        int MilksWeight = Milk * MilkWeight;
        int CocktailWeight = IceCreamsWeight + eggsWeight + MilksWeight + bananasWeight;
        System.out.println("Общий вес коктейля " + CocktailWeight + " грамм");
        float KgWeight = CocktailWeight / 1000f;
        System.out.println("Общий все коктейля в килограммах равен " + KgWeight);


        int LosingWeightOne = 250;
        int LosingWeightTwo = 500;
        int Purpose = 7 * 1000;
        int SumDaysOne = Purpose / LosingWeightOne;
        int SumDaysTwo = Purpose / LosingWeightTwo;
        System.out.println("Если худеть каждый день на 250 грамм, то для похудения на 7 кг потребуется " + SumDaysOne + " дней");
        System.out.println("Если худеть каждый день на 500 грамм, то для похудения на 7 кг потребуется " + SumDaysTwo + " дней");
        int MiddleLosingWeight = (LosingWeightTwo + LosingWeightOne) / 2;
        int MiddleDays = Purpose / MiddleLosingWeight;
        System.out.println("В среднем может понадобиться " + MiddleDays + " дней, чтобы похудеть на 7 кг");


        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int KristinaSalary = 76230;
        int tenPercent = 10;
        int MashaTenPercent = MashaSalary / tenPercent;
        int DenisTenPercent = DenisSalary / tenPercent;
        int KristinaTenPercent = KristinaSalary / tenPercent;
        int MashaNewSalary = MashaSalary + MashaTenPercent ;
        int DenisNewSalary = DenisSalary + DenisTenPercent;
        int KristinaNewSalary = KristinaSalary + KristinaTenPercent;
        int year = 12;
        int MashaYearSalary = MashaSalary * year;
        int DenisYearSalary = DenisSalary * year;
        int KristinaYearSalary = KristinaSalary * year;
        int MashaNewYearSalary = MashaNewSalary * year;
        int DenisNewYearSalary = DenisNewSalary * year;
        int KristinaNewYearSalary = KristinaNewSalary * year;
        int RisingMashaYearSalary = MashaNewYearSalary - MashaYearSalary;
        int RisingDenisYearSalary = DenisNewYearSalary - DenisYearSalary;
        int RisingKristinaYearSalary = KristinaNewYearSalary - KristinaYearSalary;
        System.out.println("Маша теперь получает " + MashaNewSalary + " рублей в месяц, а годовой доход вырос на " + RisingMashaYearSalary + " рублей");
        System.out.println("Денис теперь получает " + DenisNewSalary + " рублей в месяц, а годовой доход вырос на " + RisingDenisYearSalary + " рублей");
        System.out.println("Кристина теперь получает " + KristinaNewSalary + " рублей в месяц, а годовой доход вырос на " + RisingKristinaYearSalary + " рублей");


















    }
}