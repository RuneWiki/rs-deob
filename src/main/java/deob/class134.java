package deob;

@ObfuscatedName("ea")
public class class134 {

    @ObfuscatedName("ea.m")
    public static final class134 field2116 = new class134(0);

    @ObfuscatedName("ea.w")
    public static final class134 field2111 = new class134(1);

    @ObfuscatedName("ea.e")
    public static final class134 field2115 = new class134(2);

    @ObfuscatedName("ea.o")
    public final int field2113;

    @ObfuscatedName("dk.m(I)[Lea;")
    public static class134[] method2353() {
        return new class134[] { field2115, field2116, field2111 };
    }

    public class134(int arg0) {
        this.field2113 = arg0;
    }

    @ObfuscatedName("cl.w(II)Lea;")
    public static class134 method1861(int arg0) {
        class134[] var1 = method2353();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class134 var3 = var1[var2];
            if (var3.field2113 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
