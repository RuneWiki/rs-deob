package deob;

@ObfuscatedName("fq")
public class class171 implements class168 {

    @ObfuscatedName("fq.w")
    public static final class171 field2262 = new class171(14, 0);

    @ObfuscatedName("fq.m")
    public static final class171 field2260 = new class171(15, 4);

    @ObfuscatedName("fq.q")
    public static final class171 field2261 = new class171(16, -2);

    @ObfuscatedName("fq.b")
    public static final class171 field2259 = new class171(18, -2);

    @ObfuscatedName("fq.f")
    public final int field2263;

    @ObfuscatedName("fq.n")
    public static final class171[] field2264 = new class171[32];

    static {
        class171[] var0 = method444();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2264[var0[var1].field2263] = var0[var1];
        }
    }

    @ObfuscatedName("o.w(I)[Lfq;")
    public static class171[] method444() {
        return new class171[] { field2260, field2261, field2262, field2259 };
    }

    public class171(int arg0, int arg1) {
        this.field2263 = arg0;
    }
}
