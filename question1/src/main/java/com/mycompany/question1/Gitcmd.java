/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.question1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Saufi
 */
public class Gitcmd {
    
    public void run () throws IOException{
        

final List<String> commands = new ArrayList<String>();                

commands.add("C:/Program Files/Git/git-bash.exe");
//commands.add("/C");
//commands.add("start");
//commands.add("cd && cd \"C:\\Users\\Saufi\\239955-STIW3054-A172-A1.wiki.git\" && git add * && git commit -m \"Test\" && git push");

ProcessBuilder pb = new ProcessBuilder(commands);
pb.start();

    
    }
    
    
}
