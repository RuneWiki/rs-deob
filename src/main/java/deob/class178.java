package deob;

@ObfuscatedName("fo")
public class class178 implements class175 {

    @ObfuscatedName("fo.n")
    public static final class178 field2323 = new class178(14, 0);

    @ObfuscatedName("fo.h")
    public static final class178 field2322 = new class178(15, 4);

    @ObfuscatedName("fo.l")
    public static final class178 field2324 = new class178(16, -2);

    @ObfuscatedName("fo.g")
    public static final class178 field2325 = new class178(18, -2);

    @ObfuscatedName("fo.b")
    public static final class178 field2328 = new class178(27, 0);

    @ObfuscatedName("fo.a")
    public final int field2326;

    @ObfuscatedName("fo.c")
    public static final class178[] field2327 = new class178[32];

    static {
        class178[] var0 = method2543();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2327[var0[var1].field2326] = var0[var1];
        }
    }

    @ObfuscatedName("dn.n(B)[Lfo;")
    public static class178[] method2543() {
        return new class178[] { field2325, field2322, field2328, field2323, field2324 };
    }

    public class178(int arg0, int arg1) {
        this.field2326 = arg0;
    }
}
