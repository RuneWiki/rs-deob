package deob;

@ObfuscatedName("ip")
public class class236 extends class256 {

    @ObfuscatedName("ip.h")
    public final int field2839;

    @ObfuscatedName("ip.e")
    public final class239 field2834;

    @ObfuscatedName("ip.v")
    public int field2835;

    @ObfuscatedName("ip.x")
    public class251 field2836;

    @ObfuscatedName("ip.m")
    public int field2833;

    @ObfuscatedName("ip.q")
    public int field2838;

    public class236(class297 arg0, class297 arg1, int arg2, class239 arg3) {
        super(arg0, arg1);
        this.field2839 = arg2;
        this.field2834 = arg3;
        this.method4454();
    }

    @ObfuscatedName("ip.h(B)V")
    public void method4454() {
        this.field2835 = class196.method3208(this.field2839).method3560().field2181;
        this.field2836 = this.field2834.method4685(class179.method3153(this.field2835));
        class179 var1 = class179.method3153(this.method4455());
        class481 var2 = var1.method3214(false);
        if (var2 == null) {
            this.field2833 = 0;
            this.field2838 = 0;
        } else {
            this.field2833 = var2.field5011;
            this.field2838 = var2.field5010;
        }
    }

    @ObfuscatedName("ip.e(I)I")
    public int method4455() {
        return this.field2835;
    }

    @ObfuscatedName("ip.v(I)Lii;")
    public class251 method4456() {
        return this.field2836;
    }

    @ObfuscatedName("ip.x(I)I")
    public int method4457() {
        return this.field2833;
    }

    @ObfuscatedName("ip.m(I)I")
    public int method4458() {
        return this.field2838;
    }
}
