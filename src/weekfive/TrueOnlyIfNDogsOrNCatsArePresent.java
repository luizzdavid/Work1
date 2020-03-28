package weekfive;
public class TrueOnlyIfNDogsOrNCatsArePresent {
    public static boolean Checkdog(String arr[], int d,int c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "dog") {
                d -= 1;
            }
            else if(arr[i] == "cat"){
                c-= 1;
            }
        }
       // System.out.println(d);
       // System.out.println(c);
        if (d == 0){
            return true;
        } else if(c == 0) {
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[]args)
    {
        String arr[]={"zebra","cat","dog","dog","dog"};
        System.out.println(Checkdog(arr,3,3));

    }
}
