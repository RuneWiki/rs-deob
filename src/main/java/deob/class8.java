package deob;

@ObfuscatedName("z")
public class class8 {

    @ObfuscatedName("z.n")
    public final int field48;

    @ObfuscatedName("z.h")
    public final long field49;

    @ObfuscatedName("z.l")
    public final class10 field55;

    @ObfuscatedName("z.g")
    public String field51;

    @ObfuscatedName("z.b")
    public String field52;

    public class8(class190 arg0, byte arg1, int arg2) {
        this.field51 = arg0.method3520();
        this.field52 = arg0.method3520();
        this.field48 = arg0.method3513();
        this.field49 = arg0.method3517();
        int var4 = arg0.method3562();
        int var5 = arg0.method3562();
        this.field55 = new class10();
        this.field55.method88(2);
        this.field55.method89(arg1);
        this.field55.field63 = var4;
        this.field55.field64 = var5;
        this.field55.field65 = 0;
        this.field55.field61 = 0;
        this.field55.field67 = arg2;
    }

    @ObfuscatedName("z.n(B)Ljava/lang/String;")
    public String method64() {
        return this.field51;
    }

    @ObfuscatedName("z.h(I)Ljava/lang/String;")
    public String method57() {
        return this.field52;
    }
}
