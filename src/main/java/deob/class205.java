package deob;

@ObfuscatedName("gy")
public class class205 {

    @ObfuscatedName("gy.n")
    public final int field3047;

    @ObfuscatedName("gy.w")
    public final long field3046;

    @ObfuscatedName("gy.i")
    public final class211 field3048;

    @ObfuscatedName("gy.e")
    public String field3049;

    @ObfuscatedName("gy.h")
    public String field3050;

    public class205(class111 arg0, byte arg1, int arg2) {
        this.field3049 = arg0.method2163();
        this.field3050 = arg0.method2163();
        this.field3047 = arg0.method2157();
        this.field3046 = arg0.method2161();
        int var4 = arg0.method2160();
        int var5 = arg0.method2160();
        this.field3048 = new class211();
        this.field3048.method3553(2);
        this.field3048.method3554(arg1);
        this.field3048.field3067 = var4;
        this.field3048.field3070 = var5;
        this.field3048.field3071 = 0;
        this.field3048.field3072 = 0;
        this.field3048.field3068 = arg2;
    }

    @ObfuscatedName("gy.n(I)Ljava/lang/String;")
    public String method3503() {
        return this.field3049;
    }

    @ObfuscatedName("gy.w(I)Ljava/lang/String;")
    public String method3504() {
        return this.field3050;
    }
}
