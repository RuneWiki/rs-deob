package deob;

@ObfuscatedName("fa")
public class class173 implements class170 {

    @ObfuscatedName("fa.v")
    public static final class173 field2286 = new class173(14, 0);

    @ObfuscatedName("fa.s")
    public static final class173 field2283 = new class173(15, 4);

    @ObfuscatedName("fa.o")
    public static final class173 field2285 = new class173(16, -2);

    @ObfuscatedName("fa.k")
    public static final class173 field2284 = new class173(18, -2);

    @ObfuscatedName("fa.u")
    public final int field2287;

    @ObfuscatedName("fa.i")
    public static final class173[] field2288 = new class173[32];

    static {
        class173[] var0 = method2956();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2288[var0[var1].field2287] = var0[var1];
        }
    }

    @ObfuscatedName("em.v(B)[Lfa;")
    public static class173[] method2956() {
        return new class173[] { field2286, field2284, field2283, field2285 };
    }

    public class173(int arg0, int arg1) {
        this.field2287 = arg0;
    }
}
