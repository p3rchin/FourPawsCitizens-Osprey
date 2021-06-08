package co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos;

/**
 * Creating the pojo class of PetCase
 */
public class PetCasePOJO {

    private Integer caseId;
    private String createdAt;
    private String type;
    private String description;
    private Integer petId;

    /**
     * Creating the pojo constructor of PetCase
     */
    public PetCasePOJO() {
    }

    /**
     * Creating the pojo constructor of PetCase
     * @param caseId is the id of the pet case, caseId!=null, caseId!=" ".
     * @param createdAt is the date when the case was created, createdAt!=null, createdAt!=" ".
     * @param type is the type of the pet case, type!=null, type!=" ".
     * @param description is the description of the pet case, description!=null, description!=" ".
     * @param petId is the id of the pet, petId!=null, petId!=" ".
     */

    public PetCasePOJO(Integer caseId, String createdAt, String type, String description, Integer petId) {
        this.caseId = caseId;
        this.createdAt = createdAt;
        this.type = type;
        this.description = description;
        this.petId = petId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
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

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}
