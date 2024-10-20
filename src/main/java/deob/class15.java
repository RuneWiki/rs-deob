package deob;

@ObfuscatedName("o")
public class class15 {

    @ObfuscatedName("o.i")
    public final int field286;

    @ObfuscatedName("o.h")
    public final long field290;

    @ObfuscatedName("o.u")
    public final class17 field287;

    @ObfuscatedName("o.q")
    public String field288;

    @ObfuscatedName("o.g")
    public String field289;

    public class15(class174 arg0, byte arg1, int arg2) {
        this.field288 = arg0.method2938();
        this.field289 = arg0.method2938();
        this.field286 = arg0.method2932();
        this.field290 = arg0.method2949();
        int var4 = arg0.method2927();
        int var5 = arg0.method2927();
        this.field287 = new class17();
        this.field287.method91(2);
        this.field287.method92(arg1);
        this.field287.field300 = var4;
        this.field287.field298 = var5;
        this.field287.field302 = 0;
        this.field287.field301 = 0;
        this.field287.field299 = arg2;
    }

    @ObfuscatedName("o.i(B)Ljava/lang/String;")
    public String method63() {
        return this.field288;
    }

    @ObfuscatedName("o.h(I)Ljava/lang/String;")
    public String method73() {
        return this.field289;
    }
}
