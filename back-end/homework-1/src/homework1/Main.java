package homework1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pickup p=new Pickup();
        p.setBrand("Ford");
        p.setModel("F-150 2018");
        p.changingGear(5);
        p.handSteering("Timisoara");
        p.movingSpeed(67);
        p.setNrLocuri(4);
        System.out.println(p.toString());
        System.out.println();
        BarkingDog b=new BarkingDog();
        b.isBarking(true, 1);
        b.isBarking(false, 2);
        b.isBarking(true, 8);
        b.isBarking(true, -1);
        System.out.println();
        EqualSumChecker e=new EqualSumChecker();
        e.hasEqualSum(1,1,1);
        e.hasEqualSum(1, 1, 2);
        e.hasEqualSum(1, -1, 0);
        System.out.println();
        MinutesToYearsAndDaysCalculator m=new MinutesToYearsAndDaysCalculator();
        m.MinutesToYearsandDaysCalculator(525600);
        m.MinutesToYearsandDaysCalculator(1051200);
        m.MinutesToYearsandDaysCalculator(561600);
    }
}
