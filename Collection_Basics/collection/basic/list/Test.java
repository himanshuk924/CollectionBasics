package collection.basic.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------ArrayList-----------------------");
		// Creating arraylists
		ArrayList<Laptop> ALaptop = new ArrayList<Laptop>();
		ALaptop.add(new Laptop("hp", "generation4", "w10", "i5"));
		ALaptop.add(new Laptop("asus", "generation3", "w10", "i4"));
		ALaptop.add(new Laptop("dell", "generation5", "w10", "i6"));
		for (Laptop l : ALaptop) {            
			System.out.println(l);
		}

		System.out.println("");
		ArrayList<Car> ACar = new ArrayList<Car>();
		ACar.add(new Car("Maruti", "alto", 2018, 300000));
		ACar.add(new Car("Hyundai", "i10", 2018, 300000));
		ACar.add(new Car("Cheverolet", "impala", 2018, 300000));
		for (Car c : ACar) {
			System.out.println(c);
		}

		System.out.println("");
		ArrayList<Television> tv = new ArrayList<Television>();
		tv.add(new Television("Samsung", true, 2018, "LCD"));
		tv.add(new Television("LG", false, 2018, "LED"));
		tv.add(new Television("MI", true, 2018, "PLASMA"));
		for (Television t : tv) {
			System.out.println(t);
		}

		System.out.println("");
		ArrayList<Cellphone> cp = new ArrayList<Cellphone>();
		cp.add(new Cellphone("Samsung", "GalaxyS7", "Best in town", "BADA", 20000));
		cp.add(new Cellphone("APPLE", "IphoneX", "Too Expensive", "IOS", 30000));
		cp.add(new Cellphone("MI", "RedmiNote5Pr0", "Best", "ANDROID", 40000));
		for (Cellphone p : cp) {
			System.out.println(p);
		}

		System.out.println("");
		ArrayList<School> sl = new ArrayList<School>();
		sl.add(new School("KV1", "ChandiMAndir", "Panchkula", 1));
		sl.add(new School("DPS", "Zirakpur", "Panchkula", 13));
		sl.add(new School("DAV", "Ambala Cantt", "Panchkula", 21));
		for (School s : sl) {
			System.out.println(s);
		}

		System.out.println("");
		System.out.println("---------------------HashSets-----------------------");
		// Creating HashSet to observe that it doesn't store duplicate values having different equality
		Set<Laptop> SetLaptop = new HashSet<Laptop>();// equality comapny and model
		SetLaptop.add(new Laptop("hp", "generation4", "w10", "i5"));
		SetLaptop.add(new Laptop("asus", "generation3", "w10", "i4"));
		SetLaptop.add(new Laptop("dell", "generation5", "w10", "i6"));
		SetLaptop.add(new Laptop("dell", "generation5", "w10", "i6"));
		for (Laptop setl : SetLaptop) {
			System.out.println(setl);
		}

		System.out.println("");
		Set<Car> SetCars = new HashSet<Car>();// equality make and model
		SetCars.add(new Car("Maruti", "alto", 2018, 300000));
		SetCars.add(new Car("Hyundai", "i10", 2018, 300000));
		SetCars.add(new Car("Hyundai", "i11", 2018, 300000));
		SetCars.add(new Car("Cheverolet", "impala", 2018, 300000));
		SetCars.add(new Car("Cheverolet", "impala", 2018, 300000));
		for (Car sc : SetCars) {
			System.out.println(sc);
		}

		System.out.println("");
		Set<Television> tvs = new HashSet<Television>();// equality company,type and price
		tvs.add(new Television("Samsung", true, 2018, "LCD"));
		tvs.add(new Television("LG", false, 3000, "LED"));
		tvs.add(new Television("MI", true, 4000, "PLASMA"));
		tvs.add(new Television("MI", true, 4000, "PLASMA"));
		tvs.add(new Television("MI", true, 4000, "LCD"));
		for (Television t : tvs) {
			System.out.println(t);
		}

		System.out.println("");
		Set<Cellphone> cps = new HashSet<Cellphone>();// equality company,model and os
		cps.add(new Cellphone("Samsung", "GalaxyS7", "Best in town", "BADA", 20000));
		cps.add(new Cellphone("APPLE", "IphoneX", "Too Expensive", "IOS", 30000));
		cps.add(new Cellphone("APPLE", "Iphone6", "Too Expensive", "IOS", 50000));
		cps.add(new Cellphone("MI", "RedmiNote5Pr0", "Best", "ANDROID", 40000));
		cps.add(new Cellphone("MI", "RedmiNote5Pr0", "Best", "ANDROID", 40000));
		for (Cellphone p : cps) {
			System.out.println(p);
		}

		System.out.println("");
		Set<School> sls = new HashSet<School>();// equality name,city and district
		sls.add(new School("KV1", "ChandiMAndir", "Panchkula", 1));
		sls.add(new School("DPS", "Zirakpur", "Panchkula", 13));
		sls.add(new School("DPS", "Zirakpur", "Rohtak", 117));
		sls.add(new School("DAV", "Ambala Cantt", "Panchkula", 21));
		sls.add(new School("DAV", "Ambala Cantt", "Panchkula", 21));
		for (School s : sls) {
			System.out.println(s);
		}

		System.out.println("");
		System.out.println("---------------------LinkedHashSet-----------------------");
		Set<Student> studentlhs = new LinkedHashSet<Student>();// for observing LinkedHAshSet maintains the order
		studentlhs.add(new Student("himanshu"));
		studentlhs.add(new Student("rohit"));
		studentlhs.add(new Student("shubham"));
		studentlhs.add(new Student("aashish"));
		for (Student s : studentlhs) {
			System.out.println(s);
		}

		System.out.println("");
		System.out.println("---------------------TreeSet-----------------------");
		Set<Student> studentts = new TreeSet<Student>();// for observing TreeSet sorts the values of Student
		Student s1 = new Student("himanshu");
		Student s2 = new Student("rohit");
		Student s3 = new Student("shubham");
		Student s4 = new Student("aashish");
		studentts.add(s1);
		studentts.add(s2);
		studentts.add(s3);
		studentts.add(s4);
		for (Student s : studentts) {
			System.out.println(s);
		}

		System.out.println("");
		Set<Car> CarsTS = new TreeSet<Car>();// for observing TreeSet sorts the values of Car
		CarsTS.add(new Car("Maruti", "alto", 2018, 300000));
		CarsTS.add(new Car("Hyundai", "i10", 2018, 300000));
		CarsTS.add(new Car("Hyundai", "i11", 2018, 300000));
		CarsTS.add(new Car("Cheverolet", "impala", 2018, 300000));
		CarsTS.add(new Car("Cheverolet", "impala", 2018, 300000));
		for (Car sc : CarsTS) {
			System.out.println(sc);
		}

		System.out.println("");
		System.out.println("---------------------HAshMap-----------------------");
		Map<Student, String> Studenthm = new HashMap<Student, String>();
		Studenthm.put(new Student("himanshu"), "Orange");
		Studenthm.put(new Student("Aashish"), "Mango");
		Studenthm.put(new Student("Rohit"), "Banana");
		Studenthm.put(new Student("Shubham"), "Litchi");
		Set<Map.Entry<Student, String>> valueEntrySet = Studenthm.entrySet();// Printing key value using entry set
		
		for (Map.Entry<Student, String> m : valueEntrySet) {
			System.out.println(m.getKey() + "       values: " + m.getValue());
		}
		
		Set<Student> valueKeySet = Studenthm.keySet();// Printing key value using key set
		for (Student key : valueKeySet) {
			System.out.println(key + "       values: " + Studenthm.get(key));
		}
		Student st = new Student("himanshu");
		System.out.println("Printing himanshu's fav fruit");
		System.out.println(Studenthm.get(st));// passing object st to print its value
	}
}
