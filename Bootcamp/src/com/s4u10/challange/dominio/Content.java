package com.s4u10.challange.dominio;
/**
 * @author s4u1o
 *
 */
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Content {

    protected static final double XP_STANDARD  = 10d;

    private String title;
    private String description;

    public abstract double calculateXp();

}