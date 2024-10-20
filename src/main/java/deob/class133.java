package deob;

@ObfuscatedName("eq")
public class class133 {

    @ObfuscatedName("eq.l")
    public static final class133 field2061 = new class133("LIVE", 0);

    @ObfuscatedName("eq.b")
    public static final class133 field2069 = new class133("BUILDLIVE", 3);

    @ObfuscatedName("eq.o")
    public static final class133 field2062 = new class133("RC", 1);

    @ObfuscatedName("eq.w")
    public static final class133 field2060 = new class133("WIP", 2);

    @ObfuscatedName("eq.r")
    public final String field2064;

    @ObfuscatedName("eq.k")
    public final int field2065;

    @ObfuscatedName("u.l(B)[Leq;")
    public static class133[] method163() {
        return new class133[] { field2061, field2069, field2060, field2062 };
    }

    public class133(String arg0, int arg1) {
        this.field2064 = arg0;
        this.field2065 = arg1;
    }

    @ObfuscatedName("bc.b(II)Leq;")
    public static class133 method1372(int arg0) {
        class133[] var1 = method163();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class133 var3 = var1[var2];
            if (var3.field2065 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
