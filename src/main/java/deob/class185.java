package deob;

@ObfuscatedName("gs")
public class class185 implements class182 {

    @ObfuscatedName("gs.a")
    public static final class185 field2284 = new class185(14, 0);

    @ObfuscatedName("gs.t")
    public static final class185 field2285 = new class185(15, 4);

    @ObfuscatedName("gs.n")
    public static final class185 field2286 = new class185(16, -2);

    @ObfuscatedName("gs.q")
    public static final class185 field2287 = new class185(18, -2);

    @ObfuscatedName("gs.v")
    public static final class185 field2288 = new class185(27, 0);

    @ObfuscatedName("gs.l")
    public final int field2289;

    @ObfuscatedName("gs.c")
    public static final class185[] field2290 = new class185[32];

    static {
        class185[] var0 = method73();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2290[var0[var1].field2289] = var0[var1];
        }
    }

    @ObfuscatedName("l.a(I)[Lgs;")
    public static class185[] method73() {
        return new class185[] { field2288, field2285, field2287, field2284, field2286 };
    }

    public class185(int arg0, int arg1) {
        this.field2289 = arg0;
    }
}
