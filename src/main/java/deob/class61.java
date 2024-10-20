package deob;

@ObfuscatedName("bq")
public class class61 extends class435 {

    @ObfuscatedName("bq.f")
    public int field485;

    @ObfuscatedName("bq.w")
    public int field478;

    @ObfuscatedName("bq.v")
    public int field479;

    @ObfuscatedName("bq.s")
    public String field480;

    @ObfuscatedName("bq.z")
    public class497 field477;

    @ObfuscatedName("bq.j")
    public class406 field488 = class406.field4579;

    @ObfuscatedName("bq.i")
    public class406 field483 = class406.field4579;

    @ObfuscatedName("bq.n")
    public String field484;

    @ObfuscatedName("bq.l")
    public String field481;

    public class61(int arg0, String arg1, String arg2, String arg3) {
        this.method1091(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bq.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1091(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class106.field1389 - 1;
        this.field485 = var5;
        this.field478 = client.field511;
        this.field479 = arg0;
        this.field480 = arg1;
        this.method1098();
        this.field484 = arg2;
        this.field481 = arg3;
        this.method1092();
        this.method1095();
    }

    @ObfuscatedName("bq.w(I)V")
    public void method1092() {
        this.field488 = class406.field4579;
    }

    @ObfuscatedName("bq.v(B)Z")
    public final boolean method1097() {
        if (class406.field4579 == this.field488) {
            this.method1124();
        }
        return class406.field4580 == this.field488;
    }

    @ObfuscatedName("bq.s(I)V")
    public void method1124() {
        this.field488 = Statics.field1944.field829.method7053(this.field477) ? class406.field4580 : class406.field4582;
    }

    @ObfuscatedName("bq.z(B)V")
    public void method1095() {
        this.field483 = class406.field4579;
    }

    @ObfuscatedName("bq.j(I)Z")
    public final boolean method1096() {
        if (class406.field4579 == this.field483) {
            this.method1111();
        }
        return class406.field4580 == this.field483;
    }

    @ObfuscatedName("bq.i(B)V")
    public void method1111() {
        this.field483 = Statics.field1944.field826.method7053(this.field477) ? class406.field4580 : class406.field4582;
    }

    @ObfuscatedName("bq.n(I)V")
    public final void method1098() {
        if (this.field480 == null) {
            this.field477 = null;
        } else {
            this.field477 = new class497(client.method43(this.field480), Statics.field3020);
        }
    }
}
