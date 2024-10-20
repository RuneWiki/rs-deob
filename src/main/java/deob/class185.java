package deob;

@ObfuscatedName("ge")
public class class185 implements class182 {

    @ObfuscatedName("ge.c")
    public static final class185 field2311 = new class185(14, 0);

    @ObfuscatedName("ge.t")
    public static final class185 field2308 = new class185(15, 4);

    @ObfuscatedName("ge.o")
    public static final class185 field2309 = new class185(16, -2);

    @ObfuscatedName("ge.e")
    public static final class185 field2314 = new class185(18, -2);

    @ObfuscatedName("ge.i")
    public static final class185 field2307 = new class185(27, 0);

    @ObfuscatedName("ge.g")
    public final int field2312;

    @ObfuscatedName("ge.d")
    public static final class185[] field2313 = new class185[32];

    static {
        class185[] var0 = new class185[] { field2311, field2307, field2309, field2314, field2308 };
        class185[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            field2313[var1[var2].field2312] = var1[var2];
        }
    }

    public class185(int arg0, int arg1) {
        this.field2312 = arg0;
    }
}
