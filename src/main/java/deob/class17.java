package deob;

@ObfuscatedName("a")
public class class17 {

    @ObfuscatedName("a.h")
    public final int field69;

    @ObfuscatedName("a.v")
    public final long field70;

    @ObfuscatedName("a.x")
    public final class19 field73;

    @ObfuscatedName("a.w")
    public String field67;

    @ObfuscatedName("a.t")
    public String field68;

    public class17(class311 arg0, byte arg1, int arg2) {
        this.field67 = arg0.method5202();
        this.field68 = arg0.method5202();
        this.field69 = arg0.method5342();
        this.field70 = arg0.method5121();
        int var4 = arg0.method5120();
        int var5 = arg0.method5120();
        this.field73 = new class19();
        this.field73.method149(2);
        this.field73.method154(arg1);
        this.field73.field80 = var4;
        this.field73.field79 = var5;
        this.field73.field82 = 0;
        this.field73.field83 = 0;
        this.field73.field78 = arg2;
    }

    @ObfuscatedName("a.h(I)Ljava/lang/String;")
    public String method134() {
        return this.field67;
    }

    @ObfuscatedName("a.v(B)Ljava/lang/String;")
    public String method129() {
        return this.field68;
    }
}
