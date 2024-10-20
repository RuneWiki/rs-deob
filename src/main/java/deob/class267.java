package deob;

@ObfuscatedName("jn")
public class class267 implements class262 {

    @ObfuscatedName("jn.o")
    public static final class267 field3193 = new class267(14, 0);

    @ObfuscatedName("jn.q")
    public static final class267 field3197 = new class267(15, 4);

    @ObfuscatedName("jn.l")
    public static final class267 field3194 = new class267(16, -2);

    @ObfuscatedName("jn.k")
    public static final class267 field3195 = new class267(18, -2);

    @ObfuscatedName("jn.a")
    public static final class267 field3196 = new class267(19, -2);

    @ObfuscatedName("jn.m")
    public static final class267 field3192 = new class267(27, 0);

    @ObfuscatedName("jn.p")
    public final int field3198;

    @ObfuscatedName("jn.s")
    public static final class267[] field3199 = new class267[32];

    static {
        class267[] var0 = method6084();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3199[var0[var1].field3198] = var0[var1];
        }
    }

    @ObfuscatedName("nl.o(I)[Ljn;")
    public static class267[] method6084() {
        return new class267[] { field3196, field3192, field3195, field3197, field3194, field3193 };
    }

    public class267(int arg0, int arg1) {
        this.field3198 = arg0;
    }
}
