package deob;

@ObfuscatedName("fx")
public class class173 implements class170 {

    @ObfuscatedName("fx.y")
    public static final class173 field2286 = new class173(14, 0);

    @ObfuscatedName("fx.c")
    public static final class173 field2279 = new class173(15, 4);

    @ObfuscatedName("fx.n")
    public static final class173 field2280 = new class173(16, -2);

    @ObfuscatedName("fx.u")
    public static final class173 field2281 = new class173(18, -2);

    @ObfuscatedName("fx.i")
    public final int field2278;

    @ObfuscatedName("fx.r")
    public static final class173[] field2282 = new class173[32];

    static {
        class173[] var0 = new class173[] { field2279, field2286, field2280, field2281 };
        class173[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            field2282[var1[var2].field2278] = var1[var2];
        }
    }

    public class173(int arg0, int arg1) {
        this.field2278 = arg0;
    }
}
