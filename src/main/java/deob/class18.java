package deob;

@ObfuscatedName("y")
public class class18 {

    @ObfuscatedName("y.n")
    public static final class18 field117 = new class18(0, 0, 4);

    @ObfuscatedName("y.h")
    public static final class18 field111 = new class18(1, 1, 2);

    @ObfuscatedName("y.l")
    public static final class18 field112 = new class18(2, 2, 0);

    @ObfuscatedName("y.g")
    public final int field113;

    @ObfuscatedName("y.b")
    public final int field114;

    @ObfuscatedName("y.a")
    public final int field115;

    public class18(int arg0, int arg1, int arg2) {
        this.field113 = arg0;
        this.field114 = arg1;
        this.field115 = arg2;
    }

    @ObfuscatedName("y.n(FI)Z")
    public boolean method178(float arg0) {
        return arg0 >= (float) this.field115;
    }

    @ObfuscatedName("y.h(II)Ly;")
    public static class18 method179(int arg0) {
        class18[] var1 = new class18[] { field117, field112, field111 };
        class18[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class18 var4 = var2[var3];
            if (var4.field114 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
