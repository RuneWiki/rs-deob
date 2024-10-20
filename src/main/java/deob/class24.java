package deob;

@ObfuscatedName("d")
public class class24 extends class35 {

    @ObfuscatedName("d.q")
    public final int field196;

    @ObfuscatedName("d.w")
    public final class30 field184;

    @ObfuscatedName("d.e")
    public int field185;

    @ObfuscatedName("d.p")
    public class29 field192;

    @ObfuscatedName("d.k")
    public int field190;

    @ObfuscatedName("d.l")
    public int field187;

    public class24(class214 arg0, class214 arg1, int arg2, class30 arg3) {
        super(arg0, arg1);
        this.field196 = arg2;
        this.field184 = arg3;
        this.method258();
    }

    @ObfuscatedName("d.a(B)V")
    public void method258() {
        this.field185 = class254.method2713(this.field196).method4212().field3379;
        this.field192 = this.field184.method395(class242.method3753(this.field185));
        class242 var1 = class242.method3753(this.method176());
        class326 var2 = var1.method3996(false);
        if (var2 == null) {
            this.field190 = 0;
            this.field187 = 0;
        } else {
            this.field190 = var2.field3900;
            this.field187 = var2.field3901;
        }
    }

    @ObfuscatedName("d.q(I)I")
    public int method176() {
        return this.field185;
    }

    @ObfuscatedName("d.w(I)Las;")
    public class29 method177() {
        return this.field192;
    }

    @ObfuscatedName("d.e(B)I")
    public int method178() {
        return this.field190;
    }

    @ObfuscatedName("d.p(B)I")
    public int method192() {
        return this.field187;
    }
}
