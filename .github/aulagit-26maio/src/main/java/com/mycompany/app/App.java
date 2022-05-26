package com.mycompany.app;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.File;
import java.io.IOException;

public class App {
  public static void main(String[] args) throws IOException {
    System.out.println("buenos dias");
    // using default font standard.flf, obtained from maven artifact
    String asciiArt1 = FigletFont.convertOneLine("hello");
    System.out.println(asciiArt1);
    
    // using font font2.flf, located somewhere in classpath under path /flf/font2.flf
    String asciiArt2 = FigletFont.convertOneLine(FigletFont.class.getResourceAsStream("/flf/font2.flf"), "hello");
    System.out.println(asciiArt2);
    
    asciiArt2 = FigletFont.convertOneLine("classpath:/flf/font2.flf", "hello");     
    System.out.println(asciiArt2);                
    
    // using font font3.flf, located in file system under path /opt/font3.flf
    String asciiArt3 = FigletFont.convertOneLine(new File("/opt/font3.flf"), "hello");     
    System.out.println(asciiArt3);

    asciiArt3 = FigletFont.convertOneLine("/opt/font3.flf", "hello");     
    System.out.println(asciiArt3);

    // using font font4.flf, from www 
    String asciiArt4 = FigletFont.convertOneLine("http://myhost.com/font4.flf", "hello");     
    System.out.println(asciiArt4);                
  }
}