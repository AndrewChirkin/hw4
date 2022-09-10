public class Main {
    public static void main(String[] args) {

        int deposit = 15_000;
        int depositPercent = 7;
        for (int i = 1; deposit <= 12_000_000; i++) {
            deposit = deposit + deposit * depositPercent / 100;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " , сумма накоплений составила " + deposit + " рублей");
            }
        }

    }
    }
