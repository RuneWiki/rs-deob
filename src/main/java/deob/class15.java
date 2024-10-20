package deob;

@ObfuscatedName("s")
public class class15 {

    @ObfuscatedName("s.b")
    public final int field276;

    @ObfuscatedName("s.q")
    public final long field270;

    @ObfuscatedName("s.o")
    public final class17 field272;

    @ObfuscatedName("s.p")
    public String field273;

    @ObfuscatedName("s.a")
    public String field271;

    public class15(class194 arg0, byte arg1, int arg2) {
        this.field273 = arg0.method3256();
        this.field271 = arg0.method3256();
        this.field276 = arg0.method3249();
        this.field270 = arg0.method3253();
        int var4 = arg0.method3261();
        int var5 = arg0.method3261();
        this.field272 = new class17();
        this.field272.method94(2);
        this.field272.method95(arg1);
        this.field272.field292 = var4;
        this.field272.field287 = var5;
        this.field272.field288 = 0;
        this.field272.field289 = 0;
        this.field272.field285 = arg2;
    }

    @ObfuscatedName("s.b(B)Ljava/lang/String;")
    public String method65() {
        return this.field273;
    }

    @ObfuscatedName("s.q(I)Ljava/lang/String;")
    public String method72() {
        return this.field271;
    }
}
