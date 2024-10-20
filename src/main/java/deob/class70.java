package deob;

@ObfuscatedName("bx")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.z(Ler;III)[Lbj;")
    public static class74[] method86(class146 arg0, int arg1, int arg2) {
        return method1877(arg0, arg1, arg2) ? method525() : null;
    }

    @ObfuscatedName("w.j(Ler;IIB)[Lbw;")
    public static class72[] method170(class146 arg0, int arg1, int arg2) {
        if (!method1877(arg0, arg1, arg2)) {
            return null;
        }
        class72[] var3 = new class72[Statics.field1264];
        for (int var4 = 0; var4 < Statics.field1264; var4++) {
            class72 var5 = var3[var4] = new class72();
            var5.field1282 = Statics.field1255;
            var5.field1287 = Statics.field1259;
            var5.field1280 = Statics.field2885[var4];
            var5.field1281 = Statics.field1263[var4];
            var5.field1278 = Statics.field1226[var4];
            var5.field1279 = Statics.field1257[var4];
            int var6 = var5.field1279 * var5.field1278;
            byte[] var7 = Statics.field183[var4];
            var5.field1283 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1283[var8] = Statics.field1256[var7[var8] & 0xFF];
            }
        }
        method11();
        return var3;
    }

    @ObfuscatedName("ba.a(Ler;Ljava/lang/String;Ljava/lang/String;B)[Lbj;")
    public static class74[] method1320(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2707(arg1);
        int var4 = arg0.method2721(var3, arg2);
        return method86(arg0, var3, var4);
    }

    @ObfuscatedName("cj.y(Ler;Ljava/lang/String;Ljava/lang/String;I)Lbj;")
    public static class74 method1857(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2707(arg1);
        int var4 = arg0.method2721(var3, arg2);
        class74 var5;
        if (method1877(arg0, var3, var4)) {
            var5 = method2782();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("dp.i(Ler;Ljava/lang/String;Ljava/lang/String;I)[Lbw;")
    public static class72[] method2576(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2707(arg1);
        int var4 = arg0.method2721(var3, arg2);
        return method170(arg0, var3, var4);
    }

    @ObfuscatedName("az.b(Ler;Ler;Ljava/lang/String;Ljava/lang/String;I)Lge;")
    public static class191 method685(class146 arg0, class146 arg1, String arg2, String arg3) {
        int var4 = arg0.method2707(arg2);
        int var5 = arg0.method2721(var4, arg3);
        class191 var6;
        if (method1877(arg0, var4, var5)) {
            var6 = method2279(arg1.method2705(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("g.s(B)[Lbj;")
    public static class74[] method525() {
        class74[] var0 = new class74[Statics.field1264];
        for (int var1 = 0; var1 < Statics.field1264; var1++) {
            class74 var2 = var0[var1] = new class74();
            var2.field1302 = Statics.field1255;
            var2.field1303 = Statics.field1259;
            var2.field1300 = Statics.field2885[var1];
            var2.field1296 = Statics.field1263[var1];
            var2.field1298 = Statics.field1226[var1];
            var2.field1299 = Statics.field1257[var1];
            var2.field1301 = Statics.field1256;
            var2.field1297 = Statics.field183[var1];
        }
        method11();
        return var0;
    }

    @ObfuscatedName("er.q(I)Lbj;")
    public static class74 method2782() {
        class74 var0 = new class74();
        var0.field1302 = Statics.field1255;
        var0.field1303 = Statics.field1259;
        var0.field1300 = Statics.field2885[0];
        var0.field1296 = Statics.field1263[0];
        var0.field1298 = Statics.field1226[0];
        var0.field1299 = Statics.field1257[0];
        var0.field1301 = Statics.field1256;
        var0.field1297 = Statics.field183[0];
        method11();
        return var0;
    }

    @ObfuscatedName("dq.p([BI)Lge;")
    public static class191 method2279(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class191 var1 = new class191(arg0, Statics.field2885, Statics.field1263, Statics.field1226, Statics.field1257, Statics.field1256, Statics.field183);
        Statics.field2885 = null;
        Statics.field1263 = null;
        Statics.field1226 = null;
        Statics.field1257 = null;
        Statics.field1256 = null;
        Statics.field183 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("cs.h(Ler;IIB)Z")
    public static boolean method1877(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2705(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method10(var3);
            return true;
        }
    }

    @ObfuscatedName("j.r([BI)V")
    public static void method10(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1819 = arg0.length - 2;
        Statics.field1264 = var1.method2239();
        Statics.field2885 = new int[Statics.field1264];
        Statics.field1263 = new int[Statics.field1264];
        Statics.field1226 = new int[Statics.field1264];
        Statics.field1257 = new int[Statics.field1264];
        Statics.field183 = new byte[Statics.field1264][];
        var1.field1819 = arg0.length - 7 - Statics.field1264 * 8;
        Statics.field1255 = var1.method2239();
        Statics.field1259 = var1.method2239();
        int var2 = (var1.method2122() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1264; var3++) {
            Statics.field2885[var3] = var1.method2239();
        }
        for (int var4 = 0; var4 < Statics.field1264; var4++) {
            Statics.field1263[var4] = var1.method2239();
        }
        for (int var5 = 0; var5 < Statics.field1264; var5++) {
            Statics.field1226[var5] = var1.method2239();
        }
        for (int var6 = 0; var6 < Statics.field1264; var6++) {
            Statics.field1257[var6] = var1.method2239();
        }
        var1.field1819 = arg0.length - 7 - Statics.field1264 * 8 - (var2 - 1) * 3;
        Statics.field1256 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1256[var7] = var1.method2212();
            if (Statics.field1256[var7] == 0) {
                Statics.field1256[var7] = 1;
            }
        }
        var1.field1819 = 0;
        for (int var8 = 0; var8 < Statics.field1264; var8++) {
            int var9 = Statics.field1226[var8];
            int var10 = Statics.field1257[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field183[var8] = var12;
            int var13 = var1.method2122();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2201();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2201();
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.o(S)V")
    public static void method11() {
        Statics.field2885 = null;
        Statics.field1263 = null;
        Statics.field1226 = null;
        Statics.field1257 = null;
        Statics.field1256 = null;
        Statics.field183 = (byte[][]) null;
    }
}
