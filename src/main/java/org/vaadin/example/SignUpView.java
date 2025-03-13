package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import lombok.extern.slf4j.Slf4j;
import org.vaadin.addons.googlerecaptcha.RecaptchaComponent;

@Route("/signup")
@Slf4j
public class SignUpView extends VerticalLayout {

    public SignUpView(){
        setSizeFull();
        HorizontalLayout hl = new HorizontalLayout(createLeftLayout(), createRightLayout());
        hl.setWidthFull();
        hl.setFlexGrow(1, createLeftLayout());
        VerticalLayout vl = new VerticalLayout(hl);
        vl.setHorizontalComponentAlignment(Alignment.CENTER);
        vl.addClassName("signUpBody");
        add(vl);
    }

    public VerticalLayout createRightLayout(){
        VerticalLayout vl = new VerticalLayout();
        vl.addClassName("jojoLayout");

        Image image = new Image("images/jojobaOil.png", "Jojoba Oil Image");
        image.addClassName("jojoLogo");

        vl.add(image);
        return vl;
    }

    public VerticalLayout createLeftLayout(){
        VerticalLayout vl = new VerticalLayout();
        vl.addClassName("signUpLeft");

        Image line1 = new Image("images/aglogo.svg", "Agricyclers Logo");
        line1.addClassName("aglogo");

        H1 line2 = new H1("Welcome! 👋");
        line2.addClassName("signUpLine2");
        line2.setWidthFull();

        H1 line3 = new H1("Kindly fill in your details below to create an account");
        line3.addClassName("signUpLine3");

        TextField line4 = new TextField("Full Name");
        line4.setPlaceholder("Enter your full name");
        line4.addClassName("signUpT");

        TextField line5 = new TextField("Email Address");
        line5.setPlaceholder("Enter your email address");
        line5.addClassName("signUpT");
        line5.setRequired(true);

        TextField line6 = new TextField("Phone Number");
        line6.setPlaceholder("+44 65762354");
        line6.addClassName("signUpT");

        TextField line7 = new TextField("Password");
        line7.setPlaceholder("********");
        line7.addClassName("signUpT");

        Checkbox line8 = new Checkbox();
        line8.addClassName("signUpCB");
        line8.setLabel("I agree to the terms & conditions");

        String recaptchaDataSiteKey = "6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI";
        String recaptchaSecretKey = "6LeIxAcTAAAAAGG-vFI1TnRWxMZNFuojJ4WifJWe";

        RecaptchaComponent line9 = new RecaptchaComponent( recaptchaDataSiteKey, recaptchaSecretKey);

        Button confirmButton = new Button( "Confirm", event -> {
            if ( !line9.isValid() )
            {
                Notification.show( "Invalid captcha!", 3000, Notification.Position.MIDDLE );
                return;
            }
        } );

        Button resetButton = new Button( "Reset", event -> {
            line9.resetRecaptcha();
        } );

        Button line10 = new Button("Register Account");
        line10.addClassName("signUpSubmitButton");

        Hr leftHr = new Hr();
        Hr rightHr = new Hr();

        Span orText = new Span("Or");
        orText.getStyle().set("margin", "0 10px");
        HorizontalLayout line11 = new HorizontalLayout(leftHr, orText, rightHr);
        line11.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        line11.addClassName("line11");
        line11.setWidthFull();

        Image googleImage = new Image("images/google.svg", "Google");
        googleImage.addClassName("googleImage");
        googleImage.setWidth("20px");

        Button line12 = new Button("Register with Google", googleImage);
        line12.addClassName("signUpSubmitButton2");

        RouterLink line13 = new RouterLink("Already have an account?", LoginView.class);
        line13.addClassName("signUpLine13");

        vl.add(line2, line3, line4, line5, line6, line7, line8, line9, line10, line11, line12,
                line13);

        VerticalLayout vl2 = new VerticalLayout(line1, vl);
        vl2.addClassName("signUpLeft2");
        vl2.setSizeFull();

        return vl2;
    }
}
