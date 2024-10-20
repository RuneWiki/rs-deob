package deob;

@ObfuscatedName("fd")
public class class182 implements class179 {

    @ObfuscatedName("fd.b")
    public static final class182 field2437 = new class182(14, 0);

    @ObfuscatedName("fd.q")
    public static final class182 field2438 = new class182(15, 4);

    @ObfuscatedName("fd.o")
    public static final class182 field2445 = new class182(16, -2);

    @ObfuscatedName("fd.p")
    public static final class182 field2440 = new class182(18, -2);

    @ObfuscatedName("fd.a")
    public final int field2439;

    @ObfuscatedName("fd.h")
    public static final class182[] field2442 = new class182[32];

    static {
        class182[] var0 = new class182[] { field2438, field2445, field2440, field2437 };
        class182[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            field2442[var1[var2].field2439] = var1[var2];
        }
    }

    public class182(int arg0, int arg1) {
        this.field2439 = arg0;
    }
}
