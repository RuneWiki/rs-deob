package deob;

@ObfuscatedName("hk")
public class class214 {

    @ObfuscatedName("hk.i")
    public final int field3129;

    @ObfuscatedName("hk.v")
    public final long field3128;

    @ObfuscatedName("hk.f")
    public final class220 field3131;

    @ObfuscatedName("hk.h")
    public String field3127;

    @ObfuscatedName("hk.a")
    public String field3130;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3127 = arg0.method2318();
        this.field3130 = arg0.method2318();
        this.field3129 = arg0.method2312();
        this.field3128 = arg0.method2316();
        int var4 = arg0.method2315();
        int var5 = arg0.method2315();
        this.field3131 = new class220();
        this.field3131.method3699(2);
        this.field3131.method3697(arg1);
        this.field3131.field3154 = var4;
        this.field3131.field3150 = var5;
        this.field3131.field3152 = 0;
        this.field3131.field3155 = 0;
        this.field3131.field3149 = arg2;
    }

    @ObfuscatedName("hk.i(I)Ljava/lang/String;")
    public String method3658() {
        return this.field3127;
    }

    @ObfuscatedName("hk.v(I)Ljava/lang/String;")
    public String method3654() {
        return this.field3130;
    }
}
