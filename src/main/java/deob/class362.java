package deob;

@ObfuscatedName("ng")
public class class362 {

    @ObfuscatedName("ng.ac")
    public static final class362 field3908 = new class362("LIVE", 0);

    @ObfuscatedName("ng.al")
    public static final class362 field3909 = new class362("BUILDLIVE", 3);

    @ObfuscatedName("ng.ak")
    public static final class362 field3912 = new class362("RC", 1);

    @ObfuscatedName("ng.ax")
    public static final class362 field3911 = new class362("WIP", 2);

    @ObfuscatedName("ng.ao")
    public final String field3910;

    @ObfuscatedName("ng.ah")
    public final int field3913;

    @ObfuscatedName("ik.ac(I)[Lng;")
    public static class362[] method3533() {
        return new class362[] { field3908, field3909, field3912, field3911 };
    }

    public class362(String arg0, int arg1) {
        this.field3910 = arg0;
        this.field3913 = arg1;
    }

    @ObfuscatedName("qy.al(IB)Lng;")
    public static class362 method7155(int arg0) {
        class362[] var1 = method3533();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class362 var3 = var1[var2];
            if (var3.field3913 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
