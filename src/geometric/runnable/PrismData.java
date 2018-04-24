package geometric.runnable;

public class PrismData {

	

		Prism [] prismArray;
		public PrismData(int numberOfElements){
			super();
			prismArray=new Prism[numberOfElements];
		}
	public void setPrism(int index, Prism prism) {
		prismArray[index]=prism;
	}
	public Prism[] getPrismArray(){
		return prismArray;
	}
	public Prism getPrismByIndex(int index){
		return prismArray[index];
	}
	public int getNumberOfNulls(){
		int counter=0;
		for(Prism prism: prismArray){
			if(prism!=null){
				counter++;
			}
		}
		return counter;
	}
	public double getAvgVolume(){
		double avg=0;
		for (Prism prism : prismArray) {
			if(prism!=null){
				avg+=prism.getVolume();
			}
		}
		return avg/getNumberOfNulls();
	}
	public int getNumberOfCylinder(){
		int counter=0;
		for(Prism prism : prismArray){
			if(prism instanceof Cylinder){
				counter++;
			}
		}
		return counter;
	}
	public int getNumberOfPrism(){
		return prismArray.lenght;
	}
}
