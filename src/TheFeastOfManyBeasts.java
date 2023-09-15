public class TheFeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        int beastLast = beast.length()-1;
        int dishLast = dish.length()-1;
        boolean first = beast.substring(0,1).equals(dish.substring(0,1));
        boolean last = beast.substring(beastLast).equals(dish.substring(dishLast));

        if (first==true && last==true){
            return true;
        }
        return false;
    }
}
