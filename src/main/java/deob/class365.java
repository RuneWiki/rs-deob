package deob;

@ObfuscatedName("ot")
public class class365 {

    @ObfuscatedName("ot.az")
    public static final class365 field3979 = new class365("LIVE", 0);

    @ObfuscatedName("ot.ah")
    public static final class365 field3977 = new class365("BUILDLIVE", 3);

    @ObfuscatedName("ot.af")
    public static final class365 field3978 = new class365("RC", 1);

    @ObfuscatedName("ot.at")
    public static final class365 field3981 = new class365("WIP", 2);

    @ObfuscatedName("ot.an")
    public final String field3976;

    @ObfuscatedName("ot.ao")
    public final int field3980;

    @ObfuscatedName("jm.az(I)[Lot;")
    public static class365[] method4520() {
        return new class365[] { field3977, field3978, field3981, field3979 };
    }

    public class365(String arg0, int arg1) {
        this.field3976 = arg0;
        this.field3980 = arg1;
    }

    @ObfuscatedName("iy.ah(IB)Lot;")
    public static class365 method3965(int arg0) {
        class365[] var1 = method4520();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class365 var3 = var1[var2];
            if (var3.field3980 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
