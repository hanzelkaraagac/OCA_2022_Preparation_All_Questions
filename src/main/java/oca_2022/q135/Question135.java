package oca_2022.q135;


class Planet {
	public String name;
	public int moons;
	
	public Planet(String name, int moons) {
		this.name = name;
		this.moons = moons;
	}
//	public String toString(){  //toString methodu override yaparsak planet i yazdirabiliriz
//		return name+moons;
//	}
}

public class Question135 {


		
		public static void main(String[] args) {
			Planet[] planets = {
					new Planet ("Mercury", 0),
					new Planet ("Venus", 0),
					new Planet ("Earth", 1),
					new Planet ("Mars", 2),
							
			};
			for (Planet p : planets) {
				System.out.println(p);
			}
			System.out.println(planets);
			System.out.println(planets[2].name);
		    System.out.println(planets[2].moons);




		}
		
		/*
		 
		 What is the output?  answer B
		 A) planets
		 	Earth
		 	1
		 
		 B) [LPlanets.Planet;@15db9742
		 	Earth
		 	1
		 
		 C) [LPlanets.Planet;@15db9742
		 	Planets.Planet@6d06d69c
		 	1
		 	
		 D) [LPlanets.Planet;@15db9742
		    Planets.Planet@6d06d69c
		    [LPlanets.Moon;@7852e922
		    
		 E) [LPlanets.Planet;@15db9742
		    Venus
		  	0
		 	
		 
		 
		 */

	}

//Answer:  C
	
//	Earth
  //      1

