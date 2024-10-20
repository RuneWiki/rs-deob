package deob;

@ObfuscatedName("ho")
public class class215 {

    @ObfuscatedName("ho.f")
    public final int field3150;

    @ObfuscatedName("ho.u")
    public final long field3149;

    @ObfuscatedName("ho.x")
    public final class221 field3148;

    @ObfuscatedName("ho.b")
    public String field3147;

    @ObfuscatedName("ho.l")
    public String field3151;

    public class215(class120 arg0, byte arg1, int arg2) {
        this.field3147 = arg0.method2499();
        this.field3151 = arg0.method2499();
        this.field3150 = arg0.method2387();
        this.field3149 = arg0.method2391();
        int var4 = arg0.method2527();
        int var5 = arg0.method2527();
        this.field3148 = new class221();
        this.field3148.method3748(2);
        this.field3148.method3766(arg1);
        this.field3148.field3170 = var4;
        this.field3148.field3173 = var5;
        this.field3148.field3172 = 0;
        this.field3148.field3171 = 0;
        this.field3148.field3169 = arg2;
    }

    @ObfuscatedName("ho.f(I)Ljava/lang/String;")
    public String method3707() {
        return this.field3147;
    }

    @ObfuscatedName("ho.u(I)Ljava/lang/String;")
    public String method3708() {
        return this.field3151;
    }
}
