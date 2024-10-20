package deob;

@ObfuscatedName("ap")
public class class49 extends class130 {

    @ObfuscatedName("ap.u")
    public static class125 field930 = new class125(128);

    @ObfuscatedName("ap.x")
    public int[] field929;

    @ObfuscatedName("ap.i")
    public int[] field936;

    @ObfuscatedName("ap.a")
    public String[] field931;

    @ObfuscatedName("ap.f")
    public int field935;

    @ObfuscatedName("ap.c")
    public int field933;

    @ObfuscatedName("ap.d")
    public int field928;

    @ObfuscatedName("ap.l")
    public int field932;

    @ObfuscatedName("as.u(II)Lap;")
    public static class49 method848(int arg0) {
        class49 var1 = (class49) field930.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1899.method3071(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class154 var4 = new class154(var2);
        var4.field2073 = var4.field2078.length - 12;
        int var5 = var4.method2593();
        var3.field935 = var4.method2581();
        var3.field933 = var4.method2581();
        var3.field928 = var4.method2581();
        var3.field932 = var4.method2581();
        var4.field2073 = 0;
        var4.method2574();
        var3.field929 = new int[var5];
        var3.field936 = new int[var5];
        var3.field931 = new String[var5];
        int var6 = 0;
        while (var4.field2073 < var4.field2078.length - 12) {
            int var7 = var4.method2581();
            if (var7 == 3) {
                var3.field931[var6] = var4.method2778();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field936[var6] = var4.method2708();
            } else {
                var3.field936[var6] = var4.method2593();
            }
            var3.field929[var6++] = var7;
        }
        field930.method2179(var3, (long) arg0);
        return var3;
    }
}
