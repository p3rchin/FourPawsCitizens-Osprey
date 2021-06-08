package co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos;

/**
 * Creating the pojo class of Vet
 */
public class VetPOJO {

    private Integer vetId;
    private String username;
    private String name;
    private String address;
    private String neighborhood;

    /**
     * Creating the pojo constructor of Vet
     */
    public VetPOJO() {
    }

    /**
     * Creating the pojo constructor of Vet
     * @param vetId is the id of the vet, vetId!=null, vetId!=" ".
     * @param username is the username of the vet, username!=null, username!=" ".
     * @param name is the name of the vet, name!=null, name!=" ".
     * @param address is the address of the vet, address!=null, address!=" ".
     * @param neighborhood is the neighborhood of the vet, neighborhood!=null, neighborhood!=" ".
     */
    public VetPOJO(Integer vetId, String username, String name, String address, String neighborhood) {
        this.vetId = vetId;
        this.username = username;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public Integer getVetId() {
        return vetId;
    }

    public void setVetId(Integer vetId) {
        this.vetId = vetId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
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
