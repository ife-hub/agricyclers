package org.vaadin.example;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import lombok.extern.slf4j.Slf4j;

@Route("/test2")
@Slf4j
public class Test2 extends VerticalLayout {

    public Test2(){
        addClassName("homepage");
        setSizeFull();
        getStyle().set("position", "relative");

        VerticalLayout topLayout = new VerticalLayout();
        topLayout.addClassName("topLayout");
        topLayout.setWidthFull();
        topLayout.setHeight("10vh");
        topLayout.getStyle()
                .set("background-color", "black")
                .set("position", "absolute")
                .set("top", "0")
                .set("left", "0");
        H1 topText = new H1("Free Deliveries for all orders above €60");
        topText.addClassName("topText");
        topLayout.add(topText);
        topLayout.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        VerticalLayout bottomLayout = new VerticalLayout();
        bottomLayout.addClassName("bottomLayout");
        bottomLayout.setWidthFull();
        bottomLayout.setHeight("90vh");
        bottomLayout.getStyle()
                .set("background-color", "white")
                .set("border-radius", "20px 20px 0 0")
                .set("position", "absolute")
                .set("top", "48px")
                .set("left", "0");

        add(topLayout, bottomLayout);
    }
}
