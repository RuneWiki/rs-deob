package deob;

@ObfuscatedName("ag")
public class class49 extends class130 {

    @ObfuscatedName("ag.x")
    public static class125 field965 = new class125(128);

    @ObfuscatedName("ag.j")
    public int[] field960;

    @ObfuscatedName("ag.c")
    public int[] field961;

    @ObfuscatedName("ag.d")
    public String[] field962;

    @ObfuscatedName("ag.w")
    public int field959;

    @ObfuscatedName("ag.h")
    public int field964;

    @ObfuscatedName("ag.u")
    public int field967;

    @ObfuscatedName("ag.k")
    public int field966;

    @ObfuscatedName("ec.x(II)Lag;")
    public static class49 method2621(int arg0) {
        class49 var1 = (class49) field965.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1764.method3121(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class154 var4 = new class154(var2);
        var4.field2086 = var4.field2091.length - 12;
        int var5 = var4.method2644();
        var3.field959 = var4.method2745();
        var3.field964 = var4.method2745();
        var3.field967 = var4.method2745();
        var3.field966 = var4.method2745();
        var4.field2086 = 0;
        var4.method2646();
        var3.field960 = new int[var5];
        var3.field961 = new int[var5];
        var3.field962 = new String[var5];
        int var6 = 0;
        while (var4.field2086 < var4.field2091.length - 12) {
            int var7 = var4.method2745();
            if (var7 == 3) {
                var3.field962[var6] = var4.method2699();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field961[var6] = var4.method2701();
            } else {
                var3.field961[var6] = var4.method2644();
            }
            var3.field960[var6++] = var7;
        }
        field965.method2223(var3, (long) arg0);
        return var3;
    }
}
