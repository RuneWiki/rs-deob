package deob;

@ObfuscatedName("hb")
public class class224 extends class244 {

    @ObfuscatedName("hb.o")
    public final int field2722;

    @ObfuscatedName("hb.q")
    public final class227 field2718;

    @ObfuscatedName("hb.l")
    public int field2719;

    @ObfuscatedName("hb.k")
    public class239 field2721;

    @ObfuscatedName("hb.a")
    public int field2717;

    @ObfuscatedName("hb.m")
    public int field2723;

    public class224(class290 arg0, class290 arg1, int arg2, class227 arg3) {
        super(arg0, arg1);
        this.field2722 = arg2;
        this.field2718 = arg3;
        this.method4096();
    }

    @ObfuscatedName("hb.o(I)V")
    public void method4096() {
        this.field2719 = class188.method1989(this.field2722).method3299().field2108;
        this.field2721 = this.field2718.method4223(class172.method2598(this.field2719));
        class172 var1 = class172.method2598(this.method4095());
        class453 var2 = var1.method3009(false);
        if (var2 == null) {
            this.field2717 = 0;
            this.field2723 = 0;
        } else {
            this.field2717 = var2.field4768;
            this.field2723 = var2.field4770;
        }
    }

    @ObfuscatedName("hb.q(B)I")
    public int method4095() {
        return this.field2719;
    }

    @ObfuscatedName("hb.l(I)Lip;")
    public class239 method4098() {
        return this.field2721;
    }

    @ObfuscatedName("hb.k(B)I")
    public int method4106() {
        return this.field2717;
    }

    @ObfuscatedName("hb.a(I)I")
    public int method4105() {
        return this.field2723;
    }
}
