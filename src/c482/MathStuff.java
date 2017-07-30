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
public class MathStuff {
    boolean x = false;
    
    public void DoStuff(){
        System.out.println(x);
        x = !x;
        System.out.println(x);
    }
    
    public void DoStuff2(){
        int counter = 0;
        System.out.println(counter);
        System.out.println(++counter);
        System.out.println(counter);
        System.out.println(counter--);
        System.out.println(counter);
    }
    
    public void DoStuff3(){
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
    
    public void DoStuff4(){
        //Casting to avoid mistype errors
        int x = (int)1.0;
        short y = (short)1921222;
        int z = (int)9f;
        long t = 1920313981938423323L;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
    }
    
    public void DoStuff5(){
        short x = 10;
        short y = 3;
        short z = (short)(x * y);
        System.out.println(z);
    }
}
