package deob;

@ObfuscatedName("cq")
public class class61 extends class444 {

    @ObfuscatedName("cq.af")
    public int field471;

    @ObfuscatedName("cq.an")
    public int field472;

    @ObfuscatedName("cq.aw")
    public int field478;

    @ObfuscatedName("cq.ac")
    public String field473;

    @ObfuscatedName("cq.au")
    public class513 field475;

    @ObfuscatedName("cq.ab")
    public class413 field476 = class413.field4605;

    @ObfuscatedName("cq.aq")
    public class413 field477 = class413.field4605;

    @ObfuscatedName("cq.al")
    public String field474;

    @ObfuscatedName("cq.at")
    public String field479;

    public class61(int arg0, String arg1, String arg2, String arg3) {
        this.method1099(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cq.af(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1099(int arg0, String arg1, String arg2, String arg3) {
        this.field471 = class106.method2963();
        this.field472 = client.field602;
        this.field478 = arg0;
        this.field473 = arg1;
        this.method1132();
        this.field474 = arg2;
        this.field479 = arg3;
        this.method1127();
        this.method1101();
    }

    @ObfuscatedName("cq.an(B)V")
    public void method1127() {
        this.field476 = class413.field4605;
    }

    @ObfuscatedName("cq.aw(I)Z")
    public final boolean method1098() {
        if (class413.field4605 == this.field476) {
            this.method1100();
        }
        return class413.field4602 == this.field476;
    }

    @ObfuscatedName("cq.ac(B)V")
    public void method1100() {
        this.field476 = Statics.field804.field811.method7218(this.field475) ? class413.field4602 : class413.field4603;
    }

    @ObfuscatedName("cq.au(I)V")
    public void method1101() {
        this.field477 = class413.field4605;
    }

    @ObfuscatedName("cq.ab(I)Z")
    public final boolean method1102() {
        if (class413.field4605 == this.field477) {
            this.method1111();
        }
        return class413.field4602 == this.field477;
    }

    @ObfuscatedName("cq.aq(I)V")
    public void method1111() {
        this.field477 = Statics.field804.field812.method7218(this.field475) ? class413.field4602 : class413.field4603;
    }

    @ObfuscatedName("cq.al(I)V")
    public final void method1132() {
        if (this.field473 == null) {
            this.field475 = null;
        } else {
            this.field475 = new class513(client.method6310(this.field473), Statics.field889);
        }
    }
}
