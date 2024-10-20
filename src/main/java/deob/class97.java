package deob;

@ObfuscatedName("cj")
public class class97 extends class219 {

    @ObfuscatedName("cj.t")
    public static class213 field1434 = new class213(128);

    @ObfuscatedName("cj.q")
    public int[] field1429;

    @ObfuscatedName("cj.i")
    public int[] field1430;

    @ObfuscatedName("cj.a")
    public String[] field1431;

    @ObfuscatedName("cj.l")
    public int field1432;

    @ObfuscatedName("cj.b")
    public int field1435;

    @ObfuscatedName("cj.e")
    public int field1433;

    @ObfuscatedName("cj.x")
    public int field1428;

    @ObfuscatedName("cj.p")
    public class210[] field1436;

    @ObfuscatedName("q.t([BI)Lcj;")
    public static class97 method3(byte[] arg0) {
        class97 var1 = new class97();
        class195 var2 = new class195(arg0);
        var2.field2545 = var2.field2544.length - 2;
        int var3 = var2.method3238();
        int var4 = var2.field2544.length - 2 - var3 - 12;
        var2.field2545 = var4;
        int var5 = var2.method3241();
        var1.field1432 = var2.method3238();
        var1.field1435 = var2.method3238();
        var1.field1433 = var2.method3238();
        var1.field1428 = var2.method3238();
        int var6 = var2.method3236();
        if (var6 > 0) {
            var1.field1436 = var1.method1887(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3238();
                int var16;
                if (var8 > 0) {
                    int var9 = var8 - 1;
                    int var10 = var9 | var9 >>> 1;
                    int var11 = var10 | var10 >>> 2;
                    int var12 = var11 | var11 >>> 4;
                    int var13 = var12 | var12 >>> 8;
                    int var14 = var13 | var13 >>> 16;
                    int var15 = var14 + 1;
                    var16 = var15;
                } else {
                    var16 = 1;
                }
                class210 var17 = new class210(var16);
                var1.field1436[var7] = var17;
                while (var8-- > 0) {
                    int var18 = var2.method3241();
                    int var19 = var2.method3241();
                    var17.method3609(new class224(var19), (long) var18);
                }
            }
        }
        var2.field2545 = 0;
        var2.method3262();
        var1.field1429 = new int[var5];
        var1.field1430 = new int[var5];
        var1.field1431 = new String[var5];
        int var20 = 0;
        while (var2.field2545 < var4) {
            int var21 = var2.method3238();
            if (var21 == 3) {
                var1.field1431[var20] = var2.method3257();
            } else if (var21 >= 100 || var21 == 21 || var21 == 38 || var21 == 39) {
                var1.field1430[var20] = var2.method3236();
            } else {
                var1.field1430[var20] = var2.method3241();
            }
            var1.field1429[var20++] = var21;
        }
        return var1;
    }

    @ObfuscatedName("cj.q(II)[Lhq;")
    public class210[] method1887(int arg0) {
        return new class210[arg0];
    }
}
