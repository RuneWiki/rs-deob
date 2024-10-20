package deob;

@ObfuscatedName("jh")
public class class280 implements class275 {

    @ObfuscatedName("jh.h")
    public static final class280 field3301 = new class280(14, 0);

    @ObfuscatedName("jh.e")
    public static final class280 field3306 = new class280(15, 4);

    @ObfuscatedName("jh.v")
    public static final class280 field3302 = new class280(16, -2);

    @ObfuscatedName("jh.x")
    public static final class280 field3304 = new class280(18, -2);

    @ObfuscatedName("jh.m")
    public static final class280 field3305 = new class280(19, -2);

    @ObfuscatedName("jh.q")
    public static final class280 field3309 = new class280(27, 0);

    @ObfuscatedName("jh.f")
    public final int field3307;

    @ObfuscatedName("jh.r")
    public static final class280[] field3308 = new class280[32];

    static {
        class280[] var0 = method1145();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3308[var0[var1].field3307] = var0[var1];
        }
    }

    @ObfuscatedName("bg.h(I)[Ljh;")
    public static class280[] method1145() {
        return new class280[] { field3301, field3305, field3302, field3306, field3304, field3309 };
    }

    public class280(int arg0, int arg1) {
        this.field3307 = arg0;
    }
}
