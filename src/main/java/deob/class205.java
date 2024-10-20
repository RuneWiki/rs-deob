package deob;

@ObfuscatedName("gy")
public class class205 {

    @ObfuscatedName("gy.n")
    public final int field3050;

    @ObfuscatedName("gy.g")
    public final long field3049;

    @ObfuscatedName("gy.a")
    public final class211 field3051;

    @ObfuscatedName("gy.m")
    public String field3048;

    @ObfuscatedName("gy.s")
    public String field3052;

    public class205(class111 arg0, byte arg1, int arg2) {
        this.field3048 = arg0.method2223();
        this.field3052 = arg0.method2223();
        this.field3050 = arg0.method2395();
        this.field3049 = arg0.method2221();
        int var4 = arg0.method2366();
        int var5 = arg0.method2366();
        this.field3051 = new class211();
        this.field3051.method3620(2);
        this.field3051.method3640(arg1);
        this.field3051.field3073 = var4;
        this.field3051.field3074 = var5;
        this.field3051.field3075 = 0;
        this.field3051.field3076 = 0;
        this.field3051.field3072 = arg2;
    }

    @ObfuscatedName("gy.n(I)Ljava/lang/String;")
    public String method3574() {
        return this.field3048;
    }

    @ObfuscatedName("gy.g(I)Ljava/lang/String;")
    public String method3575() {
        return this.field3052;
    }
}
