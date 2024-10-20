package deob;

@ObfuscatedName("l")
public class class15 {

    @ObfuscatedName("l.o")
    public final int field296;

    @ObfuscatedName("l.k")
    public final long field293;

    @ObfuscatedName("l.t")
    public final class17 field292;

    @ObfuscatedName("l.d")
    public String field295;

    @ObfuscatedName("l.h")
    public String field294;

    public class15(class195 arg0, byte arg1, int arg2) {
        this.field295 = arg0.method3284();
        this.field294 = arg0.method3284();
        this.field296 = arg0.method3207();
        this.field293 = arg0.method3211();
        int var4 = arg0.method3254();
        int var5 = arg0.method3254();
        this.field292 = new class17();
        this.field292.method98(2);
        this.field292.method93(arg1);
        this.field292.field317 = var4;
        this.field292.field310 = var5;
        this.field292.field311 = 0;
        this.field292.field312 = 0;
        this.field292.field307 = arg2;
    }

    @ObfuscatedName("l.o(B)Ljava/lang/String;")
    public String method70() {
        return this.field295;
    }

    @ObfuscatedName("l.k(I)Ljava/lang/String;")
    public String method68() {
        return this.field294;
    }
}
