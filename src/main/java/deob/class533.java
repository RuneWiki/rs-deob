package deob;

@ObfuscatedName("ut")
public class class533 {

    @ObfuscatedName("ut.aw")
    public static final class533 field5207 = new class533(0);

    @ObfuscatedName("ut.ay")
    public static final class533 field5206 = new class533(1);

    @ObfuscatedName("ut.ar")
    public static final class533 field5208 = new class533(2);

    @ObfuscatedName("ut.am")
    public final int field5209;

    public class533(int arg0) {
        this.field5209 = arg0;
    }

    @ObfuscatedName("iv.aw(II)Lut;")
    public static class533 method4145(int arg0) {
        class533[] var1 = new class533[] { field5208, field5207, field5206 };
        class533[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class533 var4 = var2[var3];
            if (var4.field5209 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
