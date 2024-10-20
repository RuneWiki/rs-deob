package deob;

@ObfuscatedName("af")
public class class33 extends class44 {

    @ObfuscatedName("af.x")
    public final int field229;

    @ObfuscatedName("af.m")
    public final class39 field226;

    @ObfuscatedName("af.k")
    public int field228;

    @ObfuscatedName("af.d")
    public class38 field227;

    @ObfuscatedName("af.w")
    public int field225;

    @ObfuscatedName("af.v")
    public int field230;

    public class33(class223 arg0, class223 arg1, int arg2, class39 arg3) {
        super(arg0, arg1);
        this.field229 = arg2;
        this.field226 = arg3;
        this.method353();
    }

    @ObfuscatedName("af.u(S)V")
    public void method353() {
        this.field228 = class264.method363(this.field229).method4277().field3373;
        this.field227 = this.field226.method477(class252.method249(this.field228));
        class252 var1 = class252.method249(this.method264());
        class335 var2 = var1.method4075(false);
        if (var2 == null) {
            this.field225 = 0;
            this.field230 = 0;
        } else {
            this.field225 = var2.field3890;
            this.field230 = var2.field3900;
        }
    }

    @ObfuscatedName("af.x(B)I")
    public int method264() {
        return this.field228;
    }

    @ObfuscatedName("af.m(I)Lau;")
    public class38 method275() {
        return this.field227;
    }

    @ObfuscatedName("af.k(I)I")
    public int method266() {
        return this.field225;
    }

    @ObfuscatedName("af.d(I)I")
    public int method263() {
        return this.field230;
    }
}
