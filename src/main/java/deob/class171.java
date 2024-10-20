package deob;

@ObfuscatedName("fq")
public class class171 implements class168 {

    @ObfuscatedName("fq.z")
    public static final class171 field2238 = new class171(14, 0);

    @ObfuscatedName("fq.w")
    public static final class171 field2237 = new class171(15, 4);

    @ObfuscatedName("fq.s")
    public static final class171 field2236 = new class171(16, -2);

    @ObfuscatedName("fq.l")
    public static final class171 field2239 = new class171(18, -2);

    @ObfuscatedName("fq.u")
    public final int field2240;

    @ObfuscatedName("fq.q")
    public static final class171[] field2241 = new class171[32];

    static {
        class171[] var0 = new class171[] { field2236, field2237, field2238, field2239 };
        class171[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            field2241[var1[var2].field2240] = var1[var2];
        }
    }

    public class171(int arg0, int arg1) {
        this.field2240 = arg0;
    }
}
