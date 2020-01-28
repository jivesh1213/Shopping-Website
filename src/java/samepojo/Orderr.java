package samepojo;

public class Orderr {
    
    private String phoneitem;
    private String phone;
    private String checkbox;
    private String photo;
    private String description;
    private Integer price;
    private String date;
    
    public Orderr (String phoneitem, String checkbox, String photo, String description, Integer price, String date) {
        this.phoneitem = phoneitem;
        this.checkbox = checkbox;
        this.photo = photo;
        this.description = description;
        this.price = price;
        this.date = date;
    }

    public String getPhoneitem() {
        return phoneitem;
    }

    public void setPhoneitem(String phoneitem) {
        this.phoneitem = phoneitem;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
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

    public void Integer(Integer price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
