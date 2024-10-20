package deob;

@ObfuscatedName("ef")
public class class138 {

    @ObfuscatedName("ef.z")
    public static final class138 field2100 = new class138("LIVE", 0);

    @ObfuscatedName("ef.j")
    public static final class138 field2097 = new class138("BUILDLIVE", 3);

    @ObfuscatedName("ef.a")
    public static final class138 field2104 = new class138("RC", 1);

    @ObfuscatedName("ef.y")
    public static final class138 field2098 = new class138("WIP", 2);

    @ObfuscatedName("ef.i")
    public final String field2101;

    @ObfuscatedName("ef.b")
    public final int field2099;

    @ObfuscatedName("cf.z(I)[Lef;")
    public static class138[] method1958() {
        return new class138[] { field2098, field2104, field2097, field2100 };
    }

    public class138(String arg0, int arg1) {
        this.field2101 = arg0;
        this.field2099 = arg1;
    }

    @ObfuscatedName("dj.j(II)Lef;")
    public static class138 method2586(int arg0) {
        class138[] var1 = method1958();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class138 var3 = var1[var2];
            if (var3.field2099 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
