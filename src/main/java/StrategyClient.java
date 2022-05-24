/**
 * Реализация поведенческого паттерна Стратегия на примере компораторов в алгоритме сортировки массива
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StrategyClient {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository(new User[] {
                new User(1l,
                        "Petya",
                        "12345678",
                        0,
                        "petya@gmail.com",
                        new GregorianCalendar(1980, Calendar.JANUARY , 1).getTime(),
                        new GregorianCalendar(2010, Calendar.JANUARY , 1).getTime()),

                new User(1l,
                        "Kolya",
                        "12345678",
                        0,
                        "kolya@gmail.com",
                        new GregorianCalendar(1982, Calendar.JUNE , 10).getTime(),
                        new GregorianCalendar(2011, Calendar.JANUARY , 1).getTime()),

                new User(1l,
                        "Ivan",
                        "12345678",
                        0,
                        "ivan@gmail.com",
                        new GregorianCalendar(1981, Calendar.MARCH , 23).getTime(),
                        new GregorianCalendar(2009, Calendar.JANUARY , 1).getTime())
        });

        System.out.println("Без сортировки:");
        repository.printUsers();

        System.out.println("\nСортировка по имени:");
        repository.bubbleSorter(new CompareByName());
        repository.printUsers();


        System.out.println("\nСортировка по дате регистрации в обратном порядке:");
        repository.bubbleSorter(new CompareByRegistrationDateRevers());
        repository.printUsers();
    }
}
