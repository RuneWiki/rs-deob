package deob;

@ObfuscatedName("ge")
public class class205 {

    @ObfuscatedName("ge.p")
    public final int field3052;

    @ObfuscatedName("ge.k")
    public final long field3049;

    @ObfuscatedName("ge.e")
    public final class211 field3050;

    @ObfuscatedName("ge.f")
    public String field3051;

    @ObfuscatedName("ge.w")
    public String field3056;

    public class205(class111 arg0, byte arg1, int arg2) {
        this.field3051 = arg0.method2265();
        this.field3056 = arg0.method2265();
        this.field3052 = arg0.method2177();
        this.field3049 = arg0.method2181();
        int var4 = arg0.method2350();
        int var5 = arg0.method2350();
        this.field3050 = new class211();
        this.field3050.method3604(2);
        this.field3050.method3605(arg1);
        this.field3050.field3071 = var4;
        this.field3050.field3073 = var5;
        this.field3050.field3075 = 0;
        this.field3050.field3076 = 0;
        this.field3050.field3072 = arg2;
    }

    @ObfuscatedName("ge.p(I)Ljava/lang/String;")
    public String method3568() {
        return this.field3051;
    }

    @ObfuscatedName("ge.k(I)Ljava/lang/String;")
    public String method3567() {
        return this.field3056;
    }
}
