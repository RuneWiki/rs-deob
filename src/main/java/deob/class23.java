package deob;

@ObfuscatedName("v")
public class class23 extends class205 {

    @ObfuscatedName("v.t")
    public static class194 field594 = new class194(128);

    @ObfuscatedName("v.i")
    public int[] field581;

    @ObfuscatedName("v.g")
    public int[] field587;

    @ObfuscatedName("v.h")
    public String[] field583;

    @ObfuscatedName("v.z")
    public int field584;

    @ObfuscatedName("v.r")
    public int field585;

    @ObfuscatedName("v.f")
    public int field586;

    @ObfuscatedName("v.s")
    public int field595;

    @ObfuscatedName("f.t(II)Lv;")
    public static class23 method80(int arg0) {
        class23 var1 = (class23) field594.method3453((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2068.method3002(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class120 var4 = new class120(var2);
        var4.field2001 = var4.field2002.length - 12;
        int var5 = var4.method2345();
        var3.field584 = var4.method2310();
        var3.field585 = var4.method2310();
        var3.field586 = var4.method2310();
        var3.field595 = var4.method2310();
        var4.field2001 = 0;
        var4.method2406();
        var3.field581 = new int[var5];
        var3.field587 = new int[var5];
        var3.field583 = new String[var5];
        int var6 = 0;
        while (var4.field2001 < var4.field2002.length - 12) {
            int var7 = var4.method2310();
            if (var7 == 3) {
                var3.field583[var6] = var4.method2316();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field587[var6] = var4.method2334();
            } else {
                var3.field587[var6] = var4.method2345();
            }
            var3.field581[var6++] = var7;
        }
        field594.method3461(var3, (long) arg0);
        return var3;
    }
}
