package com.ramy.gatie.portfolio.models;

import javax.persistence.Entity;


@Entity
public class MySqlDataEntity extends AbstractEntity {

    private String name;
    private String favoritePokemon;


    public MySqlDataEntity(String name, String favoritePokemon) {
        this.name = name;
        this.favoritePokemon = favoritePokemon;
    }

    public MySqlDataEntity() {
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

    public void setFavoritePokemon(String favoritePokemon) {
        this.favoritePokemon = favoritePokemon;
    }

    @Override
    public String toString() {
        return name;
    }


}
