package deob;

@ObfuscatedName("hp")
public class class218 {

    @ObfuscatedName("hp.k")
    public final int field3198;

    @ObfuscatedName("hp.q")
    public final long field3200;

    @ObfuscatedName("hp.f")
    public final class224 field3199;

    @ObfuscatedName("hp.c")
    public String field3201;

    @ObfuscatedName("hp.v")
    public String field3202;

    public class218(class123 arg0, byte arg1, int arg2) {
        this.field3201 = arg0.method2435();
        this.field3202 = arg0.method2435();
        this.field3198 = arg0.method2547();
        this.field3200 = arg0.method2560();
        int var4 = arg0.method2432();
        int var5 = arg0.method2432();
        this.field3199 = new class224();
        this.field3199.method3771(2);
        this.field3199.method3772(arg1);
        this.field3199.field3221 = var4;
        this.field3199.field3222 = var5;
        this.field3199.field3223 = 0;
        this.field3199.field3224 = 0;
        this.field3199.field3219 = arg2;
    }

    @ObfuscatedName("hp.k(I)Ljava/lang/String;")
    public String method3736() {
        return this.field3201;
    }

    @ObfuscatedName("hp.q(B)Ljava/lang/String;")
    public String method3735() {
        return this.field3202;
    }
}
