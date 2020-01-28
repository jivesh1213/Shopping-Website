package orderbean;

import cart.Orderr;
import cart.Shoppingcart;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateful
public class Orderbean implements OrderbeanLocal {
    @PersistenceContext(unitName = "DAmazon_site-ejbPU")
    private EntityManager em;

    @Override
    public void add(List<Shoppingcart> cart,String phone, int a) {
       if(cart.size() == a){
           return;
       }
       add(cart,phone, a + 1);
       Orderr prod = new Orderr();
       prod.setPhone(phone);
       prod.setDescription(cart.get(a).getDescription());
       prod.setCheckbox(cart.get(a).getPhoneitem().substring(phone.length()));
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       prod.setDate(LocalDate.now().format(formatter));
       prod.setPhoneitem(cart.get(a).getPhoneitem() + LocalDate.now().toString());
       prod.setPhoto(cart.get(a).getPhoto());
       prod.setPrice(cart.get(a).getPrice());
       
       em.persist(prod);
    }

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public List<Orderr> returnorders(String phone) {
        return em.createNamedQuery("Orderr.findByPhone")
        .setParameter("phone", phone)
        .getResultList();
    }

}
