/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aqmal_150323;
import javax.swing.JOptionPane;


/**
 *
 * @author Aqmal
 */
public class InputJoptionPane {
    public static void main(String[] args){
        String name = "";
        name =JOptionPane.showInputDialog("Please Enter Your Name -");
        String msg = "Hello "+name+"!";
        JOptionPane.showMessageDialog(null, msg);
}

}
