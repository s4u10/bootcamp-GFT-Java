package com.s4u10.challange.dominio;

import lombok.Getter;
import lombok.Setter;

/**
 * @author s4u1o
 *
 */
@Getter @Setter
public class Course extends Content{
    private int workload;

    @Override
    public double calculateXp() {
        return XP_STANDARD * workload;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "Title= '" + getTitle() + '\'' +
                ", Description='" + getDescription() + '\'' +
                ", Workload=" + workload +
                '}';
    }
}