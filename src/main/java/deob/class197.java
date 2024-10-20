package deob;

@ObfuscatedName("gy")
public class class197 {

    @ObfuscatedName("gy.b")
    public final int field2935;

    @ObfuscatedName("gy.e")
    public final long field2934;

    @ObfuscatedName("gy.i")
    public final class203 field2936;

    @ObfuscatedName("gy.k")
    public String field2937;

    @ObfuscatedName("gy.h")
    public String field2938;

    public class197(class110 arg0, byte arg1, int arg2) {
        this.field2937 = arg0.method2150();
        this.field2938 = arg0.method2150();
        this.field2935 = arg0.method2292();
        this.field2934 = arg0.method2148();
        int var4 = arg0.method2195();
        int var5 = arg0.method2195();
        this.field2936 = new class203();
        this.field2936.method3472(2);
        this.field2936.method3473(arg1);
        this.field2936.field2954 = var4;
        this.field2936.field2956 = var5;
        this.field2936.field2957 = 0;
        this.field2936.field2958 = 0;
        this.field2936.field2955 = arg2;
    }

    @ObfuscatedName("gy.b(I)Ljava/lang/String;")
    public String method3428() {
        return this.field2937;
    }

    @ObfuscatedName("gy.e(B)Ljava/lang/String;")
    public String method3429() {
        return this.field2938;
    }
}
