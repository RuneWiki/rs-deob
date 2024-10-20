package deob;

@ObfuscatedName("fu")
public class class173 implements class170 {

    @ObfuscatedName("fu.p")
    public static final class173 field2386 = new class173(14, 0);

    @ObfuscatedName("fu.i")
    public static final class173 field2382 = new class173(15, 4);

    @ObfuscatedName("fu.w")
    public static final class173 field2381 = new class173(16, -2);

    @ObfuscatedName("fu.s")
    public static final class173 field2383 = new class173(18, -2);

    @ObfuscatedName("fu.j")
    public final int field2384;

    @ObfuscatedName("fu.a")
    public static final class173[] field2385 = new class173[32];

    static {
        class173[] var0 = new class173[] { field2381, field2382, field2383, field2386 };
        class173[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            field2385[var1[var2].field2384] = var1[var2];
        }
    }

    public class173(int arg0, int arg1) {
        this.field2384 = arg0;
    }
}
