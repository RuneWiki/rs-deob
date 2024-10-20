package deob;

@ObfuscatedName("p")
public class class19 extends class35 {

    @ObfuscatedName("p.n")
    public final int field121;

    @ObfuscatedName("p.h")
    public final class29 field120;

    @ObfuscatedName("p.l")
    public final int field122;

    @ObfuscatedName("p.g")
    public final int field123;

    public class19(class234 arg0, class234 arg1, int arg2, class29 arg3) {
        super(arg0, arg1);
        this.field121 = arg2;
        this.field120 = arg3;
        class262 var5 = class262.method106(this.method185());
        class327 var6 = var5.method4655(false);
        if (var6 == null) {
            this.field122 = 0;
            this.field123 = 0;
        } else {
            this.field122 = var6.field3878;
            this.field123 = var6.field3880;
        }
    }

    @ObfuscatedName("p.n(I)I")
    public int method185() {
        return this.field121;
    }

    @ObfuscatedName("p.h(B)Lag;")
    public class29 method200() {
        return this.field120;
    }

    @ObfuscatedName("p.l(I)I")
    public int method187() {
        return this.field122;
    }

    @ObfuscatedName("p.g(B)I")
    public int method193() {
        return this.field123;
    }
}
