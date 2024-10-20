package deob;

@ObfuscatedName("gv")
public class class205 {

    @ObfuscatedName("gv.y")
    public final int field3056;

    @ObfuscatedName("gv.k")
    public final long field3055;

    @ObfuscatedName("gv.g")
    public final class211 field3054;

    @ObfuscatedName("gv.n")
    public String field3057;

    @ObfuscatedName("gv.t")
    public String field3058;

    public class205(class111 arg0, byte arg1, int arg2) {
        this.field3057 = arg0.method2170();
        this.field3058 = arg0.method2170();
        this.field3056 = arg0.method2339();
        this.field3055 = arg0.method2166();
        int var4 = arg0.method2165();
        int var5 = arg0.method2165();
        this.field3054 = new class211();
        this.field3054.method3581(2);
        this.field3054.method3580(arg1);
        this.field3054.field3076 = var4;
        this.field3054.field3074 = var5;
        this.field3054.field3071 = 0;
        this.field3054.field3072 = 0;
        this.field3054.field3075 = arg2;
    }

    @ObfuscatedName("gv.y(I)Ljava/lang/String;")
    public String method3526() {
        return this.field3057;
    }

    @ObfuscatedName("gv.k(B)Ljava/lang/String;")
    public String method3519() {
        return this.field3058;
    }
}
