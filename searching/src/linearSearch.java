public class linearSearch {
    public static void main(String[] args) {
        String str = "hello";
        char target = 'o';
        System.out.println(Search2(str,target));
    }

    static boolean Search2(String str, char target) {
        for (char ch:str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static int Search(String str, char target) {
        if (str.isEmpty()) {
            return -1;
        }
        for (int i=0;i<str.length();i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}

