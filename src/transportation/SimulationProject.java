/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author Alia
 */
public class SimulationProject {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        TransportationSimulator ts = new TransportationSimulator();
        
        // call setupVehicleList which returns a pretty set of 
        // subclasses with call signs and all that jazz
        // immediately pass the List to our simulator for processing
        ts.runTransportSimulation(setupVehicleList());
        
        System.out.println("Simulation results: ");
        System.out.println(ts.getSimulationResults());
    }
    
    /**
     * 
     * @return 
     */
    public static List<TransportVehicle> setupVehicleList(){
        Unicycle myUnicycle = new Unicycle();
        myUnicycle.setCallSign("Speedster");
        Legs myLegs = new Legs();
        myLegs.setCallSign("Law & Order");

        Boat myBoat = new Boat();
        myBoat.setCallSign("Titanic");

        List<TransportVehicle> vList = new LinkedList<>();
        vList.add(myUnicycle);
        vList.add(myLegs);
        vList.add(myBoat);
        return vList;
    }
    
    /**
     * 
     * @param vehicle
     * @param distance
     * @return 
     */
    public static double computeTravelTime(TransportVehicle vehicle, double distance){
        return distance/vehicle.getAverageSpeed();
    }
}
