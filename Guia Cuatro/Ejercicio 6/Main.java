public class Main {
	public static void main(String[] args){
		Foton unFoton = new Foton(200);
		Free unaFree = new Free(2, 4.5);
		
		EnergyMeter energyMeter = new EnergyMeter();
		
		System.out.println("Energia de Foton:");
		System.out.println(energyMeter.measureEnergy(unFoton));
		System.out.println("Energia de Particula Libre:");
		System.out.println(energyMeter.measureEnergy(unaFree));
			
	}



}