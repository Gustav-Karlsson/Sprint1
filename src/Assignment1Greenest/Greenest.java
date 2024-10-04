package Assignment1Greenest;

import javax.swing.*;
import java.util.Objects;

public class Greenest {
        public static void main(String[] args) {

            Plants[] plantsCheckedIn = {
                    new Cactus(0.2, "Igge"),
                    new Palm(5, "Laura"),
                    new Carnivorous(0.7, "Meatloaf"),
                    new Palm(1, "Olof")
            };
        while (true){
            String waterPlant = JOptionPane.showInputDialog(null, "Name the plant you wish to water: ");
            if (waterPlant == null){
                break;
            }

            String plantWateringMessage = null;
            for (Plants plant : plantsCheckedIn){
                if (waterPlant.equalsIgnoreCase(plant.getName())){
                    double requiredLiquid = plant.plantLiquidInLitres();
                    String liquidType = plant.getLiquidType();
                    plantWateringMessage = plant.getName() + " needs " + requiredLiquid + " liters of " + liquidType + "a day.";
                }

            }
            JOptionPane.showMessageDialog(null, Objects.requireNonNullElseGet(plantWateringMessage, () -> "No plant found with the name: " + waterPlant));
        }

        }

        }


