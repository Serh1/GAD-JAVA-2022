package Lecture3.Ch3;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy implements RealEstateAgent{
    private List<Apartment> apartments;

    public RealEstateAgentProxy() {
       apartments = new ArrayList<>();
    }

    @Override
    public void represent(Apartment apartment) {
        apartments.add(apartment);
    }

    @Override
    public Apartment rent(Student student) {
        if(student.name.trim().startsWith("P")){
            return null;
        }else {
            for(Apartment ap:apartments){
                return ap.monthlyRentCost<student.money?ap:null;
            }
        }
        return null;
    }
}
