package deob;

@ObfuscatedName("lv")
public class class333 {

    public class333() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ky.c(Ljm;IIB)[Lla;")
    public static class332[] method4832(class262 arg0, int arg1, int arg2) {
        if (!Statics.method4828(arg0, arg1, arg2)) {
            return null;
        }
        class332[] var3 = new class332[Statics.field264];
        for (int var4 = 0; var4 < Statics.field264; var4++) {
            class332 var5 = var3[var4] = new class332();
            var5.field3983 = Statics.field3992;
            var5.field3985 = Statics.field1281;
            var5.field3981 = Statics.field634[var4];
            var5.field3978 = Statics.field3991[var4];
            var5.field3979 = Statics.field359[var4];
            var5.field3980 = Statics.field3990[var4];
            int var6 = var5.field3980 * var5.field3979;
            byte[] var7 = Statics.field3994[var4];
            var5.field3987 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3987[var8] = Statics.field3993[var7[var8] & 0xFF];
            }
        }
        method4183();
        return var3;
    }

    @ObfuscatedName("lj.i(Ljm;III)Lla;")
    public static class332 method5407(class262 arg0, int arg1, int arg2) {
        return Statics.method4828(arg0, arg1, arg2) ? method4165() : null;
    }

    @ObfuscatedName("gi.o(Ljm;Ljava/lang/String;Ljava/lang/String;B)[Llq;")
    public static class331[] method3473(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4245(arg1);
        int var4 = arg0.method4207(var3, arg2);
        class331[] var5;
        if (Statics.method4828(arg0, var3, var4)) {
            var5 = method3191();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ad.j(Ljm;Ljava/lang/String;Ljava/lang/String;B)Llq;")
    public static class331 method572(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4245(arg1);
        int var4 = arg0.method4207(var3, arg2);
        class331 var5;
        if (Statics.method4828(arg0, var3, var4)) {
            var5 = method983();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("lu.k(Ljm;Ljava/lang/String;Ljava/lang/String;I)[Lla;")
    public static class332[] method5221(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4245(arg1);
        int var4 = arg0.method4207(var3, arg2);
        return method4832(arg0, var3, var4);
    }

    @ObfuscatedName("gb.x(I)[Llq;")
    public static class331[] method3191() {
        class331[] var0 = new class331[Statics.field264];
        for (int var1 = 0; var1 < Statics.field264; var1++) {
            class331 var2 = var0[var1] = new class331();
            var2.field3976 = Statics.field3992;
            var2.field3971 = Statics.field1281;
            var2.field3970 = Statics.field634[var1];
            var2.field3977 = Statics.field3991[var1];
            var2.field3972 = Statics.field359[var1];
            var2.field3973 = Statics.field3990[var1];
            var2.field3975 = Statics.field3993;
            var2.field3974 = Statics.field3994[var1];
        }
        method4183();
        return var0;
    }

    @ObfuscatedName("bc.z(B)Llq;")
    public static class331 method983() {
        class331 var0 = new class331();
        var0.field3976 = Statics.field3992;
        var0.field3971 = Statics.field1281;
        var0.field3970 = Statics.field634[0];
        var0.field3977 = Statics.field3991[0];
        var0.field3972 = Statics.field359[0];
        var0.field3973 = Statics.field3990[0];
        var0.field3975 = Statics.field3993;
        var0.field3974 = Statics.field3994[0];
        method4183();
        return var0;
    }

    @ObfuscatedName("ix.p(I)Lla;")
    public static class332 method4165() {
        class332 var0 = new class332();
        var0.field3983 = Statics.field3992;
        var0.field3985 = Statics.field1281;
        var0.field3981 = Statics.field634[0];
        var0.field3978 = Statics.field3991[0];
        var0.field3979 = Statics.field359[0];
        var0.field3980 = Statics.field3990[0];
        int var1 = var0.field3980 * var0.field3979;
        byte[] var2 = Statics.field3994[0];
        var0.field3987 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3987[var3] = Statics.field3993[var2[var3] & 0xFF];
        }
        method4183();
        return var0;
    }

    @ObfuscatedName("cr.d(Ljm;II)Z")
    public static boolean method1791(class262 arg0, int arg1) {
        byte[] var2 = arg0.method4251(arg1);
        if (var2 == null) {
            return false;
        } else {
            method4529(var2);
            return true;
        }
    }

    @ObfuscatedName("jz.a([BI)V")
    public static void method4529(byte[] arg0) {
        class195 var1 = new class195(arg0);
        var1.field2566 = arg0.length - 2;
        Statics.field264 = var1.method3218();
        Statics.field634 = new int[Statics.field264];
        Statics.field3991 = new int[Statics.field264];
        Statics.field359 = new int[Statics.field264];
        Statics.field3990 = new int[Statics.field264];
        Statics.field3994 = new byte[Statics.field264][];
        var1.field2566 = arg0.length - 7 - Statics.field264 * 8;
        Statics.field3992 = var1.method3218();
        Statics.field1281 = var1.method3218();
        int var2 = (var1.method3429() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field264; var3++) {
            Statics.field634[var3] = var1.method3218();
        }
        for (int var4 = 0; var4 < Statics.field264; var4++) {
            Statics.field3991[var4] = var1.method3218();
        }
        for (int var5 = 0; var5 < Statics.field264; var5++) {
            Statics.field359[var5] = var1.method3218();
        }
        for (int var6 = 0; var6 < Statics.field264; var6++) {
            Statics.field3990[var6] = var1.method3218();
        }
        var1.field2566 = arg0.length - 7 - Statics.field264 * 8 - (var2 - 1) * 3;
        Statics.field3993 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3993[var7] = var1.method3293();
            if (Statics.field3993[var7] == 0) {
                Statics.field3993[var7] = 1;
            }
        }
        var1.field2566 = 0;
        for (int var8 = 0; var8 < Statics.field264; var8++) {
            int var9 = Statics.field359[var8];
            int var10 = Statics.field3990[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3994[var8] = var12;
            int var13 = var1.method3429();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3226();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3226();
                    }
                }
            }
        }
    }

    @ObfuscatedName("iw.b(I)V")
    public static void method4183() {
        Statics.field634 = null;
        Statics.field3991 = null;
        Statics.field359 = null;
        Statics.field3990 = null;
        Statics.field3993 = null;
        Statics.field3994 = (byte[][]) null;
    }
}
