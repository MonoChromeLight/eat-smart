package com.annguyen.android.eatsmart.entities;

/**
 * Created by annguyen on 6/3/2017.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recipe {

    //compare 2 recipe if they are the same using ids
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Recipe) {
            return ((Recipe) obj).getId() == this.getId();
        }
        return false;
    }

    @SerializedName("vegetarian")
    @Expose
    private boolean vegetarian;
    @SerializedName("vegan")
    @Expose
    private boolean vegan;
    @SerializedName("glutenFree")
    @Expose
    private boolean glutenFree;
    @SerializedName("dairyFree")
    @Expose
    private boolean dairyFree;
    @SerializedName("veryHealthy")
    @Expose
    private boolean veryHealthy;
    @SerializedName("cheap")
    @Expose
    private boolean cheap;
    @SerializedName("veryPopular")
    @Expose
    private boolean veryPopular;
    @SerializedName("sustainable")
    @Expose
    private boolean sustainable;
    @SerializedName("weightWatcherSmartPoints")
    @Expose
    private int weightWatcherSmartPoints;
    @SerializedName("gaps")
    @Expose
    private String gaps;
    @SerializedName("lowFodmap")
    @Expose
    private boolean lowFodmap;
    @SerializedName("ketogenic")
    @Expose
    private boolean ketogenic;
    @SerializedName("whole30")
    @Expose
    private boolean whole30;
    @SerializedName("servings")
    @Expose
    private int servings;
    @SerializedName("preparationMinutes")
    @Expose
    private int preparationMinutes;
    @SerializedName("cookingMinutes")
    @Expose
    private int cookingMinutes;
    @SerializedName("sourceUrl")
    @Expose
    private String sourceUrl;
    @SerializedName("spoonacularSourceUrl")
    @Expose
    private String spoonacularSourceUrl;
    @SerializedName("aggregateLikes")
    @Expose
    private int aggregateLikes;
    @SerializedName("spoonacularScore")
    @Expose
    private int spoonacularScore;
    @SerializedName("healthScore")
    @Expose
    private int healthScore;
    @SerializedName("creditText")
    @Expose
    private String creditText;
    @SerializedName("sourceName")
    @Expose
    private String sourceName;
    @SerializedName("pricePerServing")
    @Expose
    private float pricePerServing;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("readyInMinutes")
    @Expose
    private int readyInMinutes;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("imageType")
    @Expose
    private String imageType;
    @SerializedName("cuisines")
    @Expose
    private List<String> cuisines = null;
    @SerializedName("dishTypes")
    @Expose
    private List<String> dishTypes = null;
    @SerializedName("analyzedInstructions")
    @Expose
    private List<Instruction> instructions = null;
    @SerializedName("usedIngredientCount")
    @Expose
    private int usedIngredientCount;
    @SerializedName("missedIngredientCount")
    @Expose
    private int missedIngredientCount;
    @SerializedName("likes")
    @Expose
    private int likes;
    @SerializedName("calories")
    @Expose
    private int calories;
    @SerializedName("protein")
    @Expose
    private String protein;
    @SerializedName("fat")
    @Expose
    private String fat;
    @SerializedName("carbs")
    @Expose
    private String carbs;


    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public boolean isDairyFree() {
        return dairyFree;
    }

    public void setDairyFree(boolean dairyFree) {
        this.dairyFree = dairyFree;
    }

    public boolean isVeryHealthy() {
        return veryHealthy;
    }

    public void setVeryHealthy(boolean veryHealthy) {
        this.veryHealthy = veryHealthy;
    }

    public boolean isCheap() {
        return cheap;
    }

    public void setCheap(boolean cheap) {
        this.cheap = cheap;
    }

    public boolean isVeryPopular() {
        return veryPopular;
    }

    public void setVeryPopular(boolean veryPopular) {
        this.veryPopular = veryPopular;
    }

    public boolean isSustainable() {
        return sustainable;
    }

    public void setSustainable(boolean sustainable) {
        this.sustainable = sustainable;
    }

    public int getWeightWatcherSmartPoints() {
        return weightWatcherSmartPoints;
    }

    public void setWeightWatcherSmartPoints(int weightWatcherSmartPoints) {
        this.weightWatcherSmartPoints = weightWatcherSmartPoints;
    }

    public String getGaps() {
        return gaps;
    }

    public void setGaps(String gaps) {
        this.gaps = gaps;
    }

    public boolean isLowFodmap() {
        return lowFodmap;
    }

    public void setLowFodmap(boolean lowFodmap) {
        this.lowFodmap = lowFodmap;
    }

    public boolean isKetogenic() {
        return ketogenic;
    }

    public void setKetogenic(boolean ketogenic) {
        this.ketogenic = ketogenic;
    }

    public boolean isWhole30() {
        return whole30;
    }

    public void setWhole30(boolean whole30) {
        this.whole30 = whole30;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getPreparationMinutes() {
        return preparationMinutes;
    }

    public void setPreparationMinutes(int preparationMinutes) {
        this.preparationMinutes = preparationMinutes;
    }

    public int getCookingMinutes() {
        return cookingMinutes;
    }

    public void setCookingMinutes(int cookingMinutes) {
        this.cookingMinutes = cookingMinutes;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSpoonacularSourceUrl() {
        return spoonacularSourceUrl;
    }

    public void setSpoonacularSourceUrl(String spoonacularSourceUrl) {
        this.spoonacularSourceUrl = spoonacularSourceUrl;
    }

    public int getAggregateLikes() {
        return aggregateLikes;
    }

    public void setAggregateLikes(int aggregateLikes) {
        this.aggregateLikes = aggregateLikes;
    }

    public int getSpoonacularScore() {
        return spoonacularScore;
    }

    public void setSpoonacularScore(int spoonacularScore) {
        this.spoonacularScore = spoonacularScore;
    }

    public int getHealthScore() {
        return healthScore;
    }

    public void setHealthScore(int healthScore) {
        this.healthScore = healthScore;
    }

    public String getCreditText() {
        return creditText;
    }

    public void setCreditText(String creditText) {
        this.creditText = creditText;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public float getPricePerServing() {
        return pricePerServing;
    }

    public void setPricePerServing(float pricePerServing) {
        this.pricePerServing = pricePerServing;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReadyInMinutes() {
        return readyInMinutes;
    }

    public void setReadyInMinutes(int readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public List<String> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<String> cuisines) {
        this.cuisines = cuisines;
    }

    public List<String> getDishTypes() {
        return dishTypes;
    }

    public void setDishTypes(List<String> dishTypes) {
        this.dishTypes = dishTypes;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public int getUsedIngredientCount() {
        return usedIngredientCount;
    }

    public void setUsedIngredientCount(int usedIngredientCount) {
        this.usedIngredientCount = usedIngredientCount;
    }

    public int getMissedIngredientCount() {
        return missedIngredientCount;
    }

    public void setMissedIngredientCount(int missedIngredientCount) {
        this.missedIngredientCount = missedIngredientCount;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }

    public int getFatValue() {
        String fatValue = fat.replaceAll("![0-9]", "");
        return Integer.valueOf(fatValue);
    }
    public int getCarbsValue() {
        String carbsValue = carbs.replaceAll("![0-9]", "");
        return Integer.valueOf(carbsValue);
    }
    public int getProteinValue() {
        String proteinValue = protein.replaceAll("![0-9]", "");
        return Integer.valueOf(proteinValue);
    }
}
