package com.una.examen1.controller.xml;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBParser {
    public static <T> void marshall(Object obj, String rutaArchivo) {
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(obj, new FileOutputStream(rutaArchivo));
        } catch (Exception ex) {
            ex.printStackTrace();
            // System.err.println(ex.getLocalizedMessage());
        }
    }

    public static Object unmarshall(Object ref, String rutaArchivo) {
        try {
            JAXBContext context = JAXBContext.newInstance(ref.getClass());
            Unmarshaller unmarshallerObj = context.createUnmarshaller();
            return unmarshallerObj.unmarshal(new BufferedInputStream(new FileInputStream(rutaArchivo)));
        } catch (FileNotFoundException ex) {
            System.err.println("[WARN] Archivo no encontrado, omitiendo.");
        } catch (Exception ex) {
            System.err.println("[WARN] Archivo incorrecto, omitiendo.");
        }
        return ref;
    }
}
