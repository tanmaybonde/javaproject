/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginassign;

import java.awt.Image;
import javax.swing.*;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.sql.*;

/**
 *
 * @author Tanmay
 */
public class commonfunction {
    public static void imageicon(String path,JLabel lbl)
    {
        BufferedImage img;
        try {
            img=ImageIO.read(new File(path));
            Image dimg=img.getScaledInstance(lbl.getWidth(),lbl.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon imageicon=new ImageIcon(dimg);
            lbl.setIcon(imageicon);
        
        } 
        catch (Exception e) {
            System.out.println("caught"+e);
        }
    }
    
//    public static void getconnection()
//    {
//       // Connection con=DriverManager.getConnection("");
//        try{
//            DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "sa1234");
//        }
//        catch(Exception e)
//        {
//            System.out.println("exception"+e);
//        }
//        
//        }
}
