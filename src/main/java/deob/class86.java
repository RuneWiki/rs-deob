package deob;

@ObfuscatedName("t")
public class class86 extends class6 {

    @ObfuscatedName("t.f")
    public int field1216;

    @ObfuscatedName("t.d")
    public int field1217;

    @ObfuscatedName("t.b")
    public static class2 field1220 = new class2(128);

    @ObfuscatedName("t.l")
    public int field1218;

    @ObfuscatedName("t.k")
    public int[] field1213;

    @ObfuscatedName("t.h")
    public int[] field1212;

    @ObfuscatedName("t.w")
    public String[] field1214;

    @ObfuscatedName("t.t")
    public int field1215;

    @ObfuscatedName("z.b(II)Lt;")
    public static class86 method1413(int arg0) {
        class86 var1 = (class86) field1220.method1((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field884.method1266(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class86 var3 = new class86();
        class50 var4 = new class50(var2);
        var4.field540 = var4.field541.length - 12;
        int var5 = var4.method685();
        var3.field1215 = var4.method720();
        var3.field1217 = var4.method720();
        var3.field1218 = var4.method720();
        var3.field1216 = var4.method720();
        var4.field540 = 0;
        var4.method796();
        var3.field1212 = new int[var5];
        var3.field1213 = new int[var5];
        var3.field1214 = new String[var5];
        int var6 = 0;
        while (var4.field540 < var4.field541.length - 12) {
            int var7 = var4.method720();
            if (var7 == 3) {
                var3.field1214[var6] = var4.method688();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field1213[var6] = var4.method726();
            } else {
                var3.field1213[var6] = var4.method685();
            }
            var3.field1212[var6++] = var7;
        }
        field1220.method4(var3, (long) arg0);
        return var3;
    }
}
