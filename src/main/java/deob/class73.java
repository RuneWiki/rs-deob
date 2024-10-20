package deob;

@ObfuscatedName("bb")
public class class73 {

    @ObfuscatedName("bb.q")
    public static final class73 field869 = new class73("LIVE", 0);

    @ObfuscatedName("bb.l")
    public static final class73 field868 = new class73("BUILDLIVE", 3);

    @ObfuscatedName("bb.a")
    public static final class73 field866 = new class73("RC", 1);

    @ObfuscatedName("bb.o")
    public static final class73 field867 = new class73("WIP", 2);

    @ObfuscatedName("bb.c")
    public final String field870;

    @ObfuscatedName("bb.h")
    public final int field871;

    @ObfuscatedName("s.q(I)[Lbb;")
    public static class73[] method120() {
        return new class73[] { field867, field869, field866, field868 };
    }

    public class73(String arg0, int arg1) {
        this.field870 = arg0;
        this.field871 = arg1;
    }

    @ObfuscatedName("c.l(II)Lbb;")
    public static class73 method41(int arg0) {
        class73[] var1 = method120();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class73 var3 = var1[var2];
            if (var3.field871 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
