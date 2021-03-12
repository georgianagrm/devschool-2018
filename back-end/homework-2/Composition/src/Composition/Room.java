package Composition;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Furniture> list=new ArrayList<Furniture>();
    private int windows;
    private String colorOftheWalls;
    private int plants;

    public List<Furniture> getList() {
        return list;
    }

    public void setList(List<Furniture> list) {
        this.list = list;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getColorOftheWalls() {
        return colorOftheWalls;
    }

    public void setColorOftheWalls(String colorOftheWalls) {
        this.colorOftheWalls = colorOftheWalls;
    }

    public int getPlants() {
        return plants;
    }

    public void setPlants(int plants) {
        this.plants = plants;
    }

    public Room(List<Furniture> list, int windows, String colorOftheWalls, int plants) {
        this.list = list;
        this.windows = windows;
        this.colorOftheWalls = colorOftheWalls;
        this.plants = plants;
    }

    //Method to access getter from Activity and public method from Furniture
    public String printActivity(){
        int count=0;
        for(Furniture f: list) {
            if(f.getActivity()==Activity.sitON){
                System.out.println("Sit on: "+ f+" "+f.totalCost());
                count++;
            }
        }
        return count+" types of seats on wich you can rest.";
    }

    public String toString() {
        return "Room{" +
                " list=" + list +
                ", windows=" + windows +
                ", colorOftheWalls='" + colorOftheWalls + '\'' +
                ", plants=" + plants +
                '}';
    }
}
