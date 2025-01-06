/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.luckysoft.agro.log;

/**
 *
 * @author KAVINDU
 */
import java.util.logging.*;

public class log {

    public static Logger log = null;
    private static FileHandler handler;

    static {
        try {
            log = Logger.getLogger("log1");
            handler = new FileHandler("log.txt", true);
            handler.setFormatter(new SimpleFormatter());
            log.addHandler(handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
