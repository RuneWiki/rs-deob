package deob;

@ObfuscatedName("bh")
public class class60 extends class209 {

    @ObfuscatedName("bh.v")
    public int field568;

    @ObfuscatedName("bh.s")
    public int field569;

    @ObfuscatedName("bh.o")
    public int field573;

    @ObfuscatedName("bh.k")
    public String field571;

    @ObfuscatedName("bh.u")
    public class294 field572;

    @ObfuscatedName("bh.i")
    public class292 field575 = class292.field3668;

    @ObfuscatedName("bh.t")
    public class292 field574 = class292.field3668;

    @ObfuscatedName("bh.p")
    public String field570;

    @ObfuscatedName("bh.l")
    public String field576;

    public class60(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class86.field1229 - 1;
        this.field568 = var5;
        this.field569 = client.field631;
        this.field573 = arg0;
        this.field571 = arg1;
        this.method999();
        this.field570 = arg2;
        this.field576 = arg3;
    }

    @ObfuscatedName("bh.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1019(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class86.field1229 - 1;
        this.field568 = var5;
        this.field569 = client.field631;
        this.field573 = arg0;
        this.field571 = arg1;
        this.method999();
        this.field570 = arg2;
        this.field576 = arg3;
    }

    @ObfuscatedName("bh.s(I)V")
    public void method993() {
        this.field575 = class292.field3668;
    }

    @ObfuscatedName("bh.o(I)Z")
    public final boolean method994() {
        if (class292.field3668 == this.field575) {
            this.method995();
        }
        return class292.field3667 == this.field575;
    }

    @ObfuscatedName("bh.k(B)V")
    public void method995() {
        this.field575 = Statics.field1240.field1014.method4993(this.field572) ? class292.field3667 : class292.field3666;
    }

    @ObfuscatedName("bh.u(I)V")
    public void method996() {
        this.field574 = class292.field3668;
    }

    @ObfuscatedName("bh.i(I)Z")
    public final boolean method997() {
        if (class292.field3668 == this.field574) {
            this.method998();
        }
        return class292.field3667 == this.field574;
    }

    @ObfuscatedName("bh.t(I)V")
    public void method998() {
        this.field574 = Statics.field1240.field1010.method4993(this.field572) ? class292.field3667 : class292.field3666;
    }

    @ObfuscatedName("bh.c(I)V")
    public final void method999() {
        if (this.field571 == null) {
            this.field572 = null;
        } else {
            this.field572 = new class294(client.method4246(this.field571), Statics.field2289);
        }
    }
}
