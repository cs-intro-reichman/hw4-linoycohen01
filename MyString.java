public class MyString {
    public static void main(String[] args) {
       System.out.println(contains("baba yaga", "baba"));
       System.out.println(contains("baba yaga", ""));
       System.out.println((contains("baba yaga", "John Wick is the baba yaga") )); // fale
      boolean var3 = !MyString.contains("baba yaga", "John Wick is the baba yaga");
      boolean var4 = !MyString.contains("baba yaga", "Yaga");
      boolean var5 = MyString.contains("baba yaga", "babayaga"); //זה מחזיר נכון במקום לא נכון
      System.err.println(var3);
      System.out.println(var4);
      System.out.println(var5);
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");

        System.out.println(contains("Our product will transform the market", "transform")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("hey everybody how are you", "are")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lower = "";
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                char c = str.charAt(i);
                lower += (char)(c + 32);
            }else{
            lower += str.charAt(i);
             }
        }
        return lower;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        boolean isSub = false;
        if (str2.length() == 0)
        return false;
        for (int i = 0; i < str1.length() && !isSub; i++){
            if (str2.charAt(0) == str1.charAt(i)){
                isSub = true;
                for (int j = 0; j < str2.length() && isSub; j++){
                    isSub = (str1.charAt(i + j) == str2.charAt(j));
                }
            }
        }
        return isSub;
    }
}
