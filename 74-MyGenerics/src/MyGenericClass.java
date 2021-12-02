
public class MyGenericClass <T, T2>{

	T x;
	T2 y;
	
	MyGenericClass(T x, T2 y) {
		
		this.x = x;
		this.y = y;
	}
	
	public T2 getValue() {
		return y;
	}
	
}


//// bounded types =	you can create the objects of a generic class to have data
////					of specific derived types ex.Number
//
//public class MyGenericClass <T extends Number, T2>{
//
//	T x;
//	T2 y;
//	
//	MyGenericClass(T x, T2 y) {
//		
//		this.x = x;
//		this.y = y;
//	}
//	
//	public T2 getValue() {
//		return y;
//	}
//	
//}