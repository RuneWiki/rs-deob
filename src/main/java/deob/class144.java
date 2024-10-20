package deob;

@ObfuscatedName("ee")
public class class144 {

    @ObfuscatedName("ee.n")
    public static final class144 field2170 = new class144("LIVE", 0);

    @ObfuscatedName("ee.g")
    public static final class144 field2169 = new class144("BUILDLIVE", 3);

    @ObfuscatedName("ee.a")
    public static final class144 field2163 = new class144("RC", 1);

    @ObfuscatedName("ee.m")
    public static final class144 field2166 = new class144("WIP", 2);

    @ObfuscatedName("ee.s")
    public final String field2167;

    @ObfuscatedName("ee.j")
    public final int field2168;

    public class144(String arg0, int arg1) {
        this.field2167 = arg0;
        this.field2168 = arg1;
    }

    @ObfuscatedName("w.n(II)Lee;")
    public static class144 method539(int arg0) {
        class144[] var1 = new class144[] { field2170, field2163, field2169, field2166 };
        class144[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class144 var4 = var2[var3];
            if (var4.field2168 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
