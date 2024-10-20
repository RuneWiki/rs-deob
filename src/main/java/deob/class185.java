package deob;

@ObfuscatedName("gz")
public class class185 implements class182 {

    @ObfuscatedName("gz.c")
    public static final class185 field2292 = new class185(14, 0);

    @ObfuscatedName("gz.x")
    public static final class185 field2289 = new class185(15, 4);

    @ObfuscatedName("gz.t")
    public static final class185 field2290 = new class185(16, -2);

    @ObfuscatedName("gz.g")
    public static final class185 field2291 = new class185(18, -2);

    @ObfuscatedName("gz.l")
    public static final class185 field2296 = new class185(27, 0);

    @ObfuscatedName("gz.u")
    public final int field2293;

    @ObfuscatedName("gz.j")
    public static final class185[] field2294 = new class185[32];

    static {
        class185[] var0 = method125();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2294[var0[var1].field2293] = var0[var1];
        }
    }

    @ObfuscatedName("s.c(I)[Lgz;")
    public static class185[] method125() {
        return new class185[] { field2291, field2289, field2290, field2292, field2296 };
    }

    public class185(int arg0, int arg1) {
        this.field2293 = arg0;
    }
}
