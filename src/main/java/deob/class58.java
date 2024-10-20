package deob;

@ObfuscatedName("bd")
public class class58 extends class387 {

    @ObfuscatedName("bd.c")
    public int field484;

    @ObfuscatedName("bd.l")
    public int field473;

    @ObfuscatedName("bd.s")
    public int field474;

    @ObfuscatedName("bd.e")
    public String field475;

    @ObfuscatedName("bd.r")
    public class442 field476;

    @ObfuscatedName("bd.o")
    public class360 field477 = class360.field4177;

    @ObfuscatedName("bd.i")
    public class360 field478 = class360.field4177;

    @ObfuscatedName("bd.w")
    public String field482;

    @ObfuscatedName("bd.v")
    public String field480;

    public class58(int arg0, String arg1, String arg2, String arg3) {
        this.method1008(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bd.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1008(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class98.field1312 - 1;
        this.field484 = var5;
        this.field473 = client.field682;
        this.field474 = arg0;
        this.field475 = arg1;
        this.method1023();
        this.field482 = arg2;
        this.field480 = arg3;
        this.method1009();
        this.method1012();
    }

    @ObfuscatedName("bd.l(I)V")
    public void method1009() {
        this.field477 = class360.field4177;
    }

    @ObfuscatedName("bd.s(B)Z")
    public final boolean method1010() {
        if (class360.field4177 == this.field477) {
            this.method1011();
        }
        return class360.field4176 == this.field477;
    }

    @ObfuscatedName("bd.e(B)V")
    public void method1011() {
        this.field477 = Statics.field1606.field807.method5787(this.field476) ? class360.field4176 : class360.field4178;
    }

    @ObfuscatedName("bd.r(I)V")
    public void method1012() {
        this.field478 = class360.field4177;
    }

    @ObfuscatedName("bd.o(I)Z")
    public final boolean method1013() {
        if (class360.field4177 == this.field478) {
            this.method1032();
        }
        return class360.field4176 == this.field478;
    }

    @ObfuscatedName("bd.i(I)V")
    public void method1032() {
        this.field478 = Statics.field1606.field808.method5787(this.field476) ? class360.field4176 : class360.field4178;
    }

    @ObfuscatedName("bd.w(I)V")
    public final void method1023() {
        if (this.field475 == null) {
            this.field476 = null;
        } else {
            this.field476 = new class442(client.method4849(this.field475), Statics.field1786);
        }
    }
}
