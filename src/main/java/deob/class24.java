package deob;

@ObfuscatedName("n")
public class class24 extends class208 {

    @ObfuscatedName("n.e")
    public static class197 field614 = new class197(128);

    @ObfuscatedName("n.l")
    public int[] field612;

    @ObfuscatedName("n.c")
    public int[] field613;

    @ObfuscatedName("n.h")
    public String[] field621;

    @ObfuscatedName("n.r")
    public int field615;

    @ObfuscatedName("n.a")
    public int field616;

    @ObfuscatedName("n.b")
    public int field617;

    @ObfuscatedName("n.u")
    public int field618;

    @ObfuscatedName("bl.e(II)Ln;")
    public static class24 method1126(int arg0) {
        class24 var1 = (class24) field614.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field12.method3130(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class24 var3 = new class24();
        class123 var4 = new class123(var2);
        var4.field2062 = var4.field2055.length - 12;
        int var5 = var4.method2468();
        var3.field615 = var4.method2466();
        var3.field616 = var4.method2466();
        var3.field617 = var4.method2466();
        var3.field618 = var4.method2466();
        var4.field2062 = 0;
        var4.method2474();
        var3.field612 = new int[var5];
        var3.field613 = new int[var5];
        var3.field621 = new String[var5];
        int var6 = 0;
        while (var4.field2062 < var4.field2055.length - 12) {
            int var7 = var4.method2466();
            if (var7 == 3) {
                var3.field621[var6] = var4.method2471();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field613[var6] = var4.method2464();
            } else {
                var3.field613[var6] = var4.method2468();
            }
            var3.field612[var6++] = var7;
        }
        field614.method3591(var3, (long) arg0);
        return var3;
    }
}
