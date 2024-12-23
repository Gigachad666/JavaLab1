package letMeOut;
import java.util.Arrays;
import java.util.Vector;

class MainApplication {

    //@SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
    System.out.println(Arrays.toString(args));
        int itemsSoFar = 0;
        for (String arg: args) {
            System.out.println(arg);
            String[] parts = arg.split("/");
            if (parts[0].equals("Burger")) {
                breakfast[itemsSoFar] = new Burger(parts[1]);
                itemsSoFar++;}
            else if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
                itemsSoFar++;}
            else if (parts[0].equals("Apple")) {
            breakfast[itemsSoFar] = new Apple(parts[1]);
            itemsSoFar++;}

            if (arg.startsWith("-")) {
                if(arg.equals("-sort")){
                    Arrays.sort(breakfast, new BurgerComparator());
                } else if (arg.equals("-calories")) {
                    int Cal=0;
                    for(int i =0; i <itemsSoFar; i++ ){
                        Cal += breakfast[i].calculateCalories();

                    }
                    System.out.println("Breakfast Calories: " + Cal);

                    }
                }


        }




        Food[] breakfast1 = breakfast;
        Arrays.sort(breakfast1, new FoodComparator());
        for(int i=0; breakfast1[i]!=null; i++){
            int curCount =1;
            String curName = breakfast1[i].toString();
            for (int j=i+1;breakfast1[j]!= null; j++) {
               if(breakfast1[j].equals(breakfast1[i])){
                   curCount++;
               }
               else
                   break;

            }
            i+=curCount-1;
            System.out.println("There are " + curCount + " " + curName + " in breakfest" );
        }





        for (Food item: breakfast){
            if (item!=null)

                item.consume();
            else
                break;
        }
        System.out.println("Всего хорошего!");
    }
}
