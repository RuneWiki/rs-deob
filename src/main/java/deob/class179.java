package deob;

@ObfuscatedName("fm")
public class class179 implements class176 {

    @ObfuscatedName("fm.f")
    public static final class179 field2283 = new class179(14, 0);

    @ObfuscatedName("fm.i")
    public static final class179 field2289 = new class179(15, 4);

    @ObfuscatedName("fm.y")
    public static final class179 field2286 = new class179(16, -2);

    @ObfuscatedName("fm.w")
    public static final class179 field2284 = new class179(18, -2);

    @ObfuscatedName("fm.p")
    public static final class179 field2285 = new class179(27, 0);

    @ObfuscatedName("fm.b")
    public final int field2281;

    @ObfuscatedName("fm.e")
    public static final class179[] field2287 = new class179[32];

    static {
        class179[] var0 = new class179[] { field2289, field2286, field2283, field2284, field2285 };
        class179[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            field2287[var1[var2].field2281] = var1[var2];
        }
    }

    public class179(int arg0, int arg1) {
        this.field2281 = arg0;
    }
}
