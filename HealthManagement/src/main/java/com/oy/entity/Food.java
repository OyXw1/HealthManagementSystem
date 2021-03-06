package com.oy.entity;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Food {
    private int id;
    private String name;
    private String description;
    private int foodEnergy;

    public Food() {
    }

    public Food(String name, String description, int foodEnergy) {
        this.name = name;
        this.description = description;
        this.foodEnergy = foodEnergy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFoodEnergy() {
        return foodEnergy;
    }

    public void setFoodEnergy(int foodEnergy) {
        this.foodEnergy = foodEnergy;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", foodEnergy=" + foodEnergy +
                '}';
    }
}
