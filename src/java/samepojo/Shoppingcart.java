package samepojo;

public class Shoppingcart {
    private String phoneitem;
    private String photo;
    private String description;
    private Integer price;
    private Integer stock;
    
    public Shoppingcart (String phoneitem, String photo, String Description, Integer price, Integer stock) {
        this.phoneitem = phoneitem;
        this.photo = photo;
        this.description = Description;
        this.price = price;
        this.stock = stock;
    }

    public String getPhoneitem() {
        return phoneitem;
    }

    public void setPhoneitem(String phoneitem) {
        this.phoneitem = phoneitem;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
}
