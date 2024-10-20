package deob;

@ObfuscatedName("lp")
public class class298 implements class293 {

    @ObfuscatedName("lp.at")
    public static final class298 field3343 = new class298(14, 0);

    @ObfuscatedName("lp.an")
    public static final class298 field3347 = new class298(15, 4);

    @ObfuscatedName("lp.av")
    public static final class298 field3344 = new class298(16, -2);

    @ObfuscatedName("lp.as")
    public static final class298 field3345 = new class298(18, -2);

    @ObfuscatedName("lp.ax")
    public static final class298 field3346 = new class298(19, -2);

    @ObfuscatedName("lp.ap")
    public static final class298 field3348 = new class298(27, 0);

    @ObfuscatedName("lp.ab")
    public final int field3350;

    @ObfuscatedName("lp.ak")
    public static final class298[] field3349 = new class298[32];

    static {
        class298[] var0 = method1018();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3349[var0[var1].field3350] = var0[var1];
        }
    }

    @ObfuscatedName("ch.at(I)[Llp;")
    public static class298[] method1018() {
        return new class298[] { field3346, field3343, field3344, field3347, field3348, field3345 };
    }

    public class298(int arg0, int arg1) {
        this.field3350 = arg0;
    }
}
