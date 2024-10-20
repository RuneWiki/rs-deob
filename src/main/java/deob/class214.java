package deob;

@ObfuscatedName("hm")
public class class214 {

    @ObfuscatedName("hm.i")
    public final int field3136;

    @ObfuscatedName("hm.v")
    public final long field3137;

    @ObfuscatedName("hm.r")
    public final class220 field3133;

    @ObfuscatedName("hm.n")
    public String field3134;

    @ObfuscatedName("hm.x")
    public String field3135;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3134 = arg0.method2356();
        this.field3135 = arg0.method2356();
        this.field3136 = arg0.method2347();
        this.field3137 = arg0.method2451();
        int var4 = arg0.method2350();
        int var5 = arg0.method2350();
        this.field3133 = new class220();
        this.field3133.method3700(2);
        this.field3133.method3701(arg1);
        this.field3133.field3154 = var4;
        this.field3133.field3155 = var5;
        this.field3133.field3156 = 0;
        this.field3133.field3152 = 0;
        this.field3133.field3153 = arg2;
    }

    @ObfuscatedName("hm.i(I)Ljava/lang/String;")
    public String method3660() {
        return this.field3134;
    }

    @ObfuscatedName("hm.v(I)Ljava/lang/String;")
    public String method3662() {
        return this.field3135;
    }
}
