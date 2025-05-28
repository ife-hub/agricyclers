package org.vaadin.example;

import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import lombok.extern.slf4j.Slf4j;

@Route(value="products", layout=Layout.class)
@Slf4j
public class ProductView extends VerticalLayout {
    private VerticalLayout rightVl;

    public ProductView(){
        setWidthFull();
        add(getLayer1(), getLayer4());
        setPadding(false);
        setSpacing(false);
    }

    public VerticalLayout getLayer1(){
        VerticalLayout vl = new VerticalLayout(); vl.addClassName("p_vl");
        vl.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        VerticalLayout vl1 = new VerticalLayout(); vl1.addClassName("p_vl1");

        H1 h1 = new H1(); h1.addClassName("p_h1");
        h1.getElement().setProperty("innerHTML", "<h1><span class='c_fir'>Home / </span><span class='c_sec'>Products</span></h1>");

        HorizontalLayout hl = new HorizontalLayout(); hl.addClassName("p_hl");

        VerticalLayout vl1a = new VerticalLayout(); vl1a.addClassName("p_vl1a");

        H1 h2 = new H1("PRODUCT CATEGORIES"); h2.addClassName("p_h2");

        Accordion ac1 = new Accordion(); ac1.addClassName("p_ac1");
        ac1.add("Personal Care", new VerticalLayout());

        Accordion ac2 = new Accordion(); ac2.addClassName("p_ac2");
        ac2.add("Home Essentials", new VerticalLayout());

        Accordion ac3 = new Accordion(); ac3.addClassName("p_ac3");
        Span ac3_1 = new Span("Garbage Bin Bags"); ac3_1.addClassName("p_ac3_1");
        ac3_1.addClickListener(event -> {
            ac3_1.addClassName("active-span"); // Add active style
        });
        Span ac3_2 = new Span("Pet Poop Bags"); ac3_2.addClassName("p_ac3_1");
        ac3_2.addClickListener(event -> {
            ac3_2.addClassName("active-span"); // Add active style
        });
        Span ac3_3 = new Span("Shopping Bags"); ac3_3.addClassName("p_ac3_1");
        ac3_3.addClickListener(event -> {
            ac3_3.addClassName("active-span"); // Add active style
        });
        VerticalLayout ac3_vl = new VerticalLayout(); ac3_vl.addClassName("p_ac3_vl");
        ac3_vl.setSpacing(false);
        ac3_vl.setPadding(false);
        VerticalLayout ac3_vla = new VerticalLayout(); ac3_vla.addClassName("p_ac3_vla");
        ac3_vla.add(ac3_1, ac3_2, ac3_3);
        ac3_vla.setSpacing(false);
        ac3_vla.setPadding(false);
        ac3_vl.add(ac3_vla);
        ac3_vl.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.END);
        ac3.add("Eco-Friendly Packaging & Waste Management", ac3_vl);

        H1 h3 = new H1("Send your Inquiry"); h3.addClassName("p_h3");
        TextField tf1 = new TextField("First Name"); tf1.addClassName("p_tf1");
        TextField tf2 = new TextField("Email Address"); tf2.addClassName("p_tf2");
        TextField tf3 = new TextField("Company Name"); tf3.addClassName("p_tf3");
        TextArea ta1 = new TextArea("Content"); ta1.addClassName("p_ta1");

        Button but1 = new Button("Send"); but1.addClassName("p_but1");

        vl1a.add(h2, ac1, ac2, ac3, h3, tf1, tf2, tf3, ta1, but1);
        VerticalLayout vl1b = getRightVl(); vl1b.addClassName("p_vl1b");

