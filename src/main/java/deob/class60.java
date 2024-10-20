package deob;

@ObfuscatedName("bw")
public class class60 extends class209 {

    @ObfuscatedName("bw.g")
    public int field596;

    @ObfuscatedName("bw.r")
    public int field590;

    @ObfuscatedName("bw.e")
    public int field598;

    @ObfuscatedName("bw.q")
    public String field592;

    @ObfuscatedName("bw.c")
    public class294 field593;

    @ObfuscatedName("bw.l")
    public class292 field594 = class292.field3714;

    @ObfuscatedName("bw.b")
    public class292 field595 = class292.field3714;

    @ObfuscatedName("bw.w")
    public String field597;

    @ObfuscatedName("bw.n")
    public String field589;

    public class60(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class86.field1247 - 1;
        this.field596 = var5;
        this.field590 = client.field656;
        this.field598 = arg0;
        this.field592 = arg1;
        this.method1062();
        this.field597 = arg2;
        this.field589 = arg3;
    }

    @ObfuscatedName("bw.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1055(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class86.field1247 - 1;
        this.field596 = var5;
        this.field590 = client.field656;
        this.field598 = arg0;
        this.field592 = arg1;
        this.method1062();
        this.field597 = arg2;
        this.field589 = arg3;
    }

    @ObfuscatedName("bw.r(S)V")
    public void method1064() {
        this.field594 = class292.field3714;
    }

    @ObfuscatedName("bw.e(I)Z")
    public final boolean method1057() {
        if (class292.field3714 == this.field594) {
            this.method1058();
        }
        return class292.field3713 == this.field594;
    }

    @ObfuscatedName("bw.q(B)V")
    public void method1058() {
        this.field594 = Statics.field2151.field1041.method5192(this.field593) ? class292.field3713 : class292.field3712;
    }

    @ObfuscatedName("bw.c(B)V")
    public void method1059() {
        this.field595 = class292.field3714;
    }

    @ObfuscatedName("bw.i(B)Z")
    public final boolean method1054() {
        if (class292.field3714 == this.field595) {
            this.method1061();
        }
        return class292.field3713 == this.field595;
    }

    @ObfuscatedName("bw.p(I)V")
    public void method1061() {
        this.field595 = Statics.field2151.field1042.method5192(this.field593) ? class292.field3713 : class292.field3712;
    }

    @ObfuscatedName("bw.m(I)V")
    public final void method1062() {
        if (this.field592 == null) {
            this.field593 = null;
        } else {
            this.field593 = new class294(client.method2015(this.field592), Statics.field921);
        }
    }
}
