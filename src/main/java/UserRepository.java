/**
 * Хранилеще пользователей содержит массив, который необходимо отсортировать по разным полям с разным
 * порядком следования
 *
 * Способ сравнения для гибкоси представлен интерфейсом IComparable. Конкретные реализации сравнения разнесены
 * по специализированным классам CompareByName и CompareByRegistrationDateRevers
 */

import java.util.Arrays;

public class UserRepository {
    User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    private void swap(int first, int second) {
        User tmp = users[first];
        users[first] = users[second];
        users[second] = tmp;
    }

    public void bubbleSorter(IComparable comparator) {
        int length = users.length;

        for (int i = length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(comparator.compare(users[j], users[j + 1]) >= 1)
                    swap(j, j + 1);
            }
        }
    }

    public void printUsers() {
        Arrays.stream(users).forEach(System.out::println);
    }
}
