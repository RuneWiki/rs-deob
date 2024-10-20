package deob;

@ObfuscatedName("hp")
public class class214 {

    @ObfuscatedName("hp.j")
    public final int field3148;

    @ObfuscatedName("hp.l")
    public final long field3144;

    @ObfuscatedName("hp.a")
    public final class220 field3143;

    @ObfuscatedName("hp.i")
    public String field3145;

    @ObfuscatedName("hp.f")
    public String field3147;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3145 = arg0.method2324();
        this.field3147 = arg0.method2324();
        this.field3148 = arg0.method2318();
        this.field3144 = arg0.method2495();
        int var4 = arg0.method2321();
        int var5 = arg0.method2321();
        this.field3143 = new class220();
        this.field3143.method3686(2);
        this.field3143.method3687(arg1);
        this.field3143.field3170 = var4;
        this.field3143.field3168 = var5;
        this.field3143.field3169 = 0;
        this.field3143.field3165 = 0;
        this.field3143.field3166 = arg2;
    }

    @ObfuscatedName("hp.j(B)Ljava/lang/String;")
    public String method3637() {
        return this.field3145;
    }

    @ObfuscatedName("hp.l(B)Ljava/lang/String;")
    public String method3638() {
        return this.field3147;
    }
}
