package deob;

@ObfuscatedName("hv")
public class class214 {

    @ObfuscatedName("hv.m")
    public final int field3126;

    @ObfuscatedName("hv.l")
    public final long field3121;

    @ObfuscatedName("hv.y")
    public final class220 field3122;

    @ObfuscatedName("hv.u")
    public String field3123;

    @ObfuscatedName("hv.k")
    public String field3120;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3123 = arg0.method2389();
        this.field3120 = arg0.method2389();
        this.field3126 = arg0.method2541();
        this.field3121 = arg0.method2387();
        int var4 = arg0.method2386();
        int var5 = arg0.method2386();
        this.field3122 = new class220();
        this.field3122.method3789(2);
        this.field3122.method3790(arg1);
        this.field3122.field3149 = var4;
        this.field3122.field3146 = var5;
        this.field3122.field3148 = 0;
        this.field3122.field3144 = 0;
        this.field3122.field3145 = arg2;
    }

    @ObfuscatedName("hv.m(B)Ljava/lang/String;")
    public String method3739() {
        return this.field3123;
    }

    @ObfuscatedName("hv.l(I)Ljava/lang/String;")
    public String method3740() {
        return this.field3120;
    }
}
