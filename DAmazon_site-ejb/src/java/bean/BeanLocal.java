package bean;

import java.util.List;
import javax.ejb.Local;

@Local
public interface BeanLocal {
    public String add(String itemname, String phone);
    public List returnproducts(String phone, int i_num);
    public void delete(String phone, int i_num);
}
