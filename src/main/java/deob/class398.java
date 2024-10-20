package deob;

@ObfuscatedName("ol")
public class class398 {

    public class398() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gf.f(Ljp;IIB)Loa;")
    public static class397 method3491(class276 arg0, int arg1, int arg2) {
        return method1034(arg0, arg1, arg2) ? method5285() : null;
    }

    @ObfuscatedName("lw.e(Ljp;Ljp;III)Lkj;")
    public static class301 method5361(class276 arg0, class276 arg1, int arg2, int arg3) {
        if (!method1034(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method4504(arg2, arg3);
        class301 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class301 var6 = new class301(var4, Statics.field4268, Statics.field208, Statics.field301, Statics.field1538, Statics.field4269, Statics.field1480);
            method5320();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("fg.v(Ljp;Ljava/lang/String;Ljava/lang/String;I)[Lof;")
    public static class396[] method2951(class276 arg0, String arg1, String arg2) {
        int var3 = arg0.method4582(arg1);
        int var4 = arg0.method4521(var3, arg2);
        class396[] var5;
        if (method1034(arg0, var3, var4)) {
            class396[] var6 = new class396[Statics.field4266];
            for (int var7 = 0; var7 < Statics.field4266; var7++) {
                class396 var8 = var6[var7] = new class396();
                var8.field4252 = Statics.field4267;
                var8.field4253 = Statics.field2933;
                var8.field4248 = Statics.field4268[var7];
                var8.field4251 = Statics.field208[var7];
                var8.field4246 = Statics.field301[var7];
                var8.field4249 = Statics.field1538[var7];
                var8.field4250 = Statics.field4269;
                var8.field4247 = Statics.field1480[var7];
            }
            method5320();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("gj.y(Ljp;Ljava/lang/String;Ljava/lang/String;I)Lof;")
    public static class396 method3835(class276 arg0, String arg1, String arg2) {
        int var3 = arg0.method4582(arg1);
        int var4 = arg0.method4521(var3, arg2);
        class396 var5;
        if (method1034(arg0, var3, var4)) {
            var5 = method4975();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fy.j(Ljp;Ljp;Ljava/lang/String;Ljava/lang/String;I)Lkj;")
    public static class301 method3303(class276 arg0, class276 arg1, String arg2, String arg3) {
        int var4 = arg0.method4582(arg2);
        int var5 = arg0.method4521(var4, arg3);
        return method5361(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("hw.o(Ljp;II)Lof;")
    public static class396 method4001(class276 arg0, int arg1) {
        byte[] var2 = arg0.method4511(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method220(var2);
            var3 = true;
        }
        return var3 ? method4975() : null;
    }

    @ObfuscatedName("ko.m(B)Lof;")
    public static class396 method4975() {
        class396 var0 = new class396();
        var0.field4252 = Statics.field4267;
        var0.field4253 = Statics.field2933;
        var0.field4248 = Statics.field4268[0];
        var0.field4251 = Statics.field208[0];
        var0.field4246 = Statics.field301[0];
        var0.field4249 = Statics.field1538[0];
        var0.field4250 = Statics.field4269;
        var0.field4247 = Statics.field1480[0];
        method5320();
        return var0;
    }

    @ObfuscatedName("lk.r(I)Loa;")
    public static class397 method5285() {
        class397 var0 = new class397();
        var0.field4259 = Statics.field4267;
        var0.field4260 = Statics.field2933;
        var0.field4257 = Statics.field4268[0];
        var0.field4258 = Statics.field208[0];
        var0.field4262 = Statics.field301[0];
        var0.field4254 = Statics.field1538[0];
        int var1 = var0.field4262 * var0.field4254;
        byte[] var2 = Statics.field1480[0];
        var0.field4263 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field4263[var3] = Statics.field4269[var2[var3] & 0xFF];
        }
        method5320();
        return var0;
    }

    @ObfuscatedName("bl.h(Ljp;IIB)Z")
    public static boolean method1034(class276 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4504(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method220(var3);
            return true;
        }
    }

    @ObfuscatedName("at.d([BI)V")
    public static void method220(byte[] arg0) {
        class384 var1 = new class384(arg0);
        var1.field4161 = arg0.length - 2;
        Statics.field4266 = var1.method5899();
        Statics.field4268 = new int[Statics.field4266];
        Statics.field208 = new int[Statics.field4266];
        Statics.field301 = new int[Statics.field4266];
        Statics.field1538 = new int[Statics.field4266];
        Statics.field1480 = new byte[Statics.field4266][];
        var1.field4161 = arg0.length - 7 - Statics.field4266 * 8;
        Statics.field4267 = var1.method5899();
        Statics.field2933 = var1.method5899();
        int var2 = (var1.method5902() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4266; var3++) {
            Statics.field4268[var3] = var1.method5899();
        }
        for (int var4 = 0; var4 < Statics.field4266; var4++) {
            Statics.field208[var4] = var1.method5899();
        }
        for (int var5 = 0; var5 < Statics.field4266; var5++) {
            Statics.field301[var5] = var1.method5899();
        }
        for (int var6 = 0; var6 < Statics.field4266; var6++) {
            Statics.field1538[var6] = var1.method5899();
        }
        var1.field4161 = arg0.length - 7 - Statics.field4266 * 8 - (var2 - 1) * 3;
        Statics.field4269 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field4269[var7] = var1.method5901();
            if (Statics.field4269[var7] == 0) {
                Statics.field4269[var7] = 1;
            }
        }
        var1.field4161 = 0;
        for (int var8 = 0; var8 < Statics.field4266; var8++) {
            int var9 = Statics.field301[var8];
            int var10 = Statics.field1538[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1480[var8] = var12;
            int var13 = var1.method5902();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5968();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5968();
                    }
                }
            }
        }
    }

    @ObfuscatedName("la.z(B)V")
    public static void method5320() {
        Statics.field4268 = null;
        Statics.field208 = null;
        Statics.field301 = null;
        Statics.field1538 = null;
        Statics.field4269 = null;
        Statics.field1480 = (byte[][]) null;
    }
}
