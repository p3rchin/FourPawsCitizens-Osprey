package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities;


import javax.persistence.*;

/**
 * Creating Case with constructors and Getters and Setters
 */
@Entity
@Table(name = "PetCase") // Optional
@NamedQueries({
        @NamedQuery(name = "Casee.findByName",
                query = "SELECT a FROM PetCase  a WHERE a.case_id = :case_id")
})
public class PetCase {
    @Id
    @GeneratedValue
    @Column(name = "case_id")
    private Integer case_id;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    /**
     * Creating the default Constructor
     */
    public PetCase() {
    }

    /**
     * Creating the specific Constructor
     *
     * @param case_id     is the id of the case. case!= null, case != " "
     * @param created_at  is the date that was created the case. created_at!= null, created_at !=" "
     * @param type        is the "type" of the case. type!= null, type !=" "
     * @param description are the qualities that has the case . description != null , description !=" "
     * @param pet         is the id that has the pet . pet_id != null , pet_id != " "
     */
    public PetCase(Integer case_id, String created_at, String type, String description, Pet pet) {
        this.case_id = case_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.pet = pet;
    }
    public PetCase(Integer case_id, String created_at, String type, String description) {
        this.case_id = case_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
    }

    /**
     * Creating the specific Constructor
     *
     * @param created_at  is the date that was created the case. created_at!= null, created_at !=" "
     * @param type        is the "type" of the case. type!= null, type !=" "
     * @param description are the qualities that has the case . description != null , description !=" "
     */
    public PetCase(String created_at, String type, String description) {
        this.case_id = case_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.pet = pet;
    }

    public Integer getCase_id() {
        return case_id;
    }

    public void setCase_id(Integer case_id) {
        this.case_id = case_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
