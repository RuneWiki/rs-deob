package deob;

@ObfuscatedName("oi")
public class class374 {

    @ObfuscatedName("oi.aq")
    public static final class374 field4074 = new class374("LIVE", 0);

    @ObfuscatedName("oi.ad")
    public static final class374 field4072 = new class374("BUILDLIVE", 3);

    @ObfuscatedName("oi.ag")
    public static final class374 field4073 = new class374("RC", 1);

    @ObfuscatedName("oi.ak")
    public static final class374 field4071 = new class374("WIP", 2);

    @ObfuscatedName("oi.ap")
    public final String field4075;

    @ObfuscatedName("oi.an")
    public final int field4076;

    @ObfuscatedName("lu.aq(I)[Loi;")
    public static class374[] method5460() {
        return new class374[] { field4071, field4073, field4072, field4074 };
    }

    public class374(String arg0, int arg1) {
        this.field4075 = arg0;
        this.field4076 = arg1;
    }

    @ObfuscatedName("mi.ad(IB)Loi;")
    public static class374 method5514(int arg0) {
        class374[] var1 = method5460();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class374 var3 = var1[var2];
            if (var3.field4076 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
