package letMeOut;
public class Apple extends Food {

    // Новое внутреннее поле данных РАЗМЕР
    private String size;
    int calories;


    public Apple(String size) {
        super("Apple");
        this.size = size.toLowerCase();
        switch (this.size) {
            case "small":
                this.calories = 300;
                break;
            case "medium":
                this.calories = 500;
                break;
            case "large":
                this.calories = 700;
                break;
            default:
                throw new IllegalArgumentException("Invalid size");
        }
    }


    public void consume() {
        System.out.println(this + " съедено");
    }

    public String getSize() {
        return size;
    }


    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false; // Шаг 2
            return size.equals(((Apple)arg0).size); // Шаг 3
        } else
            return false;
    }


    @Override
    public String toString() {
        return getSize()+" "+super.toString();
    }

    @Override
    public Integer calculateCalories() {
        return 100;
    }
}