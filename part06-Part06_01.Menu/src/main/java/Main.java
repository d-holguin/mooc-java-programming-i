
public class Main {

    public static void main(String[] args) {
        Menu exactum = new Menu();
//
////         When you have completed the method addMeal(String meal)
////         You can delete the comments below
//        exactum.addMeal("Smoked salmon, white wine and butter sauce with basil");
//        exactum.addMeal("Seasonal green salad with apple-honey vinegarette");
//        exactum.addMeal("Roasted lamb in a red wine sauce");
//
////         When you have completed the method printMeals()
////         you can remove the comment below
//        exactum.printMeals();
//
////         When you have completed the method clearMenu()
////         you can remove the comments below
//        exactum.clearMenu();
//        exactum.printMeals();
//    }
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}
