/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

/**
 *
 * @author Alia
 */
public class Legs extends TransportVehicle {
    Legs(){
        setPassengerCount(1);
        setSafetyCoefficient(0.6);
        setAverageSpeed(15);
    }
}
