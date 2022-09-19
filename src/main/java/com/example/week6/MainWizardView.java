package com.example.week6;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value= "/mainPage.it")
public class MainWizardView extends VerticalLayout {
    private TextField fullName, dollars;
    private ComboBox position, school, house;
    private RadioButtonGroup<String> radio_sex;

    private Button b_back, b_create, b_update, b_delete, b_go;

    private HorizontalLayout panel;

    public MainWizardView() {
        panel = new HorizontalLayout();
        fullName = new TextField("Fullname");
        dollars = new TextField("Dollars");
        position = new ComboBox<>();
        position.setLabel("Position");
        school = new ComboBox<>();
        school.setLabel("School");
        house = new ComboBox<>();
        house.setLabel("House");
        radio_sex = new RadioButtonGroup<>();
        radio_sex.setLabel("Gender :");
        radio_sex.setItems("Male", "Female");
        dollars.setPrefixComponent(new Span("$"));

        b_back = new Button("<<<");
        b_create = new Button("Create");
        b_update = new Button("Update");
        b_delete = new Button("Delete");
        b_go = new Button(">>>");

        panel.add(b_back, b_create, b_update, b_delete, b_go);

        this.add(fullName, radio_sex, position, dollars, school, house, panel);
    }
}
