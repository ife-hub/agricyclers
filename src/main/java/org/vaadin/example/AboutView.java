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

@Route(value = "about", layout = Layout.class)
@Slf4j
public class AboutView extends VerticalLayout {

    public AboutView(){
        setWidthFull();
        add(getLayer1(), getLayer2(), getLayer3(), getLayer4());
        setPadding(false);
        setSpacing(false);
    }

    public VerticalLayout getLayer1(){
        VerticalLayout vl = new VerticalLayout(); vl.addClassName("a_vl");
        vl.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        VerticalLayout vl1 = new VerticalLayout(); vl1.addClassName("a_vl1");

        FlexLayout fl = new FlexLayout(); fl.addClassName("a_fl");
        fl.setWidthFull();
        fl.setAlignItems(FlexComponent.Alignment.STRETCH);
        fl.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        fl.setAlignContent(FlexLayout.ContentAlignment.CENTER);

        Div div1 = new Div(); div1.addClassName("a_div1");
        VerticalLayout vl1a = new VerticalLayout(); vl1a.addClassName("a_vl1a");
        H1 h1 = new H1("About Us"); h1.addClassName("a_h1");
        Hr hr = new Hr(); hr.addClassName("a_hr");
        H1 h2 = new H1("Agricyclers empowers businesses and households with sustainable waste management solutions, including eco-friendly collection, responsible disposal, and recycling services tailored to promote a cleaner, greener future.");
        h2.addClassName("a_h2");
        H1 h3 = new H1("Agricyclers is a trusted provider of sustainable waste management solutions, offering professional waste carrier services, eco-friendly disposal, and recycling expertise for businesses and households.\n" +
                "We recognize that every client has unique needs, which is why we deliver tailored waste management solutions designed to meet your specific requirements while promoting a cleaner, greener environment.\n" +
                "At Agricyclers, we are committed to transforming waste into opportunities for sustainability and supporting a healthier planet.\n" +
                "Looking for reliable and certified waste management professionals? Contact us today to explore how we can help you manage waste responsibly.");
        h3.addClassName("a_h3");
        vl1a.add(h1, hr, h2, h3);
        div1.add(vl1a);

        Div div2 = new Div(); div2.addClassName("a_div2");
        VerticalLayout vl1b = new VerticalLayout(); vl1b.addClassName("a_vl1b");
        Image image = new Image("images/AboutImage.jpg", "Product Image"); image.addClassName("a_image");
        vl1b.add(image);
        div2.add(vl1b);

        fl.add(div1, div2);

        vl1.add(fl);
        vl.add(vl1);
        return vl;
    }

    public VerticalLayout getLayer2(){
        VerticalLayout vl = new VerticalLayout();
        vl.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        vl.addClassName("h3_vl");

        VerticalLayout vl1 = new VerticalLayout();
        vl1.addClassName("h3_vl1");

        FlexLayout fl = new FlexLayout();
        fl.setWidthFull();
        fl.setAlignItems(Alignment.START);
        fl.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        fl.setAlignContent(FlexLayout.ContentAlignment.CENTER);
        fl.addClassName("h3_fl");
        fl.add(
                getDiv2("4+", "var(--Colour-Primary-primary-500, #2AC652)", "Expertise in diverse areas, including eco-friendly waste collection, responsible disposal, recycling, and sustainable waste management solutions."),
                getDiv2("3", "var(--Colour-Error-error-600, #E80000)", "Over a decade of experience providing sustainable waste management solutions to businesses and households."),
                getDiv2("10+", "var(--Colour-Secondary2-warning-600, #E0B800)", "Committed to delivering exceptional service and building lasting relationships through reliable and sustainable waste management solutions."),
                getDiv2("20+", "var(--Colour-Primary1-success-600, #29905B)", "Proudly managing and processing significant volumes of waste responsibly, contributing to a cleaner and greener environment.")
        );

        vl1.add(fl);

        vl.add(vl1);
        return vl;
    }

    public Div getDiv2(String str1, String color, String str2){
        Div div0 = new Div();
        div0.addClassName("h3_div0");
        div0.addClassName("a2_div0");
        VerticalLayout div = new VerticalLayout();
        div.addClassName("h3_dv");

        VerticalLayout div1 = new VerticalLayout();
        div1.addClassName("h3_dv1");
        div1.setSpacing(false);
        div1.setPadding(false);

        HorizontalLayout hl1a = new HorizontalLayout();
        hl1a.addClassName("h3l1a");

        H1 rr1 = new H1(str1);
        rr1.addClassName("a2_rr1");
        rr1.getStyle().set("color", color);

        hl1a.add(rr1);

        H1 rr3 = new H1(str2);
        rr3.addClassName("a2_rr3");
        div1.add(hl1a, rr3);

        div.add(div1);
        div0.add(div);
        return div0;
    }

    public VerticalLayout getLayer3(){
        VerticalLayout vl = new VerticalLayout();
        vl.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        vl.addClassName("h3_vl");

        VerticalLayout vl1 = new VerticalLayout();
        vl1.addClassName("h3_vl1");

        HorizontalLayout hl = new HorizontalLayout();
        hl.addClassName("hl3_hor");

        H1 fh = new H1("Our Values");
        fh.addClassName("h3_fh2");

        hl.add(fh);

        FlexLayout fl = new FlexLayout();
        fl.setWidthFull();
        fl.setAlignItems(Alignment.START);
        fl.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        fl.setAlignContent(FlexLayout.ContentAlignment.CENTER);
        fl.addClassName("h3_fl");
        fl.add(
                getDiv3("1/", "Results", "Everything we do is driven by our commitment to sustainability, utilizing proven methods and eco-friendly practices to deliver effective waste management solutions that support a cleaner future for your business and community."),
                getDiv3("2/", "Expertise", "Our services are provided by certified professionals with years of experience in sustainable waste management, ensuring reliable and eco-friendly solutions you can trust."),
                getDiv3("3/", "Transparency", "We prioritize transparency in everything we do, working closely with you at every step to provide clear, reliable waste management solutions tailored to your needs, fostering a partnership built on trust."),
                getDiv3("4/", "Flexibility", "Agricyclers’ services are fully tailored to meet the unique waste management needs of each client. We provide adaptable solutions that evolve with you, ensuring effective and sustainable results both now and in the future.")
        );

        vl1.add(hl, fl);

        vl.add(vl1);
        return vl;
    }

    public Div getDiv3(String str1, String str2, String str3){
        Div div0 = new Div();
        div0.addClassName("h3_div0");
        VerticalLayout div = new VerticalLayout();
        //div.setPadding(false);
        //div.setSpacing(false);
        div.addClassName("h3_dv");

        VerticalLayout div1 = new VerticalLayout();
        div1.addClassName("h3_dv1");
        div1.setSpacing(false);
        div1.setPadding(false);

        HorizontalLayout hl1a = new HorizontalLayout();
        hl1a.addClassName("h3l1a");

        H1 rr1 = new H1(str1);
        rr1.addClassName("h3_rr1");

        H1 rr2 = new H1(str2);
        rr2.addClassName("h3_rr2");

        hl1a.add(rr1, rr2);

        H1 rr3 = new H1(str3);
        rr3.addClassName("h3_rr3");
        div1.add(hl1a, rr3);

        div.add(div1);
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