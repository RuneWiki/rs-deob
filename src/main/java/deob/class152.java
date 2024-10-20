package deob;

@ObfuscatedName("ei")
public class class152 extends class143 {

    @ObfuscatedName("ei.h")
    public static class101 field2260 = new class101(128);

    @ObfuscatedName("ei.r")
    public int[] field2263;

    @ObfuscatedName("ei.d")
    public int[] field2261;

    @ObfuscatedName("ei.k")
    public String[] field2262;

    @ObfuscatedName("ei.u")
    public int field2266;

    @ObfuscatedName("ei.v")
    public int field2264;

    @ObfuscatedName("ei.f")
    public int field2259;

    @ObfuscatedName("ei.s")
    public int field2265;

    @ObfuscatedName("cb.k(II)Lei;")
    public static class152 method1102(int arg0) {
        class152 var1 = (class152) field2260.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1727.method1024(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class152 var3 = new class152();
        class136 var4 = new class136(var2);
        var4.field1722 = var4.field1725.length - 12;
        int var5 = var4.method1607();
        var3.field2266 = var4.method1712();
        var3.field2264 = var4.method1712();
        var3.field2259 = var4.method1712();
        var3.field2265 = var4.method1712();
        var4.field1722 = 0;
        var4.method1609();
        var3.field2263 = new int[var5];
        var3.field2261 = new int[var5];
        var3.field2262 = new String[var5];
        int var6 = 0;
        while (var4.field1722 < var4.field1725.length - 12) {
            int var7 = var4.method1712();
            if (var7 == 3) {
                var3.field2262[var6] = var4.method1610();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field2261[var6] = var4.method1602();
            } else {
                var3.field2261[var6] = var4.method1607();
            }
            var3.field2263[var6++] = var7;
        }
        field2260.method1238(var3, (long) arg0);
        return var3;
    }
}
