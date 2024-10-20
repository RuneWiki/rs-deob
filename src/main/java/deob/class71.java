package deob;

@ObfuscatedName("be")
public class class71 {

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.e(Lep;III)[Lbf;")
    public static class75[] method2353(class149 arg0, int arg1, int arg2) {
        if (!method550(arg0, arg1, arg2)) {
            return null;
        }
        class75[] var3 = new class75[Statics.field1302];
        for (int var4 = 0; var4 < Statics.field1302; var4++) {
            class75 var5 = var3[var4] = new class75();
            var5.field1338 = Statics.field2686;
            var5.field1337 = Statics.field1301;
            var5.field1341 = Statics.field1306[var4];
            var5.field1342 = Statics.field1890[var4];
            var5.field1339 = Statics.field63[var4];
            var5.field1343 = Statics.field3014[var4];
            var5.field1340 = Statics.field1300;
            var5.field1344 = Statics.field799[var4];
        }
        Statics.field1306 = null;
        Statics.field1890 = null;
        Statics.field63 = null;
        Statics.field3014 = null;
        Statics.field1300 = null;
        Statics.field799 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("aa.v(Lep;III)Lbf;")
    public static class75 method902(class149 arg0, int arg1, int arg2) {
        if (!method550(arg0, arg1, arg2)) {
            return null;
        }
        class75 var3 = new class75();
        var3.field1338 = Statics.field2686;
        var3.field1337 = Statics.field1301;
        var3.field1341 = Statics.field1306[0];
        var3.field1342 = Statics.field1890[0];
        var3.field1339 = Statics.field63[0];
        var3.field1343 = Statics.field3014[0];
        var3.field1340 = Statics.field1300;
        var3.field1344 = Statics.field799[0];
        Statics.field1306 = null;
        Statics.field1890 = null;
        Statics.field63 = null;
        Statics.field3014 = null;
        Statics.field1300 = null;
        Statics.field799 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ax.k(Lep;IIB)Lbo;")
    public static class73 method507(class149 arg0, int arg1, int arg2) {
        if (!method550(arg0, arg1, arg2)) {
            return null;
        }
        class73 var3 = new class73();
        var3.field1321 = Statics.field2686;
        var3.field1324 = Statics.field1301;
        var3.field1318 = Statics.field1306[0];
        var3.field1322 = Statics.field1890[0];
        var3.field1323 = Statics.field63[0];
        var3.field1320 = Statics.field3014[0];
        int var4 = var3.field1323 * var3.field1320;
        byte[] var5 = Statics.field799[0];
        var3.field1325 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1325[var6] = Statics.field1300[var5[var6] & 0xFF];
        }
        Statics.field1306 = null;
        Statics.field1890 = null;
        Statics.field63 = null;
        Statics.field3014 = null;
        Statics.field1300 = null;
        Statics.field799 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("p.g(Lep;Ljava/lang/String;Ljava/lang/String;B)[Lbf;")
    public static class75[] method134(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2735(arg1);
        int var4 = arg0.method2766(var3, arg2);
        return method2353(arg0, var3, var4);
    }

    @ObfuscatedName("g.q(Lep;Ljava/lang/String;Ljava/lang/String;I)Lbf;")
    public static class75 method31(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2735(arg1);
        int var4 = arg0.method2766(var3, arg2);
        return method902(arg0, var3, var4);
    }

    @ObfuscatedName("ae.a(Lep;Ljava/lang/String;Ljava/lang/String;I)Lbo;")
    public static class73 method593(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2735(arg1);
        int var4 = arg0.method2766(var3, arg2);
        return method507(arg0, var3, var4);
    }

    @ObfuscatedName("ab.b(Lep;Lep;Ljava/lang/String;Ljava/lang/String;I)Lgw;")
    public static class205 method613(class149 arg0, class149 arg1, String arg2, String arg3) {
        int var4 = arg0.method2735(arg2);
        int var5 = arg0.method2766(var4, arg3);
        class205 var6;
        if (method550(arg0, var4, var5)) {
            byte[] var7 = arg1.method2721(var4, var5);
            class205 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class205 var9 = new class205(var7, Statics.field1306, Statics.field1890, Statics.field63, Statics.field3014, Statics.field1300, Statics.field799);
                Statics.field1306 = null;
                Statics.field1890 = null;
                Statics.field63 = null;
                Statics.field3014 = null;
                Statics.field1300 = null;
                Statics.field799 = (byte[][]) null;
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ed.z(Lep;II)Lbf;")
    public static class75 method2698(class149 arg0, int arg1) {
        byte[] var2 = arg0.method2725(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method735(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class75 var4 = new class75();
        var4.field1338 = Statics.field2686;
        var4.field1337 = Statics.field1301;
        var4.field1341 = Statics.field1306[0];
        var4.field1342 = Statics.field1890[0];
        var4.field1339 = Statics.field63[0];
        var4.field1343 = Statics.field3014[0];
        var4.field1340 = Statics.field1300;
        var4.field1344 = Statics.field799[0];
        Statics.field1306 = null;
        Statics.field1890 = null;
        Statics.field63 = null;
        Statics.field3014 = null;
        Statics.field1300 = null;
        Statics.field799 = (byte[][]) null;
        return var4;
    }

    @ObfuscatedName("am.j(Lep;III)Z")
    public static boolean method550(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2721(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method735(var3);
            return true;
        }
    }

    @ObfuscatedName("ap.p([BI)V")
    public static void method735(byte[] arg0) {
        class108 var1 = new class108(arg0);
        var1.field1841 = arg0.length - 2;
        Statics.field1302 = var1.method2124();
        Statics.field1306 = new int[Statics.field1302];
        Statics.field1890 = new int[Statics.field1302];
        Statics.field63 = new int[Statics.field1302];
        Statics.field3014 = new int[Statics.field1302];
        Statics.field799 = new byte[Statics.field1302][];
        var1.field1841 = arg0.length - 7 - Statics.field1302 * 8;
        Statics.field2686 = var1.method2124();
        Statics.field1301 = var1.method2124();
        int var2 = (var1.method2122() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1302; var3++) {
            Statics.field1306[var3] = var1.method2124();
        }
        for (int var4 = 0; var4 < Statics.field1302; var4++) {
            Statics.field1890[var4] = var1.method2124();
        }
        for (int var5 = 0; var5 < Statics.field1302; var5++) {
            Statics.field63[var5] = var1.method2124();
        }
        for (int var6 = 0; var6 < Statics.field1302; var6++) {
            Statics.field3014[var6] = var1.method2124();
        }
        var1.field1841 = arg0.length - 7 - Statics.field1302 * 8 - (var2 - 1) * 3;
        Statics.field1300 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1300[var7] = var1.method2126();
            if (Statics.field1300[var7] == 0) {
                Statics.field1300[var7] = 1;
            }
        }
        var1.field1841 = 0;
        for (int var8 = 0; var8 < Statics.field1302; var8++) {
            int var9 = Statics.field63[var8];
            int var10 = Statics.field3014[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field799[var8] = var12;
            int var13 = var1.method2122();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2190();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2190();
                    }
                }
            }
        }
    }
}
