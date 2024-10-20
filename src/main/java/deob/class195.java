package deob;

@ObfuscatedName("gx")
public class class195 {

    @ObfuscatedName("gx.e")
    public final int field2926;

    @ObfuscatedName("gx.v")
    public final long field2923;

    @ObfuscatedName("gx.k")
    public final class201 field2924;

    @ObfuscatedName("gx.g")
    public String field2925;

    @ObfuscatedName("gx.q")
    public String field2922;

    public class195(class108 arg0, byte arg1, int arg2) {
        this.field2925 = arg0.method2130();
        this.field2922 = arg0.method2130();
        this.field2926 = arg0.method2124();
        this.field2923 = arg0.method2192();
        int var4 = arg0.method2127();
        int var5 = arg0.method2127();
        this.field2924 = new class201();
        this.field2924.method3402(2);
        this.field2924.method3393(arg1);
        this.field2924.field2941 = var4;
        this.field2924.field2940 = var5;
        this.field2924.field2943 = 0;
        this.field2924.field2944 = 0;
        this.field2924.field2939 = arg2;
    }

    @ObfuscatedName("gx.e(I)Ljava/lang/String;")
    public String method3360() {
        return this.field2925;
    }

    @ObfuscatedName("gx.v(I)Ljava/lang/String;")
    public String method3361() {
        return this.field2922;
    }
}
