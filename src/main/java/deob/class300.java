package deob;

@ObfuscatedName("lx")
public class class300 implements class295 {

    @ObfuscatedName("lx.aw")
    public static final class300 field3342 = new class300(14, 0);

    @ObfuscatedName("lx.ay")
    public static final class300 field3341 = new class300(15, 4);

    @ObfuscatedName("lx.ar")
    public static final class300 field3343 = new class300(16, -2);

    @ObfuscatedName("lx.am")
    public static final class300 field3344 = new class300(18, -2);

    @ObfuscatedName("lx.as")
    public static final class300 field3346 = new class300(19, -2);

    @ObfuscatedName("lx.aj")
    public static final class300 field3345 = new class300(27, 0);

    @ObfuscatedName("lx.ag")
    public final int field3340;

    @ObfuscatedName("lx.az")
    public static final class300[] field3347 = new class300[32];

    static {
        class300[] var0 = method2946();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3347[var0[var1].field3340] = var0[var1];
        }
    }

    @ObfuscatedName("fj.aw(I)[Llx;")
    public static class300[] method2946() {
        return new class300[] { field3345, field3346, field3341, field3342, field3344, field3343 };
    }

    public class300(int arg0, int arg1) {
        this.field3340 = arg0;
    }
}
