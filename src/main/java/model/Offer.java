package model;

import java.time.LocalDate;
import java.util.UUID;

public class Offer {

    private LocalDate creationDay;
    private LocalDate expaireDay;
    private UUID id;
    private House house;

    public Offer (House house){
        this.house = house;
        this.creationDay = LocalDate.now();
        this.expaireDay = LocalDate.now().plusWeeks(2);
        this.id= UUID.randomUUID();
    }

    public LocalDate getCreationDay() {
        return creationDay;
    }


    public UUID getId() {
        return id;
    }


    public LocalDate getExpaireDay() {
        return expaireDay;
    }

    public void setExpaireDay(LocalDate expaireDay) {
        this.expaireDay = expaireDay;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

}
