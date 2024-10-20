package deob;

@ObfuscatedName("d")
public class class19 extends class35 {

    @ObfuscatedName("d.u")
    public final int field127;

    @ObfuscatedName("d.f")
    public final class29 field126;

    @ObfuscatedName("d.b")
    public final int field128;

    @ObfuscatedName("d.g")
    public final int field130;

    public class19(class214 arg0, class214 arg1, int arg2, class29 arg3) {
        super(arg0, arg1);
        this.field127 = arg2;
        this.field126 = arg3;
        class242 var5 = class242.method2014(this.method191());
        class325 var6 = var5.method4057(false);
        if (var6 == null) {
            this.field128 = 0;
            this.field130 = 0;
        } else {
            this.field128 = var6.field3869;
            this.field130 = var6.field3872;
        }
    }

    @ObfuscatedName("d.u(I)I")
    public int method191() {
        return this.field127;
    }

    @ObfuscatedName("d.f(I)Lam;")
    public class29 method192() {
        return this.field126;
    }

    @ObfuscatedName("d.b(I)I")
    public int method196() {
        return this.field128;
    }

    @ObfuscatedName("d.g(B)I")
    public int method194() {
        return this.field130;
    }
}
