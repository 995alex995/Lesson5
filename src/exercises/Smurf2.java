package exercises;

public class Smurf2 {

	public static void main(String[] args) {
Smurf hs = new Smurf("handy");
hs.eat();
System.out.println(hs.getName());
Smurf ps = new Smurf("Papa Smurf");
System.out.println(ps.isGirlOrBoy());
System.out.println(ps.getHatColor());
System.out.println(ps.getName());
Smurf sm = new Smurf("Smurfete");
System.out.println(sm.isGirlOrBoy());
System.out.println(sm.getHatColor());
System.out.println(sm.getName());

	}

}
