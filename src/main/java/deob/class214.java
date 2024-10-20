package deob;

@ObfuscatedName("hh")
public class class214 {

    @ObfuscatedName("hh.z")
    public final int field3137;

    @ObfuscatedName("hh.q")
    public final long field3136;

    @ObfuscatedName("hh.k")
    public final class220 field3135;

    @ObfuscatedName("hh.f")
    public String field3138;

    @ObfuscatedName("hh.d")
    public String field3139;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3138 = arg0.method2309();
        this.field3139 = arg0.method2309();
        this.field3137 = arg0.method2415();
        this.field3136 = arg0.method2307();
        int var4 = arg0.method2306();
        int var5 = arg0.method2306();
        this.field3135 = new class220();
        this.field3135.method3647(2);
        this.field3135.method3646(arg1);
        this.field3135.field3154 = var4;
        this.field3135.field3155 = var5;
        this.field3135.field3156 = 0;
        this.field3135.field3157 = 0;
        this.field3135.field3152 = arg2;
    }

    @ObfuscatedName("hh.z(I)Ljava/lang/String;")
    public String method3609() {
        return this.field3138;
    }

    @ObfuscatedName("hh.q(B)Ljava/lang/String;")
    public String method3608() {
        return this.field3139;
    }
}
