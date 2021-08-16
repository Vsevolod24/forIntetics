package intetics.project.demo.model;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "travellers")
@Getter
@Setter
@ToString
@Data
public class Traveller extends BaseEntity {

    private String user;
    private String country;
    private String description;
    private String year;

    public Traveller() {

    }

    @Builder
    public Traveller(String user, String country, String description, String year) {

        this.user = user;
        this.country = country;
        this.description = description;
        this.year = year;
    }


    public String getUser() {
        return user;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    public String getYear() {
        return year;
    }

}
