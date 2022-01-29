package com.s4u10.challange.dominio;

/**
 * @author s4u1o
 *
 */

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Mentorship extends Content{
    private LocalDate date;

    @Override
    public double calculateXp() {
        return XP_STANDARD + 20d;
    }

    public Mentorship() {
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "Title= '" + getTitle() + '\'' +
                ", Description='" + getDescription() + '\'' +
                ", Date=" + date +
                '}';
    }
}