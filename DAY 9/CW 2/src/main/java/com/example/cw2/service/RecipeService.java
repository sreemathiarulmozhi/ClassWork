package com.example.cw2.service;

import com.example.cw2.model.Recipe;
import com.example.cw2.repository.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    
        @Autowired
    private  RecipeRepo recipeRepo;


    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepo.save(recipe);
    }

    public List<Recipe> findRecipesByName(String recipeName) {
        return recipeRepo.findByRecipeName(recipeName);
    }

    public Optional<Recipe> findRecipeById(int recipeId) {
        return recipeRepo.findById(recipeId);
}
}
