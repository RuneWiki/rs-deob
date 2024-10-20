package deob;

@ObfuscatedName("gg")
public class class195 {

    @ObfuscatedName("gg.f")
    public final int field2910;

    @ObfuscatedName("gg.k")
    public final long field2911;

    @ObfuscatedName("gg.y")
    public final class201 field2912;

    @ObfuscatedName("gg.e")
    public String field2915;

    @ObfuscatedName("gg.r")
    public String field2913;

    public class195(class108 arg0, byte arg1, int arg2) {
        this.field2915 = arg0.method2275();
        this.field2913 = arg0.method2275();
        this.field2910 = arg0.method2160();
        this.field2911 = arg0.method2201();
        int var4 = arg0.method2256();
        int var5 = arg0.method2256();
        this.field2912 = new class201();
        this.field2912.method3440(2);
        this.field2912.method3437(arg1);
        this.field2912.field2934 = var4;
        this.field2912.field2935 = var5;
        this.field2912.field2932 = 0;
        this.field2912.field2937 = 0;
        this.field2912.field2933 = arg2;
    }

    @ObfuscatedName("gg.f(I)Ljava/lang/String;")
    public String method3405() {
        return this.field2915;
    }

    @ObfuscatedName("gg.k(B)Ljava/lang/String;")
    public String method3403() {
        return this.field2913;
    }
}
