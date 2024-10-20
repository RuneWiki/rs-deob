package deob;

@ObfuscatedName("mf")
public class class328 {

    @ObfuscatedName("mf.aj")
    public static final class328 field3771 = new class328("LIVE", 0);

    @ObfuscatedName("mf.al")
    public static final class328 field3770 = new class328("BUILDLIVE", 3);

    @ObfuscatedName("mf.ac")
    public static final class328 field3772 = new class328("RC", 1);

    @ObfuscatedName("mf.ab")
    public static final class328 field3773 = new class328("WIP", 2);

    @ObfuscatedName("mf.an")
    public final String field3774;

    @ObfuscatedName("mf.ao")
    public final int field3775;

    @ObfuscatedName("cf.aj(I)[Lmf;")
    public static class328[] method2026() {
        return new class328[] { field3773, field3770, field3771, field3772 };
    }

    public class328(String arg0, int arg1) {
        this.field3774 = arg0;
        this.field3775 = arg1;
    }

    @ObfuscatedName("gz.al(II)Lmf;")
    public static class328 method3083(int arg0) {
        class328[] var1 = method2026();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class328 var3 = var1[var2];
            if (var3.field3775 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
