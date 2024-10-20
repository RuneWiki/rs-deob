package deob;

@ObfuscatedName("eq")
public class class138 {

    @ObfuscatedName("eq.y")
    public static final class138 field2118 = new class138("LIVE", 0);

    @ObfuscatedName("eq.u")
    public static final class138 field2112 = new class138("BUILDLIVE", 3);

    @ObfuscatedName("eq.k")
    public static final class138 field2113 = new class138("RC", 1);

    @ObfuscatedName("eq.v")
    public static final class138 field2115 = new class138("WIP", 2);

    @ObfuscatedName("eq.l")
    public final String field2116;

    @ObfuscatedName("eq.g")
    public final int field2117;

    @ObfuscatedName("ce.y(I)[Leq;")
    public static class138[] method2052() {
        return new class138[] { field2115, field2113, field2118, field2112 };
    }

    public class138(String arg0, int arg1) {
        this.field2116 = arg0;
        this.field2117 = arg1;
    }

    @ObfuscatedName("cg.u(IB)Leq;")
    public static class138 method1868(int arg0) {
        class138[] var1 = method2052();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class138 var3 = var1[var2];
            if (var3.field2117 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
