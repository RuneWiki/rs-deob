package deob;

@ObfuscatedName("hq")
public class class231 {

    @ObfuscatedName("hq.c")
    public static final class231 field3106 = new class231("LIVE", 0);

    @ObfuscatedName("hq.t")
    public static final class231 field3105 = new class231("BUILDLIVE", 3);

    @ObfuscatedName("hq.o")
    public static final class231 field3107 = new class231("RC", 1);

    @ObfuscatedName("hq.e")
    public static final class231 field3104 = new class231("WIP", 2);

    @ObfuscatedName("hq.i")
    public final String field3108;

    @ObfuscatedName("hq.g")
    public final int field3109;

    @ObfuscatedName("au.c(I)[Lhq;")
    public static class231[] method510() {
        return new class231[] { field3107, field3105, field3104, field3106 };
    }

    public class231(String arg0, int arg1) {
        this.field3108 = arg0;
        this.field3109 = arg1;
    }

    @ObfuscatedName("o.t(II)Lhq;")
    public static class231 method18(int arg0) {
        class231[] var1 = method510();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class231 var3 = var1[var2];
            if (var3.field3109 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
