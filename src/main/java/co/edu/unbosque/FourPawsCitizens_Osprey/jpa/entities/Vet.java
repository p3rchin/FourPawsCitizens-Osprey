package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating vet with constructor and Getters and Setters
 */
@Entity
@Table(name = "Vet")
@PrimaryKeyJoinColumn
public class Vet extends UserApp {

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "neighborhood")
    private String neighborhood;


    @OneToMany(mappedBy = "username", cascade = CascadeType.ALL)
    private List<Visit> visits = new ArrayList<>();

    /**
     * Creating default constructor
     */

    public Vet() {
    }

    /**
     * Creating an specific constructor
     *
     * @param username     is the name that was created by the program . username!= null, username!= " "
     * @param password     is the key that has the user that open the program. password != null, username!=" "
     * @param email        is the @ that has the user. email != null, email != " "
     * @param name         is the name for the vet. name != null, name !=" "
     * @param address      is the location for the house. address!= null, address!=" "
     * @param neighborhood where the vet is located. neighborhood != null ,neighborhood != " "
     */
    public Vet(String username, String password, String email, String name, String address, String neighborhood) {
        super(username, password, email, "vet");
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void addVisit(Visit visit) {
        visits.add(visit);
        visit.setUsername(this);
    }
}
