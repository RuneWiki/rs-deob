package deob;

@ObfuscatedName("eg")
public class class133 {

    @ObfuscatedName("eg.p")
    public static final class133 field2071 = new class133("LIVE", 0);

    @ObfuscatedName("eg.l")
    public static final class133 field2069 = new class133("BUILDLIVE", 3);

    @ObfuscatedName("eg.d")
    public static final class133 field2074 = new class133("RC", 1);

    @ObfuscatedName("eg.x")
    public static final class133 field2073 = new class133("WIP", 2);

    @ObfuscatedName("eg.o")
    public final String field2072;

    @ObfuscatedName("eg.a")
    public final int field2068;

    @ObfuscatedName("aa.p(I)[Leg;")
    public static class133[] method639() {
        return new class133[] { field2073, field2071, field2069, field2074 };
    }

    public class133(String arg0, int arg1) {
        this.field2072 = arg0;
        this.field2068 = arg1;
    }

    @ObfuscatedName("bg.l(II)Leg;")
    public static class133 method1284(int arg0) {
        class133[] var1 = method639();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class133 var3 = var1[var2];
            if (var3.field2068 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
