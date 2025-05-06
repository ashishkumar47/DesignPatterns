package FactoryTwo;

import FactoryOne.LuxuaryVehicleFactory;
import FactoryOne.OridinaryVehicleFactory;
import FactoryOne.Vehicle;
import FactoryOne.VehicleFactory;

/**
 * @ author  ashishKumar
 * @ since 25-02-202412:23 am
 */
public class VehicleTypeFactory {
   public VehicleFactory getVehicleFactoryType(String factoryType){
       switch (factoryType){
           case "LUXUARY":
               return new LuxuaryVehicleFactory();
           default:
               return new OridinaryVehicleFactory();
       }

   }
}
