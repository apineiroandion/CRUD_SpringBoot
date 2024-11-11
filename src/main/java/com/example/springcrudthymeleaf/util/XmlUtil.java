package com.example.springcrudthymeleaf.util;

import com.example.springcrudthymeleaf.model.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Clase de utilidad para guardar un libro en un archivo XML
 * JAXB (Java Architecture for XML Binding) es una API de Java que proporciona una forma conveniente para leer y escribir documentos XML.
 * JAXB proporciona dos enfoques para la conversión de objetos Java en documentos XML y viceversa:
 * JAXBCONTEXT: Proporciona un punto de entrada para la API de JAXB.
 * MARSHALLER: Proporciona métodos para convertir un objeto Java en un documento XML.
 */
public class XmlUtil {
    public static void saveBookToXml(Book book, String filePath) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(book, new File(filePath));
    }
}