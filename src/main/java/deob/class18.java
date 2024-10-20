package deob;

@ObfuscatedName("y")
public class class18 {

    @ObfuscatedName("y.a")
    public static final class18 field124 = new class18(2, 0, 4);

    @ObfuscatedName("y.s")
    public static final class18 field127 = new class18(1, 1, 2);

    @ObfuscatedName("y.g")
    public static final class18 field121 = new class18(0, 2, 0);

    @ObfuscatedName("y.x")
    public final int field122;

    @ObfuscatedName("y.h")
    public final int field123;

    @ObfuscatedName("y.f")
    public final int field119;

    @ObfuscatedName("y.a(I)[Ly;")
    public static class18[] method199() {
        return new class18[] { field121, field127, field124 };
    }

    public class18(int arg0, int arg1, int arg2) {
        this.field122 = arg0;
        this.field123 = arg1;
        this.field119 = arg2;
    }

    @ObfuscatedName("y.s(FB)Z")
    public boolean method188(float arg0) {
        return arg0 >= (float) this.field119;
    }

    @ObfuscatedName("y.g(IB)Ly;")
    public static class18 method189(int arg0) {
        class18[] var1 = method199();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class18 var3 = var1[var2];
            if (var3.field123 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
