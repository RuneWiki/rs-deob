package deob;

@ObfuscatedName("hl")
public class class230 implements class225 {

    @ObfuscatedName("hl.f")
    public static final class230 field2807 = new class230(14, 0);

    @ObfuscatedName("hl.e")
    public static final class230 field2802 = new class230(15, 4);

    @ObfuscatedName("hl.v")
    public static final class230 field2803 = new class230(16, -2);

    @ObfuscatedName("hl.y")
    public static final class230 field2804 = new class230(18, -2);

    @ObfuscatedName("hl.j")
    public static final class230 field2805 = new class230(19, -2);

    @ObfuscatedName("hl.o")
    public static final class230 field2810 = new class230(27, 0);

    @ObfuscatedName("hl.m")
    public final int field2806;

    @ObfuscatedName("hl.r")
    public static final class230[] field2808 = new class230[32];

    static {
        class230[] var0 = method191();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2808[var0[var1].field2806] = var0[var1];
        }
    }

    @ObfuscatedName("l.f(I)[Lhl;")
    public static class230[] method191() {
        return new class230[] { field2810, field2805, field2803, field2802, field2807, field2804 };
    }

    public class230(int arg0, int arg1) {
        this.field2806 = arg0;
    }
}
