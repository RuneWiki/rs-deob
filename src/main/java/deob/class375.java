package deob;

@ObfuscatedName("oz")
public class class375 {

    @ObfuscatedName("oz.ab")
    public static final class375 field4041 = new class375("LIVE", 0);

    @ObfuscatedName("oz.ay")
    public static final class375 field4039 = new class375("BUILDLIVE", 3);

    @ObfuscatedName("oz.an")
    public static final class375 field4040 = new class375("RC", 1);

    @ObfuscatedName("oz.au")
    public static final class375 field4038 = new class375("WIP", 2);

    @ObfuscatedName("oz.ax")
    public final String field4037;

    @ObfuscatedName("oz.ao")
    public final int field4042;

    public class375(String arg0, int arg1) {
        this.field4037 = arg0;
        this.field4042 = arg1;
    }

    @ObfuscatedName("cq.ay(II)Loz;")
    public static class375 method1103(int arg0) {
        class375[] var1 = Statics.method3173();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class375 var3 = var1[var2];
            if (var3.field4042 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
