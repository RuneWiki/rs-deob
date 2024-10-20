package deob;

@ObfuscatedName("e")
public class class5 extends class174 {

    @ObfuscatedName("e.j")
    public static class170 field69 = new class170(128);

    @ObfuscatedName("e.r")
    public int[] field58;

    @ObfuscatedName("e.v")
    public int[] field59;

    @ObfuscatedName("e.p")
    public String[] field60;

    @ObfuscatedName("e.e")
    public int field61;

    @ObfuscatedName("e.d")
    public int field62;

    @ObfuscatedName("e.y")
    public int field63;

    @ObfuscatedName("e.x")
    public int field64;

    @ObfuscatedName("t.j(II)Le;")
    public static class5 method119(int arg0) {
        class5 var1 = (class5) field69.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1505.method3016(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2022 = var4.field2025.length - 12;
        int var5 = var4.method2446();
        var3.field61 = var4.method2609();
        var3.field62 = var4.method2609();
        var3.field63 = var4.method2609();
        var3.field64 = var4.method2609();
        var4.field2022 = 0;
        var4.method2607();
        var3.field58 = new int[var5];
        var3.field59 = new int[var5];
        var3.field60 = new String[var5];
        int var6 = 0;
        while (var4.field2022 < var4.field2025.length - 12) {
            int var7 = var4.method2609();
            if (var7 == 3) {
                var3.field60[var6] = var4.method2449();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field59[var6] = var4.method2441();
            } else {
                var3.field59[var6] = var4.method2446();
            }
            var3.field58[var6++] = var7;
        }
        field69.method3257(var3, (long) arg0);
        return var3;
    }
}
