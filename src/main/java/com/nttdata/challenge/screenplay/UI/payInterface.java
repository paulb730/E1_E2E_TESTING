package com.nttdata.challenge.screenplay.UI;

import net.serenitybdd.screenplay.targets.Target;

public class payInterface {

    //#first-name
    //#last-name
    //#postal-code
    //#continue
    //.summary_total_label
    //#finish
    //.cart_list

    public static Target FIRSTNAMEFORM= net.serenitybdd.screenplay.targets.Target.the("firstnameform")
            .locatedBy("#first-name");
    public static Target LASTNAMEFORM= net.serenitybdd.screenplay.targets.Target.the("lastnameform")
            .locatedBy("#last-name");
    public static Target POSTALCODEFORM= net.serenitybdd.screenplay.targets.Target.the("postalcodeform")
            .locatedBy("#postal-code");
    public static Target CONTINUEBUT= net.serenitybdd.screenplay.targets.Target.the("continuebut")
            .locatedBy("#continue");
    public static Target TOTALPRICE= net.serenitybdd.screenplay.targets.Target.the("totalpricelabel")
            .locatedBy(".summary_total_label");
    public static Target FINISHBUT= net.serenitybdd.screenplay.targets.Target.the("finishbut")
            .locatedBy("#finish");
    public static Target CARTLIST = net.serenitybdd.screenplay.targets.Target.the("cartlist")
            .locatedBy(".cart_list");



}
