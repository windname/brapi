package com.wind.brapi.competitor;

import com.wind.brapi.test.Book;
import com.wind.brapi.test.BookStore;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class CompetitorProfileRead {

    private static final String XML = "src/main/resources/competitor.xml";


    public static void main(String[] args) throws JAXBException,
            FileNotFoundException {

        // create JAXB context and unmarshaller
        JAXBContext context = JAXBContext.newInstance(CompetitorProfile.class);
        Unmarshaller um = context.createUnmarshaller();

        CompetitorProfile competitorProfile = (CompetitorProfile) um.unmarshal(new InputStreamReader(
                new FileInputStream(XML), StandardCharsets.UTF_8));

        System.out.println(competitorProfile.toString());
    }
}
