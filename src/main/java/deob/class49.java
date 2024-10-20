package deob;

@ObfuscatedName("ay")
public class class49 extends class130 {

    @ObfuscatedName("ay.q")
    public static class125 field971 = new class125(128);

    @ObfuscatedName("ay.d")
    public int[] field960;

    @ObfuscatedName("ay.h")
    public int[] field961;

    @ObfuscatedName("ay.p")
    public String[] field969;

    @ObfuscatedName("ay.j")
    public int field965;

    @ObfuscatedName("ay.n")
    public int field962;

    @ObfuscatedName("ay.r")
    public int field966;

    @ObfuscatedName("ay.c")
    public int field964;

    @ObfuscatedName("gj.q(IB)Lay;")
    public static class49 method3191(int arg0) {
        class49 var1 = (class49) field971.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2014.method3133(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class154 var4 = new class154(var2);
        var4.field2091 = var4.field2092.length - 12;
        int var5 = var4.method2798();
        var3.field965 = var4.method2668();
        var3.field962 = var4.method2668();
        var3.field966 = var4.method2668();
        var3.field964 = var4.method2668();
        var4.field2091 = 0;
        var4.method2717();
        var3.field960 = new int[var5];
        var3.field961 = new int[var5];
        var3.field969 = new String[var5];
        int var6 = 0;
        while (var4.field2091 < var4.field2092.length - 12) {
            int var7 = var4.method2668();
            if (var7 == 3) {
                var3.field969[var6] = var4.method2701();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field961[var6] = var4.method2666();
            } else {
                var3.field961[var6] = var4.method2798();
            }
            var3.field960[var6++] = var7;
        }
        field971.method2248(var3, (long) arg0);
        return var3;
    }
}
