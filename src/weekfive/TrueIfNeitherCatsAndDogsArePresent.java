package weekfive;

public class TrueIfNeitherCatsAndDogsArePresent {
    public static boolean Check(String arr[],int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "cat" || arr[i] == "dog") {
                n += 1;
            }
        }
        if (n > 1) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[]args)
    {
        String arr[]={"zebra"};
        System.out.println(Check(arr,1));
    }
}