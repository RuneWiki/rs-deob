package deob;

@ObfuscatedName("gp")
public class class205 {

    @ObfuscatedName("gp.o")
    public final int field3052;

    @ObfuscatedName("gp.l")
    public final long field3049;

    @ObfuscatedName("gp.g")
    public final class211 field3050;

    @ObfuscatedName("gp.u")
    public String field3051;

    @ObfuscatedName("gp.q")
    public String field3048;

    public class205(class111 arg0, byte arg1, int arg2) {
        this.field3051 = arg0.method2339();
        this.field3048 = arg0.method2339();
        this.field3052 = arg0.method2397();
        this.field3049 = arg0.method2292();
        int var4 = arg0.method2273();
        int var5 = arg0.method2273();
        this.field3050 = new class211();
        this.field3050.method3627(2);
        this.field3050.method3628(arg1);
        this.field3050.field3068 = var4;
        this.field3050.field3073 = var5;
        this.field3050.field3072 = 0;
        this.field3050.field3070 = 0;
        this.field3050.field3071 = arg2;
    }

    @ObfuscatedName("gp.o(B)Ljava/lang/String;")
    public String method3592() {
        return this.field3051;
    }

    @ObfuscatedName("gp.l(I)Ljava/lang/String;")
    public String method3591() {
        return this.field3048;
    }
}
