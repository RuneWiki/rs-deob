package deob;

@ObfuscatedName("lf")
public class class321 {

    @ObfuscatedName("lf.c")
    public static final class321 field3933 = new class321(0);

    @ObfuscatedName("lf.i")
    public static final class321 field3931 = new class321(1);

    @ObfuscatedName("lf.o")
    public static final class321 field3932 = new class321(2);

    @ObfuscatedName("lf.j")
    public final int field3930;

    public class321(int arg0) {
        this.field3930 = arg0;
    }

    @ObfuscatedName("bq.c(II)Llf;")
    public static class321 method998(int arg0) {
        class321[] var1 = new class321[] { field3933, field3932, field3931 };
        class321[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class321 var4 = var2[var3];
            if (var4.field3930 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
