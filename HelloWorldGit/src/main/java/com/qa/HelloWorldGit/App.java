package com.qa.HelloWorldGit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        MyMap tournaments = new MyMap();
        
        Tournament pool = new Tournament("Pool", "Pool knockout tournament.");
        Tournament fifa = new Tournament("Fifa", "Fifa group and knockout tournament.");
        
        tournaments.addObject(pool);
        tournaments.addObject(fifa);
        
        System.out.println(tournaments.getTournamentById(2).getName());
        
    }   
    
    
}
