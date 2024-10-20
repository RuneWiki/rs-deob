package deob;

@ObfuscatedName("t")
public class class19 extends class181 {

    @ObfuscatedName("t.z")
    public static class171 field519 = new class171(128);

    @ObfuscatedName("t.j")
    public int[] field514;

    @ObfuscatedName("t.a")
    public int[] field515;

    @ObfuscatedName("t.y")
    public String[] field516;

    @ObfuscatedName("t.i")
    public int field517;

    @ObfuscatedName("t.b")
    public int field523;

    @ObfuscatedName("t.s")
    public int field521;

    @ObfuscatedName("t.q")
    public int field513;

    @ObfuscatedName("p.z(IB)Lt;")
    public static class19 method96(int arg0) {
        class19 var1 = (class19) field519.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field549.method2705(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1819 = var4.field1823.length - 12;
        int var5 = var4.method2127();
        var3.field517 = var4.method2239();
        var3.field523 = var4.method2239();
        var3.field521 = var4.method2239();
        var3.field513 = var4.method2239();
        var4.field1819 = 0;
        var4.method2129();
        var3.field514 = new int[var5];
        var3.field515 = new int[var5];
        var3.field516 = new String[var5];
        int var6 = 0;
        while (var4.field1819 < var4.field1823.length - 12) {
            int var7 = var4.method2239();
            if (var7 == 3) {
                var3.field516[var6] = var4.method2130();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field515[var6] = var4.method2122();
            } else {
                var3.field515[var6] = var4.method2127();
            }
            var3.field514[var6++] = var7;
        }
        field519.method3171(var3, (long) arg0);
        return var3;
    }
}
