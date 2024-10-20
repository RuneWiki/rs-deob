package deob;

@ObfuscatedName("ew")
public class class133 {

    @ObfuscatedName("ew.f")
    public static final class133 field2077 = new class133("LIVE", 0);

    @ObfuscatedName("ew.t")
    public static final class133 field2076 = new class133("BUILDLIVE", 3);

    @ObfuscatedName("ew.n")
    public static final class133 field2069 = new class133("RC", 1);

    @ObfuscatedName("ew.e")
    public static final class133 field2066 = new class133("WIP", 2);

    @ObfuscatedName("ew.l")
    public final String field2070;

    @ObfuscatedName("ew.d")
    public final int field2071;

    @ObfuscatedName("u.f(I)[Lew;")
    public static class133[] method104() {
        return new class133[] { field2069, field2077, field2076, field2066 };
    }

    public class133(String arg0, int arg1) {
        this.field2070 = arg0;
        this.field2071 = arg1;
    }

    @ObfuscatedName("dl.t(II)Lew;")
    public static class133 method2308(int arg0) {
        class133[] var1 = method104();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class133 var3 = var1[var2];
            if (var3.field2071 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
