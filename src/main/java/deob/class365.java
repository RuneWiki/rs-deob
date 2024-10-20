package deob;

@ObfuscatedName("oy")
public class class365 {

    @ObfuscatedName("oy.aq")
    public static final class365 field3976 = new class365("LIVE", 0);

    @ObfuscatedName("oy.aw")
    public static final class365 field3981 = new class365("BUILDLIVE", 3);

    @ObfuscatedName("oy.al")
    public static final class365 field3980 = new class365("RC", 1);

    @ObfuscatedName("oy.ai")
    public static final class365 field3974 = new class365("WIP", 2);

    @ObfuscatedName("oy.ar")
    public final String field3977;

    @ObfuscatedName("oy.as")
    public final int field3978;

    public class365(String arg0, int arg1) {
        this.field3977 = arg0;
        this.field3978 = arg1;
    }

    @ObfuscatedName("bk.aq(IB)Loy;")
    public static class365 method445(int arg0) {
        class365[] var1 = new class365[] { field3980, field3981, field3974, field3976 };
        class365[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class365 var4 = var2[var3];
            if (var4.field3978 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
