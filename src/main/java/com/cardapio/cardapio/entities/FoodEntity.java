package com.cardapio.cardapio.entities;

import com.cardapio.cardapio.dto.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Table(name="tb_food")
@Entity(name="tb_food")

public class FoodEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public FoodEntity() {
    }

    public FoodEntity(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }

    public FoodEntity(Long id, String title, String image, Integer price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
    }

    private String title;
    private String image;
    private Integer price;

    public Long getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FoodEntity that = (FoodEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(image, that.image) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, image, price);
    }
}
