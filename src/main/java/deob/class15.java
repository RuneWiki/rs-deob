package deob;

@ObfuscatedName("l")
public class class15 {

    @ObfuscatedName("l.c")
    public final int field274;

    @ObfuscatedName("l.i")
    public final long field279;

    @ObfuscatedName("l.o")
    public final class17 field275;

    @ObfuscatedName("l.j")
    public String field276;

    @ObfuscatedName("l.k")
    public String field277;

    public class15(class195 arg0, byte arg1, int arg2) {
        this.field276 = arg0.method3427();
        this.field277 = arg0.method3427();
        this.field274 = arg0.method3218();
        this.field279 = arg0.method3231();
        int var4 = arg0.method3230();
        int var5 = arg0.method3230();
        this.field275 = new class17();
        this.field275.method104(2);
        this.field275.method105(arg1);
        this.field275.field291 = var4;
        this.field275.field287 = var5;
        this.field275.field288 = 0;
        this.field275.field284 = 0;
        this.field275.field285 = arg2;
    }

    @ObfuscatedName("l.c(I)Ljava/lang/String;")
    public String method82() {
        return this.field276;
    }

    @ObfuscatedName("l.i(I)Ljava/lang/String;")
    public String method78() {
        return this.field277;
    }
}
