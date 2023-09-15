public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] arr = name.split(" ");
        return (arr[0].charAt(0) + "." +arr[1].charAt(0)).toUpperCase();
    }
}