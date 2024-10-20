package deob;

@ObfuscatedName("lw")
public class class321 {

    @ObfuscatedName("lw.h")
    public static final class321 field3834 = new class321(0);

    @ObfuscatedName("lw.v")
    public static final class321 field3833 = new class321(1);

    @ObfuscatedName("lw.x")
    public static final class321 field3835 = new class321(2);

    @ObfuscatedName("lw.w")
    public final int field3836;

    public class321(int arg0) {
        this.field3836 = arg0;
    }

    @ObfuscatedName("bh.h(II)Llw;")
    public static class321 method719(int arg0) {
        class321[] var1 = new class321[] { field3835, field3834, field3833 };
        class321[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class321 var4 = var2[var3];
            if (var4.field3836 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
