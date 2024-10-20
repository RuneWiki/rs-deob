package deob;

@ObfuscatedName("e")
public class class23 extends class204 {

    @ObfuscatedName("e.g")
    public static class193 field595 = new class193(128);

    @ObfuscatedName("e.b")
    public int[] field596;

    @ObfuscatedName("e.w")
    public int[] field600;

    @ObfuscatedName("e.d")
    public String[] field598;

    @ObfuscatedName("e.z")
    public int field599;

    @ObfuscatedName("e.l")
    public int field603;

    @ObfuscatedName("e.m")
    public int field601;

    @ObfuscatedName("e.p")
    public int field602;

    @ObfuscatedName("fy.g(II)Le;")
    public static class23 method3254(int arg0) {
        class23 var1 = (class23) field595.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field985.method3112(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1977 = var4.field1986.length - 12;
        int var5 = var4.method2367();
        var3.field599 = var4.method2376();
        var3.field603 = var4.method2376();
        var3.field601 = var4.method2376();
        var3.field602 = var4.method2376();
        var4.field1977 = 0;
        var4.method2369();
        var3.field596 = new int[var5];
        var3.field600 = new int[var5];
        var3.field598 = new String[var5];
        int var6 = 0;
        while (var4.field1977 < var4.field1986.length - 12) {
            int var7 = var4.method2376();
            if (var7 == 3) {
                var3.field598[var6] = var4.method2370();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field600[var6] = var4.method2362();
            } else {
                var3.field600[var6] = var4.method2367();
            }
            var3.field596[var6++] = var7;
        }
        field595.method3528(var3, (long) arg0);
        return var3;
    }
}
