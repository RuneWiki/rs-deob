package deob;

@ObfuscatedName("im")
public class class244 implements class239 {

    @ObfuscatedName("im.i")
    public static final class244 field2902 = new class244(14, 0);

    @ObfuscatedName("im.w")
    public static final class244 field2898 = new class244(15, 4);

    @ObfuscatedName("im.s")
    public static final class244 field2897 = new class244(16, -2);

    @ObfuscatedName("im.a")
    public static final class244 field2895 = new class244(18, -2);

    @ObfuscatedName("im.o")
    public static final class244 field2901 = new class244(19, -2);

    @ObfuscatedName("im.g")
    public static final class244 field2900 = new class244(27, 0);

    @ObfuscatedName("im.e")
    public final int field2896;

    @ObfuscatedName("im.p")
    public static final class244[] field2899 = new class244[32];

    static {
        class244[] var0 = method4221();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2899[var0[var1].field2896] = var0[var1];
        }
    }

    @ObfuscatedName("ii.i(I)[Lim;")
    public static class244[] method4221() {
        return new class244[] { field2898, field2902, field2901, field2900, field2897, field2895 };
    }

    public class244(int arg0, int arg1) {
        this.field2896 = arg0;
    }
}
