package deob;

@ObfuscatedName("ge")
public class class185 implements class182 {

    @ObfuscatedName("ge.z")
    public static final class185 field2290 = new class185(14, 0);

    @ObfuscatedName("ge.n")
    public static final class185 field2289 = new class185(15, 4);

    @ObfuscatedName("ge.v")
    public static final class185 field2288 = new class185(16, -2);

    @ObfuscatedName("ge.u")
    public static final class185 field2291 = new class185(18, -2);

    @ObfuscatedName("ge.r")
    public static final class185 field2292 = new class185(27, 0);

    @ObfuscatedName("ge.p")
    public final int field2293;

    @ObfuscatedName("ge.q")
    public static final class185[] field2294 = new class185[32];

    static {
        class185[] var0 = method3318();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2294[var0[var1].field2293] = var0[var1];
        }
    }

    @ObfuscatedName("gs.z(I)[Lge;")
    public static class185[] method3318() {
        return new class185[] { field2288, field2289, field2292, field2291, field2290 };
    }

    public class185(int arg0, int arg1) {
        this.field2293 = arg0;
    }
}
