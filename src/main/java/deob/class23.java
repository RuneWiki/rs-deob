package deob;

@ObfuscatedName("y")
public class class23 extends class204 {

    @ObfuscatedName("y.l")
    public static class193 field598 = new class193(128);

    @ObfuscatedName("y.e")
    public int[] field603;

    @ObfuscatedName("y.q")
    public int[] field595;

    @ObfuscatedName("y.o")
    public String[] field596;

    @ObfuscatedName("y.g")
    public int field597;

    @ObfuscatedName("y.m")
    public int field605;

    @ObfuscatedName("y.b")
    public int field594;

    @ObfuscatedName("y.p")
    public int field599;

    @ObfuscatedName("fv.l(II)Ly;")
    public static class23 method2983(int arg0) {
        class23 var1 = (class23) field598.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1951.method3050(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1988 = var4.field1986.length - 12;
        int var5 = var4.method2393();
        var3.field597 = var4.method2440();
        var3.field605 = var4.method2440();
        var3.field594 = var4.method2440();
        var3.field599 = var4.method2440();
        var4.field1988 = 0;
        var4.method2395();
        var3.field603 = new int[var5];
        var3.field595 = new int[var5];
        var3.field596 = new String[var5];
        int var6 = 0;
        while (var4.field1988 < var4.field1986.length - 12) {
            int var7 = var4.method2440();
            if (var7 == 3) {
                var3.field596[var6] = var4.method2396();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field595[var6] = var4.method2388();
            } else {
                var3.field595[var6] = var4.method2393();
            }
            var3.field603[var6++] = var7;
        }
        field598.method3479(var3, (long) arg0);
        return var3;
    }
}
