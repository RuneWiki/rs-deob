package deob;

@ObfuscatedName("z")
public class class19 extends class35 {

    @ObfuscatedName("z.c")
    public final int field144;

    @ObfuscatedName("z.t")
    public final class29 field147;

    @ObfuscatedName("z.o")
    public final int field142;

    @ObfuscatedName("z.e")
    public final int field148;

    public class19(class214 arg0, class214 arg1, int arg2, class29 arg3) {
        super(arg0, arg1);
        this.field144 = arg2;
        this.field147 = arg3;
        class243 var5 = class243.method3377(this.method180());
        class326 var6 = var5.method4052(false);
        if (var6 == null) {
            this.field142 = 0;
            this.field148 = 0;
        } else {
            this.field142 = var6.field3870;
            this.field148 = var6.field3872;
        }
    }

    @ObfuscatedName("z.c(I)I")
    public int method180() {
        return this.field144;
    }

    @ObfuscatedName("z.t(B)Laz;")
    public class29 method181() {
        return this.field147;
    }

    @ObfuscatedName("z.o(S)I")
    public int method182() {
        return this.field142;
    }

    @ObfuscatedName("z.e(B)I")
    public int method183() {
        return this.field148;
    }
}
