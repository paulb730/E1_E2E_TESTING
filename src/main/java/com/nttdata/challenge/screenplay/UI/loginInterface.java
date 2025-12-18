package com.nttdata.challenge.screenplay.UI;

import net.serenitybdd.screenplay.targets.Target;

public class loginInterface {

    //#user-name css selector
    //#password css selector
    //id login button

    public static Target USERNAME= Target.the("usernameinput").locatedBy("#user-name");
    public static Target PASS= Target.the("passinput").locatedBy("#password");
    public static Target LOGINBUT= Target.the("loginbut").locatedBy("#login-button");

}
