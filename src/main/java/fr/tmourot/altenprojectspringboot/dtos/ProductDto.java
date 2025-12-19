package fr.tmourot.altenprojectspringboot.dtos;

import fr.tmourot.altenprojectspringboot.entities.Product;

import javax.print.attribute.standard.DateTimeAtCreation;
import javax.print.attribute.standard.DateTimeAtProcessing;

public class ProductDto {
    private int id;
    private String code;
    private String name;
    private String description;
    private String image;
    private String category;
    private String price;
    private int quantity;
    private String internalReference;
    private int shellId;
    private Product.Status inventoryStatus;
    private double rating;
    private DateTimeAtCreation createdAt;
    private DateTimeAtProcessing updatedAt;

    public ProductDto() {
    }

    public ProductDto(int id, String code, String name, String description, String image, String category, String price, int quantity, String internalReference, int shellId, Product.Status inventoryStatus, double rating, DateTimeAtCreation createdAt, DateTimeAtProcessing updatedAt) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.image = image;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.internalReference = internalReference;
        this.shellId = shellId;
        this.inventoryStatus = inventoryStatus;
        this.rating = rating;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
