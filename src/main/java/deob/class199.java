package deob;

@ObfuscatedName("gy")
public class class199 extends class219 {

    @ObfuscatedName("gy.v")
    public final int field2222;

    @ObfuscatedName("gy.c")
    public final class202 field2217;

    @ObfuscatedName("gy.i")
    public int field2219;

    @ObfuscatedName("gy.f")
    public class214 field2220;

    @ObfuscatedName("gy.b")
    public int field2218;

    @ObfuscatedName("gy.n")
    public int field2221;

    public class199(class290 arg0, class290 arg1, int arg2, class202 arg3) {
        super(arg0, arg1);
        this.field2222 = arg2;
        this.field2217 = arg3;
        this.method3583();
    }

    @ObfuscatedName("gy.v(I)V")
    public void method3583() {
        this.field2219 = class188.method2828(this.field2222).method3333().field2043;
        this.field2220 = this.field2217.method3723(class172.method2469(this.field2219));
        class172 var1 = class172.method2469(this.method3567());
        class451 var2 = var1.method3051(false);
        if (var2 == null) {
            this.field2218 = 0;
            this.field2221 = 0;
        } else {
            this.field2218 = var2.field4719;
            this.field2221 = var2.field4710;
        }
    }

    @ObfuscatedName("gy.c(I)I")
    public int method3567() {
        return this.field2219;
    }

    @ObfuscatedName("gy.i(B)Lho;")
    public class214 method3585() {
        return this.field2220;
    }

    @ObfuscatedName("gy.f(I)I")
    public int method3565() {
        return this.field2218;
    }

    @ObfuscatedName("gy.b(I)I")
    public int method3569() {
        return this.field2221;
    }
}
