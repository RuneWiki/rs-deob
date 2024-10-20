package deob;

@ObfuscatedName("ap")
public class class33 extends class44 {

    @ObfuscatedName("ap.z")
    public final int field216;

    @ObfuscatedName("ap.k")
    public final class39 field210;

    @ObfuscatedName("ap.s")
    public int field211;

    @ObfuscatedName("ap.t")
    public class38 field212;

    @ObfuscatedName("ap.i")
    public int field209;

    @ObfuscatedName("ap.o")
    public int field214;

    public class33(class223 arg0, class223 arg1, int arg2, class39 arg3) {
        super(arg0, arg1);
        this.field216 = arg2;
        this.field210 = arg3;
        this.method320();
    }

    @ObfuscatedName("ap.a(I)V")
    public void method320() {
        this.field211 = class264.method3595(this.field216).method4325().field3400;
        this.field212 = this.field210.method456(Statics.method285(this.field211));
        class252 var1 = Statics.method285(this.method250());
        class335 var2 = var1.method4089(false);
        if (var2 == null) {
            this.field209 = 0;
            this.field214 = 0;
        } else {
            this.field209 = var2.field3905;
            this.field214 = var2.field3907;
        }
    }

    @ObfuscatedName("ap.z(I)I")
    public int method250() {
        return this.field211;
    }

    @ObfuscatedName("ap.k(I)Laq;")
    public class38 method261() {
        return this.field212;
    }

    @ObfuscatedName("ap.s(I)I")
    public int method251() {
        return this.field209;
    }

    @ObfuscatedName("ap.t(I)I")
    public int method252() {
        return this.field214;
    }
}
