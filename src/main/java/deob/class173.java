package deob;

@ObfuscatedName("fn")
public class class173 implements class170 {

    @ObfuscatedName("fn.f")
    public static final class173 field2320 = new class173(14, 0);

    @ObfuscatedName("fn.l")
    public static final class173 field2318 = new class173(15, 4);

    @ObfuscatedName("fn.w")
    public static final class173 field2314 = new class173(16, -2);

    @ObfuscatedName("fn.s")
    public static final class173 field2315 = new class173(18, -2);

    @ObfuscatedName("fn.e")
    public final int field2316;

    @ObfuscatedName("fn.a")
    public static final class173[] field2317 = new class173[32];

    static {
        class173[] var0 = new class173[] { field2315, field2320, field2314, field2318 };
        class173[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            field2317[var1[var2].field2316] = var1[var2];
        }
    }

    public class173(int arg0, int arg1) {
        this.field2316 = arg0;
    }
}
