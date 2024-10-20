package deob;

@ObfuscatedName("fs")
public class class179 {

    @ObfuscatedName("fs.o")
    public static final class179 field2688 = new class179("LIVE", 0);

    @ObfuscatedName("fs.m")
    public static final class179 field2683 = new class179("BUILDLIVE", 3);

    @ObfuscatedName("fs.b")
    public static final class179 field2684 = new class179("RC", 1);

    @ObfuscatedName("fs.g")
    public static final class179 field2685 = new class179("WIP", 2);

    @ObfuscatedName("fs.h")
    public final String field2686;

    @ObfuscatedName("fs.v")
    public final int field2687;

    @ObfuscatedName("bz.o(I)[Lfs;")
    public static class179[] method1356() {
        return new class179[] { field2685, field2688, field2684, field2683 };
    }

    public class179(String arg0, int arg1) {
        this.field2686 = arg0;
        this.field2687 = arg1;
    }

    @ObfuscatedName("fv.m(II)Lfs;")
    public static class179 method2992(int arg0) {
        class179[] var1 = method1356();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class179 var3 = var1[var2];
            if (var3.field2687 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
