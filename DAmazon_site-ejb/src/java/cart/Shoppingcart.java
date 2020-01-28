package cart;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "SHOPPINGCART")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shoppingcart.findAll", query = "SELECT s FROM Shoppingcart s"),
    @NamedQuery(name = "Shoppingcart.findByPhoneitem", query = "SELECT s FROM Shoppingcart s WHERE s.phoneitem = :phoneitem"),
    @NamedQuery(name = "Shoppingcart.findByPhoto", query = "SELECT s FROM Shoppingcart s WHERE s.photo = :photo"),
    @NamedQuery(name = "Shoppingcart.findByDescription", query = "SELECT s FROM Shoppingcart s WHERE s.description = :description"),
    @NamedQuery(name = "Shoppingcart.findByPrice", query = "SELECT s FROM Shoppingcart s WHERE s.price = :price"),
    @NamedQuery(name = "Shoppingcart.findByStock", query = "SELECT s FROM Shoppingcart s WHERE s.stock = :stock")})
public class Shoppingcart implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PHONEITEM")
    private String phoneitem;
    @Size(max = 20)
    @Column(name = "PHOTO")
    private String photo;
    @Size(max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRICE")
    private Integer price;
    @Column(name = "STOCK")
    private Integer stock;

    public Shoppingcart() {
    }

    public Shoppingcart(String phoneitem, String photo, String description, Integer price, Integer stock) {
        this.phoneitem = phoneitem;
        this.photo = photo;
        this.description = description;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phoneitem != null ? phoneitem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shoppingcart)) {
            return false;
        }
        Shoppingcart other = (Shoppingcart) object;
        if ((this.phoneitem == null && other.phoneitem != null) || (this.phoneitem != null && !this.phoneitem.equals(other.phoneitem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cart.Shoppingcart[ phoneitem=" + phoneitem + " ]";
    }
    
}
