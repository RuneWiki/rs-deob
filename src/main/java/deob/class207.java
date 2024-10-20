package deob;

@ObfuscatedName("gc")
public class class207 implements class202 {

    @ObfuscatedName("gc.f")
    public static final class207 field2457 = new class207(14, 0);

    @ObfuscatedName("gc.o")
    public static final class207 field2455 = new class207(15, 4);

    @ObfuscatedName("gc.u")
    public static final class207 field2452 = new class207(16, -2);

    @ObfuscatedName("gc.p")
    public static final class207 field2453 = new class207(18, -2);

    @ObfuscatedName("gc.b")
    public static final class207 field2451 = new class207(19, -2);

    @ObfuscatedName("gc.e")
    public static final class207 field2450 = new class207(27, 0);

    @ObfuscatedName("gc.k")
    public final int field2456;

    @ObfuscatedName("gc.g")
    public static final class207[] field2454 = new class207[32];

    static {
        class207[] var0 = method2100();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2454[var0[var1].field2456] = var0[var1];
        }
    }

    @ObfuscatedName("dn.f(B)[Lgc;")
    public static class207[] method2100() {
        return new class207[] { field2450, field2451, field2455, field2453, field2452, field2457 };
    }

    public class207(int arg0, int arg1) {
        this.field2456 = arg0;
    }
}
