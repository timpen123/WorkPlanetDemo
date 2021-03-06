package com.example.workplanet.views;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import org.apache.juli.logging.Log;

@Route("/login")
public class LoginView extends Composite<LoginOverlay> implements BeforeEnterObserver {

    public LoginView() {
        LoginOverlay loginOverlay = getContent();
        loginOverlay.setTitle("Work Planet");
        loginOverlay.setDescription("Login to get noticed by employers.");
        loginOverlay.setOpened(true);

        loginOverlay.addLoginListener(event -> {
            if("user".equals(event.getUsername())) {
                UI.getCurrent().navigate("user");
            } else if ("admin".equals(event.getUsername())) {
                UI.getCurrent().navigate(AdminView.class);

            } else {
                Notification.show("Wrong credentials");
            }
        });


    }

    @Override
    public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {

    }
}