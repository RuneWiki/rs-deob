package deob;

@ObfuscatedName("hg")
public class class214 {

    @ObfuscatedName("hg.a")
    public final int field3143;

    @ObfuscatedName("hg.r")
    public final long field3141;

    @ObfuscatedName("hg.f")
    public final class220 field3140;

    @ObfuscatedName("hg.s")
    public String field3142;

    @ObfuscatedName("hg.y")
    public String field3144;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3142 = arg0.method2353();
        this.field3144 = arg0.method2353();
        this.field3143 = arg0.method2347();
        this.field3141 = arg0.method2351();
        int var4 = arg0.method2350();
        int var5 = arg0.method2350();
        this.field3140 = new class220();
        this.field3140.method3745(2);
        this.field3140.method3746(arg1);
        this.field3140.field3165 = var4;
        this.field3140.field3163 = var5;
        this.field3140.field3166 = 0;
        this.field3140.field3168 = 0;
        this.field3140.field3164 = arg2;
    }

    @ObfuscatedName("hg.a(I)Ljava/lang/String;")
    public String method3700() {
        return this.field3142;
    }

    @ObfuscatedName("hg.r(S)Ljava/lang/String;")
    public String method3701() {
        return this.field3144;
    }
}
