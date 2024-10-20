package deob;

@ObfuscatedName("fl")
public class class157 {

    @ObfuscatedName("fl.a")
    public static final class157 field2344 = new class157("LIVE", 0);

    @ObfuscatedName("fl.d")
    public static final class157 field2342 = new class157("BUILDLIVE", 3);

    @ObfuscatedName("fl.v")
    public static final class157 field2343 = new class157("RC", 1);

    @ObfuscatedName("fl.r")
    public static final class157 field2346 = new class157("WIP", 2);

    @ObfuscatedName("fl.z")
    public final String field2345;

    @ObfuscatedName("fl.t")
    public final int field2341;

    @ObfuscatedName("cj.a(I)[Lfl;")
    public static class157[] method1832() {
        return new class157[] { field2344, field2346, field2342, field2343 };
    }

    public class157(String arg0, int arg1) {
        this.field2345 = arg0;
        this.field2341 = arg1;
    }

    @ObfuscatedName("ax.d(IB)Lfl;")
    public static class157 method746(int arg0) {
        class157[] var1 = method1832();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3.field2341 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
