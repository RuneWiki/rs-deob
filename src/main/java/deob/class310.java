package deob;

@ObfuscatedName("lo")
public class class310 implements class305 {

    @ObfuscatedName("lo.at")
    public static final class310 field3378 = new class310(14, 0);

    @ObfuscatedName("lo.ah")
    public static final class310 field3379 = new class310(15, 4);

    @ObfuscatedName("lo.ar")
    public static final class310 field3384 = new class310(16, -2);

    @ObfuscatedName("lo.ao")
    public static final class310 field3381 = new class310(18, -2);

    @ObfuscatedName("lo.ab")
    public static final class310 field3380 = new class310(19, -2);

    @ObfuscatedName("lo.au")
    public static final class310 field3383 = new class310(27, 0);

    @ObfuscatedName("lo.aa")
    public final int field3382;

    @ObfuscatedName("lo.ac")
    public static final class310[] field3385 = new class310[32];

    static {
        class310[] var0 = method702();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3385[var0[var1].field3382] = var0[var1];
        }
    }

    @ObfuscatedName("bw.at(B)[Llo;")
    public static class310[] method702() {
        return new class310[] { field3384, field3381, field3383, field3379, field3378, field3380 };
    }

    public class310(int arg0, int arg1) {
        this.field3382 = arg0;
    }
}
