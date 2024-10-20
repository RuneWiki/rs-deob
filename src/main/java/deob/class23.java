package deob;

@ObfuscatedName("o")
public class class23 extends class204 {

    @ObfuscatedName("o.m")
    public static class193 field562 = new class193(128);

    @ObfuscatedName("o.l")
    public int[] field560;

    @ObfuscatedName("o.y")
    public int[] field561;

    @ObfuscatedName("o.u")
    public String[] field565;

    @ObfuscatedName("o.k")
    public int field559;

    @ObfuscatedName("o.j")
    public int field564;

    @ObfuscatedName("o.i")
    public int field568;

    @ObfuscatedName("o.x")
    public int field566;

    @ObfuscatedName("cn.m(II)Lo;")
    public static class23 method2178(int arg0) {
        class23 var1 = (class23) field562.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2142.method3080(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1955 = var4.field1959.length - 12;
        int var5 = var4.method2386();
        var3.field559 = var4.method2541();
        var3.field564 = var4.method2541();
        var3.field568 = var4.method2541();
        var3.field566 = var4.method2541();
        var4.field1955 = 0;
        var4.method2388();
        var3.field560 = new int[var5];
        var3.field561 = new int[var5];
        var3.field565 = new String[var5];
        int var6 = 0;
        while (var4.field1955 < var4.field1959.length - 12) {
            int var7 = var4.method2541();
            if (var7 == 3) {
                var3.field565[var6] = var4.method2389();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field561[var6] = var4.method2562();
            } else {
                var3.field561[var6] = var4.method2386();
            }
            var3.field560[var6++] = var7;
        }
        field562.method3539(var3, (long) arg0);
        return var3;
    }
}
