package deob;

@ObfuscatedName("hx")
public class class215 {

    @ObfuscatedName("hx.e")
    public final int field3150;

    @ObfuscatedName("hx.w")
    public final long field3148;

    @ObfuscatedName("hx.f")
    public final class221 field3147;

    @ObfuscatedName("hx.s")
    public String field3149;

    @ObfuscatedName("hx.p")
    public String field3151;

    public class215(class120 arg0, byte arg1, int arg2) {
        this.field3149 = arg0.method2363();
        this.field3151 = arg0.method2363();
        this.field3150 = arg0.method2532();
        this.field3148 = arg0.method2361();
        int var4 = arg0.method2360();
        int var5 = arg0.method2360();
        this.field3147 = new class221();
        this.field3147.method3712(2);
        this.field3147.method3701(arg1);
        this.field3147.field3168 = var4;
        this.field3147.field3171 = var5;
        this.field3147.field3172 = 0;
        this.field3147.field3169 = 0;
        this.field3147.field3170 = arg2;
    }

    @ObfuscatedName("hx.e(I)Ljava/lang/String;")
    public String method3658() {
        return this.field3149;
    }

    @ObfuscatedName("hx.w(I)Ljava/lang/String;")
    public String method3659() {
        return this.field3151;
    }
}
