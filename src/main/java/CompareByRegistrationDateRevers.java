/**
 * Реализация стратегии сравнения двух пользователей по дате регистрации в порядке убывания
 */
public class CompareByRegistrationDateRevers implements IComparable {
    @Override
    public int compare(User u1, User u2) {
        return u2.getRegistrationDate().compareTo(u1.getRegistrationDate());
    }
}
