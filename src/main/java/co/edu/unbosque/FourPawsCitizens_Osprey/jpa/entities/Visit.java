package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities;


import javax.persistence.*;

/**
 * Creating Visit with constructor and Getters and Setters
 */


@Entity
@Table(name = "Visit")
@NamedQueries({
        @NamedQuery(name = "Visit.findByName",
                query = "SELECT a FROM Visit a WHERE a.visit_id = :visit_id")
})
public class Visit {
    @Id
    @GeneratedValue
    @Column(name = "visit_id")
    private int visit_id;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "username")
    private Vet username;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    /**
     * Creating default constructor
     */
    public Visit() {
    }

    /**
     * Creating an specific constructor
     *
     * @param visit_id    the id that was created by the program. visit_id!=null , visit_id!=" "
     * @param created_at  the date that was created the visit. created_at !=null, created_at!=" "
     * @param type        is the type of the visit. type!=null , type !=" "
     * @param description the qualities that has the visit . description!=null, description !=" "
     * @param username    is the nickname of the  vet. username !=null, username!=" "
     * @param pet         the id that has the pet. pet_id!=null, pet_id!=" "
     */
    public Visit(int visit_id, String created_at, String type, String description, Vet username, Pet pet) {
        this.visit_id = visit_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.username = username;
        this.pet = pet;
    }

    /**
     * Creating an specific constructor
     *
     * @param visit_id    the id that was created by the program. visit_id!=null , visit_id!=" "
     * @param created_at  the date that was created the visit. created_at !=null, created_at !=" "
     * @param type        is the type of the visit. type!=null , type !=" "
     * @param description the qualities that has the visit . description!=null, description !=" "
     * @param pet         the id that has the pet. pet_id!=null, pet_id !=" "
     */
    public Visit(int visit_id, String created_at, String type, String description, Pet pet) {
        this.visit_id = visit_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.pet = pet;
    }
    /**
     * Creating an specific constructor
     *
     * @param visit_id    the id that was created by the program. visit_id!=null , visit_id!=" "
     * @param created_at  the date that was created the visit. created_at !=null, created_at !=" "
     * @param type        is the type of the visit. type!=null , type !=" "
     * @param description the qualities that has the visit . description!=null, description !=" "
     */
    public Visit(int visit_id, String created_at, String type, String description) {
        this.visit_id = visit_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
    }


    /**
     * Creating an specific constructor
     *
     * @param created_at  the date that was created the visit. created_at !=null, created_at visit_id!=" "
     * @param type        is the type of the visit. type!=null , type visit_id!=" "
     * @param description the qualities that has the visit . description!=null, description visit_id!=" "
     */
    public Visit(String created_at, String type, String description) {
        this.created_at = created_at;
        this.type = type;
        this.description = description;

    }




    public int getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(int visit_id) {
        this.visit_id = visit_id;
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

    public Vet getUsername() {
        return username;
    }
    public void setUsername(Vet username) {
        this.username = username;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
