package com.wind.brapi.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class JavaReadXmlJaxbEx {

    private static final String BOOKSTORE_XML = "src/main/resources/bookstore.xml";

    public static void main(String[] args) throws JAXBException,
            FileNotFoundException {

        // create JAXB context and unmarshaller
        JAXBContext context = JAXBContext.newInstance(BookStore.class);
        Unmarshaller um = context.createUnmarshaller();

        BookStore bookstore = (BookStore) um.unmarshal(new InputStreamReader(
                new FileInputStream(BOOKSTORE_XML), StandardCharsets.UTF_8));
        ArrayList bookList = bookstore.getBooksList();

        bookList.forEach((book) -> {
            System.out.println(book);
        });
    }
}