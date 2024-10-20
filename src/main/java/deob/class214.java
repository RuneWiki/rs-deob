package deob;

@ObfuscatedName("hr")
public class class214 {

    @ObfuscatedName("hr.y")
    public final int field3124;

    @ObfuscatedName("hr.d")
    public final long field3121;

    @ObfuscatedName("hr.g")
    public final class220 field3123;

    @ObfuscatedName("hr.w")
    public String field3120;

    @ObfuscatedName("hr.e")
    public String field3126;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3120 = arg0.method2334();
        this.field3126 = arg0.method2334();
        this.field3124 = arg0.method2525();
        this.field3121 = arg0.method2332();
        int var4 = arg0.method2331();
        int var5 = arg0.method2331();
        this.field3123 = new class220();
        this.field3123.method3669(2);
        this.field3123.method3670(arg1);
        this.field3123.field3144 = var4;
        this.field3123.field3150 = var5;
        this.field3123.field3148 = 0;
        this.field3123.field3149 = 0;
        this.field3123.field3145 = arg2;
    }

    @ObfuscatedName("hr.y(I)Ljava/lang/String;")
    public String method3621() {
        return this.field3120;
    }

    @ObfuscatedName("hr.d(I)Ljava/lang/String;")
    public String method3624() {
        return this.field3126;
    }
}
