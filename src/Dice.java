/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Celina
 */
public class Dice {
    public int rollDice(){
        int eyesOfDice;
        eyesOfDice = (int)(Math.random() * 12); 
        return eyesOfDice;
    }
    
}
