/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.luckysoft.agro.component;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JTextField;

/**
 *
 * @author KAVINDU
 */
public class RoundedTextField extends JTextField {

    /**
     * RoundedTextField Constructor
     */
    public RoundedTextField() {
        init();
    }

    private void init() {
        this.putClientProperty(FlatClientProperties.STYLE, "arc:999; margin: 0,10,0,10");
    }

}
