package deob;

@ObfuscatedName("gu")
public class class183 implements class180 {

    @ObfuscatedName("gu.t")
    public static final class183 field2454 = new class183(14, 0);

    @ObfuscatedName("gu.q")
    public static final class183 field2449 = new class183(15, 4);

    @ObfuscatedName("gu.i")
    public static final class183 field2450 = new class183(16, -2);

    @ObfuscatedName("gu.a")
    public static final class183 field2448 = new class183(18, -2);

    @ObfuscatedName("gu.l")
    public final int field2452;

    @ObfuscatedName("gu.b")
    public static final class183[] field2451 = new class183[32];

    static {
        class183[] var0 = method4895();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2451[var0[var1].field2452] = var0[var1];
        }
    }

    @ObfuscatedName("kj.t(I)[Lgu;")
    public static class183[] method4895() {
        return new class183[] { field2454, field2450, field2449, field2448 };
    }

    public class183(int arg0, int arg1) {
        this.field2452 = arg0;
    }
}
