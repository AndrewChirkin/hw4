public class Main {
    public static void main(String[] args) {
int salary = 29_000;
int total = 0;

int month = 1;
while (total <= 2_459_000){
    total = total + total/100;
    total = total + salary;
    System.out.println("Месяц " + month + " , сумма накоплений равна " + total +  "рублей");
    month++;
}

            }

        }
