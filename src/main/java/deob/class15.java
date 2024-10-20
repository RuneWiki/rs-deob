package deob;

@ObfuscatedName("t")
public class class15 {

    @ObfuscatedName("t.n")
    public final int field276;

    @ObfuscatedName("t.v")
    public final long field275;

    @ObfuscatedName("t.y")
    public final class17 field277;

    @ObfuscatedName("t.r")
    public String field281;

    @ObfuscatedName("t.h")
    public String field279;

    public class15(class185 arg0, byte arg1, int arg2) {
        this.field281 = arg0.method3030();
        this.field279 = arg0.method3030();
        this.field276 = arg0.method3015();
        this.field275 = arg0.method3027();
        int var4 = arg0.method3026();
        int var5 = arg0.method3026();
        this.field277 = new class17();
        this.field277.method95(2);
        this.field277.method98(arg1);
        this.field277.field291 = var4;
        this.field277.field292 = var5;
        this.field277.field293 = 0;
        this.field277.field294 = 0;
        this.field277.field290 = arg2;
    }

    @ObfuscatedName("t.n(I)Ljava/lang/String;")
    public String method77() {
        return this.field281;
    }

    @ObfuscatedName("t.v(I)Ljava/lang/String;")
    public String method72() {
        return this.field279;
    }
}
