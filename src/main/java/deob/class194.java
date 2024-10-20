package deob;

@ObfuscatedName("gv")
public class class194 implements class191 {

    @ObfuscatedName("gv.n")
    public static final class194 field2343 = new class194(14, 0);

    @ObfuscatedName("gv.v")
    public static final class194 field2340 = new class194(15, 4);

    @ObfuscatedName("gv.d")
    public static final class194 field2337 = new class194(16, -2);

    @ObfuscatedName("gv.c")
    public static final class194 field2339 = new class194(18, -2);

    @ObfuscatedName("gv.y")
    public static final class194 field2338 = new class194(19, -2);

    @ObfuscatedName("gv.h")
    public static final class194 field2341 = new class194(27, 0);

    @ObfuscatedName("gv.z")
    public final int field2336;

    @ObfuscatedName("gv.e")
    public static final class194[] field2342 = new class194[32];

    static {
        class194[] var0 = method1079();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2342[var0[var1].field2336] = var0[var1];
        }
    }

    @ObfuscatedName("bh.n(I)[Lgv;")
    public static class194[] method1079() {
        return new class194[] { field2341, field2340, field2343, field2339, field2337, field2338 };
    }

    public class194(int arg0, int arg1) {
        this.field2336 = arg0;
    }
}
