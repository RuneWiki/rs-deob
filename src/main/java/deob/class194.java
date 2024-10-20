package deob;

@ObfuscatedName("gb")
public class class194 implements class191 {

    @ObfuscatedName("gb.x")
    public static final class194 field2316 = new class194(14, 0);

    @ObfuscatedName("gb.m")
    public static final class194 field2312 = new class194(15, 4);

    @ObfuscatedName("gb.k")
    public static final class194 field2318 = new class194(16, -2);

    @ObfuscatedName("gb.d")
    public static final class194 field2314 = new class194(18, -2);

    @ObfuscatedName("gb.w")
    public static final class194 field2315 = new class194(19, -2);

    @ObfuscatedName("gb.v")
    public static final class194 field2320 = new class194(27, 0);

    @ObfuscatedName("gb.q")
    public final int field2317;

    @ObfuscatedName("gb.z")
    public static final class194[] field2311 = new class194[32];

    static {
        class194[] var0 = method741();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2311[var0[var1].field2317] = var0[var1];
        }
    }

    @ObfuscatedName("aw.x(I)[Lgb;")
    public static class194[] method741() {
        return new class194[] { field2316, field2314, field2318, field2320, field2315, field2312 };
    }

    public class194(int arg0, int arg1) {
        this.field2317 = arg0;
    }
}
