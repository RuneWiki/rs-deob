package deob;

@ObfuscatedName("eu")
public class class144 {

    @ObfuscatedName("eu.t")
    public static final class144 field2153 = new class144("LIVE", 0);

    @ObfuscatedName("eu.b")
    public static final class144 field2148 = new class144("BUILDLIVE", 3);

    @ObfuscatedName("eu.p")
    public static final class144 field2147 = new class144("RC", 1);

    @ObfuscatedName("eu.e")
    public static final class144 field2149 = new class144("WIP", 2);

    @ObfuscatedName("eu.i")
    public final String field2150;

    @ObfuscatedName("eu.o")
    public final int field2151;

    public class144(String arg0, int arg1) {
        this.field2150 = arg0;
        this.field2151 = arg1;
    }

    @ObfuscatedName("w.t(II)Leu;")
    public static class144 method519(int arg0) {
        class144[] var1 = new class144[] { field2147, field2148, field2149, field2153 };
        class144[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class144 var4 = var2[var3];
            if (var4.field2151 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
