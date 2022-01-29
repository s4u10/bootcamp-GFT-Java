package com.s4u10.challange;

/**
 * @author s4u1o
 *
 */

import com.s4u10.challange.dominio.Bootcamp;
import com.s4u10.challange.dominio.Course;
import com.s4u10.challange.dominio.Dev;
import com.s4u10.challange.dominio.Mentorship;
import java.time.LocalDate;

public class AppBoopcamp {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Course Java");
        course1.setDescription("Description Course Java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Course JS");
        course2.setDescription("Description Course JS");
        course2.setWorkload(4);

        Mentorship mentorship= new Mentorship();
        mentorship.setTitle("Mentorship in Java");
        mentorship.setDescription("Description Mentorship Java");
        mentorship.setDate(LocalDate.now());

     /* System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship);
     */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.registerBootcamp(bootcamp);
        System.out.println("Subscribed content Camila:" + devCamila.getContentsCompleted());
        devCamila.progress();
        devCamila.progress();
        System.out.println("-");
        System.out.println("Subscribed content Camila:" + devCamila.getContentsCompleted());
        System.out.println("Subscribed completed Camila:" + devCamila.getContentsCompleted());
        System.out.println("XP:" + devCamila.calculateAllXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setName("Joao");
        devJoao.registerBootcamp(bootcamp);
        System.out.println("Subscribed content João:" + devJoao.getContentsEnrolled());
        devJoao.progress();
        devJoao.progress();
        devJoao.progress();
        System.out.println("-");
        System.out.println("Subscribed content João:" +  devJoao.getContentsEnrolled());
        System.out.println("Subscribed completed João:" + devJoao.getContentsEnrolled());
        System.out.println("XP:" + devJoao.calculateAllXp());

    }

}