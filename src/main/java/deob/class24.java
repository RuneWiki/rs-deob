package deob;

@ObfuscatedName("e")
public class class24 extends class35 {

    @ObfuscatedName("e.n")
    public final int field180;

    @ObfuscatedName("e.h")
    public final class30 field178;

    @ObfuscatedName("e.l")
    public int field179;

    @ObfuscatedName("e.g")
    public class29 field177;

    @ObfuscatedName("e.b")
    public int field181;

    @ObfuscatedName("e.a")
    public int field182;

    public class24(class234 arg0, class234 arg1, int arg2, class30 arg3) {
        super(arg0, arg1);
        this.field180 = arg2;
        this.field178 = arg3;
        this.method270();
    }

    @ObfuscatedName("e.y(S)V")
    public void method270() {
        this.field179 = class274.method4676(this.field180).method4892().field3440;
        this.field177 = this.field178.method433(class262.method106(this.field179));
        class262 var1 = class262.method106(this.method185());
        class327 var2 = var1.method4655(false);
        if (var2 == null) {
            this.field181 = 0;
            this.field182 = 0;
        } else {
            this.field181 = var2.field3878;
            this.field182 = var2.field3880;
        }
    }

    @ObfuscatedName("e.n(I)I")
    public int method185() {
        return this.field179;
    }

    @ObfuscatedName("e.h(B)Lag;")
    public class29 method200() {
        return this.field177;
    }

    @ObfuscatedName("e.l(I)I")
    public int method187() {
        return this.field181;
    }

    @ObfuscatedName("e.g(B)I")
    public int method193() {
        return this.field182;
    }
}
