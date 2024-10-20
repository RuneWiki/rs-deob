package deob;

@ObfuscatedName("hb")
public class class231 implements class226 {

    @ObfuscatedName("hb.s")
    public static final class231 field2792 = new class231(14, 0);

    @ObfuscatedName("hb.t")
    public static final class231 field2797 = new class231(15, 4);

    @ObfuscatedName("hb.v")
    public static final class231 field2790 = new class231(16, -2);

    @ObfuscatedName("hb.j")
    public static final class231 field2793 = new class231(18, -2);

    @ObfuscatedName("hb.l")
    public static final class231 field2794 = new class231(19, -2);

    @ObfuscatedName("hb.n")
    public static final class231 field2791 = new class231(27, 0);

    @ObfuscatedName("hb.w")
    public final int field2796;

    @ObfuscatedName("hb.f")
    public static final class231[] field2795 = new class231[32];

    static {
        class231[] var0 = method5702();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2795[var0[var1].field2796] = var0[var1];
        }
    }

    @ObfuscatedName("mr.s(I)[Lhb;")
    public static class231[] method5702() {
        return new class231[] { field2793, field2791, field2790, field2794, field2792, field2797 };
    }

    public class231(int arg0, int arg1) {
        this.field2796 = arg0;
    }
}
