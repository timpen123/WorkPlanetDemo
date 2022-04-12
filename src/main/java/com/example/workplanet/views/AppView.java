package com.example.workplanet.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;

public class AppView extends AppLayout {

    public AppView() {
        HorizontalLayout navbarLayout = new HorizontalLayout();
        H1 navbarTitle = new H1("WorkPlanet");
        navbarLayout.add(new DrawerToggle(), navbarTitle);

        navbarLayout.setWidthFull();
        navbarLayout.setMargin(true);
        navbarLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.BETWEEN);
        navbarLayout.setAlignItems(FlexComponent.Alignment.CENTER);

        addToNavbar(navbarLayout);

        RouterLink jobViewLink = new RouterLink("View JobPosts", JobCard.class);

        addToDrawer(new VerticalLayout(jobViewLink));

    }


}

