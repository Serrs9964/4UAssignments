/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionPractice;

/**
 *
 * @author serrs9964
 */
public class reverseWord {

    

    public String reverse(String str) 
    {     
        if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) 
    {
        reverseWord obj=new reverseWord();
        String str = "Quora";
        System.out.println("Reverse of \'"+str+"\' is \'"+obj.reverse(str)+"\'");    
    }    
}

    
     
    