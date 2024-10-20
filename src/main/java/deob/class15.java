package deob;

@ObfuscatedName("u")
public class class15 {

    @ObfuscatedName("u.d")
    public final int field292;

    @ObfuscatedName("u.z")
    public final long field290;

    @ObfuscatedName("u.n")
    public final class17 field291;

    @ObfuscatedName("u.r")
    public String field294;

    @ObfuscatedName("u.e")
    public String field293;

    public class15(class195 arg0, byte arg1, int arg2) {
        this.field294 = arg0.method3268();
        this.field293 = arg0.method3268();
        this.field292 = arg0.method3269();
        this.field290 = arg0.method3265();
        int var4 = arg0.method3264();
        int var5 = arg0.method3264();
        this.field291 = new class17();
        this.field291.method107(2);
        this.field291.method95(arg1);
        this.field291.field306 = var4;
        this.field291.field314 = var5;
        this.field291.field309 = 0;
        this.field291.field311 = 0;
        this.field291.field307 = arg2;
    }

    @ObfuscatedName("u.d(B)Ljava/lang/String;")
    public String method76() {
        return this.field294;
    }

    @ObfuscatedName("u.z(I)Ljava/lang/String;")
    public String method75() {
        return this.field293;
    }
}
