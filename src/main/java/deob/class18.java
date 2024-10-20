package deob;

@ObfuscatedName("e")
public class class18 {

    @ObfuscatedName("e.a")
    public static final class18 field110 = new class18(2, 0, 4);

    @ObfuscatedName("e.t")
    public static final class18 field109 = new class18(0, 1, 2);

    @ObfuscatedName("e.n")
    public static final class18 field107 = new class18(1, 2, 0);

    @ObfuscatedName("e.q")
    public final int field108;

    @ObfuscatedName("e.v")
    public final int field105;

    @ObfuscatedName("e.l")
    public final int field106;

    public class18(int arg0, int arg1, int arg2) {
        this.field108 = arg0;
        this.field105 = arg1;
        this.field106 = arg2;
    }

    @ObfuscatedName("e.a(FB)Z")
    public boolean method202(float arg0) {
        return arg0 >= (float) this.field106;
    }

    @ObfuscatedName("e.t(II)Le;")
    public static class18 method196(int arg0) {
        class18[] var1 = new class18[] { field110, field109, field107 };
        class18[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class18 var4 = var2[var3];
            if (var4.field105 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
