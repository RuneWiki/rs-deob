package deob;

@ObfuscatedName("co")
public class class65 extends class485 {

    @ObfuscatedName("co.am")
    public int field480;

    @ObfuscatedName("co.ap")
    public int field475;

    @ObfuscatedName("co.af")
    public int field474;

    @ObfuscatedName("co.aj")
    public String field476;

    @ObfuscatedName("co.aq")
    public class554 field477;

    @ObfuscatedName("co.ar")
    public class454 field478 = class454.field4749;

    @ObfuscatedName("co.ag")
    public class454 field479 = class454.field4749;

    @ObfuscatedName("co.ao")
    public String field481;

    @ObfuscatedName("co.ae")
    public String field482;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1162(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("co.am(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1162(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class111.field1398 - 1;
        this.field480 = var5;
        this.field475 = client.field677;
        this.field474 = arg0;
        this.field476 = arg1;
        this.method1149();
        this.field481 = arg2;
        this.field482 = arg3;
        this.method1148();
        this.method1151();
    }

    @ObfuscatedName("co.ap(I)V")
    public void method1148() {
        this.field478 = class454.field4749;
    }

    @ObfuscatedName("co.af(S)Z")
    public final boolean method1159() {
        if (class454.field4749 == this.field478) {
            this.method1150();
        }
        return class454.field4746 == this.field478;
    }

    @ObfuscatedName("co.aj(I)V")
    public void method1150() {
        this.field478 = Statics.field3588.field827.method7574(this.field477) ? class454.field4746 : class454.field4745;
    }

    @ObfuscatedName("co.aq(I)V")
    public void method1151() {
        this.field479 = class454.field4749;
    }

    @ObfuscatedName("co.ar(B)Z")
    public final boolean method1152() {
        if (class454.field4749 == this.field479) {
            this.method1153();
        }
        return class454.field4746 == this.field479;
    }

    @ObfuscatedName("co.ag(B)V")
    public void method1153() {
        this.field479 = Statics.field3588.field830.method7574(this.field477) ? class454.field4746 : class454.field4745;
    }

    @ObfuscatedName("co.ao(I)V")
    public final void method1149() {
        if (this.field476 == null) {
            this.field477 = null;
        } else {
            this.field477 = new class554(client.method5708(this.field476), Statics.field1465);
        }
    }
}
