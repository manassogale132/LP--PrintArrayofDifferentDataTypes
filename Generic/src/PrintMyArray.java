import java.util.Arrays;

public class PrintMyArray <X, Y ,Z>{
	
    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;
	
	public PrintMyArray(X[] myXArray,Y[] myYArray,Z[] myArray) {
		this.myXArray = myXArray;
		this.myYArray = myYArray;
		this.myZArray = myZArray;		
}

	public static void main(String[] args) {
		
		
		Integer[] a = {2,4,6};
		
		Character[] b = {'a','n','f','w'};
		
		Double[] c = {3.5,2.8,9.3};
		
		//toPrint(a);
			
		//toPrint(b);
		
		//toPrint(c);
		
		new PrintMyArray<Integer, Character ,Double>(a , b , c).toPrint();
					
	}  
	
	public void toPrint() {
		toPrint(myXArray);
		toPrint(myYArray);
		toPrint(myZArray);
	}
	                                                //E-for elements | T-for Objects in Generics
	public <E> void toPrint(E[] a) {           //Instead of Ojbect you can specify data types for-eg(Number etc..).
		for(E i : a) {                              //Single toPrint() method is used to print all data-types of Array using Generics.
			System.out.println(i);
		}	
	}
	
	
}
