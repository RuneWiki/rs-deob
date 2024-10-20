package deob;

@ObfuscatedName("f")
public class class18 extends class174 {

    @ObfuscatedName("f.z")
    public static class167 field542 = new class167(128);

    @ObfuscatedName("f.n")
    public int[] field539;

    @ObfuscatedName("f.u")
    public int[] field548;

    @ObfuscatedName("f.t")
    public String[] field540;

    @ObfuscatedName("f.e")
    public int field538;

    @ObfuscatedName("f.a")
    public int field543;

    @ObfuscatedName("f.l")
    public int field544;

    @ObfuscatedName("f.v")
    public int field545;

    @ObfuscatedName("b.z(II)Lf;")
    public static class18 method160(int arg0) {
        class18 var1 = (class18) field542.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field80.method2768(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class18 var3 = new class18();
        class104 var4 = new class104(var2);
        var4.field1815 = var4.field1819.length - 12;
        int var5 = var4.method2130();
        var3.field538 = var4.method2206();
        var3.field543 = var4.method2206();
        var3.field544 = var4.method2206();
        var3.field545 = var4.method2206();
        var4.field1815 = 0;
        var4.method2134();
        var3.field539 = new int[var5];
        var3.field548 = new int[var5];
        var3.field540 = new String[var5];
        int var6 = 0;
        while (var4.field1815 < var4.field1819.length - 12) {
            int var7 = var4.method2206();
            if (var7 == 3) {
                var3.field540[var6] = var4.method2187();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field548[var6] = var4.method2257();
            } else {
                var3.field548[var6] = var4.method2130();
            }
            var3.field539[var6++] = var7;
        }
        field542.method3185(var3, (long) arg0);
        return var3;
    }
}
