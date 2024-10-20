package deob;

@ObfuscatedName("eq")
public class class133 {

    @ObfuscatedName("eq.b")
    public static final class133 field2101 = new class133("LIVE", 0);

    @ObfuscatedName("eq.c")
    public static final class133 field2107 = new class133("BUILDLIVE", 3);

    @ObfuscatedName("eq.j")
    public static final class133 field2105 = new class133("RC", 1);

    @ObfuscatedName("eq.i")
    public static final class133 field2103 = new class133("WIP", 2);

    @ObfuscatedName("eq.k")
    public final String field2104;

    @ObfuscatedName("eq.q")
    public final int field2100;

    @ObfuscatedName("f.b(I)[Leq;")
    public static class133[] method218() {
        return new class133[] { field2105, field2103, field2107, field2101 };
    }

    public class133(String arg0, int arg1) {
        this.field2104 = arg0;
        this.field2100 = arg1;
    }

    @ObfuscatedName("dm.c(IB)Leq;")
    public static class133 method2365(int arg0) {
        class133[] var1 = method218();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class133 var3 = var1[var2];
            if (var3.field2100 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
