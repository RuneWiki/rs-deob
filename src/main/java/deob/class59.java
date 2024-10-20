package deob;

@ObfuscatedName("bh")
public class class59 extends class207 {

    @ObfuscatedName("bh.z")
    public int field541;

    @ObfuscatedName("bh.w")
    public int field536;

    @ObfuscatedName("bh.s")
    public int field533;

    @ObfuscatedName("bh.l")
    public String field532;

    @ObfuscatedName("bh.u")
    public class292 field535;

    @ObfuscatedName("bh.q")
    public class290 field540 = class290.field3634;

    @ObfuscatedName("bh.k")
    public class290 field537 = class290.field3634;

    @ObfuscatedName("bh.i")
    public String field538;

    @ObfuscatedName("bh.x")
    public String field534;

    public class59(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class84.field1187 - 1;
        this.field541 = var5;
        this.field536 = client.field592;
        this.field533 = arg0;
        this.field532 = arg1;
        this.method965();
        this.field538 = arg2;
        this.field534 = arg3;
    }

    @ObfuscatedName("bh.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method991(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class84.field1187 - 1;
        this.field541 = var5;
        this.field536 = client.field592;
        this.field533 = arg0;
        this.field532 = arg1;
        this.method965();
        this.field538 = arg2;
        this.field534 = arg3;
    }

    @ObfuscatedName("bh.w(I)V")
    public void method969() {
        this.field540 = class290.field3634;
    }

    @ObfuscatedName("bh.s(I)Z")
    public final boolean method961() {
        if (class290.field3634 == this.field540) {
            this.method962();
        }
        return class290.field3632 == this.field540;
    }

    @ObfuscatedName("bh.l(I)V")
    public void method962() {
        this.field540 = Statics.field2333.field971.method4935(this.field535) ? class290.field3632 : class290.field3635;
    }

    @ObfuscatedName("bh.u(I)V")
    public void method963() {
        this.field537 = class290.field3634;
    }

    @ObfuscatedName("bh.q(I)Z")
    public final boolean method964() {
        if (class290.field3634 == this.field537) {
            this.method982();
        }
        return class290.field3632 == this.field537;
    }

    @ObfuscatedName("bh.i(I)V")
    public void method982() {
        this.field537 = Statics.field2333.field976.method4935(this.field535) ? class290.field3632 : class290.field3635;
    }

    @ObfuscatedName("bh.x(I)V")
    public final void method965() {
        if (this.field532 == null) {
            this.field535 = null;
        } else {
            this.field535 = new class292(client.method2908(this.field532), Statics.field307);
        }
    }
}
