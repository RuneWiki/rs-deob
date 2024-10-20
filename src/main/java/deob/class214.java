package deob;

@ObfuscatedName("hq")
public class class214 {

    @ObfuscatedName("hq.k")
    public final int field3144;

    @ObfuscatedName("hq.h")
    public final long field3139;

    @ObfuscatedName("hq.o")
    public final class220 field3140;

    @ObfuscatedName("hq.z")
    public String field3141;

    @ObfuscatedName("hq.c")
    public String field3143;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3141 = arg0.method2337();
        this.field3143 = arg0.method2337();
        this.field3144 = arg0.method2332();
        this.field3139 = arg0.method2483();
        int var4 = arg0.method2415();
        int var5 = arg0.method2415();
        this.field3140 = new class220();
        this.field3140.method3755(2);
        this.field3140.method3756(arg1);
        this.field3140.field3161 = var4;
        this.field3140.field3156 = var5;
        this.field3140.field3159 = 0;
        this.field3140.field3160 = 0;
        this.field3140.field3155 = arg2;
    }

    @ObfuscatedName("hq.k(I)Ljava/lang/String;")
    public String method3713() {
        return this.field3141;
    }

    @ObfuscatedName("hq.h(B)Ljava/lang/String;")
    public String method3714() {
        return this.field3143;
    }
}
