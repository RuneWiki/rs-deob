package deob;

@ObfuscatedName("kb")
public class class310 {

    @ObfuscatedName("kb.f")
    public static final class310 field3796 = new class310(0);

    @ObfuscatedName("kb.h")
    public static final class310 field3797 = new class310(1);

    @ObfuscatedName("kb.e")
    public static final class310 field3802 = new class310(2);

    @ObfuscatedName("kb.b")
    public final int field3799;

    public class310(int arg0) {
        this.field3799 = arg0;
    }

    @ObfuscatedName("in.f(II)Lkb;")
    public static class310 method4251(int arg0) {
        class310[] var1 = new class310[] { field3802, field3796, field3797 };
        class310[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class310 var4 = var2[var3];
            if (var4.field3799 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
