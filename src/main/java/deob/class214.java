package deob;

@ObfuscatedName("hg")
public class class214 {

    @ObfuscatedName("hg.j")
    public final int field3135;

    @ObfuscatedName("hg.m")
    public final long field3137;

    @ObfuscatedName("hg.f")
    public final class220 field3136;

    @ObfuscatedName("hg.l")
    public String field3138;

    @ObfuscatedName("hg.u")
    public String field3134;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3138 = arg0.method2380();
        this.field3134 = arg0.method2380();
        this.field3135 = arg0.method2374();
        this.field3137 = arg0.method2570();
        int var4 = arg0.method2377();
        int var5 = arg0.method2377();
        this.field3136 = new class220();
        this.field3136.method3780(2);
        this.field3136.method3776(arg1);
        this.field3136.field3152 = var4;
        this.field3136.field3153 = var5;
        this.field3136.field3154 = 0;
        this.field3136.field3155 = 0;
        this.field3136.field3151 = arg2;
    }

    @ObfuscatedName("hg.j(I)Ljava/lang/String;")
    public String method3741() {
        return this.field3138;
    }

    @ObfuscatedName("hg.m(B)Ljava/lang/String;")
    public String method3743() {
        return this.field3134;
    }
}
