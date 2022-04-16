/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.unwe;

/**
 *
 * @author USER
 */
public class MP3Player extends Electronics {
    Colour colour;
    @Override
    public double getSalePrice() {
    return getPrice()*0.95;
    }
    
}
