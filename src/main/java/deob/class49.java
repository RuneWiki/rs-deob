package deob;

@ObfuscatedName("ad")
public class class49 extends class130 {

    @ObfuscatedName("ad.b")
    public static class125 field958 = new class125(128);

    @ObfuscatedName("ad.e")
    public int[] field949;

    @ObfuscatedName("ad.c")
    public int[] field950;

    @ObfuscatedName("ad.l")
    public String[] field951;

    @ObfuscatedName("ad.y")
    public int field953;

    @ObfuscatedName("ad.j")
    public int field952;

    @ObfuscatedName("ad.g")
    public int field954;

    @ObfuscatedName("ad.s")
    public int field955;

    @ObfuscatedName("x.b(IB)Lad;")
    public static class49 method207(int arg0) {
        class49 var1 = (class49) field958.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1644.method3126(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class154 var4 = new class154(var2);
        var4.field2079 = var4.field2084.length - 12;
        int var5 = var4.method2815();
        var3.field953 = var4.method2671();
        var3.field952 = var4.method2671();
        var3.field954 = var4.method2671();
        var3.field955 = var4.method2671();
        var4.field2079 = 0;
        var4.method2676();
        var3.field949 = new int[var5];
        var3.field950 = new int[var5];
        var3.field951 = new String[var5];
        int var6 = 0;
        while (var4.field2079 < var4.field2084.length - 12) {
            int var7 = var4.method2671();
            if (var7 == 3) {
                var3.field951[var6] = var4.method2677();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field950[var6] = var4.method2669();
            } else {
                var3.field950[var6] = var4.method2815();
            }
            var3.field949[var6++] = var7;
        }
        field958.method2250(var3, (long) arg0);
        return var3;
    }
}
