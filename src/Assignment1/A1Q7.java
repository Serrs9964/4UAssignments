/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

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
        String result = test.stringClean(hhello?!);
        System.out.println(result);
                
        
    }
    public String stringClean(String s){
        /*if(s.charAt(1) == s.charAt(2)){
         * return s.;
        }else{
            return stringClean(s);
        }*/
       
        for(int i=s.length()-1; i>0;i--){
            if(s.charAt(i)==s.charAt(i)||s.charAt(i)==s.charAt(i-1)){
                System.out.println(s.charAt(i));
                
            }else{
                return stringClean(s);
            }
        }
    }
}
