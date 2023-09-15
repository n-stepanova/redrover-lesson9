public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        String result="";
        for (int i=0; i<one.length(); i++){
            result+=one.substring(i, i+1) + two.substring(i, i+1) + three.substring(i, i+1);
        }
        return result;
    }

}
