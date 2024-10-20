package deob;

@ObfuscatedName("fx")
public class class173 implements class170 {

    @ObfuscatedName("fx.n")
    public static final class173 field2433 = new class173(14, 0);

    @ObfuscatedName("fx.v")
    public static final class173 field2430 = new class173(15, 4);

    @ObfuscatedName("fx.y")
    public static final class173 field2431 = new class173(16, -2);

    @ObfuscatedName("fx.r")
    public static final class173 field2429 = new class173(18, -2);

    @ObfuscatedName("fx.h")
    public final int field2432;

    @ObfuscatedName("fx.d")
    public static final class173[] field2434 = new class173[32];

    static {
        class173[] var0 = new class173[] { field2431, field2429, field2433, field2430 };
        class173[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            field2434[var1[var2].field2432] = var1[var2];
        }
    }

    public class173(int arg0, int arg1) {
        this.field2432 = arg0;
    }
}
