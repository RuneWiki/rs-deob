package deob;

@ObfuscatedName("he")
public class class214 {

    @ObfuscatedName("he.n")
    public final int field3145;

    @ObfuscatedName("he.q")
    public final long field3144;

    @ObfuscatedName("he.c")
    public final class220 field3149;

    @ObfuscatedName("he.l")
    public String field3147;

    @ObfuscatedName("he.r")
    public String field3148;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3147 = arg0.method2368();
        this.field3148 = arg0.method2368();
        this.field3145 = arg0.method2430();
        this.field3144 = arg0.method2423();
        int var4 = arg0.method2365();
        int var5 = arg0.method2365();
        this.field3149 = new class220();
        this.field3149.method3725(2);
        this.field3149.method3726(arg1);
        this.field3149.field3161 = var4;
        this.field3149.field3164 = var5;
        this.field3149.field3159 = 0;
        this.field3149.field3162 = 0;
        this.field3149.field3160 = arg2;
    }

    @ObfuscatedName("he.n(I)Ljava/lang/String;")
    public String method3685() {
        return this.field3147;
    }

    @ObfuscatedName("he.q(S)Ljava/lang/String;")
    public String method3681() {
        return this.field3148;
    }
}
