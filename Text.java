package pack;

public class Text {
	public static void main(String args[]){
		
		CPU cpu =new CPU();
	
		cpu.setSpeed(2200);
	
		HardDisk disk=new HardDisk();

		disk.setAmount(200);
		
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
		
	}

}
