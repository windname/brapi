package com.wind.brapi.competitor;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

public class Competitor {

    @XmlAttribute
    public String id;

    @Override
    public String toString() {
        return "Competitor{" +
                "id='" + id + '\'' +
                '}';
    }
}