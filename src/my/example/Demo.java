package my.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 * Created by rdwivedi on 02/02/2017.
 */
public class Demo {

    public static void main(String[] args) throws Exception {

        OrderFile orderFile = new OrderFile();
        orderFile.setOrders("Order1");
//        orderFile.setId(123);
//        orderFile.setName("Jane Doe");

        doMarshall(orderFile);

    }

    private static void doMarshall(Object xmlContainPojo) throws Exception
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(xmlContainPojo.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        //jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://api.anatwine.com/schemas/brand/v3/order/order.xsd");

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(xmlContainPojo, System.out);
    }

}
