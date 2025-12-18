package com.nttdata.challenge.screenplay.UI;

import net.serenitybdd.screenplay.targets.Target;

public class listproductInterface {

    //.shopping_cart_badge css selector
    //.shopping_cart_link css selector
    //.inventory_list
    //#remove-sauce-labs-backpack
    //#remove-sauce-labs-bike-light

    public static Target ICONCART= net.serenitybdd.screenplay.targets.Target.the("linkcart")
            .locatedBy(".shopping_cart_link css selector");
    public static Target CARTBADGE= net.serenitybdd.screenplay.targets.Target.the("badgecart")
            .locatedBy(".shopping_cart_badge css selector");
    public static Target InvList= net.serenitybdd.screenplay.targets.Target.the("invlist")
            .locatedBy(".inventory_list");
    public static Target REMVBUT01= net.serenitybdd.screenplay.targets.Target.the("remvbut01")
            .locatedBy("#remove-sauce-labs-backpack");
    public static Target REMVBUT02= net.serenitybdd.screenplay.targets.Target.the("remvbut02")
            .locatedBy("#remove-sauce-labs-bike-light");



}
