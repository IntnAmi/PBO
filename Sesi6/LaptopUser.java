/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesi6;

/**
 *
 * @author ASUS
 */
public class LaptopUser {
    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    public LaptopUser(Macbook macbook) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LaptopUser(Toshiba toshiba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LaptopUser(Lenovo lenovo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void turnOnTheLaptop(){
        this.laptop.powerOn();
    }
    
    void turnOffTheLaptop(){
        this.laptop.powerOff();
    }
    
    void makeLaptopLouder(){
        this.laptop.volumeUp();
    }
    
    void makeLaptopSilent(){
        this.laptop.volumeDown();
    }
    
}
