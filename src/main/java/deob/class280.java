package deob;

@ObfuscatedName("ji")
public class class280 {

    @ObfuscatedName("ji.w")
    public static final class280 field3742 = new class280(0);

    @ObfuscatedName("ji.o")
    public static final class280 field3741 = new class280(1);

    @ObfuscatedName("ji.x")
    public static final class280 field3740 = new class280(2);

    @ObfuscatedName("ji.k")
    public final int field3743;

    public class280(int arg0) {
        this.field3743 = arg0;
    }

    @ObfuscatedName("ek.w(II)Lji;")
    public static class280 method2624(int arg0) {
        class280[] var1 = new class280[] { field3741, field3742, field3740 };
        class280[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class280 var4 = var2[var3];
            if (var4.field3743 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
