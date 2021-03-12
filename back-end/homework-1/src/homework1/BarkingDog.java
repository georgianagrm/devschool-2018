package homework1;

public class BarkingDog {

    public boolean isBarking(boolean barking, int hourOfDay){

        if(hourOfDay<0||hourOfDay>23){
            System.out.println("O zi nu poate avea ore negative sau mai mari decat 23.");
            return false;
        } else
            if(barking && hourOfDay<8 || hourOfDay>22){
            System.out.println("Trezirea, latra cainele.");
            return true;
        }
        else {
            System.out.println("Caz in care probabil poti dormi linistit.");
            return false;
        }
    }
}
