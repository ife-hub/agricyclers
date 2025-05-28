package org.vaadin.example;

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

@Route(value="contactUs", layout = Layout.class)
@Slf4j
public class ContactUs extends VerticalLayout {

    public ContactUs(){
        setWidthFull();
        add(getLayer1(), getLayer4());
        setPadding(false);
        setSpacing(false);
    }

    public VerticalLayout getLayer1(){
        VerticalLayout vl = new VerticalLayout(); vl.addClassName("c_vl");
        vl.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        VerticalLayout vl1 = new VerticalLayout(); vl1.addClassName("c_vl1");

        H1 h1 = new H1(); h1.addClassName("c_h1"); h1.addClassName("c_h1");
        h1.getElement().setProperty("innerHTML", "<h1><span class='c_fir'>Home / </span><span class='c_sec'>Contact Us</span></h1>");
        H1 h2 = new H1("Contact Us"); h2.addClassName("c_h2"); h2.addClassName("c_h2");
        H1 h3 = new H1("We'd love to hear from you. Our team is here to help"); h3.addClassName("c_h3"); h3.addClassName("c_h3");
        H1 h4 = new H1("Fill out the email for below and we would respond within 24-48 hours on weekdays"); h4.addClassName("c_h4");

        HorizontalLayout hl1 = new HorizontalLayout(); hl1.addClassName("c_hl1");
        TextField t1 = new TextField(); t1.addClassName("c_t1");
        t1.setPlaceholder("Name");
        TextField t2 = new TextField(); t2.addClassName("c_t2");
        t2.setPlaceholder("Email");
        VerticalLayout vls1 = new VerticalLayout(); vls1.addClassName("c_vls1");
        vls1.setPadding(false);
        vls1.setSpacing(false);
        H1 sh1 = new H1("Email"); sh1.addClassName("c_sh1");
        Anchor link1 = new Anchor("", "info@agricyclers.co.uk"); link1.addClassName("c_link1");
        vls1.add(sh1, link1);
        hl1.add(t1, t2, vls1);

        HorizontalLayout hl2 = new HorizontalLayout(); hl2.addClassName("c_hl2");
        TextField t3 = new TextField(); t3.addClassName("c_t3");
        t3.setPlaceholder("Phone Number");
        TextField t4 = new TextField(); t4.addClassName("c_t4");
        t4.setPlaceholder("Subject");
        VerticalLayout vls2 = new VerticalLayout(); vls2.addClassName("c_vls2");
        vls2.setPadding(false);
        vls2.setSpacing(false);
        H1 sh2 = new H1("Contact Us"); sh2.addClassName("c_sh2");
        HorizontalLayout shh = new HorizontalLayout(); shh.addClassName("c_shh");
        Image shh1 = new Image("icons/facebook2.svg", "Facebook Link"); shh1.addClassName("c_shh1");
        Image shh2 = new Image("icons/instagram2.svg", "Twitter Link"); shh2.addClassName("c_shh2");
        Image shh3 = new Image("icons/twitter2.svg", "Instagram Link"); shh3.addClassName("c_shh3");
        shh.add(shh1, shh2, shh3);
        vls2.add(sh2, shh);
        hl2.add(t3, t4, vls2);

        TextArea ta = new TextArea(); ta.addClassName("c_ta");
        ta.setPlaceholder("Message");

        Button but = new Button("Send Message"); but.addClassName("c_but");

        H1 h5 = new H1(); h5.addClassName("c_h5");
        h5.getElement().setProperty("innerHTML", "<h1><span class='c_3'>This site is protected by hCaptcha and the hCaptcha </span><span class='c_4'><a href='' class='c_5'>Privacy Policy</a></span><span class='c_6'> and </span><span class='c_7'><a href='' class='c_8'>Terms of Service</a></span><span class='c_9'> apply.</span></h1>");

        VerticalLayout vls1q = new VerticalLayout(); vls1q.addClassName("c_vls1q");
        vls1q.setPadding(false);
        vls1q.setSpacing(false);
        H1 sh1q = new H1("Email"); sh1q.addClassName("c_sh1");
        Anchor link1q = new Anchor("", "info@agricyclers.co.uk"); link1q.addClassName("c_link1");
        vls1q.add(sh1q, link1q);

        VerticalLayout vls2q = new VerticalLayout(); vls2q.addClassName("c_vls2q");
        vls2q.setPadding(false);
        vls2q.setSpacing(false);
        H1 sh2q = new H1("Contact Us"); sh2q.addClassName("c_sh2");
        HorizontalLayout shhq = new HorizontalLayout(); shhq.addClassName("c_shh");
        Image shh1q = new Image("icons/facebook2.svg", "Facebook Link"); shh1q.addClassName("c_shh1");
        Image shh2q = new Image("icons/instagram2.svg", "Twitter Link"); shh2q.addClassName("c_shh2");
        Image shh3q = new Image("icons/twitter2.svg", "Instagram Link"); shh3q.addClassName("c_shh3");
        shhq.add(shh1q, shh2q, shh3q);
        vls2q.add(sh2q, shhq);

        vl1.add(h1, h2, h3, h4, hl1, hl2, ta, but, h5, vls1q, vls2q);

        vl.add(vl1);
        return (vl);
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
