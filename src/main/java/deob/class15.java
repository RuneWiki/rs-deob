package deob;

@ObfuscatedName("y")
public class class15 {

    @ObfuscatedName("y.d")
    public final int field281;

    @ObfuscatedName("y.x")
    public final long field274;

    @ObfuscatedName("y.k")
    public final class17 field275;

    @ObfuscatedName("y.z")
    public String field278;

    @ObfuscatedName("y.v")
    public String field277;

    public class15(class181 arg0, byte arg1, int arg2) {
        this.field278 = arg0.method3045();
        this.field277 = arg0.method3045();
        this.field281 = arg0.method3179();
        this.field274 = arg0.method3134();
        int var4 = arg0.method3041();
        int var5 = arg0.method3041();
        this.field275 = new class17();
        this.field275.method102(2);
        this.field275.method103(arg1);
        this.field275.field293 = var4;
        this.field275.field294 = var5;
        this.field275.field297 = 0;
        this.field275.field298 = 0;
        this.field275.field296 = arg2;
    }

    @ObfuscatedName("y.d(B)Ljava/lang/String;")
    public String method84() {
        return this.field278;
    }

    @ObfuscatedName("y.x(I)Ljava/lang/String;")
    public String method85() {
        return this.field277;
    }
}
