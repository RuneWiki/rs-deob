package deob;

@ObfuscatedName("ac")
public class class49 extends class130 {

    @ObfuscatedName("ac.i")
    public static class125 field954 = new class125(128);

    @ObfuscatedName("ac.e")
    public int[] field951;

    @ObfuscatedName("ac.f")
    public int[] field949;

    @ObfuscatedName("ac.k")
    public String[] field952;

    @ObfuscatedName("ac.g")
    public int field953;

    @ObfuscatedName("ac.n")
    public int field956;

    @ObfuscatedName("ac.a")
    public int field955;

    @ObfuscatedName("ac.q")
    public int field950;

    @ObfuscatedName("fa.i(II)Lac;")
    public static class49 method2780(int arg0) {
        class49 var1 = (class49) field954.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1112.method3014(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class154 var4 = new class154(var2);
        var4.field2091 = var4.field2094.length - 12;
        int var5 = var4.method2658();
        var3.field953 = var4.method2575();
        var3.field956 = var4.method2575();
        var3.field955 = var4.method2575();
        var3.field950 = var4.method2575();
        var4.field2091 = 0;
        var4.method2580();
        var3.field951 = new int[var5];
        var3.field949 = new int[var5];
        var3.field952 = new String[var5];
        int var6 = 0;
        while (var4.field2091 < var4.field2094.length - 12) {
            int var7 = var4.method2575();
            if (var7 == 3) {
                var3.field952[var6] = var4.method2581();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field949[var6] = var4.method2573();
            } else {
                var3.field949[var6] = var4.method2658();
            }
            var3.field951[var6++] = var7;
        }
        field954.method2152(var3, (long) arg0);
        return var3;
    }
}
