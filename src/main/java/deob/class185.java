package deob;

@ObfuscatedName("ge")
public class class185 implements class182 {

    @ObfuscatedName("ge.s")
    public static final class185 field2292 = new class185(14, 0);

    @ObfuscatedName("ge.j")
    public static final class185 field2294 = new class185(15, 4);

    @ObfuscatedName("ge.i")
    public static final class185 field2296 = new class185(16, -2);

    @ObfuscatedName("ge.k")
    public static final class185 field2293 = new class185(18, -2);

    @ObfuscatedName("ge.u")
    public static final class185 field2290 = new class185(27, 0);

    @ObfuscatedName("ge.n")
    public final int field2295;

    @ObfuscatedName("ge.t")
    public static final class185[] field2291 = new class185[32];

    static {
        class185[] var0 = method160();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2291[var0[var1].field2295] = var0[var1];
        }
    }

    @ObfuscatedName("g.s(I)[Lge;")
    public static class185[] method160() {
        return new class185[] { field2292, field2293, field2290, field2296, field2294 };
    }

    public class185(int arg0, int arg1) {
        this.field2295 = arg0;
    }
}
