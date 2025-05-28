package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import lombok.extern.slf4j.Slf4j;

@Route(value="services", layout = Layout.class)
@Slf4j
public class ServicesView extends VerticalLayout {

    public ServicesView(){
        setWidthFull();
        add(getLayer1(), getLayer4());
        setPadding(false);
        setSpacing(false);
    }

    public VerticalLayout getLayer1(){
        VerticalLayout vl = new VerticalLayout(); vl.addClassName("s_vl");
        vl.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        VerticalLayout vl1 = new VerticalLayout(); vl1.addClassName("s_vl1");

        HorizontalLayout hl1 = new HorizontalLayout(); hl1.addClassName("s_hl1");
        VerticalLayout vl_hl1 = new VerticalLayout(); vl_hl1.addClassName("s_vl_hl1");

        HorizontalLayout hl1a = new HorizontalLayout(); hl1a.addClassName("s_hl1a");
        H1 hl1a_text = new H1("Our Key Service Area"); hl1a_text.addClassName("s_hl1a_text");
        Image arrowIcon = new Image("icons/arrow2.svg", "Arrow Icon");
        arrowIcon.addClassName("arrowIcon");
        arrowIcon.setWidth("20px");
        Button hl1a_button = new Button("KNOW MORE", arrowIcon); hl1a_button.addClassName("s_hl1a_button");
        hl1a_button.setIconAfterText(true);
        hl1a.add(hl1a_text, hl1a_button);

        Hr hr2 = new Hr(); hr2.addClassName("s_hr2");

        FlexLayout fl = new FlexLayout(); fl.addClassName("s_fl");
        fl.setWidthFull();
        fl.setAlignItems(FlexComponent.Alignment.STRETCH);
        fl.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        //fl.setAlignContent(FlexLayout.ContentAlignment.CENTER);
        Div div1 = new Div(); div1.addClassName("s_div1");
        H1 h1a = new H1("The key to effective waste management lies in adopting a holistic approach that integrates eco-friendly collection, responsible disposal, and recycling. By leveraging innovative methods and sustainable practices, we help create cleaner environments and deliver impactful results for businesses and households alike.");
        h1a.addClassName("s_h1a");
        Div div2 = new Div(); div2.addClassName("s_div2");
        H1 h1b = new H1("Agricyclers utilizes a comprehensive range of eco-friendly practices to design, implement, and maintain effective waste management solutions.");
        h1b.addClassName("s_h1b");
        div1.add(h1a);
        div2.add(h1b);
        fl.add(div1, div2);

        vl_hl1.add(hl1a, hr2, fl);
        hl1.add(vl_hl1);

        Hr hr = new Hr(); hr.addClassName("s_hr");

        HorizontalLayout hl2 = new HorizontalLayout(); hl2.addClassName("s_hl2");
        VerticalLayout hl2_vl = new VerticalLayout(); hl2_vl.addClassName("s_hl2_vl");

        HorizontalLayout hl2_hl1 = new HorizontalLayout(); hl2_hl1.addClassName("s_hl2_hl1");
        HorizontalLayout hl2_hl1a = new HorizontalLayout(); hl2_hl1a.addClassName("s_hl2_hl1a");
        H1 hl2_h1 = new H1("1/"); hl2_h1.addClassName("s_hl2_h1");
        H1 hl2_h2 = new H1("WASTE CARRIER"); hl2_h2.addClassName("s_hl2_h2");
        hl2_hl1a.add(hl2_h1, hl2_h2);
        Image image1 = new Image("icons/add.svg", "Icon"); image1.addClassName("s_image1");
        hl2_hl1.add(hl2_hl1a, image1);

        Hr hr3 = new Hr(); hr3.addClassName("s_hr3");
        H1 hl2_h3 = new H1("At Agricyclers, we provide professional waste carrier services to help businesses and households manage their waste sustainably. Whether you need regular pickups or one-time disposal, our certified team ensures that waste is collected, transported, and processed in an eco-friendly manner.  We handle various types of waste, including agricultural, household, and commercial waste, with a commitment to recycling and responsible disposal. Our services are tailored to meet your needs while promoting a cleaner environment.  For more details on our waste carrier services and pricing, please contact us. Prices may vary based on waste type, quantity, and location.");
        hl2_h3.addClassName("s_hl2_h3");

        hl2_vl.add(hl2_hl1, hr3, hl2_h3);
        hl2.add(hl2_vl);

        vl1.add(hl1, hr, hl2);
        vl.add(vl1);
        return vl;
    }

