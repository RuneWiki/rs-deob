package deob;

@ObfuscatedName("io")
public class class244 extends class256 {

    @ObfuscatedName("io.h")
    public final int field2918;

    @ObfuscatedName("io.e")
    public final class251 field2915;

    @ObfuscatedName("io.v")
    public final int field2916;

    @ObfuscatedName("io.x")
    public final int field2917;

    public class244(class297 arg0, class297 arg1, int arg2, class251 arg3) {
        super(arg0, arg1);
        this.field2918 = arg2;
        this.field2915 = arg3;
        class179 var5 = class179.method3153(this.method4455());
        class481 var6 = var5.method3214(false);
        if (var6 == null) {
            this.field2916 = 0;
            this.field2917 = 0;
        } else {
            this.field2916 = var6.field5011;
            this.field2917 = var6.field5010;
        }
    }

    @ObfuscatedName("io.e(I)I")
    public int method4455() {
        return this.field2918;
    }

    @ObfuscatedName("io.v(I)Lii;")
    public class251 method4456() {
        return this.field2915;
    }

    @ObfuscatedName("io.x(I)I")
    public int method4457() {
        return this.field2916;
    }

    @ObfuscatedName("io.m(I)I")
    public int method4458() {
        return this.field2917;
    }
}
