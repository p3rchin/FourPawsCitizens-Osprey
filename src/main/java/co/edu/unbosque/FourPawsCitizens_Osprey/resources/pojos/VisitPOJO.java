package co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos;

/**
 * Creating the pojo class of Visit
 */
public class VisitPOJO {

    private Integer visitId;
    private String createdAt;
    private String type;
    private String description;
    private String username;
    private Integer petId;

    /**
     * Creating the pojo constructor of Visit
     */
    public VisitPOJO() {
    }

    /**
     * Creating the pojo constructor of Visit
     * @param visitId is the id of the visit, visitId!=null, visitId!=" ".
     * @param createdAt  is the date when the visit was created, createdAt!=null, createdAt!=" ".
     * @param type is the type of the visit, type!=null, type!=" ".
     * @param description is the description of the visit, description!=null, description!=" ".
     * @param username is the nickname of the vet, username!=null, username!=" ".
     * @param petId is the id of the pet, petId!=null, petId!=" ".
     */
    public VisitPOJO(Integer visitId, String createdAt, String type, String description, String username, Integer petId) {
        this.visitId = visitId;
        this.createdAt = createdAt;
        this.type = type;
        this.description = description;
        this.username = username;
        this.petId = petId;
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}
