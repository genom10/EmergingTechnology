package io.moonman.emergingtechnology.helpers.custom;

public class CustomGrowthMedium {

    public int id = 0;
    public String name = "";
    public int waterUsage = 1;
    public int growthModifier = 0;

    public CustomGrowthMedium(int id, String name, int waterUsage, int growthModifier) {
        this.id = id;
        this.name = name;
        this.waterUsage = waterUsage;
        this.growthModifier = growthModifier;
    }
}