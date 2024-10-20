package deob;

@ObfuscatedName("im")
public class class241 {

    @ObfuscatedName("im.f")
    public static final class241 field2881 = new class241("LIVE", 0);

    @ObfuscatedName("im.o")
    public static final class241 field2875 = new class241("BUILDLIVE", 3);

    @ObfuscatedName("im.u")
    public static final class241 field2882 = new class241("RC", 1);

    @ObfuscatedName("im.p")
    public static final class241 field2877 = new class241("WIP", 2);

    @ObfuscatedName("im.b")
    public final String field2878;

    @ObfuscatedName("im.e")
    public final int field2876;

    @ObfuscatedName("w.f(S)[Lim;")
    public static class241[] method195() {
        return new class241[] { field2882, field2877, field2881, field2875 };
    }

    public class241(String arg0, int arg1) {
        this.field2878 = arg0;
        this.field2876 = arg1;
    }

    @ObfuscatedName("fk.o(IB)Lim;")
    public static class241 method2834(int arg0) {
        class241[] var1 = method195();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class241 var3 = var1[var2];
            if (var3.field2876 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
