/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.question1;

import java.io.IOException;

/**
 *
 * @author Saufi
 */


public class Main {
    
    com.mycompany.question1.Read read = new com.mycompany.question1.Read();

    public static void main(String[] args) throws IOException {

        Read readclass = new Read();
        Gitcmd git = new Gitcmd();
        readclass.read();
        git.run();
        
        

    }
}
    
