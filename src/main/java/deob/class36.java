package deob;

@ObfuscatedName("ed")
public class class36 {

    @ObfuscatedName("ed.d")
    public final int field443;

    @ObfuscatedName("ed.b")
    public static final class36 field445 = new class36("LIVE", 0);

    @ObfuscatedName("ed.k")
    public static final class36 field444 = new class36("RC", 1);

    @ObfuscatedName("ed.h")
    public static final class36 field447 = new class36("BUILDLIVE", 3);

    @ObfuscatedName("ed.w")
    public static final class36 field442 = new class36("WIP", 2);

    @ObfuscatedName("ed.t")
    public final String field446;

    public class36(String arg0, int arg1) {
        this.field446 = arg0;
        this.field443 = arg1;
    }

    @ObfuscatedName("cz.b(II)Led;")
    public static class36 method2346(int arg0) {
        class36[] var1 = new class36[] { field444, field442, field445, field447 };
        class36[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class36 var4 = var2[var3];
            if (var4.field443 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
