/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package associationexample;
import java.util.*;
/**
 *
 * @author jovan
 */

class CityClass {
    private String cityName;
    
    public String getCityName(){
        return cityName;
    }
    
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    
    public String toString(){
        return cityName;
    }
}

class State {
    private String stateName;
    
    List<CityClass> citys;
    
    public String getStateName(){
        return stateName;
    }
    
    public void setStateName(String stateName){
        this.stateName = stateName;
    }
    
    public List<CityClass> getCities(){
        return citys;
    }
    
    public void setState(List<CityClass> citys){
        this.citys = citys;
    }
}

public class AssociationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        State state = new State();
        state.setStateName("California");
        
        CityClass city = new CityClass();
        city.setCityName("Los Angeles");
        CityClass city2 = new CityClass();
        city2.setCityName("San Diego");
        
        List<CityClass> empList = new ArrayList<CityClass>();
        empList.add(city);
        empList.add(city2);
        
        state.setState(empList);
        
        System.out.println(state.getCities()+" are cities in the state "+state.getStateName());
    }
    
}
