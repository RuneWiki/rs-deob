package deob;

@ObfuscatedName("u")
public class class15 {

    @ObfuscatedName("u.t")
    public final int field276;

    @ObfuscatedName("u.q")
    public final long field275;

    @ObfuscatedName("u.i")
    public final class17 field282;

    @ObfuscatedName("u.a")
    public String field274;

    @ObfuscatedName("u.l")
    public String field278;

    public class15(class195 arg0, byte arg1, int arg2) {
        this.field274 = arg0.method3257();
        this.field278 = arg0.method3257();
        this.field276 = arg0.method3238();
        this.field275 = arg0.method3315();
        int var4 = arg0.method3241();
        int var5 = arg0.method3241();
        this.field282 = new class17();
        this.field282.method94(2);
        this.field282.method95(arg1);
        this.field282.field288 = var4;
        this.field282.field294 = var5;
        this.field282.field289 = 0;
        this.field282.field287 = 0;
        this.field282.field286 = arg2;
    }

    @ObfuscatedName("u.t(B)Ljava/lang/String;")
    public String method70() {
        return this.field274;
    }

    @ObfuscatedName("u.q(I)Ljava/lang/String;")
    public String method72() {
        return this.field278;
    }
}
