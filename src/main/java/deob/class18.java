package deob;

@ObfuscatedName("s")
public class class18 {

    @ObfuscatedName("s.m")
    public static final class18 field100 = new class18(0, 0, 4);

    @ObfuscatedName("s.f")
    public static final class18 field105 = new class18(2, 1, 2);

    @ObfuscatedName("s.q")
    public static final class18 field94 = new class18(1, 2, 0);

    @ObfuscatedName("s.w")
    public final int field96;

    @ObfuscatedName("s.o")
    public final int field97;

    @ObfuscatedName("s.u")
    public final int field98;

    @ObfuscatedName("s.m(I)[Ls;")
    public static class18[] method175() {
        return new class18[] { field100, field105, field94 };
    }

    public class18(int arg0, int arg1, int arg2) {
        this.field96 = arg0;
        this.field97 = arg1;
        this.field98 = arg2;
    }

    @ObfuscatedName("s.f(FI)Z")
    public boolean method177(float arg0) {
        return arg0 >= (float) this.field98;
    }

    @ObfuscatedName("s.q(IB)Ls;")
    public static class18 method178(int arg0) {
        class18[] var1 = method175();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class18 var3 = var1[var2];
            if (var3.field97 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
