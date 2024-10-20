package deob;

@ObfuscatedName("ga")
public class class183 implements class180 {

    @ObfuscatedName("ga.o")
    public static final class183 field2489 = new class183(14, 0);

    @ObfuscatedName("ga.k")
    public static final class183 field2484 = new class183(15, 4);

    @ObfuscatedName("ga.t")
    public static final class183 field2486 = new class183(16, -2);

    @ObfuscatedName("ga.d")
    public static final class183 field2487 = new class183(18, -2);

    @ObfuscatedName("ga.h")
    public final int field2488;

    @ObfuscatedName("ga.m")
    public static final class183[] field2485 = new class183[32];

    static {
        class183[] var0 = method36();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2485[var0[var1].field2488] = var0[var1];
        }
    }

    @ObfuscatedName("u.o(I)[Lga;")
    public static class183[] method36() {
        return new class183[] { field2486, field2487, field2484, field2489 };
    }

    public class183(int arg0, int arg1) {
        this.field2488 = arg0;
    }
}
