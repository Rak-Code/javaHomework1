

public class String1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,6,7,8,9};
    
  for(int i = 0; i < a.length; i++) {
    System.out.println(a[i] + 2 + "");

  }
  String s = "Hello";
  for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i)  + "");
  }
  
  String b = "Hello World";
  char[] str = b.toCharArray();

  int count = 0;
  for (int i = 0; i < str.length; i++) {
      if (str[i] == 'l') {
        count++;
        
      }
  }
  System.out.println(count);


    }
}
