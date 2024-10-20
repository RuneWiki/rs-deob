package deob;

@ObfuscatedName("fi")
public class class173 implements class170 {

    @ObfuscatedName("fi.s")
    public static final class173 field2423 = new class173(14, 0);

    @ObfuscatedName("fi.g")
    public static final class173 field2419 = new class173(15, 4);

    @ObfuscatedName("fi.m")
    public static final class173 field2418 = new class173(16, -2);

    @ObfuscatedName("fi.h")
    public static final class173 field2420 = new class173(18, -2);

    @ObfuscatedName("fi.i")
    public final int field2422;

    @ObfuscatedName("fi.w")
    public static final class173[] field2421 = new class173[32];

    static {
        class173[] var0 = method1022();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2421[var0[var1].field2422] = var0[var1];
        }
    }

    @ObfuscatedName("bd.s(I)[Lfi;")
    public static class173[] method1022() {
        return new class173[] { field2419, field2420, field2423, field2418 };
    }

    public class173(int arg0, int arg1) {
        this.field2422 = arg0;
    }
}
