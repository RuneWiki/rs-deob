package deob;

@ObfuscatedName("hf")
public class class224 extends class236 {

    @ObfuscatedName("hf.c")
    public final int field2669;

    @ObfuscatedName("hf.b")
    public final class231 field2670;

    @ObfuscatedName("hf.p")
    public final int field2671;

    @ObfuscatedName("hf.m")
    public final int field2672;

    public class224(class277 arg0, class277 arg1, int arg2, class231 arg3) {
        super(arg0, arg1);
        this.field2669 = arg2;
        this.field2670 = arg3;
        class164 var5 = class164.method2044(this.method4040());
        class432 var6 = var5.method2886(false);
        if (var6 == null) {
            this.field2671 = 0;
            this.field2672 = 0;
        } else {
            this.field2671 = var6.field4566;
            this.field2672 = var6.field4567;
        }
    }

    @ObfuscatedName("hf.b(I)I")
    public int method4040() {
        return this.field2669;
    }

    @ObfuscatedName("hf.p(I)Lhm;")
    public class231 method4034() {
        return this.field2670;
    }

    @ObfuscatedName("hf.m(S)I")
    public int method4035() {
        return this.field2671;
    }

    @ObfuscatedName("hf.t(I)I")
    public int method4036() {
        return this.field2672;
    }
}
