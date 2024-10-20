package deob;

@ObfuscatedName("bw")
public class class72 {

    @ObfuscatedName("bw.t")
    public static final class72 field848 = new class72("LIVE", 0);

    @ObfuscatedName("bw.n")
    public static final class72 field844 = new class72("BUILDLIVE", 3);

    @ObfuscatedName("bw.q")
    public static final class72 field845 = new class72("RC", 1);

    @ObfuscatedName("bw.h")
    public static final class72 field846 = new class72("WIP", 2);

    @ObfuscatedName("bw.k")
    public final String field847;

    @ObfuscatedName("bw.r")
    public final int field843;

    @ObfuscatedName("bx.t(I)[Lbw;")
    public static class72[] method789() {
        return new class72[] { field846, field845, field844, field848 };
    }

    public class72(String arg0, int arg1) {
        this.field847 = arg0;
        this.field843 = arg1;
    }

    @ObfuscatedName("aw.n(II)Lbw;")
    public static class72 method719(int arg0) {
        class72[] var1 = method789();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class72 var3 = var1[var2];
            if (var3.field843 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
