package deob;

@ObfuscatedName("l")
public class class8 {

    @ObfuscatedName("l.m")
    public final int field40;

    @ObfuscatedName("l.f")
    public final long field39;

    @ObfuscatedName("l.q")
    public final class10 field41;

    @ObfuscatedName("l.w")
    public String field42;

    @ObfuscatedName("l.o")
    public String field43;

    public class8(class202 arg0, byte arg1, int arg2) {
        this.field42 = arg0.method3426();
        this.field43 = arg0.method3426();
        this.field40 = arg0.method3530();
        this.field39 = arg0.method3423();
        int var4 = arg0.method3620();
        int var5 = arg0.method3620();
        this.field41 = new class10();
        this.field41.method89(2);
        this.field41.method90(arg1);
        this.field41.field51 = var4;
        this.field41.field52 = var5;
        this.field41.field55 = 0;
        this.field41.field54 = 0;
        this.field41.field58 = arg2;
    }

    @ObfuscatedName("l.m(I)Ljava/lang/String;")
    public String method61() {
        return this.field42;
    }

    @ObfuscatedName("l.f(I)Ljava/lang/String;")
    public String method62() {
        return this.field43;
    }
}
