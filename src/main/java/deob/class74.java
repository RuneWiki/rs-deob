package deob;

@ObfuscatedName("bk")
public class class74 extends class185 {

    @ObfuscatedName("bk.f")
    public int field639;

    @ObfuscatedName("bk.b")
    public int field633;

    @ObfuscatedName("bk.l")
    public int field634;

    @ObfuscatedName("bk.m")
    public String field642;

    @ObfuscatedName("bk.z")
    public class294 field637;

    @ObfuscatedName("bk.q")
    public class292 field635 = class292.field3644;

    @ObfuscatedName("bk.k")
    public class292 field638 = class292.field3644;

    @ObfuscatedName("bk.c")
    public String field632;

    @ObfuscatedName("bk.u")
    public String field640;

    public class74(int arg0, String arg1, String arg2, String arg3) {
        this.method1130(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bk.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1130(int arg0, String arg1, String arg2, String arg3) {
        this.field639 = class101.method4894();
        this.field633 = client.field863;
        this.field634 = arg0;
        this.field642 = arg1;
        this.method1137();
        this.field632 = arg2;
        this.field640 = arg3;
        this.method1131();
        this.method1144();
    }

    @ObfuscatedName("bk.b(I)V")
    public void method1131() {
        this.field635 = class292.field3644;
    }

    @ObfuscatedName("bk.l(I)Z")
    public final boolean method1132() {
        if (class292.field3644 == this.field635) {
            this.method1133();
        }
        return class292.field3645 == this.field635;
    }

    @ObfuscatedName("bk.m(I)V")
    public void method1133() {
        this.field635 = Statics.field150.field1096.method4811(this.field637) ? class292.field3645 : class292.field3646;
    }

    @ObfuscatedName("bk.z(I)V")
    public void method1144() {
        this.field638 = class292.field3644;
    }

    @ObfuscatedName("bk.q(B)Z")
    public final boolean method1135() {
        if (class292.field3644 == this.field638) {
            this.method1136();
        }
        return class292.field3645 == this.field638;
    }

    @ObfuscatedName("bk.k(B)V")
    public void method1136() {
        this.field638 = Statics.field150.field1097.method4811(this.field637) ? class292.field3645 : class292.field3646;
    }

    @ObfuscatedName("bk.c(I)V")
    public final void method1137() {
        if (this.field642 == null) {
            this.field637 = null;
        } else {
            this.field637 = new class294(client.method186(this.field642), Statics.field1990);
        }
    }
}
