package deob;

@ObfuscatedName("fs")
public class class179 {

    @ObfuscatedName("fs.i")
    public static final class179 field2680 = new class179("LIVE", 0);

    @ObfuscatedName("fs.e")
    public static final class179 field2674 = new class179("BUILDLIVE", 3);

    @ObfuscatedName("fs.f")
    public static final class179 field2675 = new class179("RC", 1);

    @ObfuscatedName("fs.k")
    public static final class179 field2676 = new class179("WIP", 2);

    @ObfuscatedName("fs.g")
    public final String field2677;

    @ObfuscatedName("fs.n")
    public final int field2678;

    @ObfuscatedName("gr.i(I)[Lfs;")
    public static class179[] method3166() {
        return new class179[] { field2675, field2680, field2674, field2676 };
    }

    public class179(String arg0, int arg1) {
        this.field2677 = arg0;
        this.field2678 = arg1;
    }

    @ObfuscatedName("bp.e(II)Lfs;")
    public static class179 method1097(int arg0) {
        class179[] var1 = method3166();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class179 var3 = var1[var2];
            if (var3.field2678 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
