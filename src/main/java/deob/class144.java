package deob;

@ObfuscatedName("es")
public class class144 {

    @ObfuscatedName("es.e")
    public static final class144 field2128 = new class144("LIVE", 0);

    @ObfuscatedName("es.a")
    public static final class144 field2125 = new class144("BUILDLIVE", 3);

    @ObfuscatedName("es.l")
    public static final class144 field2126 = new class144("RC", 1);

    @ObfuscatedName("es.c")
    public static final class144 field2130 = new class144("WIP", 2);

    @ObfuscatedName("es.u")
    public final String field2127;

    @ObfuscatedName("es.w")
    public final int field2124;

    public class144(String arg0, int arg1) {
        this.field2127 = arg0;
        this.field2124 = arg1;
    }

    @ObfuscatedName("ck.e(II)Les;")
    public static class144 method1934(int arg0) {
        class144[] var1 = new class144[] { field2126, field2130, field2128, field2125 };
        class144[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class144 var4 = var2[var3];
            if (var4.field2124 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
