package letMeOut;

    public class Cheese extends Food {

        public Cheese() {
            super("Cheese");
        }

        public void consume() {
            System.out.println(this + " съеден");
        }

        @Override
        public Integer calculateCalories() {
            return 100;
        }
    }

