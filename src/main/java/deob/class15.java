package deob;

@ObfuscatedName("r")
public class class15 {

    @ObfuscatedName("r.j")
    public final int field294;

    @ObfuscatedName("r.h")
    public final long field287;

    @ObfuscatedName("r.f")
    public final class17 field292;

    @ObfuscatedName("r.p")
    public String field289;

    @ObfuscatedName("r.x")
    public String field297;

    public class15(class175 arg0, byte arg1, int arg2) {
        this.field289 = arg0.method2911();
        this.field297 = arg0.method2911();
        this.field294 = arg0.method3023();
        this.field287 = arg0.method2973();
        int var4 = arg0.method2908();
        int var5 = arg0.method2908();
        this.field292 = new class17();
        this.field292.method91(2);
        this.field292.method92(arg1);
        this.field292.field309 = var4;
        this.field292.field310 = var5;
        this.field292.field307 = 0;
        this.field292.field308 = 0;
        this.field292.field304 = arg2;
    }

    @ObfuscatedName("r.j(B)Ljava/lang/String;")
    public String method74() {
        return this.field289;
    }

    @ObfuscatedName("r.h(I)Ljava/lang/String;")
    public String method71() {
        return this.field297;
    }
}
