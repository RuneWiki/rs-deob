package deob;

@ObfuscatedName("ec")
public class class144 {

    @ObfuscatedName("ec.b")
    public static final class144 field2173 = new class144("LIVE", 0);

    @ObfuscatedName("ec.e")
    public static final class144 field2169 = new class144("BUILDLIVE", 3);

    @ObfuscatedName("ec.a")
    public static final class144 field2170 = new class144("RC", 1);

    @ObfuscatedName("ec.k")
    public static final class144 field2171 = new class144("WIP", 2);

    @ObfuscatedName("ec.p")
    public final String field2172;

    @ObfuscatedName("ec.l")
    public final int field2174;

    public class144(String arg0, int arg1) {
        this.field2172 = arg0;
        this.field2174 = arg1;
    }

    @ObfuscatedName("al.b(IB)Lec;")
    public static class144 method617(int arg0) {
        class144[] var1 = new class144[] { field2169, field2170, field2171, field2173 };
        class144[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class144 var4 = var2[var3];
            if (var4.field2174 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
