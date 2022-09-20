package com.example.week6;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Wizards {
    public ArrayList<Wizard> model;

    public Wizards() {
        model = new ArrayList<>();
    }
}
