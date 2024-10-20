package deob;

@ObfuscatedName("hh")
public class class214 {

    @ObfuscatedName("hh.h")
    public final int field3129;

    @ObfuscatedName("hh.q")
    public final long field3125;

    @ObfuscatedName("hh.v")
    public final class220 field3126;

    @ObfuscatedName("hh.n")
    public String field3127;

    @ObfuscatedName("hh.f")
    public String field3128;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3127 = arg0.method2391();
        this.field3128 = arg0.method2391();
        this.field3129 = arg0.method2385();
        this.field3125 = arg0.method2389();
        int var4 = arg0.method2388();
        int var5 = arg0.method2388();
        this.field3126 = new class220();
        this.field3126.method3801(2);
        this.field3126.method3808(arg1);
        this.field3126.field3150 = var4;
        this.field3126.field3153 = var5;
        this.field3126.field3152 = 0;
        this.field3126.field3148 = 0;
        this.field3126.field3149 = arg2;
    }

    @ObfuscatedName("hh.h(S)Ljava/lang/String;")
    public String method3747() {
        return this.field3127;
    }

    @ObfuscatedName("hh.q(I)Ljava/lang/String;")
    public String method3746() {
        return this.field3128;
    }
}
