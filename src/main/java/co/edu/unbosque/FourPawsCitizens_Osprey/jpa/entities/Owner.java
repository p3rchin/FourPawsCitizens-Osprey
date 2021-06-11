package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating the  Owner with constructor and Getters and Setters
 */
@Entity
@Table(name = "Owner")
@PrimaryKeyJoinColumn
public class Owner extends UserApp {

    @Column(name = "person_id", unique = true)
    private Integer personId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "neighborhood")
    private String neighborhood;

    @OneToMany(mappedBy = "username", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Pet> pets = new ArrayList<>();

    /**
     * Creating default constructor
     */
    public Owner() {
    }


    /**
     * Creating an specific constructor
     *
     * @param username     is the name that was created by the program . username!= null, username!= " "
     * @param password     is the key that has the user that open the program. password != null, username!=" "
     * @param email        is the @ that has the user. email != null, email != " "
     * @param personId     is the id of the person. personId != null, personId!=" ".
     * @param name         is the name of the owner. name != null, name !=" "
     * @param address      is the location for the house. address!= null, address
     * @param neighborhood is the location where the owner live. neighborhood != null ,neighborhood != " "
     */

    public Owner(String username, String password, String email, Integer personId, String name, String address, String neighborhood) {
        super(username, password, email, "owner");
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    /**
     * Creating an specific constructor
     *
     * @param name         is the name of the owner. name != null, name !=" "
     * @param address      is the location for the house. address!= null, address
     * @param neighborhood is the location where the owner live. neighborhood != null ,neighborhood != " "
     */

    public Owner(String name, String address, String neighborhood) {
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
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

    public void addPet(Pet pet) {
        pets.add(pet);
        pet.setUsername(this);
    }

}