    public VerticalLayout getLayer4(){
        VerticalLayout vl = new VerticalLayout(); vl.addClassName("h4_vl");
        vl.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        FlexLayout fl1 = new FlexLayout();

        Div dv1 = new Div(); dv1.addClassName("h4_dv1");
        Image h11 = new Image("images/WhiteLogo.png", "Logo"); h11.addClassName("h4_h11");
        H1 h12 = new H1("Subscribe"); h12.addClassName("h4_h12");
        H1 h13 = new H1("Get 10% off your first order"); h13.addClassName("h4_h13");
        TextField h14 = new TextField(); h14.addClassName("h4_h14");
        h14.setPlaceholder("Enter your email");
        Image icon1 = new Image("icons/send.svg", "Send Icon"); icon1.addClassName("h4_icon1");
        Button button1 = new Button(icon1); button1.addClassName("h4_button1");
        h14.setSuffixComponent(button1);
        VerticalLayout vv1 = new VerticalLayout(); vv1.addClassName("h4_vv1");
        vv1.add(h11, h12, h13, h14);
        dv1.add(vv1);

        Div dv2 = new Div(); dv2.addClassName("h4_dv2");
        H1 h21 = new H1("Support"); h21.addClassName("h4_h21");
        H1 h22 = new H1("38 Francis Road"); h22.addClassName("h4_h22");
        H1 h23 = new H1("Birmingham"); h23.addClassName("h4_h23");
        H1 h24 = new H1("West Midlands"); h24.addClassName("h4_h24");
        H1 h25 = new H1("B276LX"); h25.addClassName("h4_h25");
        H1 h26 = new H1("info@agricyclers.co.uk"); h26.addClassName("h4_h26");
        H1 h27 = new H1("07950966761"); h27.addClassName("h4_h27");
        VerticalLayout vv2 = new VerticalLayout(); vv2.addClassName("h4_vv2");
        vv2.add(h21, h22, h23, h24, h25, h26, h27);
        dv2.add(vv2);

        Div dv3 = new Div(); dv3.addClassName("h4_dv3");
        H1 h31 = new H1("Account"); h31.addClassName("h4_h31");
        RouterLink h32 = new RouterLink("My Account", SignUpView.class); h32.addClassName("h4_h32");
        RouterLink h33 = new RouterLink("Login / Register", SignUpView.class); h33.addClassName("h4_h33");
        RouterLink h34 = new RouterLink("Cart", SignUpView.class); h34.addClassName("h4_h34");
        VerticalLayout vv3 = new VerticalLayout(); vv3.addClassName("h4_vv3");
        vv3.add(h31, h32, h33, h34);
        dv3.add(vv3);

        Div dv4 = new Div(); dv4.addClassName("h4_dv4");
        H1 h41 = new H1("Quick Link"); h41.addClassName("h4_h41");
        RouterLink h42 = new RouterLink("Privacy Policy", SignUpView.class); h42.addClassName("h4_h42");
        RouterLink h43 = new RouterLink("Terms Of Use", SignUpView.class); h43.addClassName("h4_h43");
        RouterLink h44 = new RouterLink("FAQ", SignUpView.class); h44.addClassName("h4_h44");
        RouterLink h45 = new RouterLink("Contact Us", SignUpView.class); h45.addClassName("h4_h45");
        VerticalLayout vv4 = new VerticalLayout(); vv4.addClassName("h4_vv4");
        vv4.add(h41, h42, h43, h44, h45);
        dv4.add(vv4);

        Div dv5 = new Div(); dv5.addClassName("h4_dv5");
        H1 h51 = new H1("Invite a User"); h51.addClassName("h4_h51");
        H1 h52 = new H1("Save $3 by inviting a New User"); h52.addClassName("h4_h52");
        Image h53 = new Image("images/qr.png", "QR Code"); h53.addClassName("h4_h53");
        HorizontalLayout h54 = new HorizontalLayout(); h54.addClassName("h4_h54");
        Image h54a = new Image("icons/facebook.svg", "Facebook Link"); h54a.addClassName("h4_h54a");
        Image h54b = new Image("icons/instagram.svg", "Twitter Link"); h54b.addClassName("h4_h54b");
        Image h54c = new Image("icons/twitter.svg", "Instagram Link"); h54c.addClassName("h4_h54c");
        h54.add(h54a, h54b, h54c);
        VerticalLayout vv5 = new VerticalLayout(); vv5.addClassName("h4_vv5");
        vv5.add(h51, h52, h53, h54);
        dv5.add(vv5);

        fl1.setWidthFull();
        fl1.setAlignItems(FlexComponent.Alignment.STRETCH);
        fl1.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        fl1.setAlignContent(FlexLayout.ContentAlignment.CENTER);
        fl1.addClassName("h4_fl");
        fl1.add (dv1, dv2, dv3, dv4, dv5);

        Hr hr = new Hr(); hr.addClassName("h4_hr");

        HorizontalLayout hle = new HorizontalLayout(); hle.addClassName("h4_hle");
        Image hlea = new Image("icons/copyright.svg", "Copyright Icon"); hlea.addClassName("h4_hlea");
        H1 hleb = new H1("Copyright Agricyclers 2025. All right reserved"); hleb.addClassName("h4_hleb");
        hle.add(hlea, hleb);

        VerticalLayout vl1 = new VerticalLayout();
        vl1.addClassName("h4_vl1");
        vl1.add(fl1);
        vl.add(vl1, hr, hle);
        return vl;
    }
}
