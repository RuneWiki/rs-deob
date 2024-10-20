package deob;

@ObfuscatedName("eh")
public class class135 {

    @ObfuscatedName("eh.m")
    public static final class135 field2086 = new class135("LIVE", 0);

    @ObfuscatedName("eh.k")
    public static final class135 field2088 = new class135("BUILDLIVE", 3);

    @ObfuscatedName("eh.y")
    public static final class135 field2083 = new class135("RC", 1);

    @ObfuscatedName("eh.g")
    public static final class135 field2084 = new class135("WIP", 2);

    @ObfuscatedName("eh.r")
    public final String field2085;

    @ObfuscatedName("eh.i")
    public final int field2082;

    public class135(String arg0, int arg1) {
        this.field2085 = arg0;
        this.field2082 = arg1;
    }

    @ObfuscatedName("by.m(IB)Leh;")
    public static class135 method1584(int arg0) {
        class135[] var1 = new class135[] { field2086, field2084, field2088, field2083 };
        class135[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class135 var4 = var2[var3];
            if (var4.field2082 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
