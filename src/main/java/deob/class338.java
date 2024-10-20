package deob;

@ObfuscatedName("lp")
public class class338 {

    @ObfuscatedName("lp.a")
    public final int field4206;

    @ObfuscatedName("lp.f")
    public final long field4205;

    @ObfuscatedName("lp.c")
    public final class339 field4207;

    @ObfuscatedName("lp.x")
    public String field4211;

    @ObfuscatedName("lp.h")
    public String field4209;

    public class338(class464 arg0, byte arg1, int arg2) {
        this.field4211 = arg0.method7725();
        this.field4209 = arg0.method7725();
        this.field4206 = arg0.method7716();
        this.field4205 = arg0.method7721();
        int var4 = arg0.method7720();
        int var5 = arg0.method7720();
        this.field4207 = new class339();
        this.field4207.method5944(2);
        this.field4207.method5938(arg1);
        this.field4207.field4214 = var4;
        this.field4207.field4217 = var5;
        this.field4207.field4216 = 0;
        this.field4207.field4219 = 0;
        this.field4207.field4215 = arg2;
    }

    @ObfuscatedName("lp.a(B)Ljava/lang/String;")
    public String method5924() {
        return this.field4211;
    }

    @ObfuscatedName("lp.f(I)Ljava/lang/String;")
    public String method5925() {
        return this.field4209;
    }
}
