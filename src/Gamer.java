/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Celina
 */
public class Gamer {
    private int id;
    private Panel position;
    private String name;
    private int turn;
    
    public Gamer(int id, Panel position, String name, int turn){
        this.id = id;
        this.position = position;
        this.name = name;
        this.turn = turn;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public Panel position(){
        return position;
    }
    
    public void setPosition(Panel position){
        this.position = position;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getTurn(){
        return turn;
    }
    
    public void setTurn(int turn){
        this.turn = turn;
    }
    
}
