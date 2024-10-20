package deob;

@ObfuscatedName("bn")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("el.i(Ler;III)[Lbb;")
    public static class74[] method2717(class146 arg0, int arg1, int arg2) {
        if (!method468(arg0, arg1, arg2)) {
            return null;
        }
        class74[] var3 = new class74[Statics.field1288];
        for (int var4 = 0; var4 < Statics.field1288; var4++) {
            class74 var5 = var3[var4] = new class74();
            var5.field1332 = Statics.field1289;
            var5.field1329 = Statics.field1291;
            var5.field1330 = Statics.field1456[var4];
            var5.field1331 = Statics.field1287[var4];
            var5.field1328 = Statics.field1290[var4];
            var5.field1326 = Statics.field1664[var4];
            var5.field1327 = Statics.field902;
            var5.field1333 = Statics.field182[var4];
        }
        method499();
        return var3;
    }

    @ObfuscatedName("af.c(Ler;Ljava/lang/String;Ljava/lang/String;I)[Lbb;")
    public static class74[] method595(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2815(arg1);
        int var4 = arg0.method2756(var3, arg2);
        return method2717(arg0, var3, var4);
    }

    @ObfuscatedName("z.h(Ler;Ljava/lang/String;Ljava/lang/String;I)Lbb;")
    public static class74 method156(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2815(arg1);
        int var4 = arg0.method2756(var3, arg2);
        class74 var5;
        if (method468(arg0, var3, var4)) {
            class74 var6 = new class74();
            var6.field1332 = Statics.field1289;
            var6.field1329 = Statics.field1291;
            var6.field1330 = Statics.field1456[0];
            var6.field1331 = Statics.field1287[0];
            var6.field1328 = Statics.field1290[0];
            var6.field1326 = Statics.field1664[0];
            var6.field1327 = Statics.field902;
            var6.field1333 = Statics.field182[0];
            method499();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("am.v(Ler;Ljava/lang/String;Ljava/lang/String;I)[Lbp;")
    public static class72[] method602(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2815(arg1);
        int var4 = arg0.method2756(var3, arg2);
        class72[] var5;
        if (method468(arg0, var3, var4)) {
            class72[] var6 = new class72[Statics.field1288];
            for (int var7 = 0; var7 < Statics.field1288; var7++) {
                class72 var8 = var6[var7] = new class72();
                var8.field1315 = Statics.field1289;
                var8.field1313 = Statics.field1291;
                var8.field1310 = Statics.field1456[var7];
                var8.field1311 = Statics.field1287[var7];
                var8.field1308 = Statics.field1290[var7];
                var8.field1317 = Statics.field1664[var7];
                int var9 = var8.field1317 * var8.field1308;
                byte[] var10 = Statics.field182[var7];
                var8.field1312 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1312[var11] = Statics.field902[var10[var11] & 0xFF];
                }
            }
            method499();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("av.q(Ler;Ljava/lang/String;Ljava/lang/String;B)Lbp;")
    public static class72 method824(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2815(arg1);
        int var4 = arg0.method2756(var3, arg2);
        class72 var5;
        if (method468(arg0, var3, var4)) {
            var5 = method489();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ba.s(Ler;Ler;Ljava/lang/String;Ljava/lang/String;I)Lgi;")
    public static class193 method1066(class146 arg0, class146 arg1, String arg2, String arg3) {
        int var4 = arg0.method2815(arg2);
        int var5 = arg0.method2756(var4, arg3);
        class193 var6;
        if (method468(arg0, var4, var5)) {
            var6 = method25(arg1.method2811(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("f.g(B)Lbp;")
    public static class72 method489() {
        class72 var0 = new class72();
        var0.field1315 = Statics.field1289;
        var0.field1313 = Statics.field1291;
        var0.field1310 = Statics.field1456[0];
        var0.field1311 = Statics.field1287[0];
        var0.field1308 = Statics.field1290[0];
        var0.field1317 = Statics.field1664[0];
        int var1 = var0.field1317 * var0.field1308;
        byte[] var2 = Statics.field182[0];
        var0.field1312 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1312[var3] = Statics.field902[var2[var3] & 0xFF];
        }
        method499();
        return var0;
    }

    @ObfuscatedName("h.u([BB)Lgi;")
    public static class193 method25(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class193 var1 = new class193(arg0, Statics.field1456, Statics.field1287, Statics.field1290, Statics.field1664, Statics.field902, Statics.field182);
            method499();
            return var1;
        }
    }

    @ObfuscatedName("a.d(Ler;IIB)Z")
    public static boolean method468(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2811(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method157(var3);
            return true;
        }
    }

    @ObfuscatedName("ab.y(Ler;II)Z")
    public static boolean method621(class146 arg0, int arg1) {
        byte[] var2 = arg0.method2745(arg1);
        if (var2 == null) {
            return false;
        } else {
            method157(var2);
            return true;
        }
    }

    @ObfuscatedName("b.e([BI)V")
    public static void method157(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1837 = arg0.length - 2;
        Statics.field1288 = var1.method2313();
        Statics.field1456 = new int[Statics.field1288];
        Statics.field1287 = new int[Statics.field1288];
        Statics.field1290 = new int[Statics.field1288];
        Statics.field1664 = new int[Statics.field1288];
        Statics.field182 = new byte[Statics.field1288][];
        var1.field1837 = arg0.length - 7 - Statics.field1288 * 8;
        Statics.field1289 = var1.method2313();
        Statics.field1291 = var1.method2313();
        int var2 = (var1.method2151() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1288; var3++) {
            Statics.field1456[var3] = var1.method2313();
        }
        for (int var4 = 0; var4 < Statics.field1288; var4++) {
            Statics.field1287[var4] = var1.method2313();
        }
        for (int var5 = 0; var5 < Statics.field1288; var5++) {
            Statics.field1290[var5] = var1.method2313();
        }
        for (int var6 = 0; var6 < Statics.field1288; var6++) {
            Statics.field1664[var6] = var1.method2313();
        }
        var1.field1837 = arg0.length - 7 - Statics.field1288 * 8 - (var2 - 1) * 3;
        Statics.field902 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field902[var7] = var1.method2336();
            if (Statics.field902[var7] == 0) {
                Statics.field902[var7] = 1;
            }
        }
        var1.field1837 = 0;
        for (int var8 = 0; var8 < Statics.field1288; var8++) {
            int var9 = Statics.field1290[var8];
            int var10 = Statics.field1664[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field182[var8] = var12;
            int var13 = var1.method2151();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2152();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2152();
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.l(I)V")
    public static void method499() {
        Statics.field1456 = null;
        Statics.field1287 = null;
        Statics.field1290 = null;
        Statics.field1664 = null;
        Statics.field902 = null;
        Statics.field182 = (byte[][]) null;
    }
}
