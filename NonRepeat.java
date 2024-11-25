public class NonRepeat{
    public static void main(String[] args) {

        String s = "cow";

        String norepeat = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i) != s.charAt(j))  
                norepeat = s.charAt(i);
            }
            
        }
        System.out.println(norepeat);
    }
}