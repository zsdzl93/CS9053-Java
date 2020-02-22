package edu.nyu.cs9053.homework5;

/**
 * User: blangel
 */
public class Chef {

    private final Oven oven;
    private final SousChef sousChef;
    
    public Chef(Oven oven) {
        this.oven = oven;
        this.sousChef = new SousChef(oven);
    }
    
    public static void main(String[] args) {
        Oven oven = new Oven(300);
        Chef chef = new Chef(oven);
        Recipe roastedSweetPotato = new RoastedSweetPotato();
        Recipe potRoast = new PotRoast();
        Recipe firstBaguette = new Baguette(0.5d);
        Recipe secondBaguette = new Baguette(0.5d);
        
        // prepare in order
        chef.prepareToCook(potRoast);
        chef.prepareToCook(firstBaguette);
        chef.prepareToCook(roastedSweetPotato);
        chef.prepareToCook(secondBaguette);
    }

    private void prepareToCook(Recipe recipe) {
        // call souschef to prepare
        sousChef.prepare(recipe, new RecipeReadyCallback(){
            @Override
            public void recipeReadyToCook(Recipe recipe) {
                recipe.initializeFromOven(oven);
                cookInOven(recipe, true);
            }
        });
    }
    
    private void cookInOven(Recipe recipe, boolean initialPutInOven) {
        oven.cook(recipe, new Timer() {
            @Override
            public void update(Time unit, int value, int ovenTemperature) {
                if (recipe.isRecipeDone()) {
                    oven.takeOut(recipe);
                } else {
                    recipe.adjust(unit, value, ovenTemperature);
                    cookInOven(recipe, false);
                }
            }
        }, initialPutInOven);
    }
    
}
