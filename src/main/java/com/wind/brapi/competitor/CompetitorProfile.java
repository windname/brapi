package com.wind.brapi.competitor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "competitor_profile",namespace = "http://schemas.sportradar.com/sportsapi/v1/unified")
public class CompetitorProfile {

    private Competitor competitor;

    @XmlElement
    public Competitor getCompetitor() {
        return competitor;
    }

    public void setCompetitor(Competitor competitor) {
        this.competitor = competitor;
    }

    @Override
    public String toString() {
        return "CompetitorProfile{" +
                "competitor='" + competitor + '\'' +
                '}';
    }
}
