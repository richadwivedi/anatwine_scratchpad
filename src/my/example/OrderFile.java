package my.example;

import javax.xml.bind.annotation.*;

/**
 * Created by rdwivedi on 02/02/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "orders"
})
@XmlRootElement
public class OrderFile {

//    private long id;
//    private String name;
    @XmlElement(required = true)
    protected String orders;


//    //@XmlAttribute
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String ord) {
        this.orders = ord;
    }

}