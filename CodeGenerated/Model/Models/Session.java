package Models;

import java.util.*;

public class Session {

    public Session() {
    }

    private Integer Id;

    private DateTime starting;

    private DateTime ending;

    private Course course;

    private User[] students;

    private RateSession[] ratesSession;

    private RateStudent[] ratesStudents;

    private User trainer;


}