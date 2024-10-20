package deob;

@ObfuscatedName("eg")
public class class134 {

    @ObfuscatedName("eg.a")
    public static final class134 field2131 = new class134(0);

    @ObfuscatedName("eg.d")
    public static final class134 field2132 = new class134(1);

    @ObfuscatedName("eg.v")
    public static final class134 field2133 = new class134(2);

    @ObfuscatedName("eg.r")
    public final int field2134;

    public class134(int arg0) {
        this.field2134 = arg0;
    }

    @ObfuscatedName("dd.a(IB)Leg;")
    public static class134 method2190(int arg0) {
        class134[] var1 = new class134[] { field2131, field2132, field2133 };
        class134[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class134 var4 = var2[var3];
            if (var4.field2134 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
