package deob;

@ObfuscatedName("b")
public class class5 extends class174 {

    @ObfuscatedName("b.t")
    public static class170 field88 = new class170(128);

    @ObfuscatedName("b.l")
    public int[] field74;

    @ObfuscatedName("b.c")
    public int[] field75;

    @ObfuscatedName("b.d")
    public String[] field76;

    @ObfuscatedName("b.b")
    public int field77;

    @ObfuscatedName("b.i")
    public int field80;

    @ObfuscatedName("b.p")
    public int field84;

    @ObfuscatedName("b.y")
    public int field78;

    @ObfuscatedName("q.t(II)Lb;")
    public static class5 method146(int arg0) {
        class5 var1 = (class5) field88.method3260((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field191.method2987(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2059 = var4.field2061.length - 12;
        int var5 = var4.method2448();
        var3.field77 = var4.method2440();
        var3.field80 = var4.method2440();
        var3.field84 = var4.method2440();
        var3.field78 = var4.method2440();
        var4.field2059 = 0;
        var4.method2510();
        var3.field74 = new int[var5];
        var3.field75 = new int[var5];
        var3.field76 = new String[var5];
        int var6 = 0;
        while (var4.field2059 < var4.field2061.length - 12) {
            int var7 = var4.method2440();
            if (var7 == 3) {
                var3.field76[var6] = var4.method2627();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field75[var6] = var4.method2438();
            } else {
                var3.field75[var6] = var4.method2448();
            }
            var3.field74[var6++] = var7;
        }
        field88.method3261(var3, (long) arg0);
        return var3;
    }
}
