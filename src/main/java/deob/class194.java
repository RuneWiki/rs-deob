package deob;

@ObfuscatedName("gd")
public class class194 implements class191 {

    @ObfuscatedName("gd.f")
    public static final class194 field2341 = new class194(14, 0);

    @ObfuscatedName("gd.b")
    public static final class194 field2339 = new class194(15, 4);

    @ObfuscatedName("gd.l")
    public static final class194 field2340 = new class194(16, -2);

    @ObfuscatedName("gd.m")
    public static final class194 field2342 = new class194(18, -2);

    @ObfuscatedName("gd.z")
    public static final class194 field2343 = new class194(19, -2);

    @ObfuscatedName("gd.q")
    public static final class194 field2347 = new class194(27, 0);

    @ObfuscatedName("gd.k")
    public final int field2344;

    @ObfuscatedName("gd.c")
    public static final class194[] field2345 = new class194[32];

    static {
        class194[] var0 = method3874();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2345[var0[var1].field2344] = var0[var1];
        }
    }

    @ObfuscatedName("ha.f(I)[Lgd;")
    public static class194[] method3874() {
        return new class194[] { field2343, field2342, field2339, field2347, field2340, field2341 };
    }

    public class194(int arg0, int arg1) {
        this.field2344 = arg0;
    }
}
