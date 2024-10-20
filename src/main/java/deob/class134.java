package deob;

@ObfuscatedName("ef")
public class class134 {

    @ObfuscatedName("ef.f")
    public static final class134 field2111 = new class134(0);

    @ObfuscatedName("ef.e")
    public static final class134 field2117 = new class134(1);

    @ObfuscatedName("ef.n")
    public static final class134 field2113 = new class134(2);

    @ObfuscatedName("ef.t")
    public final int field2112;

    @ObfuscatedName("do.f(I)[Lef;")
    public static class134[] method2313() {
        return new class134[] { field2111, field2113, field2117 };
    }

    public class134(int arg0) {
        this.field2112 = arg0;
    }

    @ObfuscatedName("y.e(II)Lef;")
    public static class134 method588(int arg0) {
        class134[] var1 = method2313();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class134 var3 = var1[var2];
            if (var3.field2112 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
