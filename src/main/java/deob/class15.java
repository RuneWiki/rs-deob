package deob;

@ObfuscatedName("q")
public class class15 {

    @ObfuscatedName("q.w")
    public final int field309;

    @ObfuscatedName("q.o")
    public final long field302;

    @ObfuscatedName("q.x")
    public final class17 field303;

    @ObfuscatedName("q.k")
    public String field304;

    @ObfuscatedName("q.f")
    public String field305;

    public class15(class177 arg0, byte arg1, int arg2) {
        this.field304 = arg0.method2892();
        this.field305 = arg0.method2892();
        this.field309 = arg0.method2886();
        this.field302 = arg0.method2890();
        int var4 = arg0.method2904();
        int var5 = arg0.method2904();
        this.field303 = new class17();
        this.field303.method91(2);
        this.field303.method89(arg1);
        this.field303.field318 = var4;
        this.field303.field319 = var5;
        this.field303.field323 = 0;
        this.field303.field320 = 0;
        this.field303.field317 = arg2;
    }

    @ObfuscatedName("q.w(I)Ljava/lang/String;")
    public String method63() {
        return this.field304;
    }

    @ObfuscatedName("q.o(B)Ljava/lang/String;")
    public String method64() {
        return this.field305;
    }
}
