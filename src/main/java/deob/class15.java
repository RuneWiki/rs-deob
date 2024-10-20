package deob;

@ObfuscatedName("n")
public class class15 {

    @ObfuscatedName("n.p")
    public final int field274;

    @ObfuscatedName("n.i")
    public final long field276;

    @ObfuscatedName("n.w")
    public final class17 field275;

    @ObfuscatedName("n.s")
    public String field279;

    @ObfuscatedName("n.j")
    public String field277;

    public class15(class185 arg0, byte arg1, int arg2) {
        this.field279 = arg0.method3131();
        this.field277 = arg0.method3131();
        this.field274 = arg0.method3124();
        this.field276 = arg0.method3128();
        int var4 = arg0.method3127();
        int var5 = arg0.method3127();
        this.field275 = new class17();
        this.field275.method118(2);
        this.field275.method103(arg1);
        this.field275.field288 = var4;
        this.field275.field292 = var5;
        this.field275.field290 = 0;
        this.field275.field286 = 0;
        this.field275.field287 = arg2;
    }

    @ObfuscatedName("n.p(I)Ljava/lang/String;")
    public String method84() {
        return this.field279;
    }

    @ObfuscatedName("n.i(I)Ljava/lang/String;")
    public String method83() {
        return this.field277;
    }
}
