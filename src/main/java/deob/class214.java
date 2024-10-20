package deob;

@ObfuscatedName("hh")
public class class214 {

    @ObfuscatedName("hh.h")
    public final int field3134;

    @ObfuscatedName("hh.m")
    public final long field3131;

    @ObfuscatedName("hh.i")
    public final class220 field3132;

    @ObfuscatedName("hh.q")
    public String field3133;

    @ObfuscatedName("hh.p")
    public String field3130;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3133 = arg0.method2350();
        this.field3130 = arg0.method2350();
        this.field3134 = arg0.method2322();
        this.field3131 = arg0.method2325();
        int var4 = arg0.method2324();
        int var5 = arg0.method2324();
        this.field3132 = new class220();
        this.field3132.method3699(2);
        this.field3132.method3710(arg1);
        this.field3132.field3148 = var4;
        this.field3132.field3146 = var5;
        this.field3132.field3150 = 0;
        this.field3132.field3149 = 0;
        this.field3132.field3147 = arg2;
    }

    @ObfuscatedName("hh.h(I)Ljava/lang/String;")
    public String method3659() {
        return this.field3133;
    }

    @ObfuscatedName("hh.m(I)Ljava/lang/String;")
    public String method3657() {
        return this.field3130;
    }
}
