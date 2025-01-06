/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.luckysoft.agro.component;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JButton;

/**
 *
 * @author KAVINDU
 */
public class RoundedButton extends JButton {
    public RoundedButton(){
        init();
    }
    
    private void init(){
       this.putClientProperty(FlatClientProperties.STYLE, "arc:999");
    }
    
}
