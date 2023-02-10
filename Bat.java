public class Bat extends Mammal {

  public Bat(){
    super(300);
  }

  //methods
  public void fly() {
    this.setEnergyLevel(getEnergyLevel()-50);
    System.out.printf("*the bats jet engines turn on : %d%n",this.displayEnergy());

  }

  public void eatHumans() {
    this.setEnergyLevel(getEnergyLevel()+25);
    System.out.println(this.displayEnergy());
  }

  public void attackTown() {
    this.setEnergyLevel(getEnergyLevel()-100);
    System.out.printf("town burns *the bat smiles and flies away : %d%n",this.displayEnergy());
  }
  



}
