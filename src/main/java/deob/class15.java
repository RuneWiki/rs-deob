package deob;

@ObfuscatedName("t")
public class class15 {

    @ObfuscatedName("t.a")
    public final int field302;

    @ObfuscatedName("t.j")
    public final long field297;

    @ObfuscatedName("t.n")
    public final class17 field298;

    @ObfuscatedName("t.r")
    public String field300;

    @ObfuscatedName("t.v")
    public String field301;

    public class15(class174 arg0, byte arg1, int arg2) {
        this.field300 = arg0.method2879();
        this.field301 = arg0.method2879();
        this.field302 = arg0.method2873();
        this.field297 = arg0.method2877();
        int var4 = arg0.method2876();
        int var5 = arg0.method2876();
        this.field298 = new class17();
        this.field298.method107(2);
        this.field298.method104(arg1);
        this.field298.field305 = var4;
        this.field298.field311 = var5;
        this.field298.field307 = 0;
        this.field298.field304 = 0;
        this.field298.field303 = arg2;
    }

    @ObfuscatedName("t.a(I)Ljava/lang/String;")
    public String method72() {
        return this.field300;
    }

    @ObfuscatedName("t.j(I)Ljava/lang/String;")
    public String method76() {
        return this.field301;
    }
}
