/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package lk.luckysoft.agro.validate;

/**
 *
 * @author KAVINDU
 */
public enum Validation {
    PASSWORD_VALIDATION{
        @Override
        public String validate(){
            return "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
        }
    },EMAIL_VALIDATION{
        @Override
        public String validate() {
            return "^[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        ///^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$/
    },MOBILE_VALIDATION{
        @Override
        public String validate() {
            return "/^[0]{1}[7]{1}[01245678]{1}[0-9]{7}$/gm"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
    },LANDLINE_VALIDATION{
        @Override
        public String validate() {
            return "0((11)|(2(1|[3-7]))|(3[1-8])|(4(1|5|7))|(5(1|2|4|5|7))|(6(3|[5-7]))|([8-9]1))[0-9]{7}"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
    };
    
    public String validate(){
        return "";
    }
     
}
