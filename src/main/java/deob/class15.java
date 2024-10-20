package deob;

@ObfuscatedName("b")
public class class15 {

    @ObfuscatedName("b.d")
    public final int field298;

    @ObfuscatedName("b.k")
    public final long field290;

    @ObfuscatedName("b.e")
    public final class17 field296;

    @ObfuscatedName("b.p")
    public String field292;

    @ObfuscatedName("b.q")
    public String field293;

    public class15(class174 arg0, byte arg1, int arg2) {
        this.field292 = arg0.method2964();
        this.field293 = arg0.method2964();
        this.field298 = arg0.method3035();
        this.field290 = arg0.method3004();
        int var4 = arg0.method2960();
        int var5 = arg0.method2960();
        this.field296 = new class17();
        this.field296.method110(2);
        this.field296.method96(arg1);
        this.field296.field310 = var4;
        this.field296.field311 = var5;
        this.field296.field312 = 0;
        this.field296.field313 = 0;
        this.field296.field316 = arg2;
    }

    @ObfuscatedName("b.d(I)Ljava/lang/String;")
    public String method73() {
        return this.field292;
    }

    @ObfuscatedName("b.k(I)Ljava/lang/String;")
    public String method77() {
        return this.field293;
    }
}
