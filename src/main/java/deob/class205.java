package deob;

@ObfuscatedName("gg")
public class class205 {

    @ObfuscatedName("gg.n")
    public final int field3047;

    @ObfuscatedName("gg.d")
    public final long field3045;

    @ObfuscatedName("gg.z")
    public final class211 field3050;

    @ObfuscatedName("gg.y")
    public String field3046;

    @ObfuscatedName("gg.e")
    public String field3048;

    public class205(class111 arg0, byte arg1, int arg2) {
        this.field3046 = arg0.method2290();
        this.field3048 = arg0.method2290();
        this.field3047 = arg0.method2231();
        this.field3045 = arg0.method2412();
        int var4 = arg0.method2233();
        int var5 = arg0.method2233();
        this.field3050 = new class211();
        this.field3050.method3630(2);
        this.field3050.method3631(arg1);
        this.field3050.field3068 = var4;
        this.field3050.field3066 = var5;
        this.field3050.field3070 = 0;
        this.field3050.field3069 = 0;
        this.field3050.field3071 = arg2;
    }

    @ObfuscatedName("gg.n(I)Ljava/lang/String;")
    public String method3595() {
        return this.field3046;
    }

    @ObfuscatedName("gg.d(B)Ljava/lang/String;")
    public String method3588() {
        return this.field3048;
    }
}