        hl.add(vl1a, vl1b);
        vl1.add(h1, hl);
        vl.add(vl1);
        return vl;
    }

    public VerticalLayout getRightVl(){
        VerticalLayout vl = new VerticalLayout();

        FlexLayout fl = new FlexLayout();
        fl.setWidthFull();
        fl.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        fl.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        fl.setAlignItems(FlexComponent.Alignment.STRETCH);
        fl.addClassName("h_fl");
        fl.add(
                getDiv("hImage1","4.7", "Agricyclers", "Refined Coconut Oil", "€3.5", "€5.99"),
                getDiv("hImage2","4.7", "Agricyclers", "Refined Shea Butter", "€4.00", "€6.00"),
                getDiv("hImage3","4.7", "Agricyclers", "Jojoba Oil", "€8.00", "€12.00"),
                getDiv("hImage4","4.7", "Agricyclers", "Raw African Shea Butter", "€3.00", "€4.00"),
                getDiv("hImage5","4.7", "Agricyclers", "Sweet Almond Oil", "€5.00", "€5.99"),
                getDiv( "hImage6","4.7", "Agricyclers", "Refined Coconut Oil", "€8.00", "€12.00"),
                getDiv( "hImage7","4.7", "Agricyclers", "Virgin Coconut Oil", "€3.99", "€5.99"),
                getDiv( "hImage8","4.7", "Agricyclers", " Waste Bin Bag", "€2.50", "€4.00")
        );

        vl.add(fl);
        return vl;
    }

    public Div getDiv(String imageStr1, String rating, String h1, String h2, String h3, String h4){
        Div div0 = new Div();
        div0.addClassName("h_div0");
        VerticalLayout div = new VerticalLayout();
        div.addClassName("h2_dv");

        VerticalLayout div1 = new VerticalLayout();
        div1.addClassName("h2_dv1");
        div1.setSpacing(false);
        div1.setPadding(false);
        String imageStr2 = "images/" + imageStr1 + ".jpg";
        Image img7 = new Image(imageStr2, "Background");
        img7.getStyle().set("object-fit", "cover");
        img7.addClassName("img7");
        div1.add(img7);

        HorizontalLayout hl1a = new HorizontalLayout();
        hl1a.addClassName("hl1a");
        hl1a.setJustifyContentMode(JustifyContentMode.BETWEEN);

        Image image1a = new Image("icons/like.svg", "Like Symbol");
        image1a.addClassName("h2_image1a");

        HorizontalLayout hl1aa = new HorizontalLayout();
        hl1aa.addClassName("hl1aa");
        H1 rr = new H1(rating);
        rr.addClassName("h2_rr");
        Image image1b = new Image("icons/rating.svg", "Rating");
        image1b.addClassName("h2_image1b");
        hl1aa.add(image1b, rr);
        hl1aa.setSpacing(false);

        hl1a.add(image1a, hl1aa);
        div1.add(hl1a);

        HorizontalLayout div2 = new HorizontalLayout();
        div2.addClassName("h2_dv2");
        div2.setWidthFull();
        div2.setJustifyContentMode(JustifyContentMode.BETWEEN);
//        div2.setSpacing(false);
//        div2.setPadding(false);

        VerticalLayout vl1b = new VerticalLayout();
        vl1b.setSpacing(false);
        vl1b.setPadding(false);
        vl1b.addClassName("vl1b");
        H1 hl1b1 = new H1(h1);
        hl1b1.addClassName("hl1b1");
        H1 hl1b2 = new H1(h2);
        hl1b2.addClassName("hl1b2");
        vl1b.add(hl1b1, hl1b2);

        VerticalLayout vl2b = new VerticalLayout();
        vl2b.setSpacing(false);
        vl2b.setPadding(false);
        vl2b.addClassName("vl2b");
        H1 hl2b1 = new H1(h3);
        hl2b1.addClassName("hl2b1");
        H1 hl2b2 = new H1(h4);
        hl2b2.addClassName("hl2b2");
        vl2b.add(hl2b1, hl2b2);

        vl1b.setJustifyContentMode(FlexComponent.JustifyContentMode.START);
        vl2b.setJustifyContentMode(FlexComponent.JustifyContentMode.END);
        div2.add(vl1b, vl2b);

        div.add(div1, div2);
        div0.add(div);
        return div0;
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
