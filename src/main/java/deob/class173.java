package deob;

@ObfuscatedName("fs")
public class class173 implements class170 {

    @ObfuscatedName("fs.g")
    public static final class173 field2314 = new class173(14, 0);

    @ObfuscatedName("fs.r")
    public static final class173 field2311 = new class173(15, 4);

    @ObfuscatedName("fs.e")
    public static final class173 field2312 = new class173(16, -2);

    @ObfuscatedName("fs.q")
    public static final class173 field2313 = new class173(18, -2);

    @ObfuscatedName("fs.c")
    public static final class173 field2316 = new class173(27, 0);

    @ObfuscatedName("fs.l")
    public final int field2315;

    @ObfuscatedName("fs.b")
    public static final class173[] field2310 = new class173[32];

    static {
        class173[] var0 = method71();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2310[var0[var1].field2315] = var0[var1];
        }
    }

    @ObfuscatedName("b.g(B)[Lfs;")
    public static class173[] method71() {
        return new class173[] { field2311, field2316, field2314, field2312, field2313 };
    }

    public class173(int arg0, int arg1) {
        this.field2315 = arg0;
    }
}
