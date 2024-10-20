package deob;

@ObfuscatedName("er")
public class class133 {

    @ObfuscatedName("er.c")
    public static final class133 field2097 = new class133("LIVE", 0);

    @ObfuscatedName("er.q")
    public static final class133 field2098 = new class133("BUILDLIVE", 3);

    @ObfuscatedName("er.y")
    public static final class133 field2095 = new class133("RC", 1);

    @ObfuscatedName("er.v")
    public static final class133 field2100 = new class133("WIP", 2);

    @ObfuscatedName("er.g")
    public final String field2099;

    @ObfuscatedName("er.x")
    public final int field2096;

    @ObfuscatedName("ce.c(I)[Ler;")
    public static class133[] method1513() {
        return new class133[] { field2100, field2097, field2095, field2098 };
    }

    public class133(String arg0, int arg1) {
        this.field2099 = arg0;
        this.field2096 = arg1;
    }

    @ObfuscatedName("ct.q(II)Ler;")
    public static class133 method1777(int arg0) {
        class133[] var1 = method1513();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class133 var3 = var1[var2];
            if (var3.field2096 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
