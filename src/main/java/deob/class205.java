package deob;

@ObfuscatedName("gn")
public class class205 {

    @ObfuscatedName("gn.t")
    public final int field3052;

    @ObfuscatedName("gn.b")
    public final long field3049;

    @ObfuscatedName("gn.p")
    public final class211 field3051;

    @ObfuscatedName("gn.e")
    public String field3050;

    @ObfuscatedName("gn.i")
    public String field3053;

    public class205(class111 arg0, byte arg1, int arg2) {
        this.field3050 = arg0.method2180();
        this.field3053 = arg0.method2180();
        this.field3052 = arg0.method2255();
        this.field3049 = arg0.method2248();
        int var4 = arg0.method2177();
        int var5 = arg0.method2177();
        this.field3051 = new class211();
        this.field3051.method3585(2);
        this.field3051.method3580(arg1);
        this.field3051.field3068 = var4;
        this.field3051.field3071 = var5;
        this.field3051.field3069 = 0;
        this.field3051.field3066 = 0;
        this.field3051.field3067 = arg2;
    }

    @ObfuscatedName("gn.t(I)Ljava/lang/String;")
    public String method3546() {
        return this.field3050;
    }

    @ObfuscatedName("gn.b(I)Ljava/lang/String;")
    public String method3547() {
        return this.field3053;
    }
}
