package deob;

@ObfuscatedName("hk")
public class class214 {

    @ObfuscatedName("hk.l")
    public final int field3137;

    @ObfuscatedName("hk.e")
    public final long field3136;

    @ObfuscatedName("hk.q")
    public final class220 field3135;

    @ObfuscatedName("hk.o")
    public String field3138;

    @ObfuscatedName("hk.g")
    public String field3139;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3138 = arg0.method2396();
        this.field3139 = arg0.method2396();
        this.field3137 = arg0.method2440();
        this.field3136 = arg0.method2394();
        int var4 = arg0.method2393();
        int var5 = arg0.method2393();
        this.field3135 = new class220();
        this.field3135.method3698(2);
        this.field3135.method3712(arg1);
        this.field3135.field3158 = var4;
        this.field3135.field3159 = var5;
        this.field3135.field3156 = 0;
        this.field3135.field3161 = 0;
        this.field3135.field3160 = arg2;
    }

    @ObfuscatedName("hk.l(I)Ljava/lang/String;")
    public String method3656() {
        return this.field3138;
    }

    @ObfuscatedName("hk.e(I)Ljava/lang/String;")
    public String method3655() {
        return this.field3139;
    }
}
