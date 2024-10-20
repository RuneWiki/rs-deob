package deob;

@ObfuscatedName("hv")
public class class214 {

    @ObfuscatedName("hv.o")
    public final int field3138;

    @ObfuscatedName("hv.e")
    public final long field3139;

    @ObfuscatedName("hv.u")
    public final class220 field3140;

    @ObfuscatedName("hv.b")
    public String field3141;

    @ObfuscatedName("hv.p")
    public String field3142;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3141 = arg0.method2528();
        this.field3142 = arg0.method2528();
        this.field3138 = arg0.method2339();
        this.field3139 = arg0.method2343();
        int var4 = arg0.method2342();
        int var5 = arg0.method2342();
        this.field3140 = new class220();
        this.field3140.method3732(2);
        this.field3140.method3736(arg1);
        this.field3140.field3156 = var4;
        this.field3140.field3160 = var5;
        this.field3140.field3157 = 0;
        this.field3140.field3159 = 0;
        this.field3140.field3155 = arg2;
    }

    @ObfuscatedName("hv.o(I)Ljava/lang/String;")
    public String method3698() {
        return this.field3141;
    }

    @ObfuscatedName("hv.e(I)Ljava/lang/String;")
    public String method3699() {
        return this.field3142;
    }
}
