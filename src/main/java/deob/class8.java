package deob;

@ObfuscatedName("x")
public class class8 {

    @ObfuscatedName("x.f")
    public final int field37;

    @ObfuscatedName("x.i")
    public final long field39;

    @ObfuscatedName("x.y")
    public final class10 field38;

    @ObfuscatedName("x.w")
    public String field41;

    @ObfuscatedName("x.p")
    public String field40;

    public class8(class300 arg0, byte arg1, int arg2) {
        this.field41 = arg0.method5119();
        this.field40 = arg0.method5119();
        this.field37 = arg0.method5112();
        this.field39 = arg0.method5116();
        int var4 = arg0.method5192();
        int var5 = arg0.method5192();
        this.field38 = new class10();
        this.field38.method79(2);
        this.field38.method80(arg1);
        this.field38.field64 = var4;
        this.field38.field55 = var5;
        this.field38.field56 = 0;
        this.field38.field54 = 0;
        this.field38.field52 = arg2;
    }

    @ObfuscatedName("x.f(I)Ljava/lang/String;")
    public String method64() {
        return this.field41;
    }

    @ObfuscatedName("x.i(I)Ljava/lang/String;")
    public String method61() {
        return this.field40;
    }
}
