/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Owner
 */
public class Part {
    private String partNum;
    private String partDesc;
    private double partPrice;

    public Part() {
    }

    public Part(String partNum, String partDesc, double partPrice) {
        this.partNum = partNum;
        this.partDesc = partDesc;
        this.partPrice = partPrice;
    }

    public String getPartNum() {
        return partNum;
    }

    public void setPartNum(String partNum) {
         // data validation here
        this.partNum = partNum;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
         // data validation here
        this.partDesc = partDesc;
    }

    public double getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(double partPrice) {
        // data validation here
        this.partPrice = partPrice;
    }
    
    
    
}
