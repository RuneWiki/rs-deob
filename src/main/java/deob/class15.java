package deob;

@ObfuscatedName("u")
public class class15 {

    @ObfuscatedName("u.d")
    public final int field278;

    @ObfuscatedName("u.q")
    public final long field279;

    @ObfuscatedName("u.x")
    public final class17 field280;

    @ObfuscatedName("u.y")
    public String field281;

    @ObfuscatedName("u.e")
    public String field282;

    public class15(class174 arg0, byte arg1, int arg2) {
        this.field281 = arg0.method2922();
        this.field282 = arg0.method2922();
        this.field278 = arg0.method2916();
        this.field279 = arg0.method2920();
        int var4 = arg0.method2935();
        int var5 = arg0.method2935();
        this.field280 = new class17();
        this.field280.method94(2);
        this.field280.method93(arg1);
        this.field280.field297 = var4;
        this.field280.field293 = var5;
        this.field280.field294 = 0;
        this.field280.field295 = 0;
        this.field280.field292 = arg2;
    }

    @ObfuscatedName("u.d(B)Ljava/lang/String;")
    public String method72() {
        return this.field281;
    }

    @ObfuscatedName("u.q(B)Ljava/lang/String;")
    public String method76() {
        return this.field282;
    }
}
