package deob;

@ObfuscatedName("cy")
public class class65 extends class488 {

    @ObfuscatedName("cy.aq")
    public int field483;

    @ObfuscatedName("cy.aw")
    public int field477;

    @ObfuscatedName("cy.al")
    public int field479;

    @ObfuscatedName("cy.ai")
    public String field480;

    @ObfuscatedName("cy.ar")
    public class557 field478;

    @ObfuscatedName("cy.as")
    public class457 field481 = class457.field4776;

    @ObfuscatedName("cy.aa")
    public class457 field486 = class457.field4776;

    @ObfuscatedName("cy.az")
    public String field484;

    @ObfuscatedName("cy.ao")
    public String field485;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1091(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cy.aq(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1091(int arg0, String arg1, String arg2, String arg3) {
        this.field483 = class112.method292();
        this.field477 = client.field536;
        this.field479 = arg0;
        this.field480 = arg1;
        this.method1100();
        this.field484 = arg2;
        this.field485 = arg3;
        this.method1092();
        this.method1098();
    }

    @ObfuscatedName("cy.aw(B)V")
    public void method1092() {
        this.field481 = class457.field4776;
    }

    @ObfuscatedName("cy.al(I)Z")
    public final boolean method1093() {
        if (class457.field4776 == this.field481) {
            this.method1094();
        }
        return class457.field4773 == this.field481;
    }

    @ObfuscatedName("cy.ai(I)V")
    public void method1094() {
        this.field481 = Statics.field1091.field862.method7590(this.field478) ? class457.field4773 : class457.field4775;
    }

    @ObfuscatedName("cy.ar(I)V")
    public void method1098() {
        this.field486 = class457.field4776;
    }

    @ObfuscatedName("cy.as(B)Z")
    public final boolean method1090() {
        if (class457.field4776 == this.field486) {
            this.method1096();
        }
        return class457.field4773 == this.field486;
    }

    @ObfuscatedName("cy.aa(I)V")
    public void method1096() {
        this.field486 = Statics.field1091.field857.method7590(this.field478) ? class457.field4773 : class457.field4775;
    }

    @ObfuscatedName("cy.az(I)V")
    public final void method1100() {
        if (this.field480 == null) {
            this.field478 = null;
        } else {
            this.field478 = new class557(client.method7382(this.field480), Statics.field4750);
        }
    }
}
