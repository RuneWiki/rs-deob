package deob;

@ObfuscatedName("ln")
public class class287 implements class282 {

    @ObfuscatedName("ln.aj")
    public static final class287 field3291 = new class287(14, 0);

    @ObfuscatedName("ln.al")
    public static final class287 field3286 = new class287(15, 4);

    @ObfuscatedName("ln.ac")
    public static final class287 field3289 = new class287(16, -2);

    @ObfuscatedName("ln.ab")
    public static final class287 field3287 = new class287(18, -2);

    @ObfuscatedName("ln.an")
    public static final class287 field3290 = new class287(19, -2);

    @ObfuscatedName("ln.ao")
    public static final class287 field3285 = new class287(27, 0);

    @ObfuscatedName("ln.av")
    public final int field3288;

    @ObfuscatedName("ln.aq")
    public static final class287[] field3292 = new class287[32];

    static {
        class287[] var0 = method4542();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3292[var0[var1].field3288] = var0[var1];
        }
    }

    @ObfuscatedName("jw.aj(B)[Lln;")
    public static class287[] method4542() {
        return new class287[] { field3286, field3287, field3285, field3289, field3290, field3291 };
    }

    public class287(int arg0, int arg1) {
        this.field3288 = arg0;
    }
}
