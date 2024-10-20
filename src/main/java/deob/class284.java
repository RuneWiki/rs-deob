package deob;

@ObfuscatedName("jw")
public class class284 implements class279 {

    @ObfuscatedName("jw.f")
    public static final class284 field3318 = new class284(14, 0);

    @ObfuscatedName("jw.w")
    public static final class284 field3312 = new class284(15, 4);

    @ObfuscatedName("jw.v")
    public static final class284 field3311 = new class284(16, -2);

    @ObfuscatedName("jw.s")
    public static final class284 field3310 = new class284(18, -2);

    @ObfuscatedName("jw.z")
    public static final class284 field3313 = new class284(19, -2);

    @ObfuscatedName("jw.j")
    public static final class284 field3317 = new class284(27, 0);

    @ObfuscatedName("jw.i")
    public final int field3315;

    @ObfuscatedName("jw.n")
    public static final class284[] field3316 = new class284[32];

    static {
        class284[] var0 = method318();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3316[var0[var1].field3315] = var0[var1];
        }
    }

    @ObfuscatedName("e.f(B)[Ljw;")
    public static class284[] method318() {
        return new class284[] { field3310, field3317, field3318, field3311, field3312, field3313 };
    }

    public class284(int arg0, int arg1) {
        this.field3315 = arg0;
    }
}
