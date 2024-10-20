package deob;

@ObfuscatedName("j")
public class class19 extends class187 {

    @ObfuscatedName("j.p")
    public static class176 field516 = new class176(128);

    @ObfuscatedName("j.y")
    public int[] field509;

    @ObfuscatedName("j.d")
    public int[] field511;

    @ObfuscatedName("j.c")
    public String[] field512;

    @ObfuscatedName("j.r")
    public int field513;

    @ObfuscatedName("j.f")
    public int field514;

    @ObfuscatedName("j.z")
    public int field510;

    @ObfuscatedName("j.o")
    public int field515;

    @ObfuscatedName("fc.p(IB)Lj;")
    public static class19 method3179(int arg0) {
        class19 var1 = (class19) field516.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1893.method2811(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class110 var4 = new class110(var2);
        var4.field1842 = var4.field1844.length - 12;
        int var5 = var4.method2164();
        var3.field513 = var4.method2243();
        var3.field514 = var4.method2243();
        var3.field510 = var4.method2243();
        var3.field515 = var4.method2243();
        var4.field1842 = 0;
        var4.method2131();
        var3.field509 = new int[var5];
        var3.field511 = new int[var5];
        var3.field512 = new String[var5];
        int var6 = 0;
        while (var4.field1842 < var4.field1844.length - 12) {
            int var7 = var4.method2243();
            if (var7 == 3) {
                var3.field512[var6] = var4.method2132();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field511[var6] = var4.method2309();
            } else {
                var3.field511[var6] = var4.method2164();
            }
            var3.field509[var6++] = var7;
        }
        field516.method3193(var3, (long) arg0);
        return var3;
    }
}
