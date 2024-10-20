package deob;

@ObfuscatedName("ja")
public class class278 {

    @ObfuscatedName("ja.d")
    public static final class278 field3753 = new class278(0);

    @ObfuscatedName("ja.k")
    public static final class278 field3752 = new class278(1);

    @ObfuscatedName("ja.e")
    public static final class278 field3749 = new class278(2);

    @ObfuscatedName("ja.p")
    public final int field3750;

    public class278(int arg0) {
        this.field3750 = arg0;
    }

    @ObfuscatedName("ip.d(IB)Lja;")
    public static class278 method3966(int arg0) {
        class278[] var1 = new class278[] { field3752, field3749, field3753 };
        class278[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class278 var4 = var2[var3];
            if (var4.field3750 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
