package com.vss.login.view;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class LoginView extends VerticalLayout {

    public LoginView(){
        LoginForm loginForm = new LoginForm();

        addClassNames("vaadin-login-form");
        H1 heading = new H1("My View Title");
        Paragraph text = new Paragraph("Thanks for shopping with us. Click the button to submit your order.");

        add(loginForm);

    }
}
