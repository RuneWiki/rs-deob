package deob;

@ObfuscatedName("fp")
public class class169 implements class166 {

    @ObfuscatedName("fp.d")
    public static final class169 field2407 = new class169(14, 0);

    @ObfuscatedName("fp.x")
    public static final class169 field2402 = new class169(15, 4);

    @ObfuscatedName("fp.k")
    public static final class169 field2403 = new class169(16, -2);

    @ObfuscatedName("fp.z")
    public static final class169 field2401 = new class169(18, -2);

    @ObfuscatedName("fp.v")
    public final int field2404;

    @ObfuscatedName("fp.m")
    public static final class169[] field2406 = new class169[32];

    static {
        class169[] var0 = method592();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2406[var0[var1].field2404] = var0[var1];
        }
    }

    @ObfuscatedName("ac.d(I)[Lfp;")
    public static class169[] method592() {
        return new class169[] { field2407, field2402, field2401, field2403 };
    }

    public class169(int arg0, int arg1) {
        this.field2404 = arg0;
    }
}
