package deob;

@ObfuscatedName("lz")
public class class337 {

    public class337() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.n(Lig;IIB)[Lly;")
    public static class335[] method3175(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4032(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method190(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class335[] var5 = new class335[Statics.field3923];
        for (int var6 = 0; var6 < Statics.field3923; var6++) {
            class335 var7 = var5[var6] = new class335();
            var7.field3903 = Statics.field3922;
            var7.field3909 = Statics.field3924;
            var7.field3906 = Statics.field1342[var6];
            var7.field3907 = Statics.field3925[var6];
            var7.field3908 = Statics.field3926[var6];
            var7.field3905 = Statics.field2580[var6];
            var7.field3904 = Statics.field3496;
            var7.field3902 = Statics.field15[var6];
        }
        Statics.field1342 = null;
        Statics.field3925 = null;
        Statics.field3926 = null;
        Statics.field2580 = null;
        Statics.field3496 = null;
        Statics.field15 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("ay.v(Lig;III)[Llm;")
    public static class336[] method245(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4032(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method190(var3);
            var4 = true;
        }
        return var4 ? method5621() : null;
    }

    @ObfuscatedName("ll.d(Lig;III)Llm;")
    public static class336 method5613(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4032(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method190(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class336 var5 = new class336();
        var5.field3910 = Statics.field3922;
        var5.field3916 = Statics.field3924;
        var5.field3914 = Statics.field1342[0];
        var5.field3919 = Statics.field3925[0];
        var5.field3913 = Statics.field3926[0];
        var5.field3912 = Statics.field2580[0];
        int var6 = var5.field3913 * var5.field3912;
        byte[] var7 = Statics.field15[0];
        var5.field3915 = new int[var6];
        for (int var8 = 0; var8 < var6; var8++) {
            var5.field3915[var8] = Statics.field3496[var7[var8] & 0xFF];
        }
        Statics.field1342 = null;
        Statics.field3925 = null;
        Statics.field3926 = null;
        Statics.field2580 = null;
        Statics.field3496 = null;
        Statics.field15 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("fz.c(Lig;Ljava/lang/String;Ljava/lang/String;I)[Lly;")
    public static class335[] method3370(class245 arg0, String arg1, String arg2) {
        int var3 = arg0.method4001(arg1);
        int var4 = arg0.method4002(var3, arg2);
        return method3175(arg0, var3, var4);
    }

    @ObfuscatedName("ct.y(Lig;Ljava/lang/String;Ljava/lang/String;I)Lly;")
    public static class335 method2226(class245 arg0, String arg1, String arg2) {
        int var3 = arg0.method4001(arg1);
        int var4 = arg0.method4002(var3, arg2);
        byte[] var5 = arg0.method4032(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method190(var5);
            var6 = true;
        }
        class335 var7;
        if (var6) {
            var7 = method1166();
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("az.h(Lig;Ljava/lang/String;Ljava/lang/String;S)[Llm;")
    public static class336[] method585(class245 arg0, String arg1, String arg2) {
        int var3 = arg0.method4001(arg1);
        int var4 = arg0.method4002(var3, arg2);
        return method245(arg0, var3, var4);
    }

    @ObfuscatedName("ba.z(I)Lly;")
    public static class335 method1166() {
        class335 var0 = new class335();
        var0.field3903 = Statics.field3922;
        var0.field3909 = Statics.field3924;
        var0.field3906 = Statics.field1342[0];
        var0.field3907 = Statics.field3925[0];
        var0.field3908 = Statics.field3926[0];
        var0.field3905 = Statics.field2580[0];
        var0.field3904 = Statics.field3496;
        var0.field3902 = Statics.field15[0];
        Statics.field1342 = null;
        Statics.field3925 = null;
        Statics.field3926 = null;
        Statics.field2580 = null;
        Statics.field3496 = null;
        Statics.field15 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ll.e(B)[Llm;")
    public static class336[] method5621() {
        class336[] var0 = new class336[Statics.field3923];
        for (int var1 = 0; var1 < Statics.field3923; var1++) {
            class336 var2 = var0[var1] = new class336();
            var2.field3910 = Statics.field3922;
            var2.field3916 = Statics.field3924;
            var2.field3914 = Statics.field1342[var1];
            var2.field3919 = Statics.field3925[var1];
            var2.field3913 = Statics.field3926[var1];
            var2.field3912 = Statics.field2580[var1];
            int var3 = var2.field3913 * var2.field3912;
            byte[] var4 = Statics.field15[var1];
            var2.field3915 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3915[var5] = Statics.field3496[var4[var5] & 0xFF];
            }
        }
        Statics.field1342 = null;
        Statics.field3925 = null;
        Statics.field3926 = null;
        Statics.field2580 = null;
        Statics.field3496 = null;
        Statics.field15 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("t.q(Lig;II)Z")
    public static boolean method189(class245 arg0, int arg1) {
        byte[] var2 = arg0.method3990(arg1);
        if (var2 == null) {
            return false;
        } else {
            method190(var2);
            return true;
        }
    }

    @ObfuscatedName("t.l([BI)V")
    public static void method190(byte[] arg0) {
        class311 var1 = new class311(arg0);
        var1.field3747 = arg0.length - 2;
        Statics.field3923 = var1.method5247();
        Statics.field1342 = new int[Statics.field3923];
        Statics.field3925 = new int[Statics.field3923];
        Statics.field3926 = new int[Statics.field3923];
        Statics.field2580 = new int[Statics.field3923];
        Statics.field15 = new byte[Statics.field3923][];
        var1.field3747 = arg0.length - 7 - Statics.field3923 * 8;
        Statics.field3922 = var1.method5247();
        Statics.field3924 = var1.method5247();
        int var2 = (var1.method5310() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3923; var3++) {
            Statics.field1342[var3] = var1.method5247();
        }
        for (int var4 = 0; var4 < Statics.field3923; var4++) {
            Statics.field3925[var4] = var1.method5247();
        }
        for (int var5 = 0; var5 < Statics.field3923; var5++) {
            Statics.field3926[var5] = var1.method5247();
        }
        for (int var6 = 0; var6 < Statics.field3923; var6++) {
            Statics.field2580[var6] = var1.method5247();
        }
        var1.field3747 = arg0.length - 7 - Statics.field3923 * 8 - (var2 - 1) * 3;
        Statics.field3496 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3496[var7] = var1.method5263();
            if (Statics.field3496[var7] == 0) {
                Statics.field3496[var7] = 1;
            }
        }
        var1.field3747 = 0;
        for (int var8 = 0; var8 < Statics.field3923; var8++) {
            int var9 = Statics.field3926[var8];
            int var10 = Statics.field2580[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field15[var8] = var12;
            int var13 = var1.method5310();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5293();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5293();
                    }
                }
            }
        }
    }
}
