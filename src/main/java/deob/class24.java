package deob;

@ObfuscatedName("q")
public class class24 extends class35 {

    @ObfuscatedName("q.u")
    public final int field183;

    @ObfuscatedName("q.f")
    public final class30 field188;

    @ObfuscatedName("q.b")
    public int field182;

    @ObfuscatedName("q.g")
    public class29 field180;

    @ObfuscatedName("q.z")
    public int field184;

    @ObfuscatedName("q.p")
    public int field185;

    public class24(class214 arg0, class214 arg1, int arg2, class30 arg3) {
        super(arg0, arg1);
        this.field183 = arg2;
        this.field188 = arg3;
        this.method277();
    }

    @ObfuscatedName("q.o(I)V")
    public void method277() {
        this.field182 = class254.method3048(this.field183).method4321().field3382;
        this.field180 = this.field188.method402(class242.method2014(this.field182));
        class242 var1 = class242.method2014(this.method191());
        class325 var2 = var1.method4057(false);
        if (var2 == null) {
            this.field184 = 0;
            this.field185 = 0;
        } else {
            this.field184 = var2.field3869;
            this.field185 = var2.field3872;
        }
    }

    @ObfuscatedName("q.u(I)I")
    public int method191() {
        return this.field182;
    }

    @ObfuscatedName("q.f(I)Lam;")
    public class29 method192() {
        return this.field180;
    }

    @ObfuscatedName("q.b(I)I")
    public int method196() {
        return this.field184;
    }

    @ObfuscatedName("q.g(B)I")
    public int method194() {
        return this.field185;
    }
}
