package deob;

@ObfuscatedName("gl")
public class class190 implements class187 {

    @ObfuscatedName("gl.m")
    public static final class190 field2337 = new class190(14, 0);

    @ObfuscatedName("gl.f")
    public static final class190 field2333 = new class190(15, 4);

    @ObfuscatedName("gl.q")
    public static final class190 field2335 = new class190(16, -2);

    @ObfuscatedName("gl.w")
    public static final class190 field2334 = new class190(18, -2);

    @ObfuscatedName("gl.o")
    public static final class190 field2336 = new class190(27, 0);

    @ObfuscatedName("gl.u")
    public final int field2338;

    @ObfuscatedName("gl.g")
    public static final class190[] field2339 = new class190[32];

    static {
        class190[] var0 = method276();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2339[var0[var1].field2338] = var0[var1];
        }
    }

    @ObfuscatedName("r.m(I)[Lgl;")
    public static class190[] method276() {
        return new class190[] { field2335, field2334, field2337, field2336, field2333 };
    }

    public class190(int arg0, int arg1) {
        this.field2338 = arg0;
    }
}
