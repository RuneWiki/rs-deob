package deob;

@ObfuscatedName("r")
public class class5 extends class175 {

    @ObfuscatedName("r.l")
    public static class171 field59 = new class171(128);

    @ObfuscatedName("r.b")
    public int[] field58;

    @ObfuscatedName("r.o")
    public int[] field61;

    @ObfuscatedName("r.w")
    public String[] field72;

    @ObfuscatedName("r.r")
    public int field65;

    @ObfuscatedName("r.k")
    public int field62;

    @ObfuscatedName("r.z")
    public int field63;

    @ObfuscatedName("r.g")
    public int field64;

    @ObfuscatedName("cm.l(II)Lr;")
    public static class5 method1845(int arg0) {
        class5 var1 = (class5) field59.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field25.method3029(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2022 = var4.field2024.length - 12;
        int var5 = var4.method2586();
        var3.field65 = var4.method2442();
        var3.field62 = var4.method2442();
        var3.field63 = var4.method2442();
        var3.field64 = var4.method2442();
        var4.field2022 = 0;
        var4.method2571();
        var3.field58 = new int[var5];
        var3.field61 = new int[var5];
        var3.field72 = new String[var5];
        int var6 = 0;
        while (var4.field2022 < var4.field2024.length - 12) {
            int var7 = var4.method2442();
            if (var7 == 3) {
                var3.field72[var6] = var4.method2471();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field61[var6] = var4.method2440();
            } else {
                var3.field61[var6] = var4.method2586();
            }
            var3.field58[var6++] = var7;
        }
        field59.method3253(var3, (long) arg0);
        return var3;
    }
}
