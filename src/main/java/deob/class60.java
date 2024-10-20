package deob;

@ObfuscatedName("bm")
public class class60 extends class209 {

    @ObfuscatedName("bm.f")
    public int field591;

    @ObfuscatedName("bm.l")
    public int field583;

    @ObfuscatedName("bm.w")
    public int field585;

    @ObfuscatedName("bm.s")
    public String field588;

    @ObfuscatedName("bm.e")
    public class294 field587;

    @ObfuscatedName("bm.a")
    public class292 field590 = class292.field3705;

    @ObfuscatedName("bm.c")
    public class292 field589 = class292.field3705;

    @ObfuscatedName("bm.p")
    public String field584;

    @ObfuscatedName("bm.r")
    public String field586;

    public class60(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class86.field1243 - 1;
        this.field591 = var5;
        this.field583 = client.field642;
        this.field585 = arg0;
        this.field588 = arg1;
        this.method1025();
        this.field584 = arg2;
        this.field586 = arg3;
    }

    @ObfuscatedName("bm.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public void method1003(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class86.field1243 - 1;
        this.field591 = var5;
        this.field583 = client.field642;
        this.field585 = arg0;
        this.field588 = arg1;
        this.method1025();
        this.field584 = arg2;
        this.field586 = arg3;
    }

    @ObfuscatedName("bm.l(I)V")
    public void method1028() {
        this.field590 = class292.field3705;
    }

    @ObfuscatedName("bm.w(I)Z")
    public final boolean method1005() {
        if (class292.field3705 == this.field590) {
            this.method1006();
        }
        return class292.field3704 == this.field590;
    }

    @ObfuscatedName("bm.s(I)V")
    public void method1006() {
        this.field590 = Statics.field1863.field1023.method5038(this.field587) ? class292.field3704 : class292.field3706;
    }

    @ObfuscatedName("bm.e(I)V")
    public void method1023() {
        this.field589 = class292.field3705;
    }

    @ObfuscatedName("bm.c(B)Z")
    public final boolean method1008() {
        if (class292.field3705 == this.field589) {
            this.method1009();
        }
        return class292.field3704 == this.field589;
    }

    @ObfuscatedName("bm.p(I)V")
    public void method1009() {
        this.field589 = Statics.field1863.field1025.method5038(this.field587) ? class292.field3704 : class292.field3706;
    }

    @ObfuscatedName("bm.r(I)V")
    public final void method1025() {
        if (this.field588 == null) {
            this.field587 = null;
        } else {
            this.field587 = new class294(client.method3641(this.field588), Statics.field3846);
        }
    }
}
