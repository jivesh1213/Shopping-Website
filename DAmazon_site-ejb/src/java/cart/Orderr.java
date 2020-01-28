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
@Table(name = "ORDERR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderr.findAll", query = "SELECT o FROM Orderr o"),
    @NamedQuery(name = "Orderr.findByPhoneitem", query = "SELECT o FROM Orderr o WHERE o.phoneitem = :phoneitem"),
    @NamedQuery(name = "Orderr.findByPhone", query = "SELECT o FROM Orderr o WHERE o.phone = :phone"),
    @NamedQuery(name = "Orderr.findByCheckbox", query = "SELECT o FROM Orderr o WHERE o.checkbox = :checkbox"),
    @NamedQuery(name = "Orderr.findByPhoto", query = "SELECT o FROM Orderr o WHERE o.photo = :photo"),
    @NamedQuery(name = "Orderr.findByDescription", query = "SELECT o FROM Orderr o WHERE o.description = :description"),
    @NamedQuery(name = "Orderr.findByPrice", query = "SELECT o FROM Orderr o WHERE o.price = :price"),
    @NamedQuery(name = "Orderr.findByDate", query = "SELECT o FROM Orderr o WHERE o.date = :date")})
public class Orderr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "PHONEITEM")
    private String phoneitem;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 10)
    @Column(name = "CHECKBOX")
    private String checkbox;
    @Size(max = 20)
    @Column(name = "PHOTO")
    private String photo;
    @Size(max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRICE")
    private Integer price;
    @Size(max = 30)
    @Column(name = "DATE")
    private String date;

    public Orderr() {
    }

    public Orderr(String phoneitem) {
        this.phoneitem = phoneitem;
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

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
        if (!(object instanceof Orderr)) {
            return false;
        }
        Orderr other = (Orderr) object;
        if ((this.phoneitem == null && other.phoneitem != null) || (this.phoneitem != null && !this.phoneitem.equals(other.phoneitem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cart.Orderr[ phoneitem=" + phoneitem + " ]";
    }
    
}
