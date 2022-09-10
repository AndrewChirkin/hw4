public class Main {
    public static void main(String[] args) {
int salary = 29000;
int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            switch (i){
                case 1:
                    System.out.println("Месяц январь, сумма накоплений равна " + total +" рублей");
                    break;
                case 2:
                    System.out.println("Месяц февраль, сумма накоплений равна " + total +" рублей");
                    break;
                case 3:
                    System.out.println("Месяц март, сумма накоплений равна " + total +" рублей");
                    break;
                case 4:
                    System.out.println("Месяц апрель, сумма накоплений равна " + total +" рублей");
                    break;
                case 5:
                    System.out.println("Месяц май, сумма накоплений равна " + total +" рублей");
                    break;
                case 6:
                    System.out.println("Месяц июнь, сумма накоплений равна " + total +" рублей");
                    break;
                case 7:
                    System.out.println("Месяц июль, сумма накоплений равна " + total +" рублей");
                    break;
                case 8:
                    System.out.println("Месяц август, сумма накоплений равна " + total +" рублей");
                    break;
                case 9:
                    System.out.println("Месяц сентябрь, сумма накоплений равна " + total +" рублей");
                    break;
                case 10:
                    System.out.println("Месяц октябрь, сумма накоплений равна " + total +" рублей");
                    break;
                case 11:
                    System.out.println("Месяц ноябрь, сумма накоплений равна " + total +" рублей");
                    break;
                case 12:
                    System.out.println("Месяц декабрь, сумма накоплений равна " + total +" рублей");
                    break;

            }

        }
    }
}