package deob;

@ObfuscatedName("an")
public class class28 extends class44 {

    @ObfuscatedName("an.x")
    public final int field170;

    @ObfuscatedName("an.m")
    public final class38 field164;

    @ObfuscatedName("an.k")
    public final int field171;

    @ObfuscatedName("an.d")
    public final int field166;

    public class28(class223 arg0, class223 arg1, int arg2, class38 arg3) {
        super(arg0, arg1);
        this.field170 = arg2;
        this.field164 = arg3;
        class252 var5 = class252.method249(this.method264());
        class335 var6 = var5.method4075(false);
        if (var6 == null) {
            this.field171 = 0;
            this.field166 = 0;
        } else {
            this.field171 = var6.field3890;
            this.field166 = var6.field3900;
        }
    }

    @ObfuscatedName("an.x(B)I")
    public int method264() {
        return this.field170;
    }

    @ObfuscatedName("an.m(I)Lau;")
    public class38 method275() {
        return this.field164;
    }

    @ObfuscatedName("an.k(I)I")
    public int method266() {
        return this.field171;
    }

    @ObfuscatedName("an.d(I)I")
    public int method263() {
        return this.field166;
    }
}
