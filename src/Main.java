public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int month = 0;
        int deposit = 15000;
        int total = 0;
        while (total <= 2_4590_00) {
            total = total + deposit;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        }
    public static void task3() {
        System.out.println("Задача 3");
        int countryY = 12_000_000;
        int birthRatePerYear = 17;
        int deathRatePerYear = 8;
        int year = 0;
        birthRatePerYear = birthRatePerYear * countryY / 1000;
        deathRatePerYear = deathRatePerYear * countryY / 1000;
        System.out.println("Рождаемость в год " + birthRatePerYear);
        System.out.println("Сметность в год " + deathRatePerYear);
        while (year < 10) {
            year = year + 1;
            countryY = countryY + birthRatePerYear - deathRatePerYear;
            System.out.println("Год " + year + ", численность населения составляет " + countryY);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        int totalSaving = 0;
        int month = 0;
        totalSaving = totalSaving + deposit;
        while (totalSaving <= 12000000) {
            totalSaving = totalSaving + deposit * 7 / 100;
            month = month + 1;
            System.out.println("месяц " + month + " накоплено " + totalSaving + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int totalSavings = 0;
        int month = 0;
        totalSavings = totalSavings + deposit;
        while (totalSavings <= 12000000) {
            totalSavings = totalSavings + deposit * 7 / 100;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("месяц " + month + " накоплено " + totalSavings + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        int totalSaving = 0;
        int month = 0;
        int year = 0;
        totalSaving = totalSaving + deposit;
        while (year < 9) {
            totalSaving = totalSaving + deposit * 7 / 100;
            month = month + 1;
            if (month % 12 == 0)
                year = year + 1;
            if (month % 6 == 0)
                System.out.println("месяц " + month + " накоплено " + totalSaving + " рублей");
        }
        System.out.println("Василий за " + year + " лет накопит " + totalSaving + " рублей");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        int date = 0;
        for (; date < 31; date++) {
            if (date == friday) {
                friday = friday + 7;
                System.out.println("Сегодня пятница " + date + "-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int year = 2023;
        int yearsBefore = 200;
        int yearsAfter = 100;
        int cometComes = 79;
        int yearsCounting = 0;
        int startYear = year - yearsBefore;
        int endYear = year + yearsAfter;
        for (int comet = startYear; comet <= endYear; comet++) {
            yearsCounting = yearsCounting + 1;
            if (comet % cometComes == 0)
                System.out.println(comet);
        }
    }
}
