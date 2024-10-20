package deob;

@ObfuscatedName("q")
public class class15 {

    @ObfuscatedName("q.s")
    public final int field282;

    @ObfuscatedName("q.g")
    public final long field278;

    @ObfuscatedName("q.m")
    public final class17 field280;

    @ObfuscatedName("q.h")
    public String field277;

    @ObfuscatedName("q.i")
    public String field281;

    public class15(class185 arg0, byte arg1, int arg2) {
        this.field277 = arg0.method3248();
        this.field281 = arg0.method3248();
        this.field282 = arg0.method3241();
        this.field278 = arg0.method3405();
        int var4 = arg0.method3292();
        int var5 = arg0.method3292();
        this.field280 = new class17();
        this.field280.method101(2);
        this.field280.method97(arg1);
        this.field280.field301 = var4;
        this.field280.field306 = var5;
        this.field280.field300 = 0;
        this.field280.field299 = 0;
        this.field280.field298 = arg2;
    }

    @ObfuscatedName("q.s(I)Ljava/lang/String;")
    public String method74() {
        return this.field277;
    }

    @ObfuscatedName("q.g(I)Ljava/lang/String;")
    public String method81() {
        return this.field281;
    }
}
