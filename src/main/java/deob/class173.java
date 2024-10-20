package deob;

@ObfuscatedName("fb")
public class class173 implements class170 {

    @ObfuscatedName("fb.c")
    public static final class173 field2284 = new class173(14, 0);

    @ObfuscatedName("fb.q")
    public static final class173 field2283 = new class173(15, 4);

    @ObfuscatedName("fb.m")
    public static final class173 field2285 = new class173(16, -2);

    @ObfuscatedName("fb.j")
    public static final class173 field2286 = new class173(18, -2);

    @ObfuscatedName("fb.g")
    public final int field2287;

    @ObfuscatedName("fb.i")
    public static final class173[] field2288 = new class173[32];

    static {
        class173[] var0 = new class173[] { field2284, field2286, field2285, field2283 };
        class173[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            field2288[var1[var2].field2287] = var1[var2];
        }
    }

    public class173(int arg0, int arg1) {
        this.field2287 = arg0;
    }
}
