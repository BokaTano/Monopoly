/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Celina
 */
public class Panelgroup extends Panel {
    
    private String name;
    private int rent;
    private int nrOfRent;
    private int functionNr;
    
    public Panelgroup(String name, int rent, int nrOfRent, int functionNr){
        super(name, rent, nrOfRent, functionNr);
        this.setName(getName());
        this.setRent(getRent());
        this.setNrOfRent(getNrOfRent());
        this.setFunctionNr(getFunctionNr());
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the rent
     */
    public int getRent() {
        return rent;
    }

    /**
     * @param rent the rent to set
     */
    public void setRent(int rent) {
        this.rent = rent;
    }

    /**
     * @return the nrOfRent
     */
    public int getNrOfRent() {
        return nrOfRent;
    }

    /**
     * @param nrOfRent the nrOfRent to set
     */
    public void setNrOfRent(int nrOfRent) {
        this.nrOfRent = nrOfRent;
    }

    /**
     * @return the functionNr
     */
    public int getFunctionNr() {
        return functionNr;
    }

    /**
     * @param functionNr the functionNr to set
     */
    public void setFunctionNr(int functionNr) {
        this.functionNr = functionNr;
    }
    
}
