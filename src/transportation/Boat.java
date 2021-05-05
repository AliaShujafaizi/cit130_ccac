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
public class Boat extends TransportVehicle {
    Boat(){
        setPassengerCount(12);
        setSafetyCoefficient(0.8);
        setAverageSpeed(30);
    }
}
