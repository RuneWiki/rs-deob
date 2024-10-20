package deob;

@ObfuscatedName("nt")
public class class345 {

    @ObfuscatedName("nt.at")
    public static final class345 field3844 = new class345("LIVE", 0);

    @ObfuscatedName("nt.an")
    public static final class345 field3841 = new class345("BUILDLIVE", 3);

    @ObfuscatedName("nt.av")
    public static final class345 field3843 = new class345("RC", 1);

    @ObfuscatedName("nt.as")
    public static final class345 field3847 = new class345("WIP", 2);

    @ObfuscatedName("nt.ax")
    public final String field3845;

    @ObfuscatedName("nt.ap")
    public final int field3846;

    @ObfuscatedName("ke.at(I)[Lnt;")
    public static class345[] method5086() {
        return new class345[] { field3843, field3841, field3847, field3844 };
    }

    public class345(String arg0, int arg1) {
        this.field3845 = arg0;
        this.field3846 = arg1;
    }

    @ObfuscatedName("gl.an(II)Lnt;")
    public static class345 method3224(int arg0) {
        class345[] var1 = method5086();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class345 var3 = var1[var2];
            if (var3.field3846 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
