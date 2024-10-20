package deob;

@ObfuscatedName("va")
public class class549 {

    @ObfuscatedName("va.ac")
    public static final class549 field5273 = new class549(0);

    @ObfuscatedName("va.al")
    public static final class549 field5275 = new class549(1);

    @ObfuscatedName("va.ak")
    public static final class549 field5274 = new class549(2);

    @ObfuscatedName("va.ax")
    public final int field5272;

    public class549(int arg0) {
        this.field5272 = arg0;
    }

    @ObfuscatedName("ee.ac(II)Lva;")
    public static class549 method2784(int arg0) {
        class549[] var1 = new class549[] { field5273, field5274, field5275 };
        class549[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class549 var4 = var2[var3];
            if (var4.field5272 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
