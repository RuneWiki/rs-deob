package deob;

@ObfuscatedName("j")
public class class15 {

    @ObfuscatedName("j.i")
    public final int field289;

    @ObfuscatedName("j.c")
    public final long field291;

    @ObfuscatedName("j.e")
    public final class17 field287;

    @ObfuscatedName("j.v")
    public String field294;

    @ObfuscatedName("j.b")
    public String field285;

    public class15(class174 arg0, byte arg1, int arg2) {
        this.field294 = arg0.method2878();
        this.field285 = arg0.method2878();
        this.field289 = arg0.method2872();
        this.field291 = arg0.method2876();
        int var4 = arg0.method2875();
        int var5 = arg0.method2875();
        this.field287 = new class17();
        this.field287.method88(2);
        this.field287.method81(arg1);
        this.field287.field303 = var4;
        this.field287.field300 = var5;
        this.field287.field298 = 0;
        this.field287.field302 = 0;
        this.field287.field297 = arg2;
    }

    @ObfuscatedName("j.i(I)Ljava/lang/String;")
    public String method65() {
        return this.field294;
    }

    @ObfuscatedName("j.c(I)Ljava/lang/String;")
    public String method63() {
        return this.field285;
    }
}
