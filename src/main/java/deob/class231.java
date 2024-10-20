package deob;

@ObfuscatedName("hy")
public class class231 extends class243 {

    @ObfuscatedName("hy.s")
    public final int field2780;

    @ObfuscatedName("hy.h")
    public final class238 field2777;

    @ObfuscatedName("hy.w")
    public final int field2778;

    @ObfuscatedName("hy.v")
    public final int field2776;

    public class231(class290 arg0, class290 arg1, int arg2, class238 arg3) {
        super(arg0, arg1);
        this.field2780 = arg2;
        this.field2777 = arg3;
        class171 var5 = class171.method3061(this.method4097());
        class457 var6 = var5.method2961(false);
        if (var6 == null) {
            this.field2778 = 0;
            this.field2776 = 0;
        } else {
            this.field2778 = var6.field4799;
            this.field2776 = var6.field4797;
        }
    }

    @ObfuscatedName("hy.h(B)I")
    public int method4097() {
        return this.field2780;
    }

    @ObfuscatedName("hy.w(B)Liw;")
    public class238 method4100() {
        return this.field2777;
    }

    @ObfuscatedName("hy.v(I)I")
    public int method4114() {
        return this.field2778;
    }

    @ObfuscatedName("hy.c(I)I")
    public int method4102() {
        return this.field2776;
    }
}
