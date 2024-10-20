package deob;

@ObfuscatedName("q")
public class class8 {

    @ObfuscatedName("q.s")
    public final int field54;

    @ObfuscatedName("q.j")
    public final long field55;

    @ObfuscatedName("q.i")
    public final class10 field49;

    @ObfuscatedName("q.k")
    public String field50;

    @ObfuscatedName("q.u")
    public String field53;

    public class8(class300 arg0, byte arg1, int arg2) {
        this.field50 = arg0.method5150();
        this.field53 = arg0.method5150();
        this.field54 = arg0.method5054();
        this.field55 = arg0.method5221();
        int var4 = arg0.method5056();
        int var5 = arg0.method5056();
        this.field49 = new class10();
        this.field49.method85(2);
        this.field49.method101(arg1);
        this.field49.field63 = var4;
        this.field49.field62 = var5;
        this.field49.field61 = 0;
        this.field49.field66 = 0;
        this.field49.field70 = arg2;
    }

    @ObfuscatedName("q.s(I)Ljava/lang/String;")
    public String method63() {
        return this.field50;
    }

    @ObfuscatedName("q.j(I)Ljava/lang/String;")
    public String method67() {
        return this.field53;
    }
}
