package deob;

@ObfuscatedName("ve")
public class class571 {

    @ObfuscatedName("ve.ac")
    public static final class571 field5567 = new class571(0);

    @ObfuscatedName("ve.ae")
    public static final class571 field5570 = new class571(1);

    @ObfuscatedName("ve.ag")
    public static final class571 field5569 = new class571(2);

    @ObfuscatedName("ve.am")
    public final int field5568;

    public class571(int arg0) {
        this.field5568 = arg0;
    }

    @ObfuscatedName("dl.ac(IB)Lve;")
    public static class571 method2301(int arg0) {
        class571[] var1 = new class571[] { field5567, field5569, field5570 };
        class571[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class571 var4 = var2[var3];
            if (var4.field5568 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
