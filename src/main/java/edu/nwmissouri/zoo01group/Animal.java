package edu.nwmissouri.zoo01group;

/**
 * Animal super class for traits shared by all animals. Abstract - don't make a
 * general animal - only specific types.
 *
 * @author Sreebharath Mallampati
 */
public abstract class Animal {

    /**
     * Every animal has a name. Class variable name is not private, but
     * protected - only subclasses can use it.
     */
    protected String name = "no name";
    

    /**
     * Animals have an associated gender which may be unknown.
     *
     * We limit the choices for selection by using an enum
     */
    protected AnimalGender gender;

    /**
     * Animal constructor
     *
     * @param name - the name of this instance of an animal
     */
    public Animal(String name) {
        this.name = name;
        this.gender = AnimalGender.UNKNOWN;

    }

    /**
     * abstract speak() - has no implementation
     */
    public abstract String speak();

    /**
     * abstract move() - has no implementation
     */
    public abstract String move();

    /**
     * Get animal's name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the animal gender.
     *
     * @return the gender
     */
    public AnimalGender getGender() {
        return gender;
    }

    /**
     * Set the animal gender using an enum
     *
     * @param gender the gender to set
     */
    public void setGender(AnimalGender gender) {
        this.gender = gender;
    }

}
