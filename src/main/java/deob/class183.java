package deob;

@ObfuscatedName("gk")
public class class183 implements class180 {

    @ObfuscatedName("gk.g")
    public static final class183 field2466 = new class183(14, 0);

    @ObfuscatedName("gk.e")
    public static final class183 field2467 = new class183(15, 4);

    @ObfuscatedName("gk.b")
    public static final class183 field2471 = new class183(16, -2);

    @ObfuscatedName("gk.z")
    public static final class183 field2469 = new class183(18, -2);

    @ObfuscatedName("gk.n")
    public final int field2470;

    @ObfuscatedName("gk.l")
    public static final class183[] field2468 = new class183[32];

    static {
        class183[] var0 = method176();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2468[var0[var1].field2470] = var0[var1];
        }
    }

    @ObfuscatedName("x.g(I)[Lgk;")
    public static class183[] method176() {
        return new class183[] { field2471, field2466, field2467, field2469 };
    }

    public class183(int arg0, int arg1) {
        this.field2470 = arg0;
    }
}
