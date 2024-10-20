package deob;

@ObfuscatedName("r")
public class class23 extends class205 {

    @ObfuscatedName("r.w")
    public static class194 field608 = new class194(128);

    @ObfuscatedName("r.x")
    public int[] field598;

    @ObfuscatedName("r.t")
    public int[] field600;

    @ObfuscatedName("r.p")
    public String[] field601;

    @ObfuscatedName("r.e")
    public int field604;

    @ObfuscatedName("r.y")
    public int field599;

    @ObfuscatedName("r.m")
    public int field603;

    @ObfuscatedName("r.c")
    public int field605;

    @ObfuscatedName("dj.w(II)Lr;")
    public static class23 method2669(int arg0) {
        class23 var1 = (class23) field608.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field170.method3127(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class120 var4 = new class120(var2);
        var4.field2012 = var4.field2013.length - 12;
        int var5 = var4.method2368();
        var3.field604 = var4.method2365();
        var3.field599 = var4.method2365();
        var3.field603 = var4.method2365();
        var3.field605 = var4.method2365();
        var4.field2012 = 0;
        var4.method2370();
        var3.field598 = new int[var5];
        var3.field600 = new int[var5];
        var3.field601 = new String[var5];
        int var6 = 0;
        while (var4.field2012 < var4.field2013.length - 12) {
            int var7 = var4.method2365();
            if (var7 == 3) {
                var3.field601[var6] = var4.method2540();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field600[var6] = var4.method2363();
            } else {
                var3.field600[var6] = var4.method2368();
            }
            var3.field598[var6++] = var7;
        }
        field608.method3522(var3, (long) arg0);
        return var3;
    }
}
