package deob;

@ObfuscatedName("ep")
public class class133 {

    @ObfuscatedName("ep.j")
    public static final class133 field2078 = new class133("LIVE", 0);

    @ObfuscatedName("ep.f")
    public static final class133 field2073 = new class133("BUILDLIVE", 3);

    @ObfuscatedName("ep.o")
    public static final class133 field2074 = new class133("RC", 1);

    @ObfuscatedName("ep.h")
    public static final class133 field2072 = new class133("WIP", 2);

    @ObfuscatedName("ep.u")
    public final String field2076;

    @ObfuscatedName("ep.a")
    public final int field2081;

    public class133(String arg0, int arg1) {
        this.field2076 = arg0;
        this.field2081 = arg1;
    }

    @ObfuscatedName("cw.j(II)Lep;")
    public static class133 method1875(int arg0) {
        class133[] var1 = new class133[] { field2078, field2074, field2072, field2073 };
        class133[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class133 var4 = var2[var3];
            if (var4.field2081 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
