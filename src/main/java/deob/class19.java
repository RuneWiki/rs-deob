package deob;

@ObfuscatedName("k")
public class class19 extends class182 {

    @ObfuscatedName("k.t")
    public static class171 field524 = new class171(128);

    @ObfuscatedName("k.o")
    public int[] field522;

    @ObfuscatedName("k.i")
    public int[] field525;

    @ObfuscatedName("k.p")
    public String[] field528;

    @ObfuscatedName("k.c")
    public int field521;

    @ObfuscatedName("k.y")
    public int field526;

    @ObfuscatedName("k.g")
    public int field527;

    @ObfuscatedName("k.l")
    public int field523;

    @ObfuscatedName("j.t(IB)Lk;")
    public static class19 method494(int arg0) {
        class19 var1 = (class19) field524.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field880.method2668(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1827 = var4.field1826.length - 12;
        int var5 = var4.method2152();
        var3.field521 = var4.method2120();
        var3.field526 = var4.method2120();
        var3.field527 = var4.method2120();
        var3.field523 = var4.method2120();
        var4.field1827 = 0;
        var4.method2125();
        var3.field522 = new int[var5];
        var3.field525 = new int[var5];
        var3.field528 = new String[var5];
        int var6 = 0;
        while (var4.field1827 < var4.field1826.length - 12) {
            int var7 = var4.method2120();
            if (var7 == 3) {
                var3.field528[var6] = var4.method2126();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field525[var6] = var4.method2118();
            } else {
                var3.field525[var6] = var4.method2152();
            }
            var3.field522[var6++] = var7;
        }
        field524.method3101(var3, (long) arg0);
        return var3;
    }
}
