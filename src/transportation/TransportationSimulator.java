/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;
import java.util.Random;
import java.util.List;

/**
 *
 * @author Alia
 */
public class TransportationSimulator implements TransportSimulatable {
    
    private String mostRecentResult;
    /**
     * 
     * @param vList 
     */
    public void runTransportSimulation(List<TransportVehicle> vList){
         StringBuilder sb = new StringBuilder();
        int passTotal = 0;
        // Only examine elements if we actually have a list and that list
        // is NOT empty (!)
        if(vList != null && !vList.isEmpty()){
            // Use Enhanced for Loop to visit each item individually
            // This says, serve me once TransportVehicle at a time, 
            // and do so by sticking it in the variable called v
            // which I can look at more closely inside the for loop
            for(TransportVehicle v: vList){
                sb.append("***************************************\n");
                sb.append("Examining Vehicle: " + v.getCallSign() + "\n");
                sb.append("Passenger Count: " + v.getPassengerCount() + "\n");
                int injuries = getInjuries(v.getSafetyCoefficient(),v.getPassengerCount());
                sb.append("Passenger Injuries: " + injuries + "\n");
                sb.append("Passenger Deaths: " + getDeaths(injuries) + "\n");
                passTotal = passTotal + v.getPassengerCount();
            } // enhanced for loop
            sb.append("****** OVERALL RESULTS *******");
            sb.append("Total Passengers in all vehicles: " + passTotal);
            
        }
        // after we've run the simulatoin, dump our String train into 
        // the member variable which holds simulation results
        mostRecentResult = sb.toString();
    }
    
    /**
     * 
     * @return 
     */
    public String getSimulationResults(){
        if(mostRecentResult != null){
            return mostRecentResult;
        }
        return null;
    }
    
    /**
     * 
     * @param safety
     * @param passengers
     * @return 
     */
    public int getInjuries( double safety, int passengers){
        Random rand = new Random();
        float chance = rand.nextFloat();
        if(chance >= safety){
            return 0;
        }else{
            return (int)(passengers * safety);
            
        }
        
    }
    
    /**
     * 
     * @param injuries
     * @return 
     */
    public int getDeaths(int injuries){
       Random rand = new Random();
       float chance = rand.nextFloat(); 
       return Math.round(injuries * chance);
    }
}
