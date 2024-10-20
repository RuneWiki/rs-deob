package deob;

@ObfuscatedName("ej")
public class class133 {

    @ObfuscatedName("ej.p")
    public static final class133 field2077 = new class133("LIVE", 0);

    @ObfuscatedName("ej.e")
    public static final class133 field2075 = new class133("BUILDLIVE", 3);

    @ObfuscatedName("ej.a")
    public static final class133 field2084 = new class133("RC", 1);

    @ObfuscatedName("ej.h")
    public static final class133 field2074 = new class133("WIP", 2);

    @ObfuscatedName("ej.y")
    public final String field2078;

    @ObfuscatedName("ej.j")
    public final int field2079;

    @ObfuscatedName("az.p(I)[Lej;")
    public static class133[] method622() {
        return new class133[] { field2075, field2074, field2077, field2084 };
    }

    public class133(String arg0, int arg1) {
        this.field2078 = arg0;
        this.field2079 = arg1;
    }

    @ObfuscatedName("am.e(II)Lej;")
    public static class133 method584(int arg0) {
        class133[] var1 = method622();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class133 var3 = var1[var2];
            if (var3.field2079 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
