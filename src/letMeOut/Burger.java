package letMeOut;


import java.util.Comparator;

public class Burger extends Food {

    private  String size;

    int calories;
    public Burger(String size) {
        super("Burger");
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



    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Burger)) return false;
            return size.equals(((Burger)arg0).size);
        } else
            return false;
    }


    @Override
    public String toString() {
        return getSize()+" "+super.toString();
    }

    public void consume() {
        System.out.println(toString() + " съедено ");
    }


    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }


    public Integer calculateCalories(){
        return calories;
    }



}


