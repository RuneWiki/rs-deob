package deob;

@ObfuscatedName("ip")
public class class244 implements class239 {

    @ObfuscatedName("ip.l")
    public static final class244 field2886 = new class244(14, 0);

    @ObfuscatedName("ip.q")
    public static final class244 field2885 = new class244(15, 4);

    @ObfuscatedName("ip.f")
    public static final class244 field2892 = new class244(16, -2);

    @ObfuscatedName("ip.j")
    public static final class244 field2887 = new class244(18, -2);

    @ObfuscatedName("ip.m")
    public static final class244 field2889 = new class244(19, -2);

    @ObfuscatedName("ip.k")
    public static final class244 field2890 = new class244(27, 0);

    @ObfuscatedName("ip.t")
    public final int field2891;

    @ObfuscatedName("ip.a")
    public static final class244[] field2888 = new class244[32];

    static {
        class244[] var0 = method4183();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2888[var0[var1].field2891] = var0[var1];
        }
    }

    @ObfuscatedName("ho.l(I)[Lip;")
    public static class244[] method4183() {
        return new class244[] { field2889, field2890, field2886, field2892, field2885, field2887 };
    }

    public class244(int arg0, int arg1) {
        this.field2891 = arg0;
    }
}
