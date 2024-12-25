package ru.pankova.Validate;

@Validate(value = {String.class})
public class ValidateClass {
    private String animal;
    private String name;

    public ValidateClass(String animal, String name) {
        this.animal = animal;
        this.name = name;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "ValidateClass{" +
                "animal='" + animal + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}