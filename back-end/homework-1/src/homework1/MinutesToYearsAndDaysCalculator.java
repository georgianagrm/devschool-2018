package homework1;

public class MinutesToYearsAndDaysCalculator {

    public void MinutesToYearsandDaysCalculator(int minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        } else
        {
            System.out.println(minutes+" min = "+ minutes/1440/365+" y and "+minutes/1440%365+" d");
        }
    }
}
