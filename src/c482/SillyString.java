/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482;

/**
 *
 * @author andy4512
 */
public class SillyString {
    String string = "animals";
    
    public void StringDing(){
        System.out.println(string.length());
        
        System.out.println(string.charAt(3));
        
        System.out.println(string.indexOf('m'));
        
        System.out.println(string.substring(3,5));
        
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        
        System.out.println("abc".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));
        
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c"));   // true
        System.out.println("abc".endsWith("a")); 
        
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false
        
        System.out.println("abcabc".replace("a", "A"));    // AbcAbc
        
        System.out.println(" abc ".trim());        // abc
    }
}
