package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe,Long>{

}
