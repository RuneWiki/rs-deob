package deob;

@ObfuscatedName("gx")
public class class194 implements class191 {

    @ObfuscatedName("gx.m")
    public static final class194 field2353 = new class194(14, 0);

    @ObfuscatedName("gx.o")
    public static final class194 field2351 = new class194(15, 4);

    @ObfuscatedName("gx.q")
    public static final class194 field2348 = new class194(16, -2);

    @ObfuscatedName("gx.j")
    public static final class194 field2349 = new class194(18, -2);

    @ObfuscatedName("gx.p")
    public static final class194 field2346 = new class194(19, -2);

    @ObfuscatedName("gx.g")
    public static final class194 field2347 = new class194(27, 0);

    @ObfuscatedName("gx.n")
    public final int field2352;

    @ObfuscatedName("gx.u")
    public static final class194[] field2350 = new class194[32];

    static {
        class194[] var0 = method3191();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2350[var0[var1].field2352] = var0[var1];
        }
    }

    @ObfuscatedName("ft.m(I)[Lgx;")
    public static class194[] method3191() {
        return new class194[] { field2347, field2348, field2346, field2351, field2353, field2349 };
    }

    public class194(int arg0, int arg1) {
        this.field2352 = arg0;
    }
}
