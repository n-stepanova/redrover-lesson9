public class Main {
    public static void main(String[] args) {
        String[] nameArr = new String[] {"Sam Harris", "Patrick Feenan", "Evan Cole", "P Favuzzi", "David Mendieta", "patrick feeney"};
        for (String name : nameArr){
            System.out.println(AbbreviateTwoWords.abbrevName(name));
        }
    }
}
