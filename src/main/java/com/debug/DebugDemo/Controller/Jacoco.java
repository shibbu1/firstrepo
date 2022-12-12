package com.debug.DebugDemo.Controller;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Jacoco {




        public String getMessage(String name) {
            StringBuilder s = new StringBuilder();
            if(name==null||name.trim().length()==0){
                s=s.append("Please provide your name");
            }
            else
            {
                s.append("Hello "+ name + "!");
            }


            return s.toString();
        }











}
