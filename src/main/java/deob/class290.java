package deob;

@ObfuscatedName("ku")
public class class290 {

    @ObfuscatedName("ku.a")
    public static final class290 field3807 = new class290(0);

    @ObfuscatedName("ku.w")
    public static final class290 field3808 = new class290(1);

    @ObfuscatedName("ku.e")
    public static final class290 field3809 = new class290(2);

    @ObfuscatedName("ku.k")
    public final int field3810;

    public class290(int arg0) {
        this.field3810 = arg0;
    }

    @ObfuscatedName("id.a(II)Lku;")
    public static class290 method3994(int arg0) {
        class290[] var1 = new class290[] { field3807, field3808, field3809 };
        class290[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class290 var4 = var2[var3];
            if (var4.field3810 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
