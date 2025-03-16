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

@Route(value = "home", layout = Layout.class)
@Slf4j
public class HomeView extends VerticalLayout {

    public HomeView(){
        setWidthFull();
        add(getlayer1(), getLayer2(), getLayer3(), getLayer4());
        setPadding(false);
        setSpacing(false);
    }

    public VerticalLayout getlayer1(){
        VerticalLayout vl = new VerticalLayout();
        vl.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        setWidthFull();
        vl.addClassName("hLayer1");

        VerticalLayout vl1 = new VerticalLayout();
        vl1.addClassName("h_vl1");

        H1 fh1 = new H1("AGRICYCLERS");
        fh1.addClassName("h_fh1");
        H1 sh1 = new H1("Redefining Sustainability Through Eco-Friendly Solutions");
        sh1.addClassName("h_sh1");
        H1 th1 = new H1("Transforming Resources into Sustainable Opportunities, Paving the Way for a Greener Future");
        th1.addClassName("h_th1");

        Image arrowIcon = new Image("icons/arrow.svg", "Arrow Icon");
        arrowIcon.addClassName("arrowIcon");
        arrowIcon.setWidth("20px");

        Button shop = new Button("SHOP NOW", arrowIcon);
        shop.addClassName("h_shopButton");
        shop.setIconAfterText(true);

        vl1.add(fh1, sh1, th1, shop);

        vl.add(vl1);
        return vl;
    }

    public VerticalLayout getLayer2(){
        VerticalLayout vl = new VerticalLayout();
        vl.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        vl.addClassName("h2_vl");

        VerticalLayout vl1 = new VerticalLayout();
        vl1.addClassName("h2_vl1");

        HorizontalLayout hl = new HorizontalLayout();
        hl.addClassName("hl2_hor");

        Image icon1 = new Image("icons/vb.svg", "Vertical Bar");
        icon1.addClassName("h_icon1");
        icon1.setWidth("20px");

        H1 fh = new H1("Our Best Sellers");
        fh.addClassName("h_fh2");

        hl.add(icon1, fh);

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

        vl1.add(hl, fl);

        vl.add(vl1);
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
