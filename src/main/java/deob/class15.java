package deob;

@ObfuscatedName("j")
public class class15 {

    @ObfuscatedName("j.b")
    public final int field278;

    @ObfuscatedName("j.s")
    public final long field271;

    @ObfuscatedName("j.r")
    public final class17 field277;

    @ObfuscatedName("j.g")
    public String field273;

    @ObfuscatedName("j.x")
    public String field274;

    public class15(class181 arg0, byte arg1, int arg2) {
        this.field273 = arg0.method2953();
        this.field274 = arg0.method2953();
        this.field278 = arg0.method3081();
        this.field271 = arg0.method2951();
        int var4 = arg0.method2996();
        int var5 = arg0.method2996();
        this.field277 = new class17();
        this.field277.method89(2);
        this.field277.method90(arg1);
        this.field277.field283 = var4;
        this.field277.field284 = var5;
        this.field277.field281 = 0;
        this.field277.field286 = 0;
        this.field277.field282 = arg2;
    }

    @ObfuscatedName("j.b(B)Ljava/lang/String;")
    public String method74() {
        return this.field273;
    }

    @ObfuscatedName("j.s(I)Ljava/lang/String;")
    public String method75() {
        return this.field274;
    }
}
