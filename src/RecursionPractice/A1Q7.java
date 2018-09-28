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

        String goodbbye = new String();
        String result2 = test.removeRepeat(goodbbye);
        System.out.println(result2);


    }

    public String stringClean(String s) {
        //base case
        if (s == null || s.length() <= 0) {
            System.out.println(s);
            return s;
        } else {
            for (int i = s.length() - 1; i > 0; i--) {
                if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i - 1)) {
                    System.out.println(s);
                    return stringClean(s);
                } else {
                    System.out.println(s);
                    return stringClean(s);
                }
            }
        }
        System.out.println(s);
        return (stringClean(s));
    }

    private static String removeRepeat(String input) {
        A1Q7<Character> s = new A1Q7<Character>();
        for (int n = 0; n < input.length(); n++) {
            s.add(input.charAt(n));
        }
        return s.toString();
    }
}
