package deob;

@ObfuscatedName("em")
public class class144 {

    @ObfuscatedName("em.p")
    public static final class144 field2175 = new class144("LIVE", 0);

    @ObfuscatedName("em.k")
    public static final class144 field2177 = new class144("BUILDLIVE", 3);

    @ObfuscatedName("em.e")
    public static final class144 field2176 = new class144("RC", 1);

    @ObfuscatedName("em.f")
    public static final class144 field2181 = new class144("WIP", 2);

    @ObfuscatedName("em.w")
    public final String field2178;

    @ObfuscatedName("em.t")
    public final int field2179;

    @ObfuscatedName("dh.p(I)[Lem;")
    public static class144[] method2451() {
        return new class144[] { field2175, field2181, field2177, field2176 };
    }

    public class144(String arg0, int arg1) {
        this.field2178 = arg0;
        this.field2179 = arg1;
    }

    @ObfuscatedName("dl.k(IS)Lem;")
    public static class144 method2496(int arg0) {
        class144[] var1 = method2451();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class144 var3 = var1[var2];
            if (var3.field2179 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
