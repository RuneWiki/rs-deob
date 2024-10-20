package deob;

@ObfuscatedName("mh")
public class class313 implements class308 {

    @ObfuscatedName("mh.am")
    public static final class313 field3422 = new class313(14, 0);

    @ObfuscatedName("mh.ap")
    public static final class313 field3419 = new class313(15, 4);

    @ObfuscatedName("mh.af")
    public static final class313 field3417 = new class313(16, -2);

    @ObfuscatedName("mh.aj")
    public static final class313 field3416 = new class313(18, -2);

    @ObfuscatedName("mh.aq")
    public static final class313 field3415 = new class313(19, -2);

    @ObfuscatedName("mh.ar")
    public static final class313 field3420 = new class313(27, 0);

    @ObfuscatedName("mh.ag")
    public final int field3421;

    @ObfuscatedName("mh.ao")
    public static final class313[] field3418 = new class313[32];

    static {
        class313[] var0 = method6079();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3418[var0[var1].field3421] = var0[var1];
        }
    }

    @ObfuscatedName("nj.am(B)[Lmh;")
    public static class313[] method6079() {
        return new class313[] { field3420, field3416, field3422, field3419, field3417, field3415 };
    }

    public class313(int arg0, int arg1) {
        this.field3421 = arg0;
    }
}
