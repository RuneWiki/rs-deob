package deob;

@ObfuscatedName("dk")
public class class87 extends class505 {

    @ObfuscatedName("dk.aq")
    public static class521 field1064 = new class521(32);

    @ObfuscatedName("dk.ad")
    public int[] field1063 = new int[] { -1 };

    @ObfuscatedName("dk.ag")
    public int[] field1062 = new int[] { 0 };

    @ObfuscatedName("hm.aq(IIB)I")
    public static int method3389(int arg0, int arg1) {
        class87 var2 = (class87) field1064.method8464((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1063.length) {
            return var2.field1063[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bi.ad(III)I")
    public static int method451(int arg0, int arg1) {
        class87 var2 = (class87) field1064.method8464((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1062.length) {
            return var2.field1062[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("gn.ag(III)I")
    public static int method3197(int arg0, int arg1) {
        class87 var2 = (class87) field1064.method8464((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1062.length; var4++) {
                if (var2.field1063[var4] == arg1) {
                    var3 += var2.field1062[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ik.ak(IIIII)V")
    public static void method3885(int arg0, int arg1, int arg2, int arg3) {
        class87 var4 = (class87) field1064.method8464((long) arg0);
        if (var4 == null) {
            var4 = new class87();
            field1064.method8470(var4, (long) arg0);
        }
        if (var4.field1063.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1063.length; var7++) {
                var5[var7] = var4.field1063[var7];
                var6[var7] = var4.field1062[var7];
            }
            for (int var8 = var4.field1063.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1063 = var5;
            var4.field1062 = var6;
        }
        var4.field1063[arg1] = arg2;
        var4.field1062[arg1] = arg3;
    }

    @ObfuscatedName("ue.ap(II)V")
    public static void method8598(int arg0) {
        class87 var1 = (class87) field1064.method8464((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1063.length; var2++) {
                var1.field1063[var2] = -1;
                var1.field1062[var2] = 0;
            }
        }
    }

    @ObfuscatedName("hk.an(IB)V")
    public static void method3568(int arg0) {
        class87 var1 = (class87) field1064.method8464((long) arg0);
        if (var1 != null) {
            var1.method8130();
        }
    }
}
