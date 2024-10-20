package deob;

@ObfuscatedName("bo")
public class class71 {

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.x(Ley;III)[Lbg;")
    public static class75[] method485(class149 arg0, int arg1, int arg2) {
        if (!method75(arg0, arg1, arg2)) {
            return null;
        }
        class75[] var3 = new class75[Statics.field1294];
        for (int var4 = 0; var4 < Statics.field1294; var4++) {
            class75 var5 = var3[var4] = new class75();
            var5.field1321 = Statics.field1291;
            var5.field1328 = Statics.field1292;
            var5.field1325 = Statics.field1293[var4];
            var5.field1327 = Statics.field560[var4];
            var5.field1323 = Statics.field1123[var4];
            var5.field1324 = Statics.field1296[var4];
            var5.field1322 = Statics.field618;
            var5.field1326 = Statics.field127[var4];
        }
        method1362();
        return var3;
    }

    @ObfuscatedName("q.v(Ley;III)Lbg;")
    public static class75 method129(class149 arg0, int arg1, int arg2) {
        return method75(arg0, arg1, arg2) ? method2591() : null;
    }

    @ObfuscatedName("q.m(Ley;III)[Lbu;")
    public static class73[] method124(class149 arg0, int arg1, int arg2) {
        if (!method75(arg0, arg1, arg2)) {
            return null;
        }
        class73[] var3 = new class73[Statics.field1294];
        for (int var4 = 0; var4 < Statics.field1294; var4++) {
            class73 var5 = var3[var4] = new class73();
            var5.field1308 = Statics.field1291;
            var5.field1312 = Statics.field1292;
            var5.field1303 = Statics.field1293[var4];
            var5.field1306 = Statics.field560[var4];
            var5.field1302 = Statics.field1123[var4];
            var5.field1304 = Statics.field1296[var4];
            int var6 = var5.field1304 * var5.field1302;
            byte[] var7 = Statics.field127[var4];
            var5.field1307 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1307[var8] = Statics.field618[var7[var8] & 0xFF];
            }
        }
        method1362();
        return var3;
    }

    @ObfuscatedName("f.e(Ley;Ley;III)Lgf;")
    public static class205 method474(class149 arg0, class149 arg1, int arg2, int arg3) {
        return method75(arg0, arg2, arg3) ? method110(arg1.method2751(arg2, arg3)) : null;
    }

    @ObfuscatedName("br.h(Ley;Ljava/lang/String;Ljava/lang/String;B)[Lbg;")
    public static class75[] method1353(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2746(arg1);
        int var4 = arg0.method2747(var3, arg2);
        return method485(arg0, var3, var4);
    }

    @ObfuscatedName("ay.p(Ley;Ljava/lang/String;Ljava/lang/String;B)Lbg;")
    public static class75 method550(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2746(arg1);
        int var4 = arg0.method2747(var3, arg2);
        return method129(arg0, var3, var4);
    }

    @ObfuscatedName("j.j(Ley;Ljava/lang/String;Ljava/lang/String;I)[Lbu;")
    public static class73[] method74(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2746(arg1);
        int var4 = arg0.method2747(var3, arg2);
        return method124(arg0, var3, var4);
    }

    @ObfuscatedName("h.i(Ley;Ljava/lang/String;Ljava/lang/String;I)Lbu;")
    public static class73 method32(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2746(arg1);
        int var4 = arg0.method2747(var3, arg2);
        class73 var5;
        if (method75(arg0, var3, var4)) {
            var5 = method616();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("i.u(Ley;Ley;Ljava/lang/String;Ljava/lang/String;B)Lgf;")
    public static class205 method84(class149 arg0, class149 arg1, String arg2, String arg3) {
        int var4 = arg0.method2746(arg2);
        int var5 = arg0.method2747(var4, arg3);
        return method474(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("dn.l(B)Lbg;")
    public static class75 method2591() {
        class75 var0 = new class75();
        var0.field1321 = Statics.field1291;
        var0.field1328 = Statics.field1292;
        var0.field1325 = Statics.field1293[0];
        var0.field1327 = Statics.field560[0];
        var0.field1323 = Statics.field1123[0];
        var0.field1324 = Statics.field1296[0];
        var0.field1322 = Statics.field618;
        var0.field1326 = Statics.field127[0];
        method1362();
        return var0;
    }

    @ObfuscatedName("ai.k(I)Lbu;")
    public static class73 method616() {
        class73 var0 = new class73();
        var0.field1308 = Statics.field1291;
        var0.field1312 = Statics.field1292;
        var0.field1303 = Statics.field1293[0];
        var0.field1306 = Statics.field560[0];
        var0.field1302 = Statics.field1123[0];
        var0.field1304 = Statics.field1296[0];
        int var1 = var0.field1304 * var0.field1302;
        byte[] var2 = Statics.field127[0];
        var0.field1307 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1307[var3] = Statics.field618[var2[var3] & 0xFF];
        }
        method1362();
        return var0;
    }

    @ObfuscatedName("l.q([BS)Lgf;")
    public static class205 method110(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class205 var1 = new class205(arg0, Statics.field1293, Statics.field560, Statics.field1123, Statics.field1296, Statics.field618, Statics.field127);
            method1362();
            return var1;
        }
    }

    @ObfuscatedName("j.b(Ley;III)Z")
    public static boolean method75(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2751(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1625(var3);
            return true;
        }
    }

    @ObfuscatedName("e.w(Ley;II)Z")
    public static boolean method23(class149 arg0, int arg1) {
        byte[] var2 = arg0.method2736(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1625(var2);
            return true;
        }
    }

    @ObfuscatedName("cj.g([BI)V")
    public static void method1625(byte[] arg0) {
        class108 var1 = new class108(arg0);
        var1.field1841 = arg0.length - 2;
        Statics.field1294 = var1.method2129();
        Statics.field1293 = new int[Statics.field1294];
        Statics.field560 = new int[Statics.field1294];
        Statics.field1123 = new int[Statics.field1294];
        Statics.field1296 = new int[Statics.field1294];
        Statics.field127 = new byte[Statics.field1294][];
        var1.field1841 = arg0.length - 7 - Statics.field1294 * 8;
        Statics.field1291 = var1.method2129();
        Statics.field1292 = var1.method2129();
        int var2 = (var1.method2299() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1294; var3++) {
            Statics.field1293[var3] = var1.method2129();
        }
        for (int var4 = 0; var4 < Statics.field1294; var4++) {
            Statics.field560[var4] = var1.method2129();
        }
        for (int var5 = 0; var5 < Statics.field1294; var5++) {
            Statics.field1123[var5] = var1.method2129();
        }
        for (int var6 = 0; var6 < Statics.field1294; var6++) {
            Statics.field1296[var6] = var1.method2129();
        }
        var1.field1841 = arg0.length - 7 - Statics.field1294 * 8 - (var2 - 1) * 3;
        Statics.field618 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field618[var7] = var1.method2131();
            if (Statics.field618[var7] == 0) {
                Statics.field618[var7] = 1;
            }
        }
        var1.field1841 = 0;
        for (int var8 = 0; var8 < Statics.field1294; var8++) {
            int var9 = Statics.field1123[var8];
            int var10 = Statics.field1296[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field127[var8] = var12;
            int var13 = var1.method2299();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2128();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2128();
                    }
                }
            }
        }
    }

    @ObfuscatedName("br.s(B)V")
    public static void method1362() {
        Statics.field1293 = null;
        Statics.field560 = null;
        Statics.field1123 = null;
        Statics.field1296 = null;
        Statics.field618 = null;
        Statics.field127 = (byte[][]) null;
    }
}
