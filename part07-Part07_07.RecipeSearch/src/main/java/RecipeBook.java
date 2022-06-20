
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyson
 */
public class RecipeBook {
    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);

    }

   
    public void printByName(String name) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe recipe : this.recipes) {

                
                if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(recipe);

                }

            }

        }

    }

    public void printByTime(String time) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe recipe : this.recipes) {

                
                if (recipe.getTime() <= Integer.valueOf(time)) {

                    System.out.println(recipe);

                }

            }

        }

    }

    public void printByIngredient(String ingredient) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe recipe : this.recipes) {

                
                if (recipe.getIngredients().contains(ingredient.toLowerCase())) {

                    System.out.println(recipe);

                }

            }

        }

    }

    public void printRecipeBook() {

        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);

        }

    }
}
