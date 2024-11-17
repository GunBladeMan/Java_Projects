import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void outputUsersSortedByLastName(List<User> users) {
        users.stream().sorted(Comparator.comparing(User :: getLastName));
        users.stream().map(User :: getFullInfo);
        users.stream().forEach(System.out::println);
    }

    public void outputUsersSortedByAge(List<User> users) {
        users.stream().sorted(Comparator.comparing(User :: getAge));
        users.stream().map(User :: getFullInfo);
        users.stream().forEach(System.out::println);
    }

    public boolean checkAgeGreaterThanSeven(List<User> users) {
        users.stream().filter(us -> us.getAge() <= 7);
        if (users.stream().count() > 0) return false;
        return true;
    }

    public float getAverageAge(List<User> users) {
        users.stream().map(age -> age.getAge());
        return users.stream().average();
    }

    public void outputDistinctCountries(List<User> users) {
        users.stream().map(ctr -> ctr.getCountry());
        users.stream().distinct();
        long res = users.stream().count();
        System.out.println(res);
    }

    public static void main(String[] args) {

    }
}