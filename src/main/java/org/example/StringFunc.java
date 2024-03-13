package org.example;

public class StringFunc {

    public static int IndexOf(String str, char substr) {
        int len_str = str.length();
        char[] chars = str.toCharArray();

        for (int i = 0; i < len_str; i++) {
            if (substr == chars[i]) {
                return i;
            }
        }
        return -1;
    }

    public static String Replace(String str, char replace1, char replace2){
        int len_str = str.length();
        char[] chars = str.toCharArray();

        for (int i = 0; i < len_str; i++) {
            if (replace1 == chars[i]) {
                chars[i] = replace2;
            }
        }
//        String new_str = String.valueOf(chars);
        return String.valueOf(chars);
    }
    
    public static String Reverse(String str){
        char[] chars = str.toCharArray();
        char[] new_str = new char[str.length()];
        
        for(int i = str.length() - 1; i >= 0; i--){
            new_str[str.length() - i - 1] = chars[i];
        }
        return String.valueOf(new_str);
    }

    public static char[] increaseArraySize(char[] arr, int size) {
        char[] newArr = new char[arr.length + size];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }
    public static String Append(String str, char element){
        char[] chars = str.toCharArray();
        char[] newArr = increaseArraySize(chars, 1);
        newArr[str.length()] = element;
        return String.valueOf(newArr);
    }
}


//    public static void main(String[] args) {
//        String str = "Hello, world!";
//        char substr = 'l';
//        System.out.println(IndexOf(str,substr));
//        char[] chars = str.toCharArray();
//        System.out.println(chars[1]);
//    }
//    }


