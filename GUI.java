/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui;
import javax.swing.*;

/**
 *
 * @author user
 */
public class GUI {

    public static void main(String[] args) {
           JFrame frame = new JFrame("My First GUI");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(300,300);
           JButton button = new JButton("Press");
           frame.getContentPane().add(button);
           frame.setVisible(true);
    }
}
