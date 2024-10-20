package deob;

@ObfuscatedName("io")
public class class241 extends class253 {

    @ObfuscatedName("io.a")
    public final int field2853;

    @ObfuscatedName("io.f")
    public final class248 field2850;

    @ObfuscatedName("io.c")
    public final int field2851;

    @ObfuscatedName("io.x")
    public final int field2852;

    public class241(class294 arg0, class294 arg1, int arg2, class248 arg3) {
        super(arg0, arg1);
        this.field2853 = arg2;
        this.field2850 = arg3;
        class178 var5 = class178.method2234(this.method4330());
        class477 var6 = var5.method3127(false);
        if (var6 == null) {
            this.field2851 = 0;
            this.field2852 = 0;
        } else {
            this.field2851 = var6.field4966;
            this.field2852 = var6.field4958;
        }
    }

    @ObfuscatedName("io.f(I)I")
    public int method4330() {
        return this.field2853;
    }

    @ObfuscatedName("io.c(I)Liz;")
    public class248 method4332() {
        return this.field2850;
    }

    @ObfuscatedName("io.x(I)I")
    public int method4339() {
        return this.field2851;
    }

    @ObfuscatedName("io.h(I)I")
    public int method4342() {
        return this.field2852;
    }
}
