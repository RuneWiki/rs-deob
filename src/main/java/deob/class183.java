package deob;

@ObfuscatedName("gn")
public class class183 implements class180 {

    @ObfuscatedName("gn.c")
    public static final class183 field2478 = new class183(14, 0);

    @ObfuscatedName("gn.i")
    public static final class183 field2475 = new class183(15, 4);

    @ObfuscatedName("gn.o")
    public static final class183 field2476 = new class183(16, -2);

    @ObfuscatedName("gn.j")
    public static final class183 field2474 = new class183(18, -2);

    @ObfuscatedName("gn.k")
    public final int field2477;

    @ObfuscatedName("gn.x")
    public static final class183[] field2479 = new class183[32];

    static {
        class183[] var0 = method2979();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2479[var0[var1].field2477] = var0[var1];
        }
    }

    @ObfuscatedName("fs.c(I)[Lgn;")
    public static class183[] method2979() {
        return new class183[] { field2478, field2475, field2474, field2476 };
    }

    public class183(int arg0, int arg1) {
        this.field2477 = arg0;
    }
}
