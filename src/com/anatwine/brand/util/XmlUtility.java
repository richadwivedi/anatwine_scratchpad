package com.anatwine.brand.util;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import java.io.*;


public class XmlUtility {

    public static String getXMLStringFromObject(Object xmlContainPojo) throws Exception {

        String xmlFile;

        try (StringWriter writer = new StringWriter()) {
            JAXBContext jaxbContext = JAXBContext.newInstance(xmlContainPojo.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            //jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://api.anatwine.com/schemas/brand/v3/order/order.xsd");

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(xmlContainPojo, System.out);
//            jaxbMarshaller.marshal(xmlContainPojo, writer);
//            xmlFile = writer.toString();

        }
        catch (Exception e) {
            throw new Exception(e);
        }
        //return xmlFile;
        return null;
    }
}
