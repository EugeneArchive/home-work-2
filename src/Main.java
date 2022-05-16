public class Main {
    public static void main(String[] args) {

        // Задача 1
        byte fiveFloorBuilding = 25;
        short ochtaCentre = 403;
        int ostTeleTower= 540;
        long burjDubai = 812l;
        float cnTower = 553.33f;
        double johnHancockTower = 457.2;
        boolean highestTower = burjDubai > cnTower;
        char positive = 43;
       // System.out.println(highestTower);

        // Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxer = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров = " + weightOfAllBoxer + " кг.");
        System.out.println("Разница в весе боксеров = " + weightDifference + " кг.");

        // Задача 3
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int allWeight = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        int grPerKg = 1000;
        float weightKg = allWeight/(float)grPerKg;
        System.out.println("Вес спорт-завтрака = " + weightKg + " кг.");

        // Задача 4
        int excessWeightKg = 7;
        int excessWeightGr = excessWeightKg * 1000;
        int firstType = excessWeightGr / 250;
        int secondType = excessWeightGr / 500;
        int thirdTypeGr = (500 + 250) / 2;
        int thirdType = excessWeightGr / thirdTypeGr;
        System.out.println(firstType + " дней при потере веса 250 грамм.");
        System.out.println(secondType + " дней при потере веса 500 грамм.");
        System.out.println(thirdType + " дней при потере веса " + thirdTypeGr + " грамм.");

        //Задача 5
        int mashaNow = 67_760;
        int denisNow = 83_690;
        int kristyNow = 76_230;
        float increase = 1.1f;
        float mashaNew = mashaNow * increase;
        float denisNew = denisNow * increase;
        float kristyNew = kristyNow * increase;
        float mashaDifferenceYear = mashaNew * 12 - mashaNow * 12;
        float denisDifferenceYear = denisNew * 12 - denisNow * 12;
        float kristyDifferenceYear = kristyNew * 12 - kristyNow * 12;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDifferenceYear + " рублей.");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDifferenceYear + " рублей.");
        System.out.println("Кристина теперь получает " + kristyNew + " рублей. Годовой доход вырос на " + kristyDifferenceYear + " рублей.");
    }
}