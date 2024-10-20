package deob;

@ObfuscatedName("a")
public class class18 {

    @ObfuscatedName("a.u")
    public static final class18 field114 = new class18(0, 0, 4);

    @ObfuscatedName("a.f")
    public static final class18 field118 = new class18(2, 1, 2);

    @ObfuscatedName("a.b")
    public static final class18 field113 = new class18(1, 2, 0);

    @ObfuscatedName("a.g")
    public final int field116;

    @ObfuscatedName("a.z")
    public final int field117;

    @ObfuscatedName("a.p")
    public final int field119;

    @ObfuscatedName("a.u(B)[La;")
    public static class18[] method180() {
        return new class18[] { field113, field114, field118 };
    }

    public class18(int arg0, int arg1, int arg2) {
        this.field116 = arg0;
        this.field117 = arg1;
        this.field119 = arg2;
    }

    @ObfuscatedName("a.f(FI)Z")
    public boolean method179(float arg0) {
        return arg0 >= (float) this.field119;
    }

    @ObfuscatedName("a.b(II)La;")
    public static class18 method189(int arg0) {
        class18[] var1 = method180();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class18 var3 = var1[var2];
            if (var3.field117 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
