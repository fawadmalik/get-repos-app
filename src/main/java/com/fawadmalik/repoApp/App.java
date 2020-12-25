package com.fawadmalik.repoApp;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String name = "Stranger";
        if(args.length > 0){
            name=args[0];
        }
        App app = new App();
        app.greet(name);
    }
    public void greet(String name){
        System.out.println( "Hello World!\nHere comes " + name);
    }
}
