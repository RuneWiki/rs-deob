package deob;

@ObfuscatedName("gs")
public class class183 implements class180 {

    @ObfuscatedName("gs.d")
    public static final class183 field2480 = new class183(14, 0);

    @ObfuscatedName("gs.z")
    public static final class183 field2478 = new class183(15, 4);

    @ObfuscatedName("gs.n")
    public static final class183 field2475 = new class183(16, -2);

    @ObfuscatedName("gs.r")
    public static final class183 field2482 = new class183(18, -2);

    @ObfuscatedName("gs.e")
    public final int field2479;

    @ObfuscatedName("gs.y")
    public static final class183[] field2476 = new class183[32];

    static {
        class183[] var0 = method3156();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2476[var0[var1].field2479] = var0[var1];
        }
    }

    @ObfuscatedName("fk.d(I)[Lgs;")
    public static class183[] method3156() {
        return new class183[] { field2480, field2482, field2475, field2478 };
    }

    public class183(int arg0, int arg1) {
        this.field2479 = arg0;
    }
}
