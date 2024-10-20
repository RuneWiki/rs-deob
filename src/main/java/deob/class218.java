package deob;

@ObfuscatedName("hl")
public class class218 {

    @ObfuscatedName("hl.i")
    public final int field3205;

    @ObfuscatedName("hl.h")
    public final long field3208;

    @ObfuscatedName("hl.e")
    public final class224 field3206;

    @ObfuscatedName("hl.g")
    public String field3207;

    @ObfuscatedName("hl.n")
    public String field3204;

    public class218(class123 arg0, byte arg1, int arg2) {
        this.field3207 = arg0.method2412();
        this.field3204 = arg0.method2412();
        this.field3205 = arg0.method2406();
        this.field3208 = arg0.method2426();
        int var4 = arg0.method2409();
        int var5 = arg0.method2409();
        this.field3206 = new class224();
        this.field3206.method3780(2);
        this.field3206.method3786(arg1);
        this.field3206.field3228 = var4;
        this.field3206.field3225 = var5;
        this.field3206.field3229 = 0;
        this.field3206.field3230 = 0;
        this.field3206.field3227 = arg2;
    }

    @ObfuscatedName("hl.i(I)Ljava/lang/String;")
    public String method3730() {
        return this.field3207;
    }

    @ObfuscatedName("hl.h(B)Ljava/lang/String;")
    public String method3731() {
        return this.field3204;
    }
}
