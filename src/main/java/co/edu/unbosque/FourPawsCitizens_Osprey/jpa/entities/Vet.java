package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating vet with constructor and Getters and Setters
 */
@Entity
@Table(name = "Vet") // Optional
@NamedQueries({
        @NamedQuery(name = "Vet.findByName",
                query = "SELECT a FROM Vet a WHERE a.username = :username")
})
public class Vet {


    @Id
    @GeneratedValue
    @Column(name = "vet_id", unique = true)
    private Integer vetId;

    @OneToOne
    @JoinColumn(name = "username")
    private UserApp username;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "neighborhood")
    private String neighborhood;


    @OneToMany(mappedBy = "vet", cascade = CascadeType.ALL)
    private List<Visit> visits = new ArrayList<>();

    /**
     * Creating default constructor
     */

    public Vet() {
    }



    /**
     * Creating an specific constructor
     *
     * @param vetId        is the id od the vet, vetId!= null, vetId!= " "
     * @param username     is the username that was created by the program . username!= null, username!= " "
     * @param name         is the name for the vet. name != null, name !=" "
     * @param address      is the location for the house. address!= null, address!=" "
     * @param neighborhood where the vet is located. neighborhood != null ,neighborhood != " "
     */
    public Vet(Integer vetId, UserApp username, String name, String address, String neighborhood) {
        this.vetId = vetId;
        this.username = username;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }



    public UserApp getUsername() {
        return username;
    }

    public void setUsername(UserApp username) {
        this.username = username;
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
}
