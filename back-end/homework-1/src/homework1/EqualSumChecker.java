package homework1;

public class EqualSumChecker {

    public boolean hasEqualSum (int par1, int par2, int par3){

        if((par1+par2)==par3) {
            System.out.println("Suma primilor 2 param ESTE egala cu cel de-al treilea parametru.");
            return true;
        }
        else{
            System.out.println("Suma primilor 2 param NU ESTE egala cu cel de-al treilea parametru.");
            return false;
        }
    }
}
