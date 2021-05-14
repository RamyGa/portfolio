package com.ramy.gatie.portfolio.models.dto;

public class MySqlDataDTO {

   private String name;
   private String favoritePokemon;
   private int id;


    public MySqlDataDTO(String name, String favoritePokemon, int id) {
        this.name = name;
        this.favoritePokemon = favoritePokemon;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoritePokemon() {
        return favoritePokemon;
    }

    public int getId() {
        return id;
    }


    public void setFavoritePokemon(String favoritePokemon) {
        this.favoritePokemon = favoritePokemon;
    }
}
