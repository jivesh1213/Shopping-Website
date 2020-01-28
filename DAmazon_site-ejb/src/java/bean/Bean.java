package bean;

import cart.Shoppingcart;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pojo.Products;

@Stateful
public class Bean implements BeanLocal {
    @PersistenceContext
    EntityManager e;

    @Override
    public String add(String itemname, String phone) {
        Shoppingcart product = getProductByid(itemname);
        product.setPhoneitem(phone + itemname);
        e.persist(product);
        return product.getDescription();
    }
    
    @Override
    public List returnproducts(String phone, int i_num) {
        List<Shoppingcart> products = new Products().getItems();
        if(i_num > products.size()){
            List<Shoppingcart> cart = new ArrayList<>();
            return cart;
        }
    
        Shoppingcart sc = e.find(Shoppingcart.class, phone + "c" + i_num);
        List<Shoppingcart> cartItems = returnproducts(phone, i_num + 1);
        if(sc == null) {}
        else
            cartItems.add(sc);
        return cartItems;
    }
    
    @Override
    public void delete(String phone, int i_num) {
        List<Shoppingcart> products = new Products().getItems();
        if(i_num > products.size()){
            return;
        }
        Shoppingcart sc = e.find(Shoppingcart.class, phone + "c" + i_num);
        if(sc != null)
            e.remove(sc);
        
        delete(phone, i_num + 1);
    }
    
    private Shoppingcart getProductByid(String itemname){
        Shoppingcart product = null;
        List<Shoppingcart> products = new Products().getItems();
        for (Shoppingcart prod: products) {
            if (prod.getPhoneitem().equals(itemname)) {
                product = prod;
                break;
            }
        }
        return product;
    }

    public void persist(Object object) {
        e.persist(object);
        
    }

    

}
