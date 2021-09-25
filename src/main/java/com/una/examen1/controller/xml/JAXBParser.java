package com.una.examen1.controller.xml;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;



import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBParser {
    public void marshall(Object o, String rutaArchivo) {
        try {
            JAXBContext jContext = JAXBContext.newInstance(o.getClass());
            Marshaller marshallObj = jContext.createMarshaller();
            marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshallObj.marshal(0, new FileOutputStream(rutaArchivo));
        } catch (Exception ex) {
            ex.printStackTrace();
            // System.err.println(ex.getLocalizedMessage());
        }
    }

    public Object unmarshall(Object ref, String rutaArchivo) {
        try {
            JAXBContext jContext = JAXBContext.newInstance(ref.getClass());
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            return unmarshallerObj.unmarshal(new BufferedInputStream(new FileInputStream(rutaArchivo)));
        } catch (FileNotFoundException ex) {
            System.err.println("[WARN] Archivo del cinema no encontrado, omitiendo.");
        } catch (Exception ex) {
            System.err.println("[WARN] Archivo del cinema incorrecto, omitiendo.");
        }
        return null;
    }
}
