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
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToMany(mappedBy = "pet", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Case> cases = new ArrayList<>();

    @OneToMany(mappedBy = "pet", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Visit> visits = new ArrayList<>();


    /**
     * Creating default constructor
     */
    public Pet() {
    }

    /**
     * Creating an specific constructor
     *
     * @param petId      is the id for the pet that we choose . petId !=null, petId !=" "
     * @param microchip  is the identification that we put in the pet.
     * @param name       is the reference for the pet
     * @param species    is the specie of the pet. species !=null, species !=" "
     * @param race       is the race of the pet. race !=null , race != " "
     * @param size       is the size of the pet. size!=null, size!=" "
     * @param sex        is the sex od the pet . sex!=null, sex!= " "
     * @param picture    is the image for the pet.
     * @param owner      is the id for the owner.
     */
    public Pet(Integer petId, String microchip, String name, String species, String race, String size, String sex, String picture, Owner owner) {
        this.petId = petId;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.owner = owner;

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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


}
