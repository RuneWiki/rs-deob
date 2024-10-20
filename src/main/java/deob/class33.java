package deob;

@ObfuscatedName("ay")
public class class33 extends class44 {

    @ObfuscatedName("ay.f")
    public final int field215;

    @ObfuscatedName("ay.b")
    public final class39 field211;

    @ObfuscatedName("ay.l")
    public int field212;

    @ObfuscatedName("ay.m")
    public class38 field210;

    @ObfuscatedName("ay.z")
    public int field214;

    @ObfuscatedName("ay.q")
    public int field213;

    public class33(class223 arg0, class223 arg1, int arg2, class39 arg3) {
        super(arg0, arg1);
        this.field215 = arg2;
        this.field211 = arg3;
        this.method337();
    }

    @ObfuscatedName("ay.n(I)V")
    public void method337() {
        this.field212 = class265.method1122(this.field215).method4361().field3420;
        this.field210 = this.field211.method475(class253.method3431(this.field212));
        class253 var1 = class253.method3431(this.method251());
        class336 var2 = var1.method4137(false);
        if (var2 == null) {
            this.field214 = 0;
            this.field213 = 0;
        } else {
            this.field214 = var2.field3909;
            this.field213 = var2.field3915;
        }
    }

    @ObfuscatedName("ay.f(B)I")
    public int method251() {
        return this.field212;
    }

    @ObfuscatedName("ay.b(I)Lai;")
    public class38 method252() {
        return this.field210;
    }

    @ObfuscatedName("ay.l(I)I")
    public int method253() {
        return this.field214;
    }

    @ObfuscatedName("ay.m(I)I")
    public int method264() {
        return this.field213;
    }
}
