package deob;

@ObfuscatedName("hs")
public class class232 extends class244 {

    @ObfuscatedName("hs.o")
    public final int field2809;

    @ObfuscatedName("hs.q")
    public final class239 field2810;

    @ObfuscatedName("hs.l")
    public final int field2811;

    @ObfuscatedName("hs.k")
    public final int field2812;

    public class232(class290 arg0, class290 arg1, int arg2, class239 arg3) {
        super(arg0, arg1);
        this.field2809 = arg2;
        this.field2810 = arg3;
        class172 var5 = class172.method2598(this.method4095());
        class453 var6 = var5.method3009(false);
        if (var6 == null) {
            this.field2811 = 0;
            this.field2812 = 0;
        } else {
            this.field2811 = var6.field4768;
            this.field2812 = var6.field4770;
        }
    }

    @ObfuscatedName("hs.q(B)I")
    public int method4095() {
        return this.field2809;
    }

    @ObfuscatedName("hs.l(I)Lip;")
    public class239 method4098() {
        return this.field2810;
    }

    @ObfuscatedName("hs.k(B)I")
    public int method4106() {
        return this.field2811;
    }

    @ObfuscatedName("hs.a(I)I")
    public int method4105() {
        return this.field2812;
    }
}
