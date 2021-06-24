
// Objectives:
// ● Implement packages to namespace your project.

// ● Implement inheritance.

// Tasks:
// ● Create a Mammal class that has an energyLevel and displayEnergy() method. The displayEnergy() method should show the animals energy level as well as return it.

// ● Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()

// ● For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5

// ● For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10

// ● For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10

// ● Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.



public class Mammal {
    private int energyLevel;

    public int displayEnergy(){
        System.out.println(String.format("Energy level: %d", this.energyLevel));
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel){
        this.energyLevel = this.energyLevel + energyLevel;
    }
}