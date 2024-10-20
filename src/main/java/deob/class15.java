package deob;

@ObfuscatedName("t")
public class class15 {

    @ObfuscatedName("t.c")
    public final int field279;

    @ObfuscatedName("t.o")
    public final long field276;

    @ObfuscatedName("t.i")
    public final class17 field277;

    @ObfuscatedName("t.u")
    public String field278;

    @ObfuscatedName("t.g")
    public String field275;

    public class15(class174 arg0, byte arg1, int arg2) {
        this.field278 = arg0.method2867();
        this.field275 = arg0.method2867();
        this.field279 = arg0.method2861();
        this.field276 = arg0.method2865();
        int var4 = arg0.method2987();
        int var5 = arg0.method2987();
        this.field277 = new class17();
        this.field277.method104(2);
        this.field277.method106(arg1);
        this.field277.field300 = var4;
        this.field277.field305 = var5;
        this.field277.field301 = 0;
        this.field277.field302 = 0;
        this.field277.field298 = arg2;
    }

    @ObfuscatedName("t.c(B)Ljava/lang/String;")
    public String method74() {
        return this.field278;
    }

    @ObfuscatedName("t.o(I)Ljava/lang/String;")
    public String method65() {
        return this.field275;
    }
}
