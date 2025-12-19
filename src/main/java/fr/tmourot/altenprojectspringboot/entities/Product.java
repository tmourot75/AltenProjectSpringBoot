package fr.tmourot.altenprojectspringboot.entities;

import javax.print.attribute.standard.DateTimeAtCreation;
import javax.print.attribute.standard.DateTimeAtProcessing;

public class Product {
    public enum Status {
        INSTOCK , LOWSTOCK , OUTOFSTOCK
    };

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
    private Status inventoryStatus;
    private double rating;
    private DateTimeAtCreation createdAt;
    private DateTimeAtProcessing updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getInternalReference() {
        return internalReference;
    }

    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }

    public int getShellId() {
        return shellId;
    }

    public void setShellId(int shellId) {
        this.shellId = shellId;
    }

    public Status getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(Status inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public DateTimeAtCreation getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTimeAtCreation createdAt) {
        this.createdAt = createdAt;
    }

    public DateTimeAtProcessing getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTimeAtProcessing updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", quantity=" + quantity +
                ", internalReference='" + internalReference + '\'' +
                ", shellId=" + shellId +
                ", inventoryStatus=" + inventoryStatus +
                ", rating=" + rating +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
