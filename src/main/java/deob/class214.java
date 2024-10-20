package deob;

@ObfuscatedName("hq")
public class class214 {

    @ObfuscatedName("hq.f")
    public final int field3139;

    @ObfuscatedName("hq.s")
    public final long field3138;

    @ObfuscatedName("hq.q")
    public final class220 field3137;

    @ObfuscatedName("hq.g")
    public String field3140;

    @ObfuscatedName("hq.m")
    public String field3141;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3140 = arg0.method2365();
        this.field3141 = arg0.method2365();
        this.field3139 = arg0.method2353();
        this.field3138 = arg0.method2398();
        int var4 = arg0.method2368();
        int var5 = arg0.method2368();
        this.field3137 = new class220();
        this.field3137.method3733(2);
        this.field3137.method3734(arg1);
        this.field3137.field3157 = var4;
        this.field3137.field3158 = var5;
        this.field3137.field3159 = 0;
        this.field3137.field3155 = 0;
        this.field3137.field3156 = arg2;
    }

    @ObfuscatedName("hq.f(I)Ljava/lang/String;")
    public String method3698() {
        return this.field3140;
    }

    @ObfuscatedName("hq.s(B)Ljava/lang/String;")
    public String method3694() {
        return this.field3141;
    }
}
