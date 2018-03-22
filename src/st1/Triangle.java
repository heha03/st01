package st1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Triangle {
	private int side1,side2,side3;
	private boolean isTriangle(int side1,int side2,int side3){
		int ts[]=new int[3];
		ts[0]=side1;
		ts[1]=side2;
		ts[2]=side3;
		Arrays.sort(ts);
		
		//the shortest side's length should > 0
		//the longest side's length should < the sum of the other two
		return ts[0]>0 && ts[2]<ts[0]+ts[1];
	}
	public Triangle(int side1,int side2,int side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
		try{
			if(!isTriangle(side1, side2, side3)){
				throw new Exception("not a valid triangle");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public boolean isEquilateral(){
		return side1==side2 && side2==side3;
	}
	public boolean isIsosceles(){
		return side1==side2 || side1==side3 || side2==side3;
	}
	public boolean isScalene(){
		return !isIsosceles();
	}
}
