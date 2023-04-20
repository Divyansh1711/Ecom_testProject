package com.sheryians.major.dto;

import com.sheryians.major.model.Category;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ProductDTO {
    private long id;
    private String name;

    private int categoryId;
    private double price;
    private int weight;
    private String description;
    private String imageName;
}
