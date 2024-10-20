package deob;

@ObfuscatedName("b")
public class class23 extends class205 {

    @ObfuscatedName("b.a")
    public static class194 field608 = new class194(128);

    @ObfuscatedName("b.w")
    public int[] field599;

    @ObfuscatedName("b.d")
    public int[] field607;

    @ObfuscatedName("b.c")
    public String[] field601;

    @ObfuscatedName("b.y")
    public int field602;

    @ObfuscatedName("b.k")
    public int field600;

    @ObfuscatedName("b.r")
    public int field604;

    @ObfuscatedName("b.p")
    public int field605;

    @ObfuscatedName("j.a(IB)Lb;")
    public static class23 method221(int arg0) {
        class23 var1 = (class23) field608.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3138.method3188(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class120 var4 = new class120(var2);
        var4.field1993 = var4.field1994.length - 12;
        int var5 = var4.method2467();
        var3.field602 = var4.method2464();
        var3.field600 = var4.method2464();
        var3.field604 = var4.method2464();
        var3.field605 = var4.method2464();
        var4.field1993 = 0;
        var4.method2550();
        var3.field599 = new int[var5];
        var3.field607 = new int[var5];
        var3.field601 = new String[var5];
        int var6 = 0;
        while (var4.field1993 < var4.field1994.length - 12) {
            int var7 = var4.method2464();
            if (var7 == 3) {
                var3.field601[var6] = var4.method2470();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field607[var6] = var4.method2462();
            } else {
                var3.field607[var6] = var4.method2467();
            }
            var3.field599[var6++] = var7;
        }
        field608.method3581(var3, (long) arg0);
        return var3;
    }
}
