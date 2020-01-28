package orderbean;

import cart.Orderr;
import cart.Shoppingcart;
import java.util.List;
import javax.ejb.Local;

@Local
public interface OrderbeanLocal {
    public void add(List<Shoppingcart> cart,String phone, int a);
    public List<Orderr> returnorders(String phone);
}
