package deob;

@ObfuscatedName("ko")
public class class311 {

    @ObfuscatedName("ko.m")
    public static final class311 field3807 = new class311(0);

    @ObfuscatedName("ko.f")
    public static final class311 field3806 = new class311(1);

    @ObfuscatedName("ko.q")
    public static final class311 field3808 = new class311(2);

    @ObfuscatedName("ko.w")
    public final int field3805;

    public class311(int arg0) {
        this.field3805 = arg0;
    }

    @ObfuscatedName("ic.m(IB)Lko;")
    public static class311 method4369(int arg0) {
        class311[] var1 = new class311[] { field3806, field3808, field3807 };
        class311[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class311 var4 = var2[var3];
            if (var4.field3805 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
