package deob;

@ObfuscatedName("y")
public class class15 {

    @ObfuscatedName("y.a")
    public final int field282;

    @ObfuscatedName("y.w")
    public final long field279;

    @ObfuscatedName("y.e")
    public final class17 field277;

    @ObfuscatedName("y.k")
    public String field278;

    @ObfuscatedName("y.u")
    public String field280;

    public class15(class185 arg0, byte arg1, int arg2) {
        this.field278 = arg0.method3168();
        this.field280 = arg0.method3168();
        this.field282 = arg0.method3194();
        this.field279 = arg0.method2974();
        int var4 = arg0.method2967();
        int var5 = arg0.method2967();
        this.field277 = new class17();
        this.field277.method88(2);
        this.field277.method84(arg1);
        this.field277.field290 = var4;
        this.field277.field291 = var5;
        this.field277.field295 = 0;
        this.field277.field288 = 0;
        this.field277.field293 = arg2;
    }

    @ObfuscatedName("y.a(I)Ljava/lang/String;")
    public String method61() {
        return this.field278;
    }

    @ObfuscatedName("y.w(B)Ljava/lang/String;")
    public String method67() {
        return this.field280;
    }
}
