/**
 * Реализация сравнения двух пользователей по имени в порядке возрастания
 */
public class CompareByName implements IComparable{
    @Override
    public int compare(User u1, User u2) {

        return u1.getName().compareTo(u2.getName());
    }
}
