package deob;

@ObfuscatedName("ba")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.j(Leg;III)Lby;")
    public static class74 method497(class146 arg0, int arg1, int arg2) {
        if (!method2721(arg0, arg1, arg2)) {
            return null;
        }
        class74 var3 = new class74();
        var3.field1329 = Statics.field1288;
        var3.field1322 = Statics.field1287;
        var3.field1326 = Statics.field1905[0];
        var3.field1327 = Statics.field1289[0];
        var3.field1324 = Statics.field1900[0];
        var3.field1328 = Statics.field134[0];
        var3.field1323 = Statics.field2038;
        var3.field1325 = Statics.field1670[0];
        method811();
        return var3;
    }

    @ObfuscatedName("au.z(Leg;III)[Lbq;")
    public static class72[] method838(class146 arg0, int arg1, int arg2) {
        return method2721(arg0, arg1, arg2) ? method491() : null;
    }

    @ObfuscatedName("at.y(Leg;III)Lbq;")
    public static class72 method764(class146 arg0, int arg1, int arg2) {
        return method2721(arg0, arg1, arg2) ? method498() : null;
    }

    @ObfuscatedName("ca.h(Leg;Ljava/lang/String;Ljava/lang/String;I)[Lby;")
    public static class74[] method1972(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2771(arg1);
        int var4 = arg0.method2755(var3, arg2);
        class74[] var5;
        if (method2721(arg0, var3, var4)) {
            class74[] var6 = new class74[Statics.field1290];
            for (int var7 = 0; var7 < Statics.field1290; var7++) {
                class74 var8 = var6[var7] = new class74();
                var8.field1329 = Statics.field1288;
                var8.field1322 = Statics.field1287;
                var8.field1326 = Statics.field1905[var7];
                var8.field1327 = Statics.field1289[var7];
                var8.field1324 = Statics.field1900[var7];
                var8.field1328 = Statics.field134[var7];
                var8.field1323 = Statics.field2038;
                var8.field1325 = Statics.field1670[var7];
            }
            method811();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("aj.r(Leg;Ljava/lang/String;Ljava/lang/String;I)Lby;")
    public static class74 method496(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2771(arg1);
        int var4 = arg0.method2755(var3, arg2);
        return method497(arg0, var3, var4);
    }

    @ObfuscatedName("s.e(Leg;Ljava/lang/String;Ljava/lang/String;I)[Lbq;")
    public static class72[] method442(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2771(arg1);
        int var4 = arg0.method2755(var3, arg2);
        return method838(arg0, var3, var4);
    }

    @ObfuscatedName("o.k(Leg;Ljava/lang/String;Ljava/lang/String;I)Lbq;")
    public static class72 method145(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2771(arg1);
        int var4 = arg0.method2755(var3, arg2);
        return method764(arg0, var3, var4);
    }

    @ObfuscatedName("client.b(Leg;Leg;Ljava/lang/String;Ljava/lang/String;I)Lgq;")
    public static class191 method427(class146 arg0, class146 arg1, String arg2, String arg3) {
        int var4 = arg0.method2771(arg2);
        int var5 = arg0.method2755(var4, arg3);
        class191 var6;
        if (method2721(arg0, var4, var5)) {
            var6 = method133(arg1.method2739(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("dm.n(Leg;II)Lby;")
    public static class74 method2456(class146 arg0, int arg1) {
        byte[] var2 = arg0.method2744(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method499(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class74 var4 = new class74();
        var4.field1329 = Statics.field1288;
        var4.field1322 = Statics.field1287;
        var4.field1326 = Statics.field1905[0];
        var4.field1327 = Statics.field1289[0];
        var4.field1324 = Statics.field1900[0];
        var4.field1328 = Statics.field134[0];
        var4.field1323 = Statics.field2038;
        var4.field1325 = Statics.field1670[0];
        method811();
        return var4;
    }

    @ObfuscatedName("x.a(I)[Lbq;")
    public static class72[] method491() {
        class72[] var0 = new class72[Statics.field1290];
        for (int var1 = 0; var1 < Statics.field1290; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1303 = Statics.field1288;
            var2.field1309 = Statics.field1287;
            var2.field1306 = Statics.field1905[var1];
            var2.field1305 = Statics.field1289[var1];
            var2.field1304 = Statics.field1900[var1];
            var2.field1312 = Statics.field134[var1];
            int var3 = var2.field1312 * var2.field1304;
            byte[] var4 = Statics.field1670[var1];
            var2.field1307 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1307[var5] = Statics.field2038[var4[var5] & 0xFF];
            }
        }
        method811();
        return var0;
    }

    @ObfuscatedName("aj.q(B)Lbq;")
    public static class72 method498() {
        class72 var0 = new class72();
        var0.field1303 = Statics.field1288;
        var0.field1309 = Statics.field1287;
        var0.field1306 = Statics.field1905[0];
        var0.field1305 = Statics.field1289[0];
        var0.field1304 = Statics.field1900[0];
        var0.field1312 = Statics.field134[0];
        int var1 = var0.field1312 * var0.field1304;
        byte[] var2 = Statics.field1670[0];
        var0.field1307 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1307[var3] = Statics.field2038[var2[var3] & 0xFF];
        }
        method811();
        return var0;
    }

    @ObfuscatedName("i.i([BI)Lgq;")
    public static class191 method133(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class191 var1 = new class191(arg0, Statics.field1905, Statics.field1289, Statics.field1900, Statics.field134, Statics.field2038, Statics.field1670);
            method811();
            return var1;
        }
    }

    @ObfuscatedName("ez.f(Leg;IIB)Z")
    public static boolean method2721(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2739(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method499(var3);
            return true;
        }
    }

    @ObfuscatedName("aj.o([BI)V")
    public static void method499(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1847 = arg0.length - 2;
        Statics.field1290 = var1.method2132();
        Statics.field1905 = new int[Statics.field1290];
        Statics.field1289 = new int[Statics.field1290];
        Statics.field1900 = new int[Statics.field1290];
        Statics.field134 = new int[Statics.field1290];
        Statics.field1670 = new byte[Statics.field1290][];
        var1.field1847 = arg0.length - 7 - Statics.field1290 * 8;
        Statics.field1288 = var1.method2132();
        Statics.field1287 = var1.method2132();
        int var2 = (var1.method2130() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1290; var3++) {
            Statics.field1905[var3] = var1.method2132();
        }
        for (int var4 = 0; var4 < Statics.field1290; var4++) {
            Statics.field1289[var4] = var1.method2132();
        }
        for (int var5 = 0; var5 < Statics.field1290; var5++) {
            Statics.field1900[var5] = var1.method2132();
        }
        for (int var6 = 0; var6 < Statics.field1290; var6++) {
            Statics.field134[var6] = var1.method2132();
        }
        var1.field1847 = arg0.length - 7 - Statics.field1290 * 8 - (var2 - 1) * 3;
        Statics.field2038 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2038[var7] = var1.method2252();
            if (Statics.field2038[var7] == 0) {
                Statics.field2038[var7] = 1;
            }
        }
        var1.field1847 = 0;
        for (int var8 = 0; var8 < Statics.field1290; var8++) {
            int var9 = Statics.field1900[var8];
            int var10 = Statics.field134[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1670[var8] = var12;
            int var13 = var1.method2130();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2131();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2131();
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.t(I)V")
    public static void method811() {
        Statics.field1905 = null;
        Statics.field1289 = null;
        Statics.field1900 = null;
        Statics.field134 = null;
        Statics.field2038 = null;
        Statics.field1670 = (byte[][]) null;
    }
}
