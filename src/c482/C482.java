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
public class C482 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Howdy");
        
        //System.out.println(args[0]);
        //System.out.println(args[1]);
        
        MathStuff stuff = new MathStuff();
        stuff.DoStuff();
        stuff.DoStuff2();
        stuff.DoStuff3();
        stuff.DoStuff4();
        stuff.DoStuff5();
        
        SillyString s = new SillyString();
        s.StringDing();
        
        VARARGSYEAH.walk(1);
        VARARGSYEAH.walk(1, 2);
        VARARGSYEAH.walk(1, 2, 3);
        VARARGSYEAH.walk(1, new int[] {
            4,
            5
        });
        
        negs n = new negs();
        n.PrintNegs();
    }
}
