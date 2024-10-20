package deob;

@ObfuscatedName("a")
public class class18 {

    @ObfuscatedName("a.q")
    public static final class18 field114 = new class18(0, 0, 4);

    @ObfuscatedName("a.w")
    public static final class18 field119 = new class18(2, 1, 2);

    @ObfuscatedName("a.e")
    public static final class18 field117 = new class18(1, 2, 0);

    @ObfuscatedName("a.p")
    public final int field113;

    @ObfuscatedName("a.k")
    public final int field115;

    @ObfuscatedName("a.l")
    public final int field116;

    @ObfuscatedName("a.q(B)[La;")
    public static class18[] method164() {
        return new class18[] { field114, field119, field117 };
    }

    public class18(int arg0, int arg1, int arg2) {
        this.field113 = arg0;
        this.field115 = arg1;
        this.field116 = arg2;
    }

    @ObfuscatedName("a.w(FI)Z")
    public boolean method170(float arg0) {
        return arg0 >= (float) this.field116;
    }

    @ObfuscatedName("a.e(II)La;")
    public static class18 method163(int arg0) {
        class18[] var1 = method164();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class18 var3 = var1[var2];
            if (var3.field115 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
