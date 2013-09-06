/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Owner
 */
public class PartsManager {
    private String[] partNums = new String[10];
    private String[] partDescs = new String[10];
    private double[] partPrices = new double[10];
    

    public String[] getPartNums() {
        return partNums;
    }

    public void setPartNums(String pNums, int idx) {
       this.partNums[idx] = pNums;
    }

    public String[] getPartDescs() {
        return partDescs;
    }

    public void setPartDescs(String pDescs, int idx) {
        this.partDescs[idx] = pDescs;
    }

    public double[] getPartPrices() {
        return partPrices;
    }

    public void setPartPrices(double pPrices, int idx) {
        this.partPrices[idx] = pPrices;
    }
    
    
    
    
}
