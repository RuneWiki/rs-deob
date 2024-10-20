package deob;

@ObfuscatedName("jv")
public class class267 implements class262 {

    @ObfuscatedName("jv.v")
    public static final class267 field3138 = new class267(14, 0);

    @ObfuscatedName("jv.c")
    public static final class267 field3132 = new class267(15, 4);

    @ObfuscatedName("jv.i")
    public static final class267 field3133 = new class267(16, -2);

    @ObfuscatedName("jv.f")
    public static final class267 field3134 = new class267(18, -2);

    @ObfuscatedName("jv.b")
    public static final class267 field3135 = new class267(19, -2);

    @ObfuscatedName("jv.n")
    public static final class267 field3131 = new class267(27, 0);

    @ObfuscatedName("jv.s")
    public final int field3136;

    @ObfuscatedName("jv.l")
    public static final class267[] field3137 = new class267[32];

    static {
        class267[] var0 = method2685();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3137[var0[var1].field3136] = var0[var1];
        }
    }

    @ObfuscatedName("dh.v(B)[Ljv;")
    public static class267[] method2685() {
        return new class267[] { field3138, field3133, field3135, field3132, field3134, field3131 };
    }

    public class267(int arg0, int arg1) {
        this.field3136 = arg0;
    }
}
