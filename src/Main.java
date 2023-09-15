public class Main {
    public static void main(String[] args) {
        //1
        String[] nameArr = new String[] {"Sam Harris", "Patrick Feenan", "Evan Cole", "P Favuzzi", "David Mendieta", "patrick feeney"};
        for (String name : nameArr){
            System.out.println(AbbreviateTwoWords.abbrevName(name));
        }

        //2
        System.out.println(TheFeastOfManyBeasts.feast("great blue heron","garlic nann"));
        System.out.println(TheFeastOfManyBeasts.feast("chickadee","chocolate cake"));
        System.out.println(TheFeastOfManyBeasts.feast("brown bear","bear claw"));

        //3
        System.out.println(TripleTrouble.tripleTrouble("this", "test", "lock"));

        //4
        System.out.println(FindThePosition.position('z'));

        //5
        System.out.println(ArrayPlusArray.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
    }
}
