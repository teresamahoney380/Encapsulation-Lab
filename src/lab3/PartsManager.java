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
    private Part[] parts;
    

    public PartsManager() {
        parts = new Part[0];
    }
    
    public Part[] getParts(){
        // return array of parts
        return parts;
    }
    
    public void addNewPart(String partnum, String partDesc, double partPrice){
        Part part= new Part(partnum, partDesc, partPrice);
        Part[] temp=new Part[parts.length +1];
        System.arraycopy(parts, 0, temp, 0, parts.length);
        parts=temp;
        parts[parts.length-1]= part;
        
    }
   
    

   
    
}
