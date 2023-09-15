public class FindThePosition {
    public static String position(char alphabet)
    {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        return "Position of alphabet: " + (abc.indexOf(alphabet)+1);
    }
}
