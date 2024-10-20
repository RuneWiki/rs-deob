package deob;

@ObfuscatedName("gk")
public class class205 {

    @ObfuscatedName("gk.n")
    public final int field3052;

    @ObfuscatedName("gk.o")
    public final long field3055;

    @ObfuscatedName("gk.a")
    public final class211 field3053;

    @ObfuscatedName("gk.w")
    public String field3054;

    @ObfuscatedName("gk.m")
    public String field3051;

    public class205(class111 arg0, byte arg1, int arg2) {
        this.field3054 = arg0.method2242();
        this.field3051 = arg0.method2242();
        this.field3052 = arg0.method2236();
        this.field3055 = arg0.method2240();
        int var4 = arg0.method2239();
        int var5 = arg0.method2239();
        this.field3053 = new class211();
        this.field3053.method3612(2);
        this.field3053.method3625(arg1);
        this.field3053.field3067 = var4;
        this.field3053.field3070 = var5;
        this.field3053.field3071 = 0;
        this.field3053.field3072 = 0;
        this.field3053.field3068 = arg2;
    }

    @ObfuscatedName("gk.n(I)Ljava/lang/String;")
    public String method3569() {
        return this.field3054;
    }

    @ObfuscatedName("gk.o(S)Ljava/lang/String;")
    public String method3570() {
        return this.field3051;
    }
}
