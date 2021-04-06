import java.util.Arrays;

public class MainClass {
    public static void main(String[] args)
    {
//        int [] x = {1,3,5,4,8,8};
//        int [] y = {1,4,2,4,1,4};
//        getPartAfter4(x);
//        check1And4(y);
//        System.out.println(check1And4(y));
    }
    public static int [] getPartAfter4  (int  [] arr) throws RuntimeException {
            int[] newArr = null;
            int i = arr.length - 1;
            int j = 0;
            boolean found = false;
            while (i >= 0 && !found) {
                found = arr[i] == 4;
                j = i;
                i--;
            }
            if(found) {
                newArr = new int[arr.length - j - 1];
                for (i = j + 1; i < arr.length; i++) {
                    newArr[i - j - 1] = arr[i];
                }
            } else {
                throw new RuntimeException("В массиве нет числа 4");
            }
//            System.out.println(Arrays.toString( newArr));
            return  newArr;
        }
        public static boolean check1And4(int[] arr) {
        boolean check = true;
        int count1 = 0;
        int count4 = 0;
        int i = 0;
        while (i < arr.length && check) {
            if(arr[i] == 1) {
                check = true;
                count1++;
            } else {
                if(arr[i] == 4) {
                    check = true;
                    count4++;
                } else {
                    check = false;
                }
            }
            i++;
        }
        return check && count1 > 0 && count4 > 0;

    }
}

