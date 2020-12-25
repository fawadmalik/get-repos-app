package com.fawadmalik.repoApp;

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
    public String greet(String name){
        return "Hello World!\nHere comes " + name;
    }
}
