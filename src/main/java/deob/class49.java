package deob;

@ObfuscatedName("at")
public class class49 extends class130 {

    @ObfuscatedName("at.x")
    public static class125 field952 = new class125(128);

    @ObfuscatedName("at.n")
    public int[] field953;

    @ObfuscatedName("at.g")
    public int[] field958;

    @ObfuscatedName("at.v")
    public String[] field955;

    @ObfuscatedName("at.y")
    public int field956;

    @ObfuscatedName("at.p")
    public int field957;

    @ObfuscatedName("at.j")
    public int field959;

    @ObfuscatedName("at.m")
    public int field954;

    @ObfuscatedName("ae.x(IB)Lat;")
    public static class49 method692(int arg0) {
        class49 var1 = (class49) field952.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1359.method3153(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class154 var4 = new class154(var2);
        var4.field2087 = var4.field2086.length - 12;
        int var5 = var4.method2803();
        var3.field956 = var4.method2833();
        var3.field957 = var4.method2833();
        var3.field959 = var4.method2833();
        var3.field954 = var4.method2833();
        var4.field2087 = 0;
        var4.method2708();
        var3.field953 = new int[var5];
        var3.field958 = new int[var5];
        var3.field955 = new String[var5];
        int var6 = 0;
        while (var4.field2087 < var4.field2086.length - 12) {
            int var7 = var4.method2833();
            if (var7 == 3) {
                var3.field955[var6] = var4.method2709();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field958[var6] = var4.method2878();
            } else {
                var3.field958[var6] = var4.method2803();
            }
            var3.field953[var6++] = var7;
        }
        field952.method2282(var3, (long) arg0);
        return var3;
    }
}
