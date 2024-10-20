package deob;

@ObfuscatedName("cr")
public class class97 extends class219 {

    @ObfuscatedName("cr.o")
    public static class213 field1460 = new class213(128);

    @ObfuscatedName("cr.k")
    public int[] field1457;

    @ObfuscatedName("cr.t")
    public int[] field1458;

    @ObfuscatedName("cr.d")
    public String[] field1459;

    @ObfuscatedName("cr.h")
    public int field1461;

    @ObfuscatedName("cr.m")
    public int field1462;

    @ObfuscatedName("cr.z")
    public int field1465;

    @ObfuscatedName("cr.i")
    public int field1463;

    @ObfuscatedName("cr.u")
    public class210[] field1464;

    @ObfuscatedName("al.o(II)Lcr;")
    public static class97 method275(int arg0) {
        class97 var1 = (class97) field1460.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2533.method4241(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class97 var3 = method2985(var2);
            field1460.method3603(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("fr.k(Liu;IIB)Lcr;")
    public static class97 method3119(class246 arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0.field2974;
        class97 var5 = method222(var3, arg0);
        if (var5 == null) {
            int var6 = (arg2 + 40000 << 8) + arg0.field2974;
            class97 var8 = method222(var6, arg0);
            return var8 == null ? null : var8;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("ab.t(ILiu;I)Lcr;")
    public static class97 method222(int arg0, class246 arg1) {
        class97 var2 = (class97) field1460.method3601((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field2533.method4175(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field2533.method4164(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class97 var6 = method2985(var5);
            if (var6 != null) {
                field1460.method3603(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("fe.d([BI)Lcr;")
    public static class97 method2985(byte[] arg0) {
        class97 var1 = new class97();
        class195 var2 = new class195(arg0);
        var2.field2575 = var2.field2574.length - 2;
        int var3 = var2.method3207();
        int var4 = var2.field2574.length - 2 - var3 - 12;
        var2.field2575 = var4;
        int var5 = var2.method3254();
        var1.field1461 = var2.method3207();
        var1.field1462 = var2.method3207();
        var1.field1465 = var2.method3207();
        var1.field1463 = var2.method3207();
        int var6 = var2.method3205();
        if (var6 > 0) {
            var1.field1464 = var1.method1850(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3207();
                class210 var9 = new class210(var8 > 0 ? class200.method1706(var8) : 1);
                var1.field1464[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3254();
                    int var11 = var2.method3254();
                    var9.method3580(new class224(var11), (long) var10);
                }
            }
        }
        var2.field2575 = 0;
        var2.method3213();
        var1.field1457 = new int[var5];
        var1.field1458 = new int[var5];
        var1.field1459 = new String[var5];
        int var12 = 0;
        while (var2.field2575 < var4) {
            int var13 = var2.method3207();
            if (var13 == 3) {
                var1.field1459[var12] = var2.method3284();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1458[var12] = var2.method3205();
            } else {
                var1.field1458[var12] = var2.method3254();
            }
            var1.field1457[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cr.h(IB)[Lha;")
    public class210[] method1850(int arg0) {
        return new class210[arg0];
    }
}
