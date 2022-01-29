package com.s4u10.challange.dominio;

/**
 * @author s4u1o
 *
 */

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter @Setter
public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate dateInitial = LocalDate.now();
    private final LocalDate dateFinished = dateInitial.plusDays(45);
    private Set<Dev> devsEnrolled = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) &&
                Objects.equals(dateInitial, bootcamp.dateInitial) && Objects.equals(dateFinished, bootcamp.dateFinished)
                && Objects.equals(devsEnrolled , bootcamp.devsEnrolled) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dateInitial, dateFinished, devsEnrolled, contents);
    }
}

