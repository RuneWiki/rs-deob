package deob;

@ObfuscatedName("c")
public class class15 {

    @ObfuscatedName("c.i")
    public final int field292;

    @ObfuscatedName("c.w")
    public final long field287;

    @ObfuscatedName("c.a")
    public final class17 field286;

    @ObfuscatedName("c.t")
    public String field289;

    @ObfuscatedName("c.s")
    public String field293;

    public class15(class174 arg0, byte arg1, int arg2) {
        this.field289 = arg0.method2884();
        this.field293 = arg0.method2884();
        this.field292 = arg0.method2882();
        this.field287 = arg0.method2910();
        int var4 = arg0.method2885();
        int var5 = arg0.method2885();
        this.field286 = new class17();
        this.field286.method81(2);
        this.field286.method84(arg1);
        this.field286.field306 = var4;
        this.field286.field304 = var5;
        this.field286.field307 = 0;
        this.field286.field309 = 0;
        this.field286.field305 = arg2;
    }

    @ObfuscatedName("c.i(I)Ljava/lang/String;")
    public String method58() {
        return this.field289;
    }

    @ObfuscatedName("c.w(B)Ljava/lang/String;")
    public String method70() {
        return this.field293;
    }
}
