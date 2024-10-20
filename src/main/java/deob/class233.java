package deob;

@ObfuscatedName("hx")
public class class233 extends class253 {

    @ObfuscatedName("hx.a")
    public final int field2765;

    @ObfuscatedName("hx.f")
    public final class236 field2766;

    @ObfuscatedName("hx.c")
    public int field2764;

    @ObfuscatedName("hx.x")
    public class248 field2767;

    @ObfuscatedName("hx.h")
    public int field2762;

    @ObfuscatedName("hx.j")
    public int field2763;

    public class233(class294 arg0, class294 arg1, int arg2, class236 arg3) {
        super(arg0, arg1);
        this.field2765 = arg2;
        this.field2766 = arg3;
        this.method4334();
    }

    @ObfuscatedName("hx.a(I)V")
    public void method4334() {
        this.field2764 = class194.method2141(this.field2765).method3418().field2110;
        this.field2767 = this.field2766.method4486(class178.method2234(this.field2764));
        class178 var1 = class178.method2234(this.method4330());
        class477 var2 = var1.method3127(false);
        if (var2 == null) {
            this.field2762 = 0;
            this.field2763 = 0;
        } else {
            this.field2762 = var2.field4966;
            this.field2763 = var2.field4958;
        }
    }

    @ObfuscatedName("hx.f(I)I")
    public int method4330() {
        return this.field2764;
    }

    @ObfuscatedName("hx.c(I)Liz;")
    public class248 method4332() {
        return this.field2767;
    }

    @ObfuscatedName("hx.x(I)I")
    public int method4339() {
        return this.field2762;
    }

    @ObfuscatedName("hx.h(I)I")
    public int method4342() {
        return this.field2763;
    }
}
