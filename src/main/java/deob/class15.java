package deob;

@ObfuscatedName("k")
public class class15 {

    @ObfuscatedName("k.m")
    public final int field292;

    @ObfuscatedName("k.p")
    public final long field285;

    @ObfuscatedName("k.i")
    public final class17 field286;

    @ObfuscatedName("k.j")
    public String field287;

    @ObfuscatedName("k.v")
    public String field290;

    public class15(class181 arg0, byte arg1, int arg2) {
        this.field287 = arg0.method3021();
        this.field290 = arg0.method3021();
        this.field292 = arg0.method3009();
        this.field285 = arg0.method3018();
        int var4 = arg0.method3017();
        int var5 = arg0.method3017();
        this.field286 = new class17();
        this.field286.method108(2);
        this.field286.method109(arg1);
        this.field286.field300 = var4;
        this.field286.field298 = var5;
        this.field286.field302 = 0;
        this.field286.field303 = 0;
        this.field286.field299 = arg2;
    }

    @ObfuscatedName("k.m(I)Ljava/lang/String;")
    public String method86() {
        return this.field287;
    }

    @ObfuscatedName("k.p(I)Ljava/lang/String;")
    public String method77() {
        return this.field290;
    }
}
