package com.s4u10.challange.dominio;
/**
 * @author s4u1o
 *
 */

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Getter @Setter
public class Dev {
    private String name;
    private Set<Content> contentsEnrolled = new LinkedHashSet<>();
    private Set<Content> contentsCompleted = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp){
        this.contentsEnrolled.addAll(bootcamp.getContents());
        bootcamp.getDevsEnrolled ().add(this);
    }

    public void progress() {
        Optional<Content> content = this.contentsEnrolled.stream().findFirst();
        if(content.isPresent()) {
            this.contentsCompleted.add(content.get());
            this.contentsEnrolled.remove(content.get());
        } else {
            System.err.println("You are not enrolled in any content!");
        }
    }

    public double calculateAllXp() {
        return this.contentsCompleted
                .stream()
                .mapToDouble(Content::calculateXp)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentsEnrolled, dev.contentsEnrolled)
                && Objects.equals(contentsCompleted, dev.contentsCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsEnrolled, contentsCompleted);
    }
}
