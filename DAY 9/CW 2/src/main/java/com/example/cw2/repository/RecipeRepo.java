package com.example.cw2.repository;

import com.example.cw2.model.Recipe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepo extends JpaRepository<Recipe, Integer> {

    List<Recipe> findByRecipeName(String recipeName);
}