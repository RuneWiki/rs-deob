package deob;

@ObfuscatedName("cl")
public class class85 {

    public class85() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.i(Leg;III)[Lck;")
    public static class88[] method2745(class155 arg0, int arg1, int arg2) {
        return method896(arg0, arg1, arg2) ? Statics.method1416() : null;
    }

    @ObfuscatedName("be.b(Leg;III)[Lcz;")
    public static class87[] method1419(class155 arg0, int arg1, int arg2) {
        return method896(arg0, arg1, arg2) ? method2736() : null;
    }

    @ObfuscatedName("x.r(Leg;III)Lcz;")
    public static class87 method144(class155 arg0, int arg1, int arg2) {
        return method896(arg0, arg1, arg2) ? method135() : null;
    }

    @ObfuscatedName("ax.l(Leg;Leg;III)Lga;")
    public static class185 method564(class155 arg0, class155 arg1, int arg2, int arg3) {
        if (!method896(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3043(arg2, arg3);
        class185 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class185 var6 = new class185(var4, Statics.field1470, Statics.field276, Statics.field1289, Statics.field1467, Statics.field967, Statics.field244);
            Statics.field1470 = null;
            Statics.field276 = null;
            Statics.field1289 = null;
            Statics.field1467 = null;
            Statics.field967 = null;
            Statics.field244 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("k.s(Leg;Ljava/lang/String;Ljava/lang/String;I)[Lck;")
    public static class88[] method192(class155 arg0, String arg1, String arg2) {
        int var3 = arg0.method3057(arg1);
        int var4 = arg0.method3090(var3, arg2);
        return method2745(arg0, var3, var4);
    }

    @ObfuscatedName("bx.e(Leg;Ljava/lang/String;Ljava/lang/String;I)[Lcz;")
    public static class87[] method1488(class155 arg0, String arg1, String arg2) {
        int var3 = arg0.method3057(arg1);
        int var4 = arg0.method3090(var3, arg2);
        return method1419(arg0, var3, var4);
    }

    @ObfuscatedName("m.u(Leg;Ljava/lang/String;Ljava/lang/String;I)Lcz;")
    public static class87 method134(class155 arg0, String arg1, String arg2) {
        int var3 = arg0.method3057(arg1);
        int var4 = arg0.method3090(var3, arg2);
        return method144(arg0, var3, var4);
    }

    @ObfuscatedName("ce.q(Leg;Leg;Ljava/lang/String;Ljava/lang/String;B)Lga;")
    public static class185 method1868(class155 arg0, class155 arg1, String arg2, String arg3) {
        int var4 = arg0.method3057(arg2);
        int var5 = arg0.method3090(var4, arg3);
        return method564(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("eb.v(I)[Lcz;")
    public static class87[] method2736() {
        class87[] var0 = new class87[Statics.field1471];
        for (int var1 = 0; var1 < Statics.field1471; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1485 = Statics.field1475;
            var2.field1495 = Statics.field1469;
            var2.field1489 = Statics.field1470[var1];
            var2.field1488 = Statics.field276[var1];
            var2.field1490 = Statics.field1289[var1];
            var2.field1486 = Statics.field1467[var1];
            int var3 = var2.field1490 * var2.field1486;
            byte[] var4 = Statics.field244[var1];
            var2.field1484 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1484[var5] = Statics.field967[var4[var5] & 0xFF];
            }
        }
        Statics.field1470 = null;
        Statics.field276 = null;
        Statics.field1289 = null;
        Statics.field1467 = null;
        Statics.field967 = null;
        Statics.field244 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("m.m(S)Lcz;")
    public static class87 method135() {
        class87 var0 = new class87();
        var0.field1485 = Statics.field1475;
        var0.field1495 = Statics.field1469;
        var0.field1489 = Statics.field1470[0];
        var0.field1488 = Statics.field276[0];
        var0.field1490 = Statics.field1289[0];
        var0.field1486 = Statics.field1467[0];
        int var1 = var0.field1490 * var0.field1486;
        byte[] var2 = Statics.field244[0];
        var0.field1484 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1484[var3] = Statics.field967[var2[var3] & 0xFF];
        }
        Statics.field1470 = null;
        Statics.field276 = null;
        Statics.field1289 = null;
        Statics.field1467 = null;
        Statics.field967 = null;
        Statics.field244 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ac.x(Leg;III)Z")
    public static boolean method896(class155 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3043(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method499(var3);
            return true;
        }
    }

    @ObfuscatedName("bt.w(Leg;II)Z")
    public static boolean method1359(class155 arg0, int arg1) {
        byte[] var2 = arg0.method3048(arg1);
        if (var2 == null) {
            return false;
        } else {
            method499(var2);
            return true;
        }
    }

    @ObfuscatedName("client.p([BB)V")
    public static void method499(byte[] arg0) {
        class128 var1 = new class128(arg0);
        var1.field2048 = arg0.length - 2;
        Statics.field1471 = var1.method2473();
        Statics.field1470 = new int[Statics.field1471];
        Statics.field276 = new int[Statics.field1471];
        Statics.field1289 = new int[Statics.field1471];
        Statics.field1467 = new int[Statics.field1471];
        Statics.field244 = new byte[Statics.field1471][];
        var1.field2048 = arg0.length - 7 - Statics.field1471 * 8;
        Statics.field1475 = var1.method2473();
        Statics.field1469 = var1.method2473();
        int var2 = (var1.method2531() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1471; var3++) {
            Statics.field1470[var3] = var1.method2473();
        }
        for (int var4 = 0; var4 < Statics.field1471; var4++) {
            Statics.field276[var4] = var1.method2473();
        }
        for (int var5 = 0; var5 < Statics.field1471; var5++) {
            Statics.field1289[var5] = var1.method2473();
        }
        for (int var6 = 0; var6 < Statics.field1471; var6++) {
            Statics.field1467[var6] = var1.method2473();
        }
        var1.field2048 = arg0.length - 7 - Statics.field1471 * 8 - (var2 - 1) * 3;
        Statics.field967 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field967[var7] = var1.method2599();
            if (Statics.field967[var7] == 0) {
                Statics.field967[var7] = 1;
            }
        }
        var1.field2048 = 0;
        for (int var8 = 0; var8 < Statics.field1471; var8++) {
            int var9 = Statics.field1289[var8];
            int var10 = Statics.field1467[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field244[var8] = var12;
            int var13 = var1.method2531();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2464();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2464();
                    }
                }
            }
        }
    }
}
