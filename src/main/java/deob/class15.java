package deob;

@ObfuscatedName("c")
public class class15 {

    @ObfuscatedName("c.e")
    public final int field282;

    @ObfuscatedName("c.o")
    public final long field281;

    @ObfuscatedName("c.m")
    public final class17 field283;

    @ObfuscatedName("c.g")
    public String field286;

    @ObfuscatedName("c.d")
    public String field285;

    public class15(class174 arg0, byte arg1, int arg2) {
        this.field286 = arg0.method2899();
        this.field285 = arg0.method2899();
        this.field282 = arg0.method2930();
        this.field281 = arg0.method2897();
        int var4 = arg0.method2896();
        int var5 = arg0.method2896();
        this.field283 = new class17();
        this.field283.method76(2);
        this.field283.method81(arg1);
        this.field283.field303 = var4;
        this.field283.field301 = var5;
        this.field283.field305 = 0;
        this.field283.field302 = 0;
        this.field283.field299 = arg2;
    }

    @ObfuscatedName("c.e(I)Ljava/lang/String;")
    public String method53() {
        return this.field286;
    }

    @ObfuscatedName("c.o(B)Ljava/lang/String;")
    public String method54() {
        return this.field285;
    }
}
