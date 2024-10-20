package deob;

@ObfuscatedName("ja")
public class class280 {

    @ObfuscatedName("ja.s")
    public static final class280 field3743 = new class280(0);

    @ObfuscatedName("ja.c")
    public static final class280 field3742 = new class280(1);

    @ObfuscatedName("ja.f")
    public static final class280 field3744 = new class280(2);

    @ObfuscatedName("ja.m")
    public final int field3745;

    public class280(int arg0) {
        this.field3745 = arg0;
    }

    @ObfuscatedName("iy.s(II)Lja;")
    public static class280 method4204(int arg0) {
        class280[] var1 = new class280[] { field3744, field3742, field3743 };
        class280[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class280 var4 = var2[var3];
            if (var4.field3745 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
