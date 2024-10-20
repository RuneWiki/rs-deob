package deob;

@ObfuscatedName("ed")
public class class141 {

    @ObfuscatedName("ed.g")
    public static final class141 field2112 = new class141("LIVE", 0);

    @ObfuscatedName("ed.j")
    public static final class141 field2111 = new class141("BUILDLIVE", 3);

    @ObfuscatedName("ed.z")
    public static final class141 field2110 = new class141("RC", 1);

    @ObfuscatedName("ed.b")
    public static final class141 field2113 = new class141("WIP", 2);

    @ObfuscatedName("ed.k")
    public final String field2114;

    @ObfuscatedName("ed.c")
    public final int field2115;

    @ObfuscatedName("en.g(B)[Led;")
    public static class141[] method2541() {
        return new class141[] { field2111, field2113, field2112, field2110 };
    }

    public class141(String arg0, int arg1) {
        this.field2114 = arg0;
        this.field2115 = arg1;
    }

    @ObfuscatedName("k.j(II)Led;")
    public static class141 method32(int arg0) {
        class141[] var1 = method2541();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class141 var3 = var1[var2];
            if (var3.field2115 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
