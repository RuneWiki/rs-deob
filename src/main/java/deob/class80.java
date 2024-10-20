package deob;

@ObfuscatedName("ca")
public class class80 {

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.x(Lfp;IIB)[Lcj;")
    public static class84[] method562(class171 arg0, int arg1, int arg2) {
        if (!method744(arg0, arg1, arg2)) {
            return null;
        }
        class84[] var3 = new class84[Statics.field1421];
        for (int var4 = 0; var4 < Statics.field1421; var4++) {
            class84 var5 = var3[var4] = new class84();
            var5.field1461 = Statics.field1423;
            var5.field1456 = Statics.field1420;
            var5.field1462 = Statics.field1422[var4];
            var5.field1460 = Statics.field1424[var4];
            var5.field1459 = Statics.field568[var4];
            var5.field1458 = Statics.field1425[var4];
            var5.field1457 = Statics.field1426;
            var5.field1455 = Statics.field192[var4];
        }
        method186();
        return var3;
    }

    @ObfuscatedName("aw.r(Lfp;III)Lcd;")
    public static class82 method825(class171 arg0, int arg1, int arg2) {
        return method744(arg0, arg1, arg2) ? Statics.method4() : null;
    }

    @ObfuscatedName("ak.j(Lfp;Ljava/lang/String;Ljava/lang/String;I)[Lcj;")
    public static class84[] method867(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3148(arg1);
        int var4 = arg0.method3094(var3, arg2);
        return method562(arg0, var3, var4);
    }

    @ObfuscatedName("aq.z(Lfp;Ljava/lang/String;Ljava/lang/String;I)Lcj;")
    public static class84 method642(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3148(arg1);
        int var4 = arg0.method3094(var3, arg2);
        class84 var5;
        if (method744(arg0, var3, var4)) {
            class84 var6 = new class84();
            var6.field1461 = Statics.field1423;
            var6.field1456 = Statics.field1420;
            var6.field1462 = Statics.field1422[0];
            var6.field1460 = Statics.field1424[0];
            var6.field1459 = Statics.field568[0];
            var6.field1458 = Statics.field1425[0];
            var6.field1457 = Statics.field1426;
            var6.field1455 = Statics.field192[0];
            method186();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("d.i(Lfp;Ljava/lang/String;Ljava/lang/String;I)[Lcd;")
    public static class82[] method125(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3148(arg1);
        int var4 = arg0.method3094(var3, arg2);
        class82[] var5;
        if (method744(arg0, var3, var4)) {
            var5 = method2625();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("w.b(Lfp;Ljava/lang/String;Ljava/lang/String;I)Lcd;")
    public static class82 method567(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3148(arg1);
        int var4 = arg0.method3094(var3, arg2);
        return method825(arg0, var3, var4);
    }

    @ObfuscatedName("dp.l(I)[Lcd;")
    public static class82[] method2625() {
        class82[] var0 = new class82[Statics.field1421];
        for (int var1 = 0; var1 < Statics.field1421; var1++) {
            class82 var2 = var0[var1] = new class82();
            var2.field1441 = Statics.field1423;
            var2.field1442 = Statics.field1420;
            var2.field1440 = Statics.field1422[var1];
            var2.field1446 = Statics.field1424[var1];
            var2.field1437 = Statics.field568[var1];
            var2.field1438 = Statics.field1425[var1];
            int var3 = var2.field1438 * var2.field1437;
            byte[] var4 = Statics.field192[var1];
            var2.field1436 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1436[var5] = Statics.field1426[var4[var5] & 0xFF];
            }
        }
        method186();
        return var0;
    }

    @ObfuscatedName("dr.p([BI)Lhy;")
    public static class228 method2207(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class228 var1 = new class228(arg0, Statics.field1422, Statics.field1424, Statics.field568, Statics.field1425, Statics.field1426, Statics.field192);
            method186();
            return var1;
        }
    }

    @ObfuscatedName("am.f(Lfp;III)Z")
    public static boolean method744(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3079(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method827(var3);
            return true;
        }
    }

    @ObfuscatedName("aw.d([BB)V")
    public static void method827(byte[] arg0) {
        class123 var1 = new class123(arg0);
        var1.field2057 = arg0.length - 2;
        Statics.field1421 = var1.method2403();
        Statics.field1422 = new int[Statics.field1421];
        Statics.field1424 = new int[Statics.field1421];
        Statics.field568 = new int[Statics.field1421];
        Statics.field1425 = new int[Statics.field1421];
        Statics.field192 = new byte[Statics.field1421][];
        var1.field2057 = arg0.length - 7 - Statics.field1421 * 8;
        Statics.field1423 = var1.method2403();
        Statics.field1420 = var1.method2403();
        int var2 = (var1.method2408() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1421; var3++) {
            Statics.field1422[var3] = var1.method2403();
        }
        for (int var4 = 0; var4 < Statics.field1421; var4++) {
            Statics.field1424[var4] = var1.method2403();
        }
        for (int var5 = 0; var5 < Statics.field1421; var5++) {
            Statics.field568[var5] = var1.method2403();
        }
        for (int var6 = 0; var6 < Statics.field1421; var6++) {
            Statics.field1425[var6] = var1.method2403();
        }
        var1.field2057 = arg0.length - 7 - Statics.field1421 * 8 - (var2 - 1) * 3;
        Statics.field1426 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1426[var7] = var1.method2412();
            if (Statics.field1426[var7] == 0) {
                Statics.field1426[var7] = 1;
            }
        }
        var1.field2057 = 0;
        for (int var8 = 0; var8 < Statics.field1421; var8++) {
            int var9 = Statics.field568[var8];
            int var10 = Statics.field1425[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field192[var8] = var12;
            int var13 = var1.method2408();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2409();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2409();
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.v(I)V")
    public static void method186() {
        Statics.field1422 = null;
        Statics.field1424 = null;
        Statics.field568 = null;
        Statics.field1425 = null;
        Statics.field1426 = null;
        Statics.field192 = (byte[][]) null;
    }
}
