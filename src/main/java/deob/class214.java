package deob;

@ObfuscatedName("hu")
public class class214 {

    @ObfuscatedName("hu.v")
    public final int field3142;

    @ObfuscatedName("hu.f")
    public final long field3141;

    @ObfuscatedName("hu.i")
    public final class220 field3143;

    @ObfuscatedName("hu.d")
    public String field3145;

    @ObfuscatedName("hu.o")
    public String field3144;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3145 = arg0.method2357();
        this.field3144 = arg0.method2357();
        this.field3142 = arg0.method2334();
        this.field3141 = arg0.method2452();
        int var4 = arg0.method2354();
        int var5 = arg0.method2354();
        this.field3143 = new class220();
        this.field3143.method3733(2);
        this.field3143.method3742(arg1);
        this.field3143.field3162 = var4;
        this.field3143.field3164 = var5;
        this.field3143.field3161 = 0;
        this.field3143.field3166 = 0;
        this.field3143.field3163 = arg2;
    }

    @ObfuscatedName("hu.v(B)Ljava/lang/String;")
    public String method3686() {
        return this.field3145;
    }

    @ObfuscatedName("hu.f(I)Ljava/lang/String;")
    public String method3685() {
        return this.field3144;
    }
}
