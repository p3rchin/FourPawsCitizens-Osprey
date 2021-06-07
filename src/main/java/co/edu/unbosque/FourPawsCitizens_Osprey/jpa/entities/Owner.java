package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating the  Owner with constructor and Getters and Setters
 */
@Entity
@Table(name = "Owner") // Optional
@NamedQueries({
        @NamedQuery(name = "Owner.findByName",
                query = "SELECT a FROM Owner a WHERE a.username = :username")
})

public class Owner {


    @Id
    @OneToOne
    @JoinColumn(name = "username")
    private UserApp username;

    @GeneratedValue
    @Column(name = "person_id", unique = true)
    private Integer personId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "neighborhood")
    private String neighborhood;

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Pet> pets = new ArrayList<>();
    /**
     * Creating default constructor
     */
    public Owner() {
    }

    /**
     * Creating an specific constructor
     * @param username is the name that was created in the program. username != null, username !=" ".
     * @param personId is the id of the person. personId != null, personId!=" ".
     * @param name is the name of the owner. name != null, name !=" "
     * @param address is the location for the house. address!= null, address
     * @param neighborhood is the location where the owner live. neighborhood != null ,neighborhood != " "
     */

    public Owner(UserApp username, Integer personId, String name, String address, String neighborhood) {
        this.username = username;
        this.personId = personId;
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

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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
