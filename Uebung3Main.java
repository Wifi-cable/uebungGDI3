package uebungGDI3;
import java.io.*;
public class Uebung3Main {

	public static void main(String[] args) {
		
		
		CityList.print(CityList.cityTable);
		CityList mainCitylist = new CityList();
		int table [][] = new int [10][10];
		table = mainCitylist.distanceTable;
		int distance=getDistance (table);
		System.out.println("\n");
		for(int i = 0; i<10;i++){
		System.out.print(table[0][i] + " ");
		System.out.print("reiselänge"+distance);
		}
		
		
	}
public static  int  getDistance (int[] location ){
	int city,distance=0;
	for (city=0; city<10;city++){
		distance=distance+location[city];
	}
	return (distance);
	
	
	/*int city= table[0][0];
		
		int distance=0;
		for ( city=0;city<10;){
			distance +=distance[city];
		
		}			city++; why will this not work?*/
		}
		//sum distances in "table". how?
		/*int city=0;
		while (city<10){
			distance+= table[city];	//operator += is undefined for argument int[] []
			city++;					//what to use instead?
		}*/
		
		
		
	}

