package deob;

@ObfuscatedName("dd")
public class class85 extends class473 {

    @ObfuscatedName("dd.au")
    public static class489 field1068 = new class489(32);

    @ObfuscatedName("dd.ae")
    public int[] field1067 = new int[] { -1 };

    @ObfuscatedName("dd.ao")
    public int[] field1066 = new int[] { 0 };

    @ObfuscatedName("il.au(IIB)I")
    public static int method3785(int arg0, int arg1) {
        class85 var2 = (class85) field1068.method8025((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1067.length) {
            return var2.field1067[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("dj.ae(IIB)I")
    public static int method2094(int arg0, int arg1) {
        class85 var2 = (class85) field1068.method8025((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1066.length) {
            return var2.field1066[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("iz.ao(IIS)I")
    public static int method3830(int arg0, int arg1) {
        class85 var2 = (class85) field1068.method8025((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1066.length; var4++) {
                if (var2.field1067[var4] == arg1) {
                    var3 += var2.field1066[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("qc.at(IIIII)V")
    public static void method7223(int arg0, int arg1, int arg2, int arg3) {
        class85 var4 = (class85) field1068.method8025((long) arg0);
        if (var4 == null) {
            var4 = new class85();
            field1068.method8035(var4, (long) arg0);
        }
        if (var4.field1067.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1067.length; var7++) {
                var5[var7] = var4.field1067[var7];
                var6[var7] = var4.field1066[var7];
            }
            for (int var8 = var4.field1067.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1067 = var5;
            var4.field1066 = var6;
        }
        var4.field1067[arg1] = arg2;
        var4.field1066[arg1] = arg3;
    }

    @ObfuscatedName("bi.ac(II)V")
    public static void method869(int arg0) {
        class85 var1 = (class85) field1068.method8025((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1067.length; var2++) {
                var1.field1067[var2] = -1;
                var1.field1066[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ak.ai(IB)V")
    public static void method370(int arg0) {
        class85 var1 = (class85) field1068.method8025((long) arg0);
        if (var1 != null) {
            var1.method7700();
        }
    }

    @ObfuscatedName("lk.az(I)V")
    public static void method5204() {
        field1068 = new class489(32);
    }
}
