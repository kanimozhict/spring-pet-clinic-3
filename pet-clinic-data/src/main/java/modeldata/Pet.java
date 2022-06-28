package modeldata;

import java.time.LocalDate;

public class Pet {
    private String name;
    private Owner owner;
    private LocalDate birthdate;
    private Pet_type pet_type;

    public Pet() {
    }

    public Pet(String name, Owner owner, LocalDate birthdate, Pet_type pet_type) {
        this.name = name;
        this.owner = owner;
        this.birthdate = birthdate;
        this.pet_type = pet_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Pet_type getPet_type() {
        return pet_type;
    }

    public void setPet_type(Pet_type pet_type) {
        this.pet_type = pet_type;
    }
}
