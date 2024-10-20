package deob;

@ObfuscatedName("ei")
public class class144 {

    @ObfuscatedName("ei.o")
    public static final class144 field2157 = new class144("LIVE", 0);

    @ObfuscatedName("ei.l")
    public static final class144 field2160 = new class144("BUILDLIVE", 3);

    @ObfuscatedName("ei.g")
    public static final class144 field2158 = new class144("RC", 1);

    @ObfuscatedName("ei.u")
    public static final class144 field2159 = new class144("WIP", 2);

    @ObfuscatedName("ei.q")
    public final String field2168;

    @ObfuscatedName("ei.r")
    public final int field2161;

    @ObfuscatedName("do.o(I)[Lei;")
    public static class144[] method2155() {
        return new class144[] { field2158, field2157, field2160, field2159 };
    }

    public class144(String arg0, int arg1) {
        this.field2168 = arg0;
        this.field2161 = arg1;
    }

    @ObfuscatedName("fi.l(II)Lei;")
    public static class144 method3198(int arg0) {
        class144[] var1 = method2155();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class144 var3 = var1[var2];
            if (var3.field2161 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
