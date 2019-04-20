package upc.edu.dsa;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CommandFactory cf = new CommandFactory();
        try {
            System.out.println(cf.newInstance("C3").execute());
            System.out.println(cf.newInstance("C2").execute());
            System.out.println(cf.newInstance("C1").execute());
            System.out.println(cf.newInstance("C1").execute());
        }catch (ClassNotFoundException e1){
            System.out.println("Class not found");
        }catch (IllegalAccessException e2){
            System.out.println("Illegal access");
        }catch (InstantiationException e3){
            System.out.println("Instantiation exception");
        }
    }
}
