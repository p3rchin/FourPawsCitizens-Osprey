package co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos;

/**
 * Creating the pojo class of Pet
 */
public class PetPOJO {

    private Integer petId;
    private String microchip;
    private String name;
    private String species;
    private String race;
    private String size;
    private String sex;
    private String picture;
    private Integer ownerId;

    /**
     * Creating the pojo constructor of Pet
     */
    public PetPOJO() {
    }

    /**
     * Creating the pojo constructor of Pet
     * @param petId is the id of the pet, petId!=null, petId!=" ".
     * @param microchip is the microchip of the pet, microchip!=" ".
     * @param name is the name of the pet, name!=null, name!=" ".
     * @param species is the sepecies of the pet, species!=null, species!=" ".
     * @param race is the race of the pet, race!=null, race!=" ".
     * @param size is the size of the pet, size!=null, size!=" ".
     * @param sex is the sex of the pet, sex!=null, sex!=" ".
     * @param picture is the picture of the pet, picture!=null, picture!=" ".
     * @param ownerId is the id of the owner, ownerId!=null, ownerId!=" ".
     */
    public PetPOJO(Integer petId, String microchip, String name, String species, String race, String size, String sex, String picture, Integer ownerId) {
        this.petId = petId;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.ownerId = ownerId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
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

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
