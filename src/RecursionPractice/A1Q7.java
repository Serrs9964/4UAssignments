/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionPractice;

/**
 *
 * @author serrs9964
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A1Q7 test = new A1Q7();
        String hhello = new String();
        String result = test.stringClean(hhello);
        System.out.println(result);

        /*String goodbbye = new String();
         * String result2 = test.removeRepeat(goodbbye);
         * System.out.println(result2);*/
    }

    public String stringClean(String s) {
        //base case
        
        if (s == null || s.length() <= 0) {
            System.out.println(s + "4");
            s.toCharArray();
           // return main(s[0]);
        } else {
            for (int i = s.length() - 1; i > 0; i--) {
                if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i - 1)) {
                    System.out.println(s + "1");
                    return stringClean(s + "1");
                } else {
                    System.out.println(s + "2");
                    return stringClean(s+"2");
                }
            }
        }
        System.out.println(s + "3");
        return (stringClean(s+"3"));
    }

    /* private static String removeRepeat(String input) {
     * String s = new String();
     * for (int n = 0; n < input.length(); n++) {
     * //s.toCharArray;(input.charAt(n));
     * }
     * return s.toString();
     * }*/
}
