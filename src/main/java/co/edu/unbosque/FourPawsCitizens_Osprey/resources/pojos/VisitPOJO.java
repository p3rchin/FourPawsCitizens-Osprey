package co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos;

/**
 * Creating the pojo class of Visit
 */
public class VisitPOJO {

    private Integer visitId;
    private String createdAt;
    private String type;
    private String description;
    private Integer vetId;
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
     * @param vetId is the id of the vet, vetId!=null, vetId!=" ".
     * @param petId is the id of the pet, petId!=null, petId!=" ".
     */
    public VisitPOJO(Integer visitId, String createdAt, String type, String description, Integer vetId, Integer petId) {
        this.visitId = visitId;
        this.createdAt = createdAt;
        this.type = type;
        this.description = description;
        this.vetId = vetId;
        this.petId = petId;
    }
}
