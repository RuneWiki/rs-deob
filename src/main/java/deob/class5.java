package deob;

@ObfuscatedName("p")
public class class5 extends class174 {

    @ObfuscatedName("p.g")
    public static class170 field80 = new class170(128);

    @ObfuscatedName("p.h")
    public int[] field70;

    @ObfuscatedName("p.s")
    public int[] field71;

    @ObfuscatedName("p.o")
    public String[] field72;

    @ObfuscatedName("p.p")
    public int field73;

    @ObfuscatedName("p.x")
    public int field74;

    @ObfuscatedName("p.k")
    public int field75;

    @ObfuscatedName("p.r")
    public int field76;

    @ObfuscatedName("s.g(IS)Lp;")
    public static class5 method16(int arg0) {
        class5 var1 = (class5) field80.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field516.method3080(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2027 = var4.field2030.length - 12;
        int var5 = var4.method2548();
        var3.field73 = var4.method2501();
        var3.field74 = var4.method2501();
        var3.field75 = var4.method2501();
        var3.field76 = var4.method2501();
        var4.field2027 = 0;
        var4.method2506();
        var3.field70 = new int[var5];
        var3.field71 = new int[var5];
        var3.field72 = new String[var5];
        int var6 = 0;
        while (var4.field2027 < var4.field2030.length - 12) {
            int var7 = var4.method2501();
            if (var7 == 3) {
                var3.field72[var6] = var4.method2507();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field71[var6] = var4.method2499();
            } else {
                var3.field71[var6] = var4.method2548();
            }
            var3.field70[var6++] = var7;
        }
        field80.method3313(var3, (long) arg0);
        return var3;
    }
}
