package deob;

@ObfuscatedName("ld")
public class class321 {

    @ObfuscatedName("ld.n")
    public static final class321 field3830 = new class321(0);

    @ObfuscatedName("ld.v")
    public static final class321 field3831 = new class321(1);

    @ObfuscatedName("ld.d")
    public static final class321 field3832 = new class321(2);

    @ObfuscatedName("ld.c")
    public final int field3833;

    public class321(int arg0) {
        this.field3833 = arg0;
    }

    @ObfuscatedName("fg.n(IB)Lld;")
    public static class321 method3324(int arg0) {
        class321[] var1 = new class321[] { field3832, field3830, field3831 };
        class321[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class321 var4 = var2[var3];
            if (var4.field3833 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
