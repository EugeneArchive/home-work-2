public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {

        // Задача 1
        byte fiveFloorBuilding = 25;
        short ochtaCentre = 403;
        int ostTeleTower = 540;
        long burjDubai = 812L;
        float cnTower = 553.33f;
        double johnHancockTower = 457.2;
        boolean highestTower = burjDubai > cnTower;
        char positive = 43;
    }

    public static void task2() {

        // Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxer = boxer1 + boxer2;
        double weightDifference = Math.abs(boxer2 - boxer1);
        System.out.println("Общий вес боксеров = " + weightOfAllBoxer + " кг.");
        System.out.println("Разница в весе боксеров = " + weightDifference + " кг.");
    }

    public static void task3() {

        // Задача 3
        int bananaWeight = 80;
        int banana = 5;


        int milkWeight = 105;
        int milk = 2;

        int iceCreamWeight = 100;
        int iceCream = 2;

        int eggWeight = 70;
        int egg = 4;

        int allWeight = (banana * bananaWeight) + (milk * milkWeight) + (iceCream * iceCreamWeight) + (egg * eggWeight);
        int grPerKg = 1000;
        float weightKg = allWeight / (float) grPerKg;
        System.out.println("Вес спорт-завтрака = " + weightKg + " кг.");
    }

    public static void task4() {

        // Задача 4
        int excessWeightKg = 7;
        int excessWeightGr = excessWeightKg * 1000;
        int minLost = 250;
        int maxLost = 500;
        int firstType = excessWeightGr / minLost;
        int secondType = excessWeightGr / maxLost;
        int thirdType = (firstType + secondType) / 2;
        System.out.println(firstType + " дней при потере веса 250 грамм.");
        System.out.println(secondType + " дней при потере веса 500 грамм.");
        System.out.println(thirdType + " дней при потере в среднем.");
    }

    public static void task5() {

        //Задача 5
        int mashaNow = 67_760;
        int denisNow = 83_690;
        int kristyNow = 76_230;
        int percent = 10;
        double growth = percent / (100 * 1.0);
        int mashaNew = (int) (mashaNow + (mashaNow * growth));
        int denisNew = (int) (denisNow + (denisNow * growth));
        int kristyNew = (int) (kristyNow + (kristyNow * growth));
        int year = 12;
        int mashaDifferenceYear = (mashaNew - mashaNow) * year;
        int denisDifferenceYear = (denisNew - denisNow) * year;
        int kristyDifferenceYear = (kristyNew - kristyNow) * year;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDifferenceYear + " рублей.");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDifferenceYear + " рублей.");
        System.out.println("Кристина теперь получает " + kristyNew + " рублей. Годовой доход вырос на " + kristyDifferenceYear + " рублей.");
    }
}