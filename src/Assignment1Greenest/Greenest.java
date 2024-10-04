package Assignment1Greenest;

import javax.swing.*;

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

            String userInput = null;
            for (Plants plant : plantsCheckedIn){
                if (waterPlant.equalsIgnoreCase(plant.getName())){
                    double requiredLiquid = plant.plantLiquidInLitres();
                    String liquidType = plant.getLiquidType();
                    userInput = plant.getName() + " needs " + requiredLiquid + " liters of " + liquidType + "a day.";
                    break;
                }

            }
            if (userInput != null){
                JOptionPane.showMessageDialog(null, userInput);
            } else {
                JOptionPane.showMessageDialog(null, "No plant found with the name: " + waterPlant);
                break;

            }
        }

        }

        }


