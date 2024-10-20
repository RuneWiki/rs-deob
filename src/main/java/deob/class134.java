package deob;

@ObfuscatedName("ez")
public class class134 {

    @ObfuscatedName("ez.x")
    public static final class134 field2107 = new class134(0);

    @ObfuscatedName("ez.r")
    public static final class134 field2111 = new class134(1);

    @ObfuscatedName("ez.j")
    public static final class134 field2109 = new class134(2);

    @ObfuscatedName("ez.z")
    public final int field2108;

    @ObfuscatedName("bh.x(I)[Lez;")
    public static class134[] method1064() {
        return new class134[] { field2107, field2109, field2111 };
    }

    public class134(int arg0) {
        this.field2108 = arg0;
    }

    @ObfuscatedName("ct.r(II)Lez;")
    public static class134 method2000(int arg0) {
        class134[] var1 = method1064();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class134 var3 = var1[var2];
            if (var3.field2108 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
