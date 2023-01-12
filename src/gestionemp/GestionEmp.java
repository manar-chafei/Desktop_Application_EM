/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionemp;

import javax.swing.UIManager;

/**
 *
 * @author kh-info
 */
public class GestionEmp {


    public static void main(String[] args) {
     try{UIManager.setLookAndFeel("com.sun.java.swing.plaf.metal.windowsLookAndFeel");
          }catch(Exception e){}
     new Welcom().setVisible(true);
    }
    
}
