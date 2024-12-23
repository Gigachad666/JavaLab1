package letMeOut;
import java.util.Comparator;

public class BurgerComparator implements Comparator<Food> {
    @Override
    public int compare(Food arg0, Food arg1) {
        if (arg0 instanceof Burger && arg1 instanceof Burger) {
            return ((Burger) arg0).getSize().compareTo(((Burger) arg1).getSize());
        };
        return 0;
    }
}
