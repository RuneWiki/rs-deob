package deob;

@ObfuscatedName("bn")
public class class71 {

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.a(Lek;III)[Lbd;")
    public static class75[] method2429(class151 arg0, int arg1, int arg2) {
        if (!method816(arg0, arg1, arg2)) {
            return null;
        }
        class75[] var3 = new class75[Statics.field2060];
        for (int var4 = 0; var4 < Statics.field2060; var4++) {
            class75 var5 = var3[var4] = new class75();
            var5.field1331 = Statics.field1763;
            var5.field1330 = Statics.field1292;
            var5.field1329 = Statics.field134[var4];
            var5.field1325 = Statics.field2952[var4];
            var5.field1328 = Statics.field2948[var4];
            var5.field1327 = Statics.field1287[var4];
            var5.field1326 = Statics.field1288;
            var5.field1332 = Statics.field2055[var4];
        }
        method825();
        return var3;
    }

    @ObfuscatedName("cm.v(Lek;IIB)Lbd;")
    public static class75 method2056(class151 arg0, int arg1, int arg2) {
        return method816(arg0, arg1, arg2) ? method1877() : null;
    }

    @ObfuscatedName("bt.i(Lek;III)Lba;")
    public static class73 method1336(class151 arg0, int arg1, int arg2) {
        if (!method816(arg0, arg1, arg2)) {
            return null;
        }
        class73 var3 = new class73();
        var3.field1311 = Statics.field1763;
        var3.field1312 = Statics.field1292;
        var3.field1309 = Statics.field134[0];
        var3.field1310 = Statics.field2952[0];
        var3.field1316 = Statics.field2948[0];
        var3.field1307 = Statics.field1287[0];
        int var4 = var3.field1316 * var3.field1307;
        byte[] var5 = Statics.field2055[0];
        var3.field1314 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1314[var6] = Statics.field1288[var5[var6] & 0xFF];
        }
        method825();
        return var3;
    }

    @ObfuscatedName("at.b(Lek;Lek;III)Lgm;")
    public static class207 method767(class151 arg0, class151 arg1, int arg2, int arg3) {
        if (!method816(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2731(arg2, arg3);
        class207 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class207 var6 = new class207(var4, Statics.field134, Statics.field2952, Statics.field2948, Statics.field1287, Statics.field1288, Statics.field2055);
            method825();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("ds.l(Lek;Ljava/lang/String;Ljava/lang/String;I)[Lbd;")
    public static class75[] method2427(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2745(arg1);
        int var4 = arg0.method2746(var3, arg2);
        return method2429(arg0, var3, var4);
    }

    @ObfuscatedName("k.m(Lek;Ljava/lang/String;Ljava/lang/String;I)Lbd;")
    public static class75 method132(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2745(arg1);
        int var4 = arg0.method2746(var3, arg2);
        return method2056(arg0, var3, var4);
    }

    @ObfuscatedName("fv.w(Lek;Ljava/lang/String;Ljava/lang/String;B)[Lba;")
    public static class73[] method2902(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2745(arg1);
        int var4 = arg0.method2746(var3, arg2);
        class73[] var5;
        if (method816(arg0, var3, var4)) {
            var5 = method850();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("m.e(Lek;Ljava/lang/String;Ljava/lang/String;B)Lba;")
    public static class73 method89(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2745(arg1);
        int var4 = arg0.method2746(var3, arg2);
        return method1336(arg0, var3, var4);
    }

    @ObfuscatedName("o.n(Lek;Lek;Ljava/lang/String;Ljava/lang/String;I)Lgm;")
    public static class207 method170(class151 arg0, class151 arg1, String arg2, String arg3) {
        int var4 = arg0.method2745(arg2);
        int var5 = arg0.method2746(var4, arg3);
        return method767(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("cg.s(I)Lbd;")
    public static class75 method1877() {
        class75 var0 = new class75();
        var0.field1331 = Statics.field1763;
        var0.field1330 = Statics.field1292;
        var0.field1329 = Statics.field134[0];
        var0.field1325 = Statics.field2952[0];
        var0.field1328 = Statics.field2948[0];
        var0.field1327 = Statics.field1287[0];
        var0.field1326 = Statics.field1288;
        var0.field1332 = Statics.field2055[0];
        method825();
        return var0;
    }

    @ObfuscatedName("ad.k(I)[Lba;")
    public static class73[] method850() {
        class73[] var0 = new class73[Statics.field2060];
        for (int var1 = 0; var1 < Statics.field2060; var1++) {
            class73 var2 = var0[var1] = new class73();
            var2.field1311 = Statics.field1763;
            var2.field1312 = Statics.field1292;
            var2.field1309 = Statics.field134[var1];
            var2.field1310 = Statics.field2952[var1];
            var2.field1316 = Statics.field2948[var1];
            var2.field1307 = Statics.field1287[var1];
            int var3 = var2.field1316 * var2.field1307;
            byte[] var4 = Statics.field2055[var1];
            var2.field1314 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1314[var5] = Statics.field1288[var4[var5] & 0xFF];
            }
        }
        method825();
        return var0;
    }

    @ObfuscatedName("ao.f(Lek;IIB)Z")
    public static boolean method816(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2731(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method610(var3);
            return true;
        }
    }

    @ObfuscatedName("al.d([BI)V")
    public static void method610(byte[] arg0) {
        class110 var1 = new class110(arg0);
        var1.field1861 = arg0.length - 2;
        Statics.field2060 = var1.method2282();
        Statics.field134 = new int[Statics.field2060];
        Statics.field2952 = new int[Statics.field2060];
        Statics.field2948 = new int[Statics.field2060];
        Statics.field1287 = new int[Statics.field2060];
        Statics.field2055 = new byte[Statics.field2060][];
        var1.field1861 = arg0.length - 7 - Statics.field2060 * 8;
        Statics.field1763 = var1.method2282();
        Statics.field1292 = var1.method2282();
        int var2 = (var1.method2199() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field2060; var3++) {
            Statics.field134[var3] = var1.method2282();
        }
        for (int var4 = 0; var4 < Statics.field2060; var4++) {
            Statics.field2952[var4] = var1.method2282();
        }
        for (int var5 = 0; var5 < Statics.field2060; var5++) {
            Statics.field2948[var5] = var1.method2282();
        }
        for (int var6 = 0; var6 < Statics.field2060; var6++) {
            Statics.field1287[var6] = var1.method2282();
        }
        var1.field1861 = arg0.length - 7 - Statics.field2060 * 8 - (var2 - 1) * 3;
        Statics.field1288 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1288[var7] = var1.method2208();
            if (Statics.field1288[var7] == 0) {
                Statics.field1288[var7] = 1;
            }
        }
        var1.field1861 = 0;
        for (int var8 = 0; var8 < Statics.field2060; var8++) {
            int var9 = Statics.field2948[var8];
            int var10 = Statics.field1287[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2055[var8] = var12;
            int var13 = var1.method2199();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2132();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2132();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.x(I)V")
    public static void method825() {
        Statics.field134 = null;
        Statics.field2952 = null;
        Statics.field2948 = null;
        Statics.field1287 = null;
        Statics.field1288 = null;
        Statics.field2055 = (byte[][]) null;
    }
}
