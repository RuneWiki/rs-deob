package deob;

@ObfuscatedName("fh")
public class class173 implements class170 {

    @ObfuscatedName("fh.a")
    public static final class173 field2412 = new class173(14, 0);

    @ObfuscatedName("fh.w")
    public static final class173 field2419 = new class173(15, 4);

    @ObfuscatedName("fh.e")
    public static final class173 field2417 = new class173(16, -2);

    @ObfuscatedName("fh.k")
    public static final class173 field2414 = new class173(18, -2);

    @ObfuscatedName("fh.u")
    public final int field2415;

    @ObfuscatedName("fh.z")
    public static final class173[] field2416 = new class173[32];

    static {
        class173[] var0 = new class173[] { field2417, field2414, field2419, field2412 };
        class173[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            field2416[var1[var2].field2415] = var1[var2];
        }
    }

    public class173(int arg0, int arg1) {
        this.field2415 = arg0;
    }
}
