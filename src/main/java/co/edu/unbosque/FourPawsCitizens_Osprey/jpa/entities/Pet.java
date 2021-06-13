package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating Pet with constructors and Getters and Setters
 */
@Entity
@Table(name = "Pet") // Optional
@NamedQueries({
        @NamedQuery(name = "Pet.findByName",
                query = "SELECT a FROM Pet a WHERE a.petId = :pet_id")
})

public class Pet {
    @Id
    @GeneratedValue
    @Column(name = "pet_id")
    private Integer petId;

    @Column(name = "microchip", unique = true)
    private String microchip;

    @Column(name = "name")
    private String name;

    @Column(name = "species")
    private String species;

    @Column(name = "race")
    private String race;

    @Column(name = "size")
    private String size;

    @Column(name = "sex")
    private String sex;

    @Column(name = "picture")
    private String picture;

    @ManyToOne
    @JoinColumn(name = "username")
    private Owner username;

    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
    private List<PetCase> cases = new ArrayList<>();

    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
    private List<Visit> visits = new ArrayList<>();


    /**
     * Creating default constructor
     */
    public Pet() {
    }

    /**
     * Creating an specific constructor
     *
     * @param petId     is the id for the pet that we choose . petId !=null, petId !=" "
     * @param microchip is the identification that we put in the pet.
     * @param name      is the reference for the pet
     * @param species   is the specie of the pet. species !=null, species !=" "
     * @param race      is the race of the pet. race !=null , race != " "
     * @param size      is the size of the pet. size!=null, size!=" "
     * @param sex       is the sex od the pet . sex!=null, sex!= " "
     * @param picture   is the image for the pet.
     * @param username  is the nickname for the owner.
     */
    public Pet(Integer petId, String microchip, String name, String species, String race, String size, String sex, String picture, Owner username) {
        this.petId = petId;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.username = username;

    }

    /**
     * Creating an specific constructor
     *
     * @param petId     is the id for the pet that we choose . petId !=null, petId !=" "
     * @param microchip is the identification that we put in the pet.
     * @param name      is the reference for the pet
     * @param species   is the specie of the pet. species !=null, species !=" "
     * @param race      is the race of the pet. race !=null , race != " "
     * @param size      is the size of the pet. size!=null, size!=" "
     * @param sex       is the sex od the pet . sex!=null, sex!= " "
     * @param picture   is the image for the pet.
     */
    public Pet(Integer petId, String microchip, String name, String species, String race, String size, String sex, String picture) {
        this.petId = petId;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;


    }

    /**
     * Creating an specific constructor
     *
     * @param microchip is the identification that we put in the pet.
     * @param name      is the reference for the pet
     * @param species   is the specie of the pet. species !=null, species !=" "
     * @param race      is the race of the pet. race !=null , race != " "
     * @param size      is the size of the pet. size!=null, size!=" "
     * @param sex       is the sex od the pet . sex!=null, sex!= " "
     * @param picture   is the image for the pet.
     */
    public Pet(String microchip, String name, String species, String race, String size, String sex, String picture) {
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
    }


    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Owner getUsername() {
        return username;
    }

    public void setUsername(Owner username) {
        this.username = username;
    }

    public List<PetCase> getCases() {
        return cases;
    }

    public void setCases(List<PetCase> cases) {
        this.cases = cases;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public Integer getPetId() {
        return petId;
    }

    public void addPetCase(PetCase petCase) {
        cases.add(petCase);
        petCase.setPet(this);
    }
}
