package car_details;

public class Drivercls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Maruti.displaycardetails m1;
m1=new  Maruti.displaycardetails();
Maruti.displaycustdetails m2;
m2=new Maruti.displaycustdetails();

Tata.displaycardetails t1;
t1=new Tata.displaycardetails();
Tata.displaycustdetails t2;
t2=new Tata.displaycustdetails();

//call setters for Maruti
m1.setCar_name("MARUTI SUZUKI");
m1.setCar_id("1R567");
m1.setCar_colour("BLACK");
m1.setEngine_number(1234);
m1.setDate_of_manf("oct-15");
  
m2.setCust_id("123jk");
m2.setCust_name("soumya");
m2.setCust_mobile(976547);
m2.setCust_address("KARIMNAGAR");

//call setters for Tata
t1.setCar_name("TATA V42");
t1.setCar_id("1v43");
t1.setCar_colour("GRAY");
t1.setEngine_number(1356);
t1.setDate_of_manf("AUG-3");

t2.setCust_id("14v3");
t2.setCust_name("sruthi");
t2.setCust_mobile(789203);
t2.setCust_address("WARANAGL");

System.out.println("MARUTI CAR AND CUST DETAILS");
System.out.println("========================================");
System.out.println("car_name:"+m1.getCar_name());
System.out.println("car_id:"+m1.getCar_id());
System.out.println("car_colour:"+m1.getCar_colour());
System.out.println("Engine_number:"+m1.getEngine_number());
System.out.println("Date_of_manf:"+m1.getDate_of_manf());
System.out.println("cust_id:"+m2.getCust_id());
System.out.println("cust_name:"+m2.getCust_name());
System.out.println("cust_mobile:"+m2.getCust_mobile());
System.out.println("cust_address:"+m2.getCust_address());

System.out.println("TATA CAR AND CUST DETAILS");
System.out.println("======================================");
System.out.println("car_name:"+t1.getCar_name());
System.out.println("car_id:"+t1.getCar_id());
System.out.println("car_colour:"+t1.getCar_colour());
System.out.println("Engine_number:"+t1.getEngine_number());
System.out.println("Date_of_manf:"+t1.getDate_of_manf());
System.out.println("cust_id:"+t2.getCust_id());
System.out.println("cust_name:"+t2.getCust_name());
System.out.println("cust_mobile:"+t2.getCust_mobile());
System.out.println("cust_address:"+t2.getCust_address());



	}

}
