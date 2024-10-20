package deob;

@ObfuscatedName("ho")
public class class216 extends class236 {

    @ObfuscatedName("ho.c")
    public final int field2586;

    @ObfuscatedName("ho.b")
    public final class219 field2588;

    @ObfuscatedName("ho.p")
    public int field2585;

    @ObfuscatedName("ho.m")
    public class231 field2587;

    @ObfuscatedName("ho.t")
    public int field2589;

    @ObfuscatedName("ho.s")
    public int field2590;

    public class216(class277 arg0, class277 arg1, int arg2, class219 arg3) {
        super(arg0, arg1);
        this.field2586 = arg2;
        this.field2588 = arg3;
        this.method4033();
    }

    @ObfuscatedName("ho.c(I)V")
    public void method4033() {
        this.field2585 = class180.method2760(this.field2586).method3208().field1980;
        this.field2587 = this.field2588.method4179(class164.method2044(this.field2585));
        class164 var1 = class164.method2044(this.method4040());
        class432 var2 = var1.method2886(false);
        if (var2 == null) {
            this.field2589 = 0;
            this.field2590 = 0;
        } else {
            this.field2589 = var2.field4566;
            this.field2590 = var2.field4567;
        }
    }

    @ObfuscatedName("ho.b(I)I")
    public int method4040() {
        return this.field2585;
    }

    @ObfuscatedName("ho.p(I)Lhm;")
    public class231 method4034() {
        return this.field2587;
    }

    @ObfuscatedName("ho.m(S)I")
    public int method4035() {
        return this.field2589;
    }

    @ObfuscatedName("ho.t(I)I")
    public int method4036() {
        return this.field2590;
    }
}
