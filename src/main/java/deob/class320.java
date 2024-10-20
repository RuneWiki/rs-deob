package deob;

@ObfuscatedName("ls")
public class class320 {

    @ObfuscatedName("ls.m")
    public static final class320 field3820 = new class320(0);

    @ObfuscatedName("ls.o")
    public static final class320 field3819 = new class320(1);

    @ObfuscatedName("ls.q")
    public static final class320 field3821 = new class320(2);

    @ObfuscatedName("ls.j")
    public final int field3818;

    public class320(int arg0) {
        this.field3818 = arg0;
    }

    @ObfuscatedName("bv.m(II)Lls;")
    public static class320 method1064(int arg0) {
        class320[] var1 = new class320[] { field3819, field3821, field3820 };
        class320[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class320 var4 = var2[var3];
            if (var4.field3818 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
