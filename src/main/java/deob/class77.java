package deob;

@ObfuscatedName("bb")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fy.o(Lfq;III)Lce;")
    public static class81 method3305(class167 arg0, int arg1, int arg2) {
        return method2420(arg0, arg1, arg2) ? method622() : null;
    }

    @ObfuscatedName("au.e(Lfq;III)[Lcu;")
    public static class79[] method934(class167 arg0, int arg1, int arg2) {
        return method2420(arg0, arg1, arg2) ? method2634() : null;
    }

    @ObfuscatedName("em.u(Lfq;IIS)Lcu;")
    public static class79 method2805(class167 arg0, int arg1, int arg2) {
        return method2420(arg0, arg1, arg2) ? method3089() : null;
    }

    @ObfuscatedName("c.b(Lfq;Ljava/lang/String;Ljava/lang/String;B)[Lce;")
    public static class81[] method604(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3072(arg1);
        int var4 = arg0.method3073(var3, arg2);
        class81[] var5;
        if (method2420(arg0, var3, var4)) {
            var5 = method2804();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fk.p(Lfq;Ljava/lang/String;Ljava/lang/String;I)Lce;")
    public static class81 method2985(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3072(arg1);
        int var4 = arg0.method3073(var3, arg2);
        return method3305(arg0, var3, var4);
    }

    @ObfuscatedName("client.s(Lfq;Ljava/lang/String;Ljava/lang/String;B)[Lcu;")
    public static class79[] method350(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3072(arg1);
        int var4 = arg0.method3073(var3, arg2);
        return method934(arg0, var3, var4);
    }

    @ObfuscatedName("dz.y(Lfq;Ljava/lang/String;Ljava/lang/String;I)Lcu;")
    public static class79 method2655(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3072(arg1);
        int var4 = arg0.method3073(var3, arg2);
        return method2805(arg0, var3, var4);
    }

    @ObfuscatedName("em.t(I)[Lce;")
    public static class81[] method2804() {
        class81[] var0 = new class81[Statics.field1381];
        for (int var1 = 0; var1 < Statics.field1381; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1415 = Statics.field2662;
            var2.field1416 = Statics.field1376;
            var2.field1410 = Statics.field1378[var1];
            var2.field1409 = Statics.field718[var1];
            var2.field1411 = Statics.field707[var1];
            var2.field1412 = Statics.field1379[var1];
            var2.field1413 = Statics.field1377;
            var2.field1414 = Statics.field1531[var1];
        }
        Statics.field1378 = null;
        Statics.field718 = null;
        Statics.field707 = null;
        Statics.field1379 = null;
        Statics.field1377 = null;
        Statics.field1531 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("x.w(B)Lce;")
    public static class81 method622() {
        class81 var0 = new class81();
        var0.field1415 = Statics.field2662;
        var0.field1416 = Statics.field1376;
        var0.field1410 = Statics.field1378[0];
        var0.field1409 = Statics.field718[0];
        var0.field1411 = Statics.field707[0];
        var0.field1412 = Statics.field1379[0];
        var0.field1413 = Statics.field1377;
        var0.field1414 = Statics.field1531[0];
        Statics.field1378 = null;
        Statics.field718 = null;
        Statics.field707 = null;
        Statics.field1379 = null;
        Statics.field1377 = null;
        Statics.field1531 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("dh.h(S)[Lcu;")
    public static class79[] method2634() {
        class79[] var0 = new class79[Statics.field1381];
        for (int var1 = 0; var1 < Statics.field1381; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1400 = Statics.field2662;
            var2.field1396 = Statics.field1376;
            var2.field1393 = Statics.field1378[var1];
            var2.field1394 = Statics.field718[var1];
            var2.field1391 = Statics.field707[var1];
            var2.field1392 = Statics.field1379[var1];
            int var3 = var2.field1392 * var2.field1391;
            byte[] var4 = Statics.field1531[var1];
            var2.field1398 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1398[var5] = Statics.field1377[var4[var5] & 0xFF];
            }
        }
        Statics.field1378 = null;
        Statics.field718 = null;
        Statics.field707 = null;
        Statics.field1379 = null;
        Statics.field1377 = null;
        Statics.field1531 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("fq.d(I)Lcu;")
    public static class79 method3089() {
        class79 var0 = new class79();
        var0.field1400 = Statics.field2662;
        var0.field1396 = Statics.field1376;
        var0.field1393 = Statics.field1378[0];
        var0.field1394 = Statics.field718[0];
        var0.field1391 = Statics.field707[0];
        var0.field1392 = Statics.field1379[0];
        int var1 = var0.field1392 * var0.field1391;
        byte[] var2 = Statics.field1531[0];
        var0.field1398 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1398[var3] = Statics.field1377[var2[var3] & 0xFF];
        }
        Statics.field1378 = null;
        Statics.field718 = null;
        Statics.field707 = null;
        Statics.field1379 = null;
        Statics.field1377 = null;
        Statics.field1531 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("eh.l([BI)Lhp;")
    public static class224 method2705(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class224 var1 = new class224(arg0, Statics.field1378, Statics.field718, Statics.field707, Statics.field1379, Statics.field1377, Statics.field1531);
        Statics.field1378 = null;
        Statics.field718 = null;
        Statics.field707 = null;
        Statics.field1379 = null;
        Statics.field1377 = null;
        Statics.field1531 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("di.n(Lfq;III)Z")
    public static boolean method2420(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3057(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method144(var3);
            return true;
        }
    }

    @ObfuscatedName("dv.q(Lfq;II)Z")
    public static boolean method2282(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3062(arg1);
        if (var2 == null) {
            return false;
        } else {
            method144(var2);
            return true;
        }
    }

    @ObfuscatedName("l.f([BB)V")
    public static void method144(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1974 = arg0.length - 2;
        Statics.field1381 = var1.method2339();
        Statics.field1378 = new int[Statics.field1381];
        Statics.field718 = new int[Statics.field1381];
        Statics.field707 = new int[Statics.field1381];
        Statics.field1379 = new int[Statics.field1381];
        Statics.field1531 = new byte[Statics.field1381][];
        var1.field1974 = arg0.length - 7 - Statics.field1381 * 8;
        Statics.field2662 = var1.method2339();
        Statics.field1376 = var1.method2339();
        int var2 = (var1.method2427() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1381; var3++) {
            Statics.field1378[var3] = var1.method2339();
        }
        for (int var4 = 0; var4 < Statics.field1381; var4++) {
            Statics.field718[var4] = var1.method2339();
        }
        for (int var5 = 0; var5 < Statics.field1381; var5++) {
            Statics.field707[var5] = var1.method2339();
        }
        for (int var6 = 0; var6 < Statics.field1381; var6++) {
            Statics.field1379[var6] = var1.method2339();
        }
        var1.field1974 = arg0.length - 7 - Statics.field1381 * 8 - (var2 - 1) * 3;
        Statics.field1377 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1377[var7] = var1.method2341();
            if (Statics.field1377[var7] == 0) {
                Statics.field1377[var7] = 1;
            }
        }
        var1.field1974 = 0;
        for (int var8 = 0; var8 < Statics.field1381; var8++) {
            int var9 = Statics.field707[var8];
            int var10 = Statics.field1379[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1531[var8] = var12;
            int var13 = var1.method2427();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2338();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2338();
                    }
                }
            }
        }
    }
}
