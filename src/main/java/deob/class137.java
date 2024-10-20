package deob;

@ObfuscatedName("ef")
public class class137 {

    @ObfuscatedName("ef.g")
    public static final class137 field2314 = new class137(0);

    @ObfuscatedName("ef.m")
    public static final class137 field2309 = new class137(1);

    @ObfuscatedName("ef.v")
    public static final class137 field2310 = new class137(2);

    @ObfuscatedName("ef.r")
    public final int field2311;

    @ObfuscatedName("aa.g(B)[Lef;")
    public static class137[] method626() {
        return new class137[] { field2310, field2314, field2309 };
    }

    public class137(int arg0) {
        this.field2311 = arg0;
    }

    @ObfuscatedName("dr.m(II)Lef;")
    public static class137 method2610(int arg0) {
        class137[] var1 = method626();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class137 var3 = var1[var2];
            if (var3.field2311 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
