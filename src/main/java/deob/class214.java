package deob;

@ObfuscatedName("hh")
public class class214 {

    @ObfuscatedName("hh.o")
    public final int field3135;

    @ObfuscatedName("hh.f")
    public final long field3138;

    @ObfuscatedName("hh.i")
    public final class220 field3136;

    @ObfuscatedName("hh.h")
    public String field3134;

    @ObfuscatedName("hh.q")
    public String field3137;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3134 = arg0.method2344();
        this.field3137 = arg0.method2344();
        this.field3135 = arg0.method2292();
        this.field3138 = arg0.method2422();
        int var4 = arg0.method2295();
        int var5 = arg0.method2295();
        this.field3136 = new class220();
        this.field3136.method3690(2);
        this.field3136.method3691(arg1);
        this.field3136.field3161 = var4;
        this.field3136.field3157 = var5;
        this.field3136.field3158 = 0;
        this.field3136.field3159 = 0;
        this.field3136.field3155 = arg2;
    }

    @ObfuscatedName("hh.o(I)Ljava/lang/String;")
    public String method3644() {
        return this.field3134;
    }

    @ObfuscatedName("hh.f(B)Ljava/lang/String;")
    public String method3641() {
        return this.field3137;
    }
}
