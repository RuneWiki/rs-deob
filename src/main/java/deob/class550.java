package deob;

@ObfuscatedName("ve")
public class class550 {

    @ObfuscatedName("ve.am")
    public static final class550 field5316 = new class550(0);

    @ObfuscatedName("ve.ap")
    public static final class550 field5315 = new class550(1);

    @ObfuscatedName("ve.af")
    public static final class550 field5317 = new class550(2);

    @ObfuscatedName("ve.aj")
    public final int field5318;

    @ObfuscatedName("ir.am(B)[Lve;")
    public static class550[] method4166() {
        return new class550[] { field5315, field5316, field5317 };
    }

    public class550(int arg0) {
        this.field5318 = arg0;
    }

    @ObfuscatedName("oa.ap(II)Lve;")
    public static class550 method6540(int arg0) {
        class550[] var1 = method4166();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class550 var3 = var1[var2];
            if (var3.field5318 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
